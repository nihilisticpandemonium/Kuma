// -----------------------------------------------------------------------

using System.Collections.Generic;

// <copyright file="KumaPartialFunction.cs" Company="Michael Tindal">
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

namespace Kuma.Runtime {
    /// <summary>
    ///     TODO: Update summary.
    /// </summary>
    public partial class KumaPartialFunction : KumaFunction {
        public KumaPartialFunction(KumaFunction function, List<FunctionArgument> args, KumaScope scope)
            : base(function.Name, new List<FunctionArgument>(), null, null) {
            WrappedFunction = function;
            PartialArguments = args;
            WrappedScope = scope;
        }

        public KumaFunction WrappedFunction { get; set; }

        internal List<FunctionArgument> PartialArguments { get; set; }

        internal KumaScope WrappedScope { get; set; }

        public override string ToString() {
            return string.Format("[KumaPartialFunction: WrappedFunction={0}, Scope={1}]", WrappedFunction, Scope);
        }
    }
}