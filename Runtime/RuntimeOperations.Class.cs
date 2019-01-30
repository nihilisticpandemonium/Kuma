// -----------------------------------------------------------------------
// <copyright file="RuntimeOperations.Class.cs" Company="Michael Tindal">
// Copyright 2011-2014 Michael Tindal
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

using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using Kuma.Expressions;
using Kuma.Parser;
using Microsoft.Scripting.Runtime;
using BlockExpression = Kuma.Expressions.BlockExpression;

namespace Kuma.Runtime {
    using E = ExpressionType;

    public class InstanceReference {
        public Expression LValue { get; set; }
        public string Key { get; set; }
    }

    public static partial class RuntimeOperations {
        private static bool _inClassDefine; // for nested class
        private static string _className;
        private static KumaScope _currentClassScope;

        private static readonly object _classDefineLock = new object();

        internal static dynamic DefineClass(object rawName, object rawParent, List<Expression> contents, object rawScope) {
            lock (_classDefineLock) {
                if (Resolve(rawName, rawScope) != null) {
                    return DefineCategory(Resolve(rawName, rawScope), contents, rawScope);
                }
                var scope = (KumaScope) rawScope;
                var defineScope = _inClassDefine ? scope : scope.GlobalScope;
                _inClassDefine = true;
                KumaClass parent;
                if (rawParent == null) {
                    if (scope.GlobalScope["Object"] == null) {
                        scope.GlobalScope["Object"] = Kuma.Box(typeof (object));
                    }
                    parent = scope.GlobalScope["Object"];
                }
                else {
                    var dParent = Resolve(rawParent as string, scope);
                    if (dParent == null) {
                        _inClassDefine = false;
                        return null;
                    }
                    if (dParent is Type) {
                        parent = Kuma.Box(dParent);
                    }
                    else {
                        parent = dParent as KumaClass;
                    }
                    if (parent == null) {
                        _inClassDefine = false;
                        return null;
                    }
                }

                var name = (string) rawName;
                _className = name;

                var @class = new KumaClass {Name = _className, Parent = parent};
                var xScope = new KumaScope(scope);
                xScope["self"] = @class;
                xScope[_className] = @class;
                _currentClassScope = xScope;

                contents.ForEach(content => {
                    if (content is IncludeExpression) {
                        // We only include modules here so make sure this include references a module
                        var names = ((IncludeExpression) content).Names;

                        dynamic module = null;

                        var index = 0;
                        names.ForEach(mname => {
                            if ((module is KumaModule)) {
                                module = module.Context[mname];
                            }
                            else if (index == 0) {
                                module = scope[mname];
                            }
                            index = index + 1;
                        });

                        if (module != null) {
                            if (module is KumaModule) {
                                ((KumaModule) module).Contents.ForEach(mcon => {
                                    if (mcon is KumaFunction) {
                                        if ((mcon as KumaFunction).IsSingleton ||
                                            (mcon as KumaFunction).Name == "new") {
                                            KumaClass.AddMethod(@class.ClassMethods, mcon as KumaFunction);
                                        }
                                        else {
                                            KumaClass.AddMethod(@class.InstanceMethods, mcon as KumaFunction);
                                        }
                                        if (@class.RemovedMethods.Contains((mcon as KumaFunction).Name))
                                        {
                                            @class.RemovedMethods.Remove((mcon as KumaFunction).Name);
                                        }
                                        if (@class.UndefinedMethods.Contains((mcon as KumaFunction).Name))
                                        {
                                            @class.UndefinedMethods.Remove((mcon as KumaFunction).Name);
                                        }
                                    }
                                });

                                xScope.MergeWithScope(module.Context);
                            }
                            else if (module is KumaClass) {
                                xScope[((KumaClass) module).Name] = module;
                            }
                        }
                    }
                });

                contents.ForEach(content => {
                    if (!(content is IncludeExpression)) {
                        var result = CompilerServices.CompileExpression(content, xScope);
                        if (result is KumaFunction) {
                            if ((result as KumaFunction).IsSingleton || (result as KumaFunction).Name == "new") {
                                KumaClass.AddMethod(@class.ClassMethods, result as KumaFunction);
                            }
                            else {
                                KumaClass.AddMethod(@class.InstanceMethods, result as KumaFunction);
                            }
                            if (@class.RemovedMethods.Contains((result as KumaFunction).Name))
                            {
                                @class.RemovedMethods.Remove((result as KumaFunction).Name);
                            }
                            if (@class.UndefinedMethods.Contains((result as KumaFunction).Name))
                            {
                                @class.UndefinedMethods.Remove((result as KumaFunction).Name);
                            }
                        }
                    }
                });

                if (!@class.ClassMethods.ContainsKey("new")) {
                    KumaClass.AddMethod(@class.ClassMethods, new KumaFunction("new", new List<FunctionArgument>(),
                        KumaExpression.KumaBlock(
                            KumaExpression.Return(new List<FunctionArgument> {
                                new FunctionArgument(null, KumaExpression.Variable(Expression.Constant("self")))
                            }),
                            Expression.Label(KumaParser.ReturnTarget, Expression.Constant(null, typeof (object)))),
                        new KumaScope()));
                }
                @class.Context = xScope;
                defineScope[@class.Name] = @class;
                _inClassDefine = false;
                return @class;
            }
        }


        internal static dynamic DefineCategory(KumaClass @class, List<Expression> contents, object rawScope) {
            lock (_classDefineLock) {
                var scope = (KumaScope) rawScope;
                _inClassDefine = true;
                _className = @class.Name;

                scope["self"] = @class;
                scope[_className] = @class;
                _currentClassScope = scope;

                contents.ForEach(content => {
                    if (content is IncludeExpression) {
                        // We only include modules here so make sure this include references a module
                        var names = ((IncludeExpression) content).Names;

                        dynamic module = null;

                        var index = 0;
                        names.ForEach(mname => {
                            if (module != null && (module is KumaModule)) {
                                module = module.Context[mname];
                            }
                            else if (index == 0) {
                                module = scope[mname];
                            }
                            index = index + 1;
                        });

                        if (module != null) {
                            if (module is KumaModule) {
                                ((KumaModule) module).Contents.ForEach(mcon => {
                                    if (mcon is KumaFunction) {
                                        if ((mcon as KumaFunction).IsSingleton ||
                                            (mcon as KumaFunction).Name == "new") {
                                            KumaClass.AddMethod(@class.ClassMethods, mcon as KumaFunction);
                                        }
                                        else {
                                            KumaClass.AddMethod(@class.InstanceMethods, mcon as KumaFunction);
                                        }
                                        if (@class.RemovedMethods.Contains((mcon as KumaFunction).Name))
                                        {
                                            @class.RemovedMethods.Remove((mcon as KumaFunction).Name);
                                        }
                                        if (@class.UndefinedMethods.Contains((mcon as KumaFunction).Name))
                                        {
                                            @class.UndefinedMethods.Remove((mcon as KumaFunction).Name);
                                        }
                                    }
                                });

                                scope.MergeWithScope(module.Context);
                            }
                            else if (module is KumaClass) {
                                scope[((KumaClass) module).Name] = module;
                            }
                        }
                    }
                });

                contents.ForEach(content => {
                    if (!(content is IncludeExpression)) {
                        var result = CompilerServices.CompileExpression(content, scope);
                        if (result is KumaFunction) {
                            if ((result as KumaFunction).IsSingleton) {
                                KumaClass.AddMethod(@class.ClassMethods, result as KumaFunction);
                            }
                            else {
                                KumaClass.AddMethod(@class.InstanceMethods, result as KumaFunction);
                            }
                            if (@class.RemovedMethods.Contains((result as KumaFunction).Name))
                            {
                                @class.RemovedMethods.Remove((result as KumaFunction).Name);
                            }
                            if (@class.UndefinedMethods.Contains((result as KumaFunction).Name))
                            {
                                @class.UndefinedMethods.Remove((result as KumaFunction).Name);
                            }
                        }
                    }
                });

                @class.Context.MergeWithScope(scope);
                return @class;
            }
        }

        internal static dynamic DefineClassOpen(object rawValue, List<Expression> contents, object rawScope)
        {
            var scope = (KumaScope) rawScope;

            var value = CompilerServices.CompileExpression((Expression) rawValue, scope);

            if (value == null)
                return null;

            var @class = value as KumaClass;
            if (@class != null)
            {
                return DefineCategory(@class, contents, scope);
            }
            var instance = value as KumaInstance;
            if (instance != null)
            {
                return DefineCategory(instance.Class, contents, scope);
            }
            var newVal = Kuma.Box(value);
            return DefineCategory(((KumaInstance)newVal).Class, contents, scope);
        }
  
        internal static dynamic DefineModule(object rawName, List<Expression> contents, object rawScope) {
            lock (_classDefineLock) {
                var scope = (KumaScope) rawScope;
                var defineScope = _inClassDefine ? scope : scope.GlobalScope;

                var name = (string) rawName;

                var xScope = new KumaScope(scope);

                var module = new KumaModule {Name = name, Context = scope};

                contents.ForEach(content => module.Contents.Add(CompilerServices.CompileExpression(content, xScope)));

                defineScope[module.Name] = module;

                return module;
            }
        }

        internal static dynamic InstanceRef(Expression lvalue, object key) {
            // Try to compile lvalue to check for type
            return new InstanceReference {LValue = lvalue, Key = (string) key};
        }

        internal static dynamic Include(List<string> names) {
            // this has a different meaning when were defining classes
            if (!_inClassDefine) {
                var s = new StringBuilder();
                names.ForEach(name => s.AppendFormat("{0}.", name));
                s.Remove(s.Length - 1, 1);
                KumaTypeResolver.Include(s.ToString());
                return null;
            }
            return null;
        }

        internal static dynamic Sync(object rawName, object rawBlock, object rawScope)
        {
            var varName = (string) rawName;
            var block = (Expression) rawBlock;
            var scope = (KumaScope) rawScope;

            var var = scope[varName];

            dynamic retVal = null;

            lock (var)
            {
                retVal = CompilerServices.CompileExpression(block, scope);
            }

            return retVal;
        }

        internal static dynamic ObjectMethodChange(object rawSelf, object rawName, bool isRemove, object rawScope)
        {
            var scope = (KumaScope) rawScope;
            var name = (string)rawName;

            var self = CompilerServices.CompileExpression((Expression) rawSelf, scope);

            var @class = self as KumaClass;
            if (@class != null)
            {
                if (isRemove)
                {
                    @class.RemovedMethods.Add(name);
                }
                else
                {
                    @class.UndefinedMethods.Add(name);
                }
            }
            else
            {
                var instance = self as KumaInstance;
                if (instance != null)
                {
                    if (isRemove)
                    {
                        instance.RemovedMethods.Add(name);
                    }
                    else
                    {
                        instance.UndefinedMethods.Add(name);
                    }
                }
                else
                {
                    var newVal = Kuma.Box(self);
                    if (isRemove)
                    {
                        ((KumaInstance)newVal).RemovedMethods.Add(name);
                    }
                    else
                    {
                        ((KumaInstance)newVal).UndefinedMethods.Add(name);
                    }
                }
            }


            return null;
        }

        internal static dynamic MethodChange(object rawName, bool isRemove)
        {
            if (!_inClassDefine)
            {
                return null;
            }

            var name = (string)rawName;


            KumaClass @class = _currentClassScope[_className];
            if (isRemove)
            {
                @class.RemovedMethods.Add(name);
            }
            else
            {
                @class.UndefinedMethods.Add(name);
            }

            return null;
        }

        internal static dynamic Switch(object rawTest, List<SwitchCase> cases, object rawDefaultBlock, object rawScope)
        {
            var test = (Expression) rawTest;
            var defaultBlock = rawDefaultBlock != null
                ? (Expression) rawDefaultBlock
                : KumaExpression.KumaBlock(KumaExpression.Default(cases.First().Body.Type));
            var scope = (KumaScope) rawScope;

            dynamic retVal = null;

            var found = false;
            var tval = CompilerServices.CompileExpression(test, scope);
            foreach (var @case in cases.Where(@case => @case.TestValues.Select(testValue => CompilerServices.CompileExpression(testValue, scope))
                .Any(xval => Binary(tval, xval, E.Equal, scope))))
            {
                found = true;
                retVal = CompilerServices.CompileExpression(@case.Body, scope);
            }

            if (!found)
            {
                retVal = CompilerServices.CompileExpression(defaultBlock, scope);
            }

            return retVal;
        }
    }
}