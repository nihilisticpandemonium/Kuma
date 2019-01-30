using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;
using Kuma.Parser;
using Kuma.Runtime;

namespace Kuma.Expressions
{
    public class LoopExpression : KumaExpression
    {
        internal LoopExpression(Expression body)
        {
            Body = body;
        }

        public Expression Body { get; private set; }

        public override Type Type => Body.Type;

        public override Expression Reduce()
        {
            var loopLabel = Label("<kuma_loop>");
            ParameterExpression loopReturn = null;
            var useReturn = true;
            if (Body.Type == typeof(void))
            {
                useReturn = false;
            }
            else
            {
                loopReturn = Variable(Body.Type, "<kuma_loop_return>");
            }
            var realBody = new List<Expression> {
                Label(loopLabel),
                Label(KumaParser.ContinueTarget),
                Label(KumaParser.RetryTarget),
                useReturn
                    ? Assign(loopReturn, Body)
                    : Body,
                Goto(loopLabel),
                Label(KumaParser.BreakTarget)
            };
            if (useReturn)
            {
                realBody.Add(Convert(loopReturn, Body.Type));

                return Block(new[] { loopReturn }, realBody);
            }

            return Block(new ParameterExpression[] { }, realBody);
        }

        public override void SetChildrenScopes(KumaScope scope)
        {
            Body.SetScope(scope);
        }

        public override string ToString()
        {
            return $"loop {{ {Body} }}";
        }
    }
}
