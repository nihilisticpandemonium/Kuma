// -----------------------------------------------------------------------
// <copyright file="BinaryExpression.cs" Company="Michael Tindal">
// Copyright 2011-2013 Michael Tindal
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use file except in compliance with the License.
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
using System.Linq.Expressions;
using Kuma.Runtime;

namespace Kuma.Expressions {
    /// <summary>
    ///     TODO: Update summary.
    /// </summary>
    public class BinaryExpression : KumaExpression {
        private readonly bool _isKumaBinary;

        internal BinaryExpression(Expression left, Expression right, ExpressionType type) {
            Left = left;
            Right = right;
            BinaryNodeType = type;
            _isKumaBinary = false;
        }

        internal BinaryExpression(Expression left, Expression right, KumaExpressionType type) {
            Left = left;
            Right = right;
            KumaBinaryNodeType = type;
            _isKumaBinary = true;
        }

        public ExpressionType BinaryNodeType { get; private set; }

        public KumaExpressionType KumaBinaryNodeType { get; private set; }

        public Expression Left { get; private set; }

        public Expression Right { get; private set; }

        public override Type Type {
            get {
                if (_isKumaBinary) {
                    if (KumaBinaryNodeType == KumaExpressionType.Compare) {
                        return typeof (int);
                    }
                    return typeof (bool);
                }
                switch (BinaryNodeType) {
                    case ExpressionType.AndAlso:
                        return typeof (bool);
                    case ExpressionType.Equal:
                        return typeof (bool);
                    case ExpressionType.GreaterThan:
                        return typeof (bool);
                    case ExpressionType.GreaterThanOrEqual:
                        return typeof (bool);
                    case ExpressionType.LessThan:
                        return typeof (bool);
                    case ExpressionType.LessThanOrEqual:
                        return typeof (bool);
                    case ExpressionType.NotEqual:
                        return typeof (bool);
                    case ExpressionType.OrElse:
                        return typeof (bool);
                    default:
                        return typeof (object);
                }
            }
        }

        private static Expression Convert<T>(Expression e) {
            return Convert(e, typeof (T));
        }

        public override Expression Reduce() {
            if (_isKumaBinary) {
                switch (KumaBinaryNodeType)
                {
                    case KumaExpressionType.Compare:
                        return ReduceCompare();
                    case KumaExpressionType.LogicalXor:
                        return ReduceLogicalXor();
                    case KumaExpressionType.Match:
                        return ReduceMatch();
                    case KumaExpressionType.NotMatch:
                        return ReduceMatch();
                }

            }
            if (BinaryNodeType == ExpressionType.OrElse || BinaryNodeType == ExpressionType.AndAlso) {
                return MakeBinary(BinaryNodeType, Convert<bool>(Left), Convert<bool>(Right));
            }
            return Operation.Binary(Type, Convert<object>(Left), Convert<object>(Right), Constant(BinaryNodeType),
                Constant(Scope));
        }

        protected Expression ReduceCompare() {
            return Operation.Compare(typeof (int), Convert(Left, typeof (object)), Convert(Right, typeof (object)),
                Constant(Scope));
        }

        protected Expression ReduceLogicalXor() {
            return new IfExpression(
                new BinaryExpression(Left, Right, ExpressionType.AndAlso),
                Constant(false),
                new IfExpression(
                    new BinaryExpression(Left, Right, ExpressionType.OrElse),
                    Constant(true),
                    Constant(false)
                    )
                );
        }

        protected Expression ReduceMatch()
        {
            return Operation.Match(typeof (bool), Constant(Left), Constant(Right), Constant(KumaBinaryNodeType), Constant(Scope));
        }

        public override void SetChildrenScopes(KumaScope scope) {
            Left.SetScope(scope);
            Right.SetScope(scope);
        }

        public override string ToString() {
            var ops = new Dictionary<ExpressionType, string>();
            ops[ExpressionType.Add] = "+";
            ops[ExpressionType.And] = "&";
            ops[ExpressionType.AndAlso] = "&&";
            ops[ExpressionType.Divide] = "/";
            ops[ExpressionType.Equal] = "==";
            ops[ExpressionType.ExclusiveOr] = "^";
            ops[ExpressionType.GreaterThan] = ">";
            ops[ExpressionType.GreaterThanOrEqual] = ">=";
            ops[ExpressionType.LeftShift] = "<<";
            ops[ExpressionType.LessThan] = "<";
            ops[ExpressionType.LessThanOrEqual] = "<=";
            ops[ExpressionType.Modulo] = "%";
            ops[ExpressionType.Multiply] = "*";
            ops[ExpressionType.NotEqual] = "!=";
            ops[ExpressionType.Or] = "|";
            ops[ExpressionType.OrElse] = "||";
            ops[ExpressionType.Power] = "**";
            ops[ExpressionType.RightShift] = ">>";
            ops[ExpressionType.Subtract] = "-";
            return string.Format("({0} {1} {2})", Left, ops[BinaryNodeType], Right);
        }
    }
}