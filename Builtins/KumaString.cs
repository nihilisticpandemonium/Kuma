using System.Text;
using Kuma.Runtime;

namespace Kuma.Builtins {
    /// <summary>
    ///     TODO: Update summary.
    /// </summary>
    [KumaExport("String")]
    public class KumaString {
        public KumaString() {
            _internal = new StringBuilder();
        }

        public KumaString(string @string) {
            _internal = new StringBuilder(@string);
        }

        private StringBuilder _internal { get; set; }

        public override int GetHashCode() {
            return _internal.ToString().GetHashCode();
        }

        public override string ToString() {
            return _internal.ToString();
        }

        public override bool Equals(object obj) {
            if (obj is KumaString) {
                return ((KumaString) obj)._internal.ToString() == _internal.ToString();
            }
            if (obj is string) {
                return (string) obj == _internal.ToString();
            }
            return false;
        }

        [KumaExport("<<")]
        public void StringAdd(dynamic val) {
            _internal.Append((string) val);
        }

        public static implicit operator string(KumaString s) {
            return s._internal.ToString();
        }

        public static implicit operator KumaString(string s) {
            return new KumaString(s);
        }
    }
}