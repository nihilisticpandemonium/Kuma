// -----------------------------------------------------------------------
// <copyright file="DynamicScope.cs" Company="Michael Tindal">
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

using System;
using System.Linq;
using System.Linq.Expressions;
using System.Reflection;
using Kuma.Builtins;
using Kuma.Runtime;
using Microsoft.Scripting.Hosting;

namespace Kuma {
  /// <summary>
  ///     Main class for users of Kuma.
  /// </summary>
  public static class Kuma {
    private static readonly LanguageSetup _KumaSetup =
      new LanguageSetup ("Kuma.Runtime.KumaContext,Kuma,Version=0.5.0.0,Culture=neutral",
        "Kuma 0.5", new [] { "kuma" }, new [] { ".kuma" });

    static Kuma () {
      Globals = CreateRuntime ().GetEngine ("Kuma").CreateScope ();
      new Kernel ();
    }

    public static KumaScope CurrentContext { get; internal set; }

    public static ScriptScope Globals { get; private set; }

    /// <summary>
    ///     Generate a FunctionArgument object to be used for named arguments when calling Kuma functions from a .NET
    ///     language.
    /// </summary>
    /// <example>(Where testfunc is a Kuma dynamic function): testfunc(Kuma.Arg("b",2),10);</example>
    /// <param name="name">Name of the argument.</param>
    /// <param name="value">Value for the argument.</param>
    public static FunctionArgument Arg (dynamic name, dynamic value) {
      return new FunctionArgument (name.ToString (), Expression.Constant (value));
    }

    /// <summary>
    ///     Returns a KumaNativeFunction invokable wrapper around the Arg() function that allows you to consume Kuma
    ///     keyword arguments from other languages, pursuant to the limitations of your language.
    /// </summary>
    /// <example>scope.SetVariable("sa",Kuma.GetFunctionArgumentGenerator())</example>
    /// <returns>A KumaNativeFuncton dynamic wrapper around Kuma.Arg(name,value).</returns>
    public static dynamic GetFunctionArgumentGenerator () {
      return new KumaNativeFunction (typeof (Kuma),
        typeof (Kuma).GetMethod ("Arg", BindingFlags.Public | BindingFlags.Static));
    }

    public static dynamic Box (object obj, KumaScope scope = null) {
      return KumaBoxedInstance.Box (obj, scope ?? new KumaScope ());
    }

    public static dynamic BoxNoCache (object obj, KumaScope scope = null) {
      return KumaBoxedInstance.BoxNoCache (obj, scope ?? new KumaScope ());
    }

    public static ScriptRuntime CreateRuntime (params LanguageSetup[] setups) {
      var setup = new ScriptRuntimeSetup ();
      setups.ToList ().ForEach (lsetup => setup.LanguageSetups.Add (lsetup));
      return new ScriptRuntime (setup);
    }

    public static ScriptRuntime CreateRuntime () {
      return CreateRuntime (_KumaSetup);
    }

    public static LanguageSetup CreateKumaSetup () {
      return _KumaSetup;
    }

    public static dynamic Execute (string source, ScriptScope scope) {
      return CreateRuntime ().GetEngine ("Kuma").CreateScriptSourceFromString (source).Execute (scope);
    }

    public static dynamic Execute (string source) {
      return Execute (source, Globals);
    }

    public static dynamic Box (Type type) {
      return KumaClass.BoxClass (type);
    }
  }

  public static class KumaExtensions {
    public static dynamic Eval (this string source) {
      return Kuma.Execute (source);
    }
  }
}