// -----------------------------------------------------------------------
// <copyright file="KumaClass.cs" Company="Michael Tindal">
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
using System.Linq;
using System.Linq.Expressions;
using System.Reflection;
using System.Text;
using Kuma.Expressions;
using Kuma.Parser;

namespace Kuma.Runtime {
    /// <summary>
    ///     TODO: Update summary.
    /// </summary>
    public partial class KumaClass {
        #region Properties

        internal static readonly Dictionary<Type, KumaClass> TypeCache = new Dictionary<Type, KumaClass>();

        public Dictionary<string, KumaMethodTable> ClassMethods { get; private set; }

        public Dictionary<string, KumaMethodTable> InstanceMethods { get; private set; }

        public List<string> UndefinedMethods { get; private set; }

        public List<string> RemovedMethods { get; private set; }

        public KumaScope Context { get; internal set; }

        public string Name { get; internal set; }

        public KumaClass Parent { get; internal set; }

        #endregion

        public KumaClass(string name, KumaClass parent, List<KumaFunction> classMethods,
            List<KumaFunction> instanceMethods) {
            Name = name;
            ClassMethods = new Dictionary<string, KumaMethodTable>();
            classMethods.ForEach(func => AddMethod(ClassMethods, func));
            if (!ClassMethods.ContainsKey("new")) {
                AddMethod(ClassMethods, new KumaFunction("new", new List<FunctionArgument>(),
                    KumaExpression.KumaBlock(
                        KumaExpression.Return(new List<FunctionArgument> {
                            new FunctionArgument(null, KumaExpression.Variable(Expression.Constant("self")))
                        }),
                        Expression.Label(KumaParser.ReturnTarget, Expression.Constant(null, typeof (object)))),
                    new KumaScope()));
            }
            InstanceMethods = new Dictionary<string, KumaMethodTable>();
            instanceMethods.ForEach(func => AddMethod(InstanceMethods, func));
            UndefinedMethods = new List<string>();
            RemovedMethods = new List<string>();
            Context = new KumaScope();
            Parent = parent;
        }

        internal KumaClass() {
            ClassMethods = new Dictionary<string, KumaMethodTable>();
            InstanceMethods = new Dictionary<string, KumaMethodTable>();
            UndefinedMethods = new List<string>();
            RemovedMethods = new List<string>();
            Context = new KumaScope();
        }

        public static KumaClass BoxClass(Type type) {
            Func<Type, bool> chkDoNotExport = t => {
                var a = t.GetCustomAttributes(typeof (KumaDoNotExportAttribute), false).FirstOrDefault();
                return a != null;
            };
            if (chkDoNotExport(type)) {
                return null;
            }

            if (TypeCache.ContainsKey(type)) {
                return TypeCache[type];
            }

            var @class = type.IsInterface ? new KumaInterface() : (KumaClass) new KumaBoxedClass();
            type.GetMethods(BindingFlags.Static | BindingFlags.Public | BindingFlags.NonPublic)
                .ToList().
                ForEach(method => AddMethod(@class.ClassMethods, new KumaNativeFunction(type, method)));
            type.GetMethods(BindingFlags.Instance | BindingFlags.Public | BindingFlags.NonPublic)
                .ToList().
                ForEach(method => AddMethod(@class.InstanceMethods, new KumaNativeFunction(type, method)));
            type.GetConstructors()
                .ToList().
                ForEach(ctor => AddMethod(@class.ClassMethods, new KumaNativeFunction(type, ctor)));

            Func<Type, KumaClass> genBaseType = t => {
                if (t.BaseType != null) {
                    return TypeCache.ContainsKey(t.BaseType) ? TypeCache[t.BaseType] : BoxClass(t.BaseType);
                }
                return null;
            };

            Func<Type, string> getExportName = t => {
                var a = t.GetCustomAttributes(typeof (KumaExportAttribute), false).FirstOrDefault();
                return a != null ? ((KumaExportAttribute) a).Name : null;
            };

            if (@class is KumaBoxedClass) {
                ((KumaBoxedClass) @class).BoxedType = type;
            }

            @class.Name = getExportName(type) ?? type.Name;
            @class.Parent = genBaseType(type);
            TypeCache[type] = @class;
            return @class;
        }

        public static void AddMethod(IDictionary<string, KumaMethodTable> dict, KumaFunction func) {
            if (func.Name == "<__doNotExport>") {
                return;
            }
            if (!dict.ContainsKey(func.Name)) {
                dict[func.Name] = new KumaMethodTable(func.Name);
            }


            dict[func.Name].AddFunction(func);
        }

        public void Merge(KumaClass klass) {
            foreach (var key in klass.ClassMethods.Keys) {
                KumaMethodTable table;
                if (ClassMethods.ContainsKey(key)) {
                    table = ClassMethods[key];
                }
                else {
                    table = new KumaMethodTable(key);
                }
                foreach (var func in klass.ClassMethods[key].Functions) {
                    table.AddFunction(func);
                }
            }

            foreach (var key in klass.InstanceMethods.Keys) {
                KumaMethodTable table;
                if (InstanceMethods.ContainsKey(key)) {
                    table = InstanceMethods[key];
                }
                else {
                    table = new KumaMethodTable(key);
                }
                foreach (var func in klass.InstanceMethods[key].Functions) {
                    table.AddFunction(func);
                }
            }

            Context.MergeWithScope(klass.Context);
        }

        public override string ToString() {
            var builder = new StringBuilder("KumaClass: ");
            builder.Append(Name);
            builder.AppendLine(":");
            builder.AppendLine("  Class Methods:");
            foreach (var func in ClassMethods) {
                builder.AppendFormat("    {0}", func);
                builder.AppendLine();
            }
            builder.AppendLine("  Instance Methods:");
            foreach (var func in InstanceMethods) {
                builder.AppendFormat("    {0}", func);
                builder.AppendLine();
            }
            if (Parent != null) {
                builder.AppendLine("Parent: ");
                builder.Append(Parent);
                builder.AppendLine();
            }
            return builder.ToString();
        }
    }
}