using System.Collections.Generic;

namespace Kuma.Runtime {
    public class KumaModule {
        public KumaModule(string name, KumaScope context, List<object> contents) {
            Name = name;
            Contents = contents;
            Context = context;
        }

        internal KumaModule() {
            Contents = new List<object>();
        }

        public string Name { get; internal set; }

        public List<object> Contents { get; private set; }

        public KumaScope Context { get; internal set; }
    }
}