// -----------------------------------------------------------------------
// <copyright file="KumaObject.cs" Company="Michael Tindal">
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

using System.Collections.Generic;

namespace Kuma.Runtime {
    /// <summary>
    ///     TODO: Update summary.
    /// </summary>
    public partial class KumaInstance {
        #region Properties

        internal KumaClass _class;

        public Dictionary<string, KumaFunction> SingletonMethods { get; private set; }

        public KumaScope InstanceVariables { get; private set; }

        public List<string> UndefinedMethods { get; private set; }

        public List<string> RemovedMethods { get; private set; }

        public KumaClass Class {
            get { return _class; }
        }

        internal object BackingObject { get; set; }

        #endregion

        public KumaInstance(KumaClass @class) {
            _class = @class;
            SingletonMethods = new Dictionary<string, KumaFunction>();
            UndefinedMethods = new List<string>();
            RemovedMethods = new List<string>();
            InstanceVariables = new KumaScope();
        }

        public override string ToString() {
            return
                string.Format(
                    "[KumaInstance: SingletonMethods={0}, InstanceVariables={1}, UndefinedMethods={2}, RemovedMethods={3}, Class={4}, Scope={5}]",
                    SingletonMethods, InstanceVariables, UndefinedMethods, RemovedMethods, Class, Scope);
        }
    }
}