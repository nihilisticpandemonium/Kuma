using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;
using Kuma.Runtime;

namespace Kuma.Expressions
{
    public class KumaConstantExpression : KumaExpression
    {
        internal KumaConstantExpression(Expression value)
        {
            Value = value;
        }

        public Expression Value { get; private set; }

        public override Type Type => typeof(object);

        public override Expression Reduce()
        {
            return Operation.Resolve(typeof(object), Value, Constant(Scope));
        }

        public override string ToString()
        {
            return $"{Value}";
        }
    }
}
