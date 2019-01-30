// -----------------------------------------------------------------------
// <copyright file="KumaLexer.partial.cs" Company="NihilisticPandemonium">
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

using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using Microsoft.Scripting;
using Kuma.Parser;

#pragma warning disable 162

namespace Kuma.Lexer
{
  /// <summary>
  ///     Extra methods for lexer
  /// </summary>
  public partial class KumaLexer
  {
    private readonly Dictionary<int, int> _lineIndexes = new Dictionary<int, int>();
    private string[] _lines;

    public string CreateString()
    {
      return data.Substring(ts, (te - ts));
    }

    public void Token(string name, KumaTokenCategory category = KumaTokenCategory.Normal)
    {
      var text = CreateString();
      Queue.AddToken(name, text, text);
    }

    public void Token<T>(string name, T value, KumaTokenCategory category = KumaTokenCategory.Normal)
    {
      Queue.AddToken(name, CreateString(), value);
    }

    public void Keyword(string name)
    {
      Token(name, KumaTokenCategory.Keyword);
    }

    public void Symbol(string name)
    {
      Token(name, KumaTokenCategory.Identifier);
    }

    public void Number()
    {
      var text = CreateString();
      Queue.AddToken("NUMBER", text, double.Parse(text), KumaTokenCategory.Number);
    }

    public void Integer()
    {
      var text = CreateString();
      Queue.AddToken("INTEGER", text, int.Parse(text), KumaTokenCategory.Number);
    }

    public void Hex()
    {
      var text = CreateString();
      Queue.AddToken("INTEGER", text, int.Parse(text.Substring(2), NumberStyles.HexNumber), KumaTokenCategory.Number);
    }

    public void String()
    {
      var text = CreateString();
      Queue.AddToken("STRING", text, text.Substring(1, text.Length - 2), KumaTokenCategory.String);
    }

    public void Regex()
    {
      var text = CreateString();
      Queue.AddToken("REGEX", text, text.Substring(2, text.Length - 3), KumaTokenCategory.String);
    }

    public void CustomOp()
    {
      var text = CreateString();
      Queue.AddToken("OP", text, text);
    }

    public void SetLines(KumaParser parser)
    {
      parser.Lines = _lines;
    }

    private void SetupLineIndexes(string source)
    {
      _lines = source.Split(new[] { "\n", "\r", "\r\n" }, StringSplitOptions.None);
      _lineIndexes[0] = 0;
      for (var i = 1; i < _lines.Length; i++)
      {
        _lineIndexes[i] = _lines[i - 1].Length;
      }
    }

    internal SourceSpan GetSourceSpanOfToken()
    {
      var ls = _lineIndexes.Where(k => k.Value > ts).Select(k => k.Key).FirstOrDefault();
      var le = _lineIndexes.Where(k => k.Value > te).Select(k => k.Key).FirstOrDefault();

      var start = new SourceLocation(Queue.NumTokens, ls + 1, (ts - _lineIndexes[ls]) + 1);

      var end = new SourceLocation(Queue.NumTokens, le + 1, (te - _lineIndexes[le]) + 1);
      return new SourceSpan(start, end);
    }
  }
}