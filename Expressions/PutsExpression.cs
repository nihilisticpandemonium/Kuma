// -----------------------------------------------------------------------
// <copyright file="PutsExpression.cs" Company="Michael Tindal">
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
using System.Linq.Expressions;
using System.Reflection;
using Kuma.Runtime;

namespace Kuma.Expressions {
    /// <summary>
    ///     TODO: Update summary.
    /// </summary>
    public class PutsExpression : KumaExpression {
        private static readonly MethodInfo Method = typeof (Console).GetMethod("WriteLine", new[] {typeof (string)});

        internal PutsExpression(Expression value) {
            Value = value;
        }

        public Expression Value { get; private set; }

        public override Type Type {
            get { return Method.ReturnType; }
        }

        public override Expression Reduce() {
            return Call(null, Method, Value);
        }

        public override void SetChildrenScopes(KumaScope scope) {
            Value.SetScope(scope);
        }

        public override string ToString() {
            return string.Format("puts {0}", Value);
        }
    }
}