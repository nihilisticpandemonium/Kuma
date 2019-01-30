// -----------------------------------------------------------------------
// <copyright file="KumaToken.cs" Company="NihilisticPandemonium">
// Copyright 2019 NihilisticPandemonium
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
// ----------------------------------------------------------------------

using Antlr4.Runtime;
using Microsoft.Scripting;

namespace Kuma.Lexer
{
  /// <summary>
  ///     Token used by Kuma, deriving from CommonToken.
  /// </summary>
  public abstract class KumaToken : CommonToken
  {
    protected KumaToken(int type, string text) : base(type, text) { }

    public SourceSpan Span { get; internal set; }

    public KumaTokenCategory Category { get; protected set; }
  }

  public enum KumaTokenCategory
  {
    Keyword,
    Identifier,
    Number,
    String,
    Comment,
    Normal
  }

  public class KumaToken<T> : KumaToken
  {
    public KumaToken(int type, string text) : this(type, text, default) { }

    public KumaToken(int type, string text, T value, KumaTokenCategory category = KumaTokenCategory.Normal) : base(type, text)
    {
      Value = value;

      Category = category;
    }

    public T Value { get; set; }
  }
}