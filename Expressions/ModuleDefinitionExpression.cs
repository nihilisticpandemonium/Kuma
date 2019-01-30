using System;
using System.Collections.Generic;
using System.Linq.Expressions;
using Kuma.Runtime;

namespace Kuma.Expressions {
    using CS = CompilerServices;

    public class ModuleDefinitionExpression : KumaExpression {
        internal ModuleDefinitionExpression(string name, List<Expression> contents) {
            Name = name;
            Contents = contents;
        }

        public string Name { get; private set; }

        public List<Expression> Contents { get; private set; }

        public override Type Type {
            get { return typeof (KumaModule); }
        }

        public override string ToString() {
            return "";
        }

        public override Expression Reduce() {
            return Operation.DefineModule(typeof (KumaModule), Constant(Name), Constant(Contents), Constant(Scope));
        }

        public override void SetChildrenScopes(KumaScope scope) {
            Contents.ForEach(content => content.SetScope(scope));
        }
    }
}