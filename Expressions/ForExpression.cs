// -----------------------------------------------------------------------
// <copyright file="Forcs" Company="Michael Tindal">
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

using System;
using System.Collections.Generic;
using System.Linq.Expressions;
using System.Text;
using Kuma.Parser;
using Kuma.Runtime;

namespace Kuma.Expressions {
    /// <summary>
    ///     Represents a standard for loop in Kuma.
    /// </summary>
    public class ForExpression : KumaExpression {
        internal ForExpression(Expression init, Expression test, Expression step, Expression body) {
            Init = init;
            Test = test;
            Step = step;
            Body = body;
        }

        public Expression Init { get; private set; }

        public Expression Test { get; private set; }

        public Expression Step { get; private set; }

        public Expression Body { get; private set; }

        public override Type Type {
            get { return Body.Type; }
        }

        public override Expression Reduce() {
            var forLabel = Label("<kuma_for>");
            VariableExpression forReturn = null;
            LeftHandValueExpression forReturnLh = null;
            var useReturn = true;
            if (Body.Type == typeof (void)) {
                useReturn = false;
            }
            else {
                forReturn = Variable(Constant("<kuma_for_return>"));
                forReturnLh = LeftHandValue(forReturn);
                forReturn.Scope = ((KumaExpression) Body).Scope;
                forReturnLh.Scope = ((KumaExpression) Body).Scope;
            }
            var forTest = Variable(Constant("<kuma_for_test>"));
            var forTestLh = LeftHandValue(forTest);
            forTest.Scope = ((KumaExpression) Body).Scope;
            forTestLh.Scope = ((KumaExpression) Body).Scope;
            var realBody = new List<Expression> {
                Init,
                Label(forLabel),
            };
            var testAssign = Assign(forTestLh, Test);
            realBody.Add(Label(KumaParser.RetryTarget));
            testAssign.Scope = (Body as KumaExpression).Scope;
            realBody.Add(testAssign);
            IfExpression testIf;
            if (useReturn) {
                var returnAssign = Assign(forReturnLh, Body);
                returnAssign.Scope = (Body as KumaExpression).Scope;
                testIf = IfThen(forTest, returnAssign);
            }
            else {
                testIf = IfThen(forTest, Body);
            }
            testIf.Scope = ((KumaExpression) Body).Scope;
            realBody.Add(testIf);
            realBody.Add(Label(KumaParser.ContinueTarget));
            realBody.Add(Step);
            realBody.Add(IfThen(forTest, Goto(forLabel)));
            realBody.Add(Label(KumaParser.BreakTarget));
            if (useReturn) {
                realBody.Add(forReturn);
            }

            var block = new BlockExpression(realBody) {Scope = (Body as KumaExpression).Scope};
            return Convert(block, Type);
        }

        public override void SetChildrenScopes(KumaScope scope) {
            Body.SetScope(scope);
            Init.SetScope(((KumaExpression) Body).Scope);
            Test.SetScope(((KumaExpression) Body).Scope);
            Step.SetScope(((KumaExpression) Body).Scope);
        }

        public override string ToString() {
            var str = new StringBuilder("for (");
            str.AppendFormat("{0}; ", Init);
            str.AppendFormat("{0}; ", Test);
            str.AppendFormat("{0})", Step);
            str.Append(Body);
            return str.ToString();
        }
    }
}