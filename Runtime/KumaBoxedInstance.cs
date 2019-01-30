// -----------------------------------------------------------------------
// <copyright file="KumaBoxedObject.cs" Company="Michael Tindal">
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
using System.Reflection;
using Kuma.Builtins;

namespace Kuma.Runtime {
    public class KumaBoxedInstance : KumaInstance {
        private static readonly Dictionary<object, KumaBoxedInstance> _boxCache =
            new Dictionary<object, KumaBoxedInstance>();

        internal KumaBoxedInstance(object obj, KumaScope scope, KumaClass @class) : base(@class) {
            BoxedObject = obj;
            BoxedScope = scope;
        }

        protected KumaBoxedInstance(object obj, KumaScope scope) : base(GetBoxClass(obj)) {
            BoxedObject = obj;
            BoxedScope = scope;
        }

        internal object BoxedObject { get; private set; }

        internal KumaScope BoxedScope { get; private set; }

        public static KumaBoxedInstance Box(object obj, KumaScope scope = null) {
            if (obj == null) {
                return null;
            }
            if (_boxCache.ContainsKey(obj)) {
                _boxCache[obj].BoxedScope.MergeWithScope(scope ?? new KumaScope());
                return _boxCache[obj];
            }
            var boxed = new KumaBoxedInstance(obj, scope ?? new KumaScope());
            _boxCache[obj] = boxed;
            if (scope != null) {
                string name;
                var _scope = scope.SearchForObject(obj, out name);
                if (_scope != null) {
                    _scope[name] = boxed;
                }
            }
            return boxed;
        }

        public static KumaBoxedInstance BoxNoCache(object obj, KumaScope scope = null) {
            if (obj == null) {
                return null;
            }
            var boxed = new KumaBoxedInstance(obj, scope ?? new KumaScope());
            if (scope != null) {
                string name;
                var _scope = scope.SearchForObject(obj, out name);
                if (_scope != null) {
                    _scope[name] = boxed;
                }
            }
            return boxed;
        }

        public static dynamic Unbox(KumaBoxedInstance obj) {
            _boxCache.Remove(obj.BoxedObject);
            return obj.BoxedObject;
        }

        private static KumaClass GetBoxClass(object obj) {
            return Kuma.Box(obj.GetType());
        }

        // Kuma -> .net
        internal static void SyncInstanceVariablesFrom(KumaInstance KumaObject, object obj) {
            var _fields =
                obj.GetType().GetFields(BindingFlags.Instance | BindingFlags.Public | BindingFlags.NonPublic).ToList();
            KumaObject.InstanceVariables.Variables.Keys.ToList().ForEach(key => {
                var _fq = _fields.Where(field => field.Name == key);
                if (_fq.Any())
                {
                    var val = KumaObject.InstanceVariables[key];
                    if (val is KumaNumber)
                    {
                        val = KumaNumber.Convert(val);
                    }
                    _fq.First().SetValue(obj, val);
                }
            });
        }

        // .net -> Kuma
        internal static void SyncInstanceVariablesTo(KumaInstance KumaObject, object obj) {
            var _fields =
                obj.GetType().GetFields(BindingFlags.Instance | BindingFlags.Public | BindingFlags.NonPublic).ToList();
            _fields.ForEach(field => KumaObject.InstanceVariables[field.Name] = field.GetValue(obj));
        }
    }
}