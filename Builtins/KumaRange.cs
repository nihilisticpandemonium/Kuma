using System.Collections.Generic;

namespace Kuma.Builtins {
    public class KumaRange {
        public int Start { get; private set; }

        public int End { get; private set; }

        public bool Inclusive { get; private set; }

        public KumaRange (int start, int end, bool inclusive = false) {
            Start = start;
            End = end;
            Inclusive = inclusive;
        }

        public override int GetHashCode () {
            return ((Start * 0xFF) / 0xCE) + ((End * 0xEB) / 0xFA) + (Inclusive ? 0xFF3C : 0xCC4D);
        }

        public override bool Equals (object o) {
            if (o.GetType () != typeof (KumaRange)) {
                return false;
            }
            var r = o as KumaRange;
            return r.Start == Start && r.End == End && r.Inclusive == Inclusive;
        }

        public static implicit operator KumaArray (KumaRange range) {
            var l = new List<dynamic> ();
            for (var i = range.Start; range.Inclusive ? i <= range.End : i < range.End; i++) {
                l.Add (i);
            }
            return new KumaArray (l);
        }
    }
}
