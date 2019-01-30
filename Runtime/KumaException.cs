using System;

namespace Kuma.Runtime {
    // Used to throw a Kuma-based exception class
    [KumaDoNotExport]
    public class KumaException : Exception {
        public KumaException(KumaInstance obj) {
            var klass = obj.Class;

            var exceptionFound = false;
            var _class = obj.Class;
            do {
                if (_class.Name.Equals("Exception")) {
                    exceptionFound = true;
                    break;
                }
                _class = _class.Parent;
            } while (!exceptionFound && _class != null);

            if (exceptionFound) {
                ExceptionClass = klass;
                InnerObject = obj;
            }
            else {
                ExceptionClass = Kuma.Box(typeof (KumaException));
                InnerObject = null;
            }
        }

        public KumaInstance InnerObject { get; private set; }

        public KumaClass ExceptionClass { get; private set; }
    }
}