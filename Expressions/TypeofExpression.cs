// -----------------------------------------------------------------------
// <copyright file="TypeofExpression.cs" Company="Michael Tindal">
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
using Kuma.Runtime;

namespace Kuma.Expressions {
    /// <summary>
    ///     TODO: Update summary.
    /// </summary>
    public class TypeofExpression : KumaExpression {
        internal TypeofExpression(Expression e) {
            Expression = e;
        }

        public Expression Expression { get; private set; }

        public override Type Type {
            get { return typeof (Type); }
        }

        public override Expression Reduce() {
            return Operation.Typeof(typeof (Type), Convert(Expression, typeof (object)));
        }

        public override void SetChildrenScopes(KumaScope scope) {
            Expression.SetScope(scope);
        }

        public override string ToString() {
            return string.Format("typeof({0})", Expression);
        }
    }
}