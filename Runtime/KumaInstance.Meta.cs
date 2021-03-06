// -----------------------------------------------------------------------
// <copyright file="KumaObject.Meta.cs" Company="Michael Tindal">
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
using System.Dynamic;
using System.Linq.Expressions;

namespace Kuma.Runtime {
    /// <summary>
    ///     TODO: Update summary.
    /// </summary>
    public partial class KumaInstance : IKumaDynamicMetaObjectProvider {
        private KumaScope _scope;

        #region IScopeExpression implementation

        public KumaScope Scope {
            get { return _scope; }
        }

        public void SetScope(KumaScope scope) {
            _scope = scope;
        }

        #endregion

        public DynamicMetaObject /*!*/ GetMetaObject(Expression /*!*/ parameter) {
            var m = new Meta(parameter, BindingRestrictions.Empty, this);
            m.SetScope(Scope);
            return m;
        }

        internal sealed class Meta : KumaMetaObject<KumaInstance> {
            public Meta(Expression expression, BindingRestrictions restrictions, KumaInstance value)
                : base(expression, restrictions, value) {}

            private static FunctionArgument Arg(object val) {
                return val as FunctionArgument ?? new FunctionArgument(null, Expression.Constant(val));
            }

            private static DynamicMetaObject DMO(dynamic val) {
                return DynamicMetaObject.Create(val, Expression.Constant(val));
            }

            private static List<FunctionArgument> L(params FunctionArgument[] args) {
                return new List<FunctionArgument>(args);
            }

            private static DynamicMetaObject[] _DMO(params DynamicMetaObject[] args) {
                return args;
            }

            public override DynamicMetaObject BindInvokeMember(InvokeMemberBinder binder,
                params DynamicMetaObject[] args) {
                if (!(Value is KumaBoxedInstance) && Value.BackingObject != null) {
                    KumaBoxedInstance.SyncInstanceVariablesFrom(Value, Value.BackingObject);
                }
                var dmo =
                    InteropBinder.InvokeMember.Bind(
                        new InteropBinder.InvokeMember(binder.Name, binder.CallInfo, Scope), this, args);
                if (!(Value is KumaBoxedInstance) && Value.BackingObject != null) {
                    KumaBoxedInstance.SyncInstanceVariablesTo(Value, Value.BackingObject);
                }
                return dmo;
            }

            public override DynamicMetaObject BindGetMember(GetMemberBinder binder) {
                if (!(Value is KumaBoxedInstance) && Value.BackingObject != null) {
                    KumaBoxedInstance.SyncInstanceVariablesFrom(Value, Value.BackingObject);
                }
                var dmo = InteropBinder.GetMember.Bind(new InteropBinder.GetMember(binder.Name, Scope),
                    this);
                if (!(Value is KumaBoxedInstance) && Value.BackingObject != null) {
                    KumaBoxedInstance.SyncInstanceVariablesTo(Value, Value.BackingObject);
                }
                return dmo;
            }

            public override DynamicMetaObject BindSetMember(SetMemberBinder binder, DynamicMetaObject value) {
                if (!(Value is KumaBoxedInstance) && Value.BackingObject != null) {
                    KumaBoxedInstance.SyncInstanceVariablesFrom(Value, Value.BackingObject);
                }
                var dmo = InteropBinder.SetMember.Bind(new InteropBinder.SetMember(binder.Name, Scope),
                    this, value);
                if (!(Value is KumaBoxedInstance) && Value.BackingObject != null) {
                    KumaBoxedInstance.SyncInstanceVariablesTo(Value, Value.BackingObject);
                }
                return dmo;
            }
        }
    }
}