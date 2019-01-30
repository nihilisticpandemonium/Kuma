// -----------------------------------------------------------------------

using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Reflection;
using Kuma.Expressions;
using Kuma.Parser;
using BlockExpression = Kuma.Expressions.BlockExpression;

// <copyright file="KumaPartialFunction.cs" Company="Michael Tindal">
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
    /// <summary>
    ///     TODO: Update summary.
    /// </summary>
    public partial class KumaNativeFunction : KumaFunction {
        private static readonly Dictionary<MethodBase, List<FunctionArgument>> ArgumentCache =
            new Dictionary<MethodBase, List<FunctionArgument>>();

        public KumaNativeFunction(Type target, MethodBase method)
            : base(
                GetExportName(method) ?? (method.IsConstructor ? "new" : method.Name), GenerateArguments(method),
                GenerateBody(target, method), new KumaScope()) {
            Func<MethodBase, bool> chkDoNotExportMethod = t => {
                var a = t.GetCustomAttributes(typeof (KumaDoNotExportAttribute), false).FirstOrDefault();
                return a != null;
            };
            if (chkDoNotExportMethod(method)) {
                Name = "<__doNotExport>";
                return;
            }
            Target = target;
            Method = method;
            NumberOfArguments = method.GetParameters().Count();
        }

        public Type Target { get; private set; }

        public MethodBase Method { get; private set; }

        public int NumberOfArguments { get; private set; }

        public static List<FunctionArgument> GenerateArguments(MethodBase method) {
            if (ArgumentCache.ContainsKey(method)) {
                return ArgumentCache[method];
            }
            var args = new List<FunctionArgument>();
            method.GetParameters().ToList().ForEach(p => {
                var arg = new FunctionArgument(p.Name);
                if (p.GetCustomAttributes(typeof (ParamArrayAttribute), false).Any()) {
                    arg.IsVarArg = true;
                }
                if (p.DefaultValue != null && p.DefaultValue.GetType() != typeof (DBNull)) {
                    arg.HasDefault = true;
                    arg.DefaultValue = Expression.Constant(p.DefaultValue);
                }
                args.Add(arg);
            });
            ArgumentCache[method] = args;
            return args;
        }

        public static BlockExpression GenerateBody(Type type, MethodBase method) {
            var body = new List<Expression>();
            body.Add(
                KumaExpression.Invoke(
                    Expression.Constant(method.IsConstructor ? typeof (KumaInstance) : type, typeof (Type)),
                    Expression.Constant(method, typeof (MethodBase)), ArgumentCache[method]));
            body.Add(Expression.Label(KumaParser.ReturnTarget, Expression.Constant(null, typeof (object))));
            return KumaExpression.KumaBlock(body.ToArray());
        }

        public static string GetExportName(MethodBase t) {
            var a = t.GetCustomAttributes(typeof (KumaExportAttribute), false).FirstOrDefault();
            return a != null ? ((KumaExportAttribute) a).Name : null;
        }

        public override string ToString() {
            return string.Format("[KumaNativeFunction: TargetType={0}, Scope={1}]", Target, Scope);
        }
    }
}