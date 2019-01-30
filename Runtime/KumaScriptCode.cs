// -----------------------------------------------------------------------
// <copyright file="KumaScriptCode.cs" company="Michael Tindal">
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

using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Xml.Schema;
using Kuma.Expressions;
using Kuma.Builtins;
using Microsoft.Scripting;
using Microsoft.Scripting.Runtime;
using BlockExpression = Kuma.Expressions.BlockExpression;

namespace Kuma.Runtime {
    /// <summary>
    ///     TODO: Update summary.
    /// </summary>
    public class KumaScriptCode : ScriptCode {
        public KumaScriptCode(Expression body, SourceUnit sourceUnit) : base(sourceUnit) {
            Body = body;
        }

        /// <summary>
        ///     Returns the body associated with this script code.
        /// </summary>
        public Expression Body { get; private set; }

        private dynamic ConvertElements(KumaArray res)
        {
            for (var i = 0; i < res.Count(); i++)
            {
                if (res[i] is KumaString)
                {
                    res[i] = (string)res[i];
                }
                if (res[i] is KumaNumber)
                {
                    res[i] = KumaNumber.Convert(res[i]);
                }
                if (res[i] is KumaArray)
                {
                    res[i] = ConvertElements((KumaArray)res[i]);
                }
                if (res[i] is KumaDictionary)
                {
                    res[i] = ConvertElements((KumaDictionary)res[i]);
                }
            }
            return res;
        }

        private dynamic ConvertElements(KumaDictionary res)
        {
            List<dynamic> keysToRemove = new List<object>();
            keysToRemove.AddRange(res.Keys.OfType<KumaString>());
            keysToRemove.ForEach(o =>
            {
                string s = o;
                var val = res[o];
                res.Remove(o);
                res[s] = val;
            });

            keysToRemove.Clear();

            keysToRemove.AddRange(
                res.Keys.Where(
                    key =>
                        res[key] is KumaString || res[key] is KumaNumber || res[key] is KumaArray ||
                        res[key] is KumaDictionary));

            keysToRemove.ForEach(o =>
            {
                if (res[o] is KumaString)
                {
                    string s = res[o];
                    res[o] = s;
                }
                else if (res[o] is KumaNumber)
                {
                    res[o] = KumaNumber.Convert(res[o]);
                }
                else if (res[o] is KumaArray)
                {
                    res[o] = ConvertElements((KumaArray) res[o]);
                }
                else if (res[o] is KumaDictionary)
                {
                    res[o] = ConvertElements((KumaDictionary) res[o]);
                }
            });

            return res;
        }

        public override object Run(Scope scope) {
            var body = (Body as BlockExpression);
            body.Scope.MergeWithScope(Kuma.Globals);
            body.Scope.MergeWithScope(scope);

            var visitor = new VariableNameVisitor();
            visitor.Visit(body);

            body.SetChildrenScopes(body.Scope);

            var block = CompilerServices.CreateLambdaForExpression(body);
            var res = block();

            if (res is Symbol) {
                var symval = new BlockExpression(new List<Expression> {new VariableExpression(res)}, body.Scope);
                res = CompilerServices.CreateLambdaForExpression(symval)();
            }
            else if (res is KumaInstance) {
                var so = (KumaInstance) res;
                if (so is KumaBoxedInstance) {
                    res = ((KumaBoxedInstance) so).BoxedObject;
                }
            }
            else if (res is KumaNumber)
            {
                res = KumaNumber.Convert(res);
            }
            else if (res is KumaString) {
                res = (string) res;
            }
            else if (res is KumaArray) {
                res = ConvertElements((KumaArray)res);
            }
            else if (res is KumaDictionary) {
                res = ConvertElements((KumaDictionary)res);
            }

            body.Scope.MergeIntoScope(scope);

            return res;
        }

        internal object Run(KumaScope scope) {
            var body = (BlockExpression) Body;

            body.SetScope(scope);

            body.SetChildrenScopes(body.Scope);

            var block = CompilerServices.CreateLambdaForExpression(Expression.Block(body));

            var res = block();

            if (res is Symbol) {
                var symval = new BlockExpression(new List<Expression> {new VariableExpression(res)}, body.Scope);
                res = CompilerServices.CreateLambdaForExpression(symval)();
            }

            return res;
        }
    }
}