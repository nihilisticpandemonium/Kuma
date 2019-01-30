// -----------------------------------------------------------------------

using System;
using System.Collections.Generic;
using System.Dynamic;
using System.Linq;
using System.Linq.Expressions;
using System.Reflection;
using Kuma.Expressions;
using Kuma.Builtins;
using BlockExpression = Kuma.Expressions.BlockExpression;

// <copyright file="RuntimeOperations.Function.cs" Company="Michael Tindal">
// Copyright 2011-2013 Michael Tindal
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// </copyright>
// -----------------------------------------------------------------------

namespace Kuma.Runtime {
    using E = ExpressionType;

    /// <summary>
    ///     This class provides the operations Kuma needs to operate.  It houses the methods that makes up the IS
    ///     runtime, which works in conjunction with the DLR runtime.
    /// </summary>
    public static partial class RuntimeOperations {
        internal static dynamic Define(object rawName, object rawArguments, object rawBody, object rawScope) {
            var scope = (KumaScope) rawScope;

            var name = (string) rawName;

            var args = (List<FunctionArgument>) rawArguments;

            var body = (BlockExpression) rawBody;
            var function = new KumaFunction(name, args, body, scope);

            scope[name] = function;

            return function;
        }

        internal static dynamic SingletonDefine(Expression rawSingleton, object rawName, object rawArguments,
            object rawBody, object rawScope) {
            var scope = (KumaScope) rawScope;

            var name = (string) rawName;

            var args = (List<FunctionArgument>) rawArguments;

            var body = (BlockExpression) rawBody;
            var function = new KumaFunction(name, args, body, scope);

            object singleton = CompilerServices.CompileExpression(rawSingleton, scope);
            if ((singleton is KumaClass)) {
                var @class = (KumaClass) singleton;
                if (_inClassDefine) {
                    if (@class.Name == _className) {
                        function.IsSingleton = true;
                        return function;
                    }
                    KumaClass.AddMethod(@class.InstanceMethods, function);
                    if (@class.RemovedMethods.Contains(name))
                    {
                        @class.RemovedMethods.Remove(name);
                    }
                    if (@class.UndefinedMethods.Contains(name))
                    {
                        @class.UndefinedMethods.Remove(name);
                    }
                }
                else {
                    KumaClass.AddMethod(@class.InstanceMethods, function);
                    if (@class.RemovedMethods.Contains(name))
                    {
                        @class.RemovedMethods.Remove(name);
                    }
                    if (@class.UndefinedMethods.Contains(name))
                    {
                        @class.UndefinedMethods.Remove(name);
                    }
                }
            }
            else if (singleton is KumaInstance) {
                var @object = (KumaInstance) singleton;
                @object.SingletonMethods[name] = function;
                if (@object.RemovedMethods.Contains(name))
                {
                    @object.RemovedMethods.Remove(name);
                }
                if (@object.UndefinedMethods.Contains(name))
                {
                    @object.UndefinedMethods.Remove(name);
                }
            }

            return function;
        }

        internal static dynamic Call(object func, List<FunctionArgument> args, object scope, KumaExpressionType pipeType, bool isOp, bool isPostfix) {
            if (func == null) {
                if (((KumaScope) scope).GlobalScope["Kernel"] == null) {
                    // map and check Kernel
                }
                throw new NotImplementedException();
            }
            var realArgs = new List<object>();
            var names = new List<string>();
            var offsetCount = 0;
            if (func is KumaFunction && !(func is KumaPartialFunction)) {
                args.ForEach(realArgs.Add);
                realArgs.Insert(0, scope);
                if (realArgs.Count() - 1 < names.Count()) {
                    (func as KumaFunction).Arguments.ForEach(arg => {
                        if (arg.HasDefault) {
                            realArgs.Add(new FunctionArgument(arg.Name, arg.DefaultValue));
                        }
                    });
                }
                offsetCount = 1;
                if (pipeType != KumaExpressionType.Empty) {
                    realArgs.Add(pipeType);
                    offsetCount = 2;
                }
                (func as KumaFunction).SetScope(scope as KumaScope);
            }
            else if (func.GetType() == typeof (InstanceReference)) {
                args.ForEach(realArgs.Add);
                realArgs.Insert(0, scope);
                offsetCount = 1;
                if (pipeType != KumaExpressionType.Empty) {
                    realArgs.Add(pipeType);
                    offsetCount = 2;
                }
                var iref = (InstanceReference) func;
                var lval = CompilerServices.CompileExpression(iref.LValue, (KumaScope) scope);
                var imArgs = new List<Expression>();
                realArgs.ForEach(arg => imArgs.Add(Expression.Constant(arg)));
                imArgs.Insert(0, Expression.Constant(lval, typeof (object)));
                if (isOp) {
                    imArgs.Add(Expression.Constant(new KumaUnaryBoolean(isPostfix)));
                }
                if (iref.LValue is VariableExpression &&
                    CompilerServices.CompileExpression((iref.LValue as VariableExpression).Name, (KumaScope) scope) ==
                    "super") {
                    imArgs.Add(Expression.Constant(new KumaDoNotWrapBoolean(true)));
                }
                return Dynamic(typeof (object),
                    new InteropBinder.InvokeMember(iref.Key, new CallInfo(realArgs.Count - offsetCount, names),
                        (KumaScope) scope), imArgs);
            }
            else {
                // Kuma name logic does not work here
                args.ForEach(arg => realArgs.Add(CompilerServices.CompileExpression(arg.Value, scope as KumaScope)));
            }

            var bArgs = new List<Expression>();
            realArgs.ForEach(arg => bArgs.Add(Expression.Constant(ConvertIfNumber(arg))));
            bArgs.Insert(0, Expression.Constant(func, typeof (object)));
            return Dynamic(typeof (object),
                new InteropBinder.Invoke(scope as KumaScope,
                    new CallInfo(realArgs.Count - offsetCount, names)), bArgs);
        }

        internal static dynamic GenDelegate(object @delegate, List<object> @params, object scope)
        {
            var multicastDelegate = @delegate as MulticastDelegate;
            var realParams = new List<object>();
            @params.ForEach( p => realParams.Add(p is KumaNumber ? KumaNumber.Convert((KumaNumber)p) : p) );

            return multicastDelegate != null ? multicastDelegate.DynamicInvoke(realParams.ToArray()) : null;
        }

        internal static dynamic Yield(object function, List<FunctionArgument> values, object scope) {
            if (!(function is MulticastDelegate)) return Call(function, values, scope, KumaExpressionType.Empty, false, false);
            var p = new List<object>();
            values.ForEach(val => p.Add(CompilerServices.CompileExpression(val.Value, scope as KumaScope)));
            return GenDelegate(function, p, scope);
        }


        private static bool HasParent(KumaInstance KumaObject, Type type) {
            var @class = KumaObject.Class;
            do {
                if (@class is KumaBoxedClass && ((KumaBoxedClass) @class).BoxedType == type) {
                    return true;
                }
            } while ((@class = @class.Parent) != null);
            return false;
        }

        internal static dynamic Invoke(Type targetType, MethodBase minfo, List<FunctionArgument> args,
            KumaScope scope) {
            var isClassMethod = minfo.IsStatic;

            object target = scope.Variables.ContainsKey("self")
                ? scope["self"]
                : isClassMethod ? targetType : targetType.GetConstructor(new Type[] {}).Invoke(null);

            var arguments = new List<object>();
            args.ForEach(arg => {
                var _val = CompilerServices.CompileExpression(arg.Value, scope);
                if (_val is KumaString) {
                    _val = (string) _val;
                }
                if (_val is KumaNumber)
                {
                    _val = KumaNumber.Convert((KumaNumber) _val);
                }
                arguments.Add(_val);
            });

            while (arguments.Count < minfo.GetParameters().Count()) {
                arguments.Add(null);
            }

            if (minfo.IsConstructor) {
                var ctor = (ConstructorInfo) minfo;
                return ctor.Invoke(arguments.ToArray());
            }

            if (target is KumaInstance && !(target is KumaBoxedInstance) &&
                ((KumaInstance) target).BackingObject != null) {
                target = ((KumaInstance) target).BackingObject;
            }

            dynamic val = null;

            if (((MethodInfo) minfo).ReturnType != typeof (void)) {
                val = minfo.Invoke(target, arguments.ToArray());
            }
            else {
                minfo.Invoke(target, arguments.ToArray());
            }

            return val;
        }
    }
}