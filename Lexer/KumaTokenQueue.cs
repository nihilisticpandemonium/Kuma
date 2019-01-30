// -----------------------------------------------------------------------
// <copyright file="KumaTokenQueue.cs" Company="NihilisticPandemonium">
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
// ---------------------------------------------------------------------

using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime;
using Kuma.Parser;
using Microsoft.Scripting;

namespace Kuma.Lexer
{
  public class KumaTokenQueue : ITokenSource
  {
    private readonly Queue<CommonToken> _tokens;
    private readonly KumaTokenFactory _factory;
    private readonly KumaLexer _lexer;

    public KumaTokenQueue(KumaParser parser, KumaLexer lexer, string sourceName)
    {
      Parser = parser;
      _lexer = lexer;
      SourceName = sourceName;
      _factory = new KumaTokenFactory { Parser = parser };
      _tokens = new Queue<CommonToken>();
    }

    internal KumaParser Parser { get; }

    public int NumTokens
    {
      get;
      private set;
    }

    public ICharStream InputStream => null;

    public string SourceName { get; }

    public ITokenFactory TokenFactory
    {
      get => _factory;
      set { }
    }

    public IToken NextToken()
    {
      return _tokens.Count > 0 ? _tokens.Dequeue() : new CommonToken(-1);
    }

    public int Line => _tokens.First().Line;
    public int Column => _tokens.First().Column;

    public void AddToken<T>(string name, string text, T value, KumaTokenCategory category = KumaTokenCategory.Normal)
    {
      var num = _factory.GetTokenFromName(name);
      if (num == -2)
      {
        throw new SyntaxErrorException($"Invalid token {name}");
      }
      var item = new KumaToken<T>(num, text, value) { Span = _lexer.GetSourceSpanOfToken() };
      if (category == KumaTokenCategory.Comment)
      {
        item.Channel = TokenConstants.HiddenChannel;
      }
      NumTokens++;
      _tokens.Enqueue(item);
    }
  }
}