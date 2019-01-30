using System;
using System.Collections.Generic;
using System.Text;
using Kuma.Runtime;

namespace Kuma.Builtins
{
    /// <summary>
    ///     TODO: Update summary.
    /// </summary>
    [KumaExport("Number")]
    public class KumaNumber {
        public KumaNumber()
        {
            _internal = default(int);
            _myType = typeof (int);
        }

        public KumaNumber(object val)
        {
            _internal = val;
            _myType = val.GetType();
        }

        private object _internal { get; set; }

        private Type _myType { get; set; }

        public override int GetHashCode()
        {
            return _internal.GetHashCode();
        }

        public override string ToString()
        {
            return _internal.ToString();
        }

        private static List<Type> _numberTypes = new List<Type>
        {
            typeof (bool),
            typeof (byte),
            typeof (sbyte),
            typeof (short),
            typeof (ushort),
            typeof (int),
            typeof (uint),
            typeof (long),
            typeof (ulong),
            typeof (float),
            typeof (double),
            typeof (decimal)
        };

        public override bool Equals(object obj)
        {
            if (obj is KumaNumber)
            {
                return RuntimeOperations.Convert(((KumaNumber) obj)._internal, _myType) ==
                       RuntimeOperations.Convert(_internal, _myType);
            }
            if (_numberTypes.Contains(obj.GetType()))
            {
                return RuntimeOperations.Convert(obj, _myType) == RuntimeOperations.Convert(_internal, _myType);
            }
            return false;
        }

        public static bool IsConvertable(object o)
        {
            return o != null && _numberTypes.Contains(o.GetType());
        }

        public static dynamic Convert(KumaNumber number)
        {
            return RuntimeOperations.Convert(number._internal, number._myType);
        }

        public static implicit operator bool(KumaNumber n)
        {
            return (bool)n._internal;
        }

        public static implicit operator KumaNumber(bool n)
        {
            return new KumaNumber(n);
        }

        public static implicit operator byte(KumaNumber n)
        {
            return (byte)n._internal;
        }

        public static implicit operator KumaNumber(byte n)
        {
            return new KumaNumber(n);
        }

        public static implicit operator sbyte(KumaNumber n)
        {
            return (sbyte)n._internal;
        }

        public static implicit operator KumaNumber(sbyte n)
        {
            return new KumaNumber(n);
        }

        public static implicit operator short(KumaNumber n)
        {
            return (short)n._internal;
        }

        public static implicit operator KumaNumber(short n)
        {
            return new KumaNumber(n);
        }

        public static implicit operator ushort(KumaNumber n)
        {
            return (ushort)n._internal;
        }

        public static implicit operator KumaNumber(ushort n)
        {
            return new KumaNumber(n);
        }

        public static implicit operator int(KumaNumber n)
        {
            return (int)n._internal;
        }

        public static implicit operator KumaNumber(int n)
        {
            return new KumaNumber(n);
        }

        public static implicit operator uint(KumaNumber n)
        {
            return (uint)n._internal;
        }

        public static implicit operator KumaNumber(uint n)
        {
            return new KumaNumber(n);
        }

        public static implicit operator long(KumaNumber n)
        {
            return (long)n._internal;
        }

        public static implicit operator KumaNumber(long n)
        {
            return new KumaNumber(n);
        }

        public static implicit operator ulong(KumaNumber n)
        {
            return (ulong)n._internal;
        }

        public static implicit operator KumaNumber(ulong n)
        {
            return new KumaNumber(n);
        }

        public static implicit operator float(KumaNumber n)
        {
            return (float)n._internal;
        }

        public static implicit operator KumaNumber(float n)
        {
            return new KumaNumber(n);
        }

        public static implicit operator double(KumaNumber n)
        {
            return (double)n._internal;
        }

        public static implicit operator KumaNumber(double n)
        {
            return new KumaNumber(n);
        }

        public static implicit operator decimal(KumaNumber n)
        {
            return (decimal)n._internal;
        }

        public static implicit operator KumaNumber(decimal n)
        {
            return new KumaNumber(n);
        }

    }
}
