// Generated from /home/nihilisticpandemonium/dev/Draco/Kuma/Parser/KumaParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KumaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, SEMICOLON=2, IF=3, WHILE=4, UNLESS=5, UNTIL=6, SWITCHOP=7, 
		ASSIGN=8, BREAK=9, RETRY=10, CONTINUE=11, THROW=12, LBRACE=13, RBRACE=14, 
		SWITCH=15, CASE=16, COLON=17, DEFAULT=18, LOOP=19, FOR=20, LPAREN=21, 
		IDENTIFIER=22, IN=23, RPAREN=24, DO=25, ELSE=26, RETURN=27, SET=28, CONST=29, 
		ADDASSIGN=30, SUBASSIGN=31, MULASSIGN=32, DIVASSIGN=33, MODASSIGN=34, 
		SHLASSIGN=35, SHRASSIGN=36, ANDASSIGN=37, ORASSIGN=38, XORASSIGN=39, EXPASSIGN=40, 
		CONDASSIGNO=41, CONDASSIGNA=42, INCREMENT=43, DECREMENT=44, OP=45, BACKWARDPIPE=46, 
		FORWARDPIPE=47, LOGICALOR=48, LOGICALXOR=49, LOGICALAND=50, COMPARE=51, 
		REGEXMATCH=52, REGEXNOMATCH=53, EQUAL=54, NOTEQUAL=55, LESSTHANEQUAL=56, 
		LESSTHAN=57, GREATERTHANEQUAL=58, GREATERTHAN=59, BITWISEXOR=60, BITWISEOR=61, 
		BITWISEAND=62, SHIFTLEFT=63, SHIFTRIGHT=64, PLUS=65, MINUS=66, MULTIPLY=67, 
		DIVIDE=68, MODULO=69, NOT=70, BITWISEINVERSE=71, TYPEOF=72, YIELD=73, 
		UNDEF=74, STRING=75, REMOVE=76, EXPONENT=77, LBRACKET=78, RBRACKET=79, 
		HASH=80, COMMA=81, BRACKETS=82, NUMBER=83, INTEGER=84, NIL=85, TRUE=86, 
		FALSE=87, DOT=88, CLASS=89, SELF=90, SUPER=91, CONTEXT=92, IRANGE=93, 
		ERANGE=94, WHENCOMP=95, UPLUS=96, UMINUS=97, BRACKETSASSIGN=98, DCOLON=99, 
		DEF=100, END=101, ALIAS=102, INCLUDE=103, MODULE=104, BEGIN=105, ENSURE=106, 
		RESCUE=107, SYNC=108, REGEX=109, COMMENT=110;
	public static final int
		RULE_program = 0, RULE_block_contents = 1, RULE_term = 2, RULE_term_top_level_statement = 3, 
		RULE_top_level_statement = 4, RULE_conditional_statement = 5, RULE_statement = 6, 
		RULE_block = 7, RULE_switch_construct = 8, RULE_case_block = 9, RULE_default_block = 10, 
		RULE_loop_construct = 11, RULE_for_construct = 12, RULE_for_in_construct = 13, 
		RULE_until_construct = 14, RULE_do_until_construct = 15, RULE_while_construct = 16, 
		RULE_do_while_construct = 17, RULE_unless_construct = 18, RULE_if_else_construct = 19, 
		RULE_else_part = 20, RULE_return_expression = 21, RULE_expression = 22, 
		RULE_prefix_increment = 23, RULE_postfix_increment = 24, RULE_assignment = 25, 
		RULE_prefix_op = 26, RULE_postfix_op = 27, RULE_arg = 28, RULE_op_expression = 29, 
		RULE_pipe_op = 30, RULE_pipe_expression = 31, RULE_logical_or_expression = 32, 
		RULE_logical_xor_expression = 33, RULE_logical_and_expression = 34, RULE_equality_op_eq_neq = 35, 
		RULE_equality_op = 36, RULE_equality_expression = 37, RULE_comparison_op = 38, 
		RULE_comparison_expression = 39, RULE_bitwise_or_op = 40, RULE_bitwise_or_expression = 41, 
		RULE_bitwise_and_expression = 42, RULE_shift_op = 43, RULE_shift_expression = 44, 
		RULE_additive_op = 45, RULE_additive_expression = 46, RULE_multiplicative_op = 47, 
		RULE_multiplicative_expression = 48, RULE_unary_expression = 49, RULE_power_expression = 50, 
		RULE_atom = 51, RULE_primary_right_side_parens = 52, RULE_primary_right_side_access = 53, 
		RULE_primary_right_side_yield_block = 54, RULE_primary_right_side_parens_access = 55, 
		RULE_primary_function_call = 56, RULE_primary_left_side = 57, RULE_primary = 58, 
		RULE_hash = 59, RULE_single_hash_key = 60, RULE_hash_key = 61, RULE_array = 62, 
		RULE_literal = 63, RULE_symbol = 64, RULE_lvalue = 65, RULE_lvalue_instance_ref_opt = 66, 
		RULE_lvalue_instance_ref = 67, RULE_lvalue_method_change = 68, RULE_lvalue_access = 69, 
		RULE_variable = 70, RULE_call_args = 71, RULE_call_arg_single_hash = 72, 
		RULE_call_arg = 73, RULE_first_arg = 74, RULE_first_var_arg = 75, RULE_first_block_arg = 76, 
		RULE_end_var_arg = 77, RULE_end_block_arg = 78, RULE_next_arg = 79, RULE_definition_argument_list_no_paren = 80, 
		RULE_definition_argument_list = 81, RULE_function_name = 82, RULE_function_definition = 83, 
		RULE_anonymous_function = 84, RULE_yield_block = 85, RULE_do_yield_block = 86, 
		RULE_parallel_assign_left = 87, RULE_parallel_assign_left_item = 88, RULE_parallel_assign_right = 89, 
		RULE_parallel_assign_right_item = 90, RULE_alias = 91, RULE_alias_part = 92, 
		RULE_include = 93, RULE_class_declaration = 94, RULE_anonymous_class_declaration = 95, 
		RULE_module_declaration = 96, RULE_begin_construct = 97, RULE_rescue_block = 98, 
		RULE_rescue_else_block = 99, RULE_rescue_ensure_block = 100, RULE_identifiers = 101, 
		RULE_sync_construct = 102;
	public static final String[] ruleNames = {
		"program", "block_contents", "term", "term_top_level_statement", "top_level_statement", 
		"conditional_statement", "statement", "block", "switch_construct", "case_block", 
		"default_block", "loop_construct", "for_construct", "for_in_construct", 
		"until_construct", "do_until_construct", "while_construct", "do_while_construct", 
		"unless_construct", "if_else_construct", "else_part", "return_expression", 
		"expression", "prefix_increment", "postfix_increment", "assignment", "prefix_op", 
		"postfix_op", "arg", "op_expression", "pipe_op", "pipe_expression", "logical_or_expression", 
		"logical_xor_expression", "logical_and_expression", "equality_op_eq_neq", 
		"equality_op", "equality_expression", "comparison_op", "comparison_expression", 
		"bitwise_or_op", "bitwise_or_expression", "bitwise_and_expression", "shift_op", 
		"shift_expression", "additive_op", "additive_expression", "multiplicative_op", 
		"multiplicative_expression", "unary_expression", "power_expression", "atom", 
		"primary_right_side_parens", "primary_right_side_access", "primary_right_side_yield_block", 
		"primary_right_side_parens_access", "primary_function_call", "primary_left_side", 
		"primary", "hash", "single_hash_key", "hash_key", "array", "literal", 
		"symbol", "lvalue", "lvalue_instance_ref_opt", "lvalue_instance_ref", 
		"lvalue_method_change", "lvalue_access", "variable", "call_args", "call_arg_single_hash", 
		"call_arg", "first_arg", "first_var_arg", "first_block_arg", "end_var_arg", 
		"end_block_arg", "next_arg", "definition_argument_list_no_paren", "definition_argument_list", 
		"function_name", "function_definition", "anonymous_function", "yield_block", 
		"do_yield_block", "parallel_assign_left", "parallel_assign_left_item", 
		"parallel_assign_right", "parallel_assign_right_item", "alias", "alias_part", 
		"include", "class_declaration", "anonymous_class_declaration", "module_declaration", 
		"begin_construct", "rescue_block", "rescue_else_block", "rescue_ensure_block", 
		"identifiers", "sync_construct"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "SEMICOLON", "IF", "WHILE", "UNLESS", "UNTIL", "SWITCHOP", 
		"ASSIGN", "BREAK", "RETRY", "CONTINUE", "THROW", "LBRACE", "RBRACE", "SWITCH", 
		"CASE", "COLON", "DEFAULT", "LOOP", "FOR", "LPAREN", "IDENTIFIER", "IN", 
		"RPAREN", "DO", "ELSE", "RETURN", "SET", "CONST", "ADDASSIGN", "SUBASSIGN", 
		"MULASSIGN", "DIVASSIGN", "MODASSIGN", "SHLASSIGN", "SHRASSIGN", "ANDASSIGN", 
		"ORASSIGN", "XORASSIGN", "EXPASSIGN", "CONDASSIGNO", "CONDASSIGNA", "INCREMENT", 
		"DECREMENT", "OP", "BACKWARDPIPE", "FORWARDPIPE", "LOGICALOR", "LOGICALXOR", 
		"LOGICALAND", "COMPARE", "REGEXMATCH", "REGEXNOMATCH", "EQUAL", "NOTEQUAL", 
		"LESSTHANEQUAL", "LESSTHAN", "GREATERTHANEQUAL", "GREATERTHAN", "BITWISEXOR", 
		"BITWISEOR", "BITWISEAND", "SHIFTLEFT", "SHIFTRIGHT", "PLUS", "MINUS", 
		"MULTIPLY", "DIVIDE", "MODULO", "NOT", "BITWISEINVERSE", "TYPEOF", "YIELD", 
		"UNDEF", "STRING", "REMOVE", "EXPONENT", "LBRACKET", "RBRACKET", "HASH", 
		"COMMA", "BRACKETS", "NUMBER", "INTEGER", "NIL", "TRUE", "FALSE", "DOT", 
		"CLASS", "SELF", "SUPER", "CONTEXT", "IRANGE", "ERANGE", "WHENCOMP", "UPLUS", 
		"UMINUS", "BRACKETSASSIGN", "DCOLON", "DEF", "END", "ALIAS", "INCLUDE", 
		"MODULE", "BEGIN", "ENSURE", "RESCUE", "SYNC", "REGEX", "COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "KumaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KumaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Block_contentsContext block_contents() {
			return getRuleContext(Block_contentsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KumaParser.EOF, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Top_level_statementContext top_level_statement() {
			return getRuleContext(Top_level_statementContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				block_contents();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE || _la==SEMICOLON) {
					{
					{
					setState(207);
					term();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				top_level_statement();
				setState(216);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_contentsContext extends ParserRuleContext {
		public List<Term_top_level_statementContext> term_top_level_statement() {
			return getRuleContexts(Term_top_level_statementContext.class);
		}
		public Term_top_level_statementContext term_top_level_statement(int i) {
			return getRuleContext(Term_top_level_statementContext.class,i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Block_contentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_contents; }
	}

	public final Block_contentsContext block_contents() throws RecognitionException {
		Block_contentsContext _localctx = new Block_contentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block_contents);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(222);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IF:
					case WHILE:
					case UNLESS:
					case UNTIL:
					case BREAK:
					case RETRY:
					case CONTINUE:
					case THROW:
					case LBRACE:
					case SWITCH:
					case COLON:
					case LOOP:
					case FOR:
					case LPAREN:
					case IDENTIFIER:
					case DO:
					case RETURN:
					case SET:
					case CONST:
					case INCREMENT:
					case DECREMENT:
					case OP:
					case BITWISEXOR:
					case PLUS:
					case MINUS:
					case MULTIPLY:
					case NOT:
					case BITWISEINVERSE:
					case TYPEOF:
					case YIELD:
					case UNDEF:
					case STRING:
					case REMOVE:
					case LBRACKET:
					case BRACKETS:
					case NUMBER:
					case INTEGER:
					case NIL:
					case TRUE:
					case FALSE:
					case CLASS:
					case SELF:
					case SUPER:
					case CONTEXT:
					case DEF:
					case ALIAS:
					case INCLUDE:
					case MODULE:
					case BEGIN:
					case SYNC:
					case REGEX:
						{
						setState(220);
						term_top_level_statement();
						}
						break;
					case NEWLINE:
					case SEMICOLON:
						{
						setState(221);
						term();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(KumaParser.NEWLINE, 0); }
		public TerminalNode SEMICOLON() { return getToken(KumaParser.SEMICOLON, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Term_top_level_statementContext extends ParserRuleContext {
		public Top_level_statementContext top_level_statement() {
			return getRuleContext(Top_level_statementContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Term_top_level_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_top_level_statement; }
	}

	public final Term_top_level_statementContext term_top_level_statement() throws RecognitionException {
		Term_top_level_statementContext _localctx = new Term_top_level_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_term_top_level_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			top_level_statement();
			setState(230);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Top_level_statementContext extends ParserRuleContext {
		public Conditional_statementContext conditional_statement() {
			return getRuleContext(Conditional_statementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Top_level_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level_statement; }
	}

	public final Top_level_statementContext top_level_statement() throws RecognitionException {
		Top_level_statementContext _localctx = new Top_level_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_top_level_statement);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				conditional_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode IF() { return getToken(KumaParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(KumaParser.WHILE, 0); }
		public TerminalNode UNLESS() { return getToken(KumaParser.UNLESS, 0); }
		public TerminalNode UNTIL() { return getToken(KumaParser.UNTIL, 0); }
		public TerminalNode SWITCHOP() { return getToken(KumaParser.SWITCHOP, 0); }
		public HashContext hash() {
			return getRuleContext(HashContext.class,0);
		}
		public Conditional_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_statement; }
	}

	public final Conditional_statementContext conditional_statement() throws RecognitionException {
		Conditional_statementContext _localctx = new Conditional_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional_statement);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				statement();
				setState(237);
				match(IF);
				setState(238);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				statement();
				setState(241);
				match(WHILE);
				setState(242);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				statement();
				setState(245);
				match(UNLESS);
				setState(246);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				statement();
				setState(249);
				match(UNTIL);
				setState(250);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				statement();
				setState(253);
				match(SWITCHOP);
				setState(254);
				hash();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Parallel_assign_leftContext parallel_assign_left() {
			return getRuleContext(Parallel_assign_leftContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(KumaParser.ASSIGN, 0); }
		public Parallel_assign_rightContext parallel_assign_right() {
			return getRuleContext(Parallel_assign_rightContext.class,0);
		}
		public Loop_constructContext loop_construct() {
			return getRuleContext(Loop_constructContext.class,0);
		}
		public Class_declarationContext class_declaration() {
			return getRuleContext(Class_declarationContext.class,0);
		}
		public Module_declarationContext module_declaration() {
			return getRuleContext(Module_declarationContext.class,0);
		}
		public Switch_constructContext switch_construct() {
			return getRuleContext(Switch_constructContext.class,0);
		}
		public For_constructContext for_construct() {
			return getRuleContext(For_constructContext.class,0);
		}
		public For_in_constructContext for_in_construct() {
			return getRuleContext(For_in_constructContext.class,0);
		}
		public Until_constructContext until_construct() {
			return getRuleContext(Until_constructContext.class,0);
		}
		public Do_until_constructContext do_until_construct() {
			return getRuleContext(Do_until_constructContext.class,0);
		}
		public While_constructContext while_construct() {
			return getRuleContext(While_constructContext.class,0);
		}
		public Do_while_constructContext do_while_construct() {
			return getRuleContext(Do_while_constructContext.class,0);
		}
		public Unless_constructContext unless_construct() {
			return getRuleContext(Unless_constructContext.class,0);
		}
		public If_else_constructContext if_else_construct() {
			return getRuleContext(If_else_constructContext.class,0);
		}
		public Begin_constructContext begin_construct() {
			return getRuleContext(Begin_constructContext.class,0);
		}
		public Sync_constructContext sync_construct() {
			return getRuleContext(Sync_constructContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(KumaParser.BREAK, 0); }
		public TerminalNode RETRY() { return getToken(KumaParser.RETRY, 0); }
		public TerminalNode CONTINUE() { return getToken(KumaParser.CONTINUE, 0); }
		public TerminalNode THROW() { return getToken(KumaParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_expressionContext return_expression() {
			return getRuleContext(Return_expressionContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				parallel_assign_left();
				setState(259);
				match(ASSIGN);
				setState(260);
				parallel_assign_right();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				loop_construct();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				class_declaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				module_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				switch_construct();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(266);
				for_construct();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(267);
				for_in_construct();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(268);
				until_construct();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(269);
				do_until_construct();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(270);
				while_construct();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(271);
				do_while_construct();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(272);
				unless_construct();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(273);
				if_else_construct();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(274);
				begin_construct();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(275);
				sync_construct();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(276);
				alias();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(277);
				include();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(278);
				match(BREAK);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(279);
				match(RETRY);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(280);
				match(CONTINUE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(281);
				match(THROW);
				setState(282);
				expression();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(283);
				return_expression();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(284);
				function_definition();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(285);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(KumaParser.LBRACE, 0); }
		public Block_contentsContext block_contents() {
			return getRuleContext(Block_contentsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KumaParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(LBRACE);
			setState(289);
			block_contents();
			setState(290);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_constructContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(KumaParser.SWITCH, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(KumaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(KumaParser.RBRACE, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Case_blockContext> case_block() {
			return getRuleContexts(Case_blockContext.class);
		}
		public Case_blockContext case_block(int i) {
			return getRuleContext(Case_blockContext.class,i);
		}
		public Default_blockContext default_block() {
			return getRuleContext(Default_blockContext.class,0);
		}
		public Switch_constructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_construct; }
	}

	public final Switch_constructContext switch_construct() throws RecognitionException {
		Switch_constructContext _localctx = new Switch_constructContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_switch_construct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(SWITCH);
			setState(293);
			expression();
			setState(294);
			match(LBRACE);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE || _la==SEMICOLON) {
				{
				setState(295);
				term();
				}
			}

			setState(299); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(298);
				case_block();
				}
				}
				setState(301); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(303);
				term();
				}
				break;
			}
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(306);
				default_block();
				}
			}

			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE || _la==SEMICOLON) {
				{
				setState(309);
				term();
				}
			}

			setState(312);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_blockContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(KumaParser.CASE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(KumaParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(KumaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KumaParser.COMMA, i);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Case_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_block; }
	}

	public final Case_blockContext case_block() throws RecognitionException {
		Case_blockContext _localctx = new Case_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_case_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(CASE);
			setState(315);
			expression();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(316);
				match(COMMA);
				setState(317);
				expression();
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			match(COLON);
			setState(324);
			block();
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(325);
				term();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_blockContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(KumaParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(KumaParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Default_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_block; }
	}

	public final Default_blockContext default_block() throws RecognitionException {
		Default_blockContext _localctx = new Default_blockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_default_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(DEFAULT);
			setState(329);
			match(COLON);
			setState(330);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_constructContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(KumaParser.LOOP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Loop_constructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_construct; }
	}

	public final Loop_constructContext loop_construct() throws RecognitionException {
		Loop_constructContext _localctx = new Loop_constructContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_loop_construct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(LOOP);
			setState(333);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_constructContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(KumaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(KumaParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(KumaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(KumaParser.SEMICOLON, i);
		}
		public TerminalNode RPAREN() { return getToken(KumaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_constructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_construct; }
	}

	public final For_constructContext for_construct() throws RecognitionException {
		For_constructContext _localctx = new For_constructContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_for_construct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(FOR);
			setState(336);
			match(LPAREN);
			setState(337);
			expression();
			setState(338);
			match(SEMICOLON);
			setState(339);
			expression();
			setState(340);
			match(SEMICOLON);
			setState(341);
			expression();
			setState(342);
			match(RPAREN);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(343);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_in_constructContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(KumaParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(KumaParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(KumaParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KumaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_in_constructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_in_construct; }
	}

	public final For_in_constructContext for_in_construct() throws RecognitionException {
		For_in_constructContext _localctx = new For_in_constructContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_in_construct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(FOR);
			setState(347);
			match(LPAREN);
			setState(348);
			match(IDENTIFIER);
			setState(349);
			match(IN);
			setState(350);
			expression();
			setState(351);
			match(RPAREN);
			setState(352);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Until_constructContext extends ParserRuleContext {
		public TerminalNode UNTIL() { return getToken(KumaParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Until_constructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_until_construct; }
	}

	public final Until_constructContext until_construct() throws RecognitionException {
		Until_constructContext _localctx = new Until_constructContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_until_construct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(UNTIL);
			setState(355);
			expression();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(356);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_until_constructContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(KumaParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(KumaParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_until_constructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_until_construct; }
	}

	public final Do_until_constructContext do_until_construct() throws RecognitionException {
		Do_until_constructContext _localctx = new Do_until_constructContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_do_until_construct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(DO);
			setState(360);
			block();
			setState(361);
			match(UNTIL);
			setState(362);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_constructContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(KumaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_constructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_construct; }
	}

	public final While_constructContext while_construct() throws RecognitionException {
		While_constructContext _localctx = new While_constructContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_while_construct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(WHILE);
			setState(365);
			expression();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(366);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_while_constructContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(KumaParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(KumaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_while_constructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_construct; }
	}

	public final Do_while_constructContext do_while_construct() throws RecognitionException {
		Do_while_constructContext _localctx = new Do_while_constructContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_do_while_construct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(DO);
			setState(370);
			block();
			setState(371);
			match(WHILE);
			setState(372);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unless_constructContext extends ParserRuleContext {
		public TerminalNode UNLESS() { return getToken(KumaParser.UNLESS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public Unless_constructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unless_construct; }
	}

	public final Unless_constructContext unless_construct() throws RecognitionException {
		Unless_constructContext _localctx = new Unless_constructContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unless_construct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(UNLESS);
			setState(375);
			expression();
			setState(376);
			block();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(377);
				else_part();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_else_constructContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(KumaParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_partContext else_part() {
			return getRuleContext(Else_partContext.class,0);
		}
		public If_else_constructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_construct; }
	}

	public final If_else_constructContext if_else_construct() throws RecognitionException {
		If_else_constructContext _localctx = new If_else_constructContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_if_else_construct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(IF);
			setState(381);
			expression();
			setState(382);
			block();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(383);
				else_part();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_partContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(KumaParser.ELSE, 0); }
		public If_else_constructContext if_else_construct() {
			return getRuleContext(If_else_constructContext.class,0);
		}
		public Unless_constructContext unless_construct() {
			return getRuleContext(Unless_constructContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_part; }
	}

	public final Else_partContext else_part() throws RecognitionException {
		Else_partContext _localctx = new Else_partContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_else_part);
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				match(ELSE);
				setState(387);
				if_else_construct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(ELSE);
				setState(389);
				unless_construct();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(ELSE);
				setState(391);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_expressionContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(KumaParser.RETURN, 0); }
		public Call_argsContext call_args() {
			return getRuleContext(Call_argsContext.class,0);
		}
		public Return_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_expression; }
	}

	public final Return_expressionContext return_expression() throws RecognitionException {
		Return_expressionContext _localctx = new Return_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_return_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(RETURN);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << COLON) | (1L << LPAREN) | (1L << IDENTIFIER) | (1L << OP) | (1L << BITWISEXOR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (MINUS - 65)) | (1L << (NOT - 65)) | (1L << (BITWISEINVERSE - 65)) | (1L << (TYPEOF - 65)) | (1L << (YIELD - 65)) | (1L << (UNDEF - 65)) | (1L << (STRING - 65)) | (1L << (REMOVE - 65)) | (1L << (LBRACKET - 65)) | (1L << (BRACKETS - 65)) | (1L << (NUMBER - 65)) | (1L << (INTEGER - 65)) | (1L << (NIL - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (SELF - 65)) | (1L << (SUPER - 65)) | (1L << (CONTEXT - 65)) | (1L << (REGEX - 65)))) != 0)) {
				{
				setState(395);
				call_args();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		try {
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				arg();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_incrementContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(KumaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(KumaParser.DECREMENT, 0); }
		public Lvalue_accessContext lvalue_access() {
			return getRuleContext(Lvalue_accessContext.class,0);
		}
		public Lvalue_instance_refContext lvalue_instance_ref() {
			return getRuleContext(Lvalue_instance_refContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Prefix_incrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_increment; }
	}

	public final Prefix_incrementContext prefix_increment() throws RecognitionException {
		Prefix_incrementContext _localctx = new Prefix_incrementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_prefix_increment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_la = _input.LA(1);
			if ( !(_la==INCREMENT || _la==DECREMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(403);
				lvalue_access();
				}
				break;
			case 2:
				{
				setState(404);
				lvalue_instance_ref();
				}
				break;
			case 3:
				{
				setState(405);
				lvalue();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_incrementContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(KumaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(KumaParser.DECREMENT, 0); }
		public Lvalue_accessContext lvalue_access() {
			return getRuleContext(Lvalue_accessContext.class,0);
		}
		public Lvalue_instance_refContext lvalue_instance_ref() {
			return getRuleContext(Lvalue_instance_refContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Postfix_incrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_increment; }
	}

	public final Postfix_incrementContext postfix_increment() throws RecognitionException {
		Postfix_incrementContext _localctx = new Postfix_incrementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_postfix_increment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(408);
				lvalue_access();
				}
				break;
			case 2:
				{
				setState(409);
				lvalue_instance_ref();
				}
				break;
			case 3:
				{
				setState(410);
				lvalue();
				}
				break;
			}
			setState(413);
			_la = _input.LA(1);
			if ( !(_la==INCREMENT || _la==DECREMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(KumaParser.ASSIGN, 0); }
		public TerminalNode ADDASSIGN() { return getToken(KumaParser.ADDASSIGN, 0); }
		public TerminalNode SUBASSIGN() { return getToken(KumaParser.SUBASSIGN, 0); }
		public TerminalNode MULASSIGN() { return getToken(KumaParser.MULASSIGN, 0); }
		public TerminalNode DIVASSIGN() { return getToken(KumaParser.DIVASSIGN, 0); }
		public TerminalNode MODASSIGN() { return getToken(KumaParser.MODASSIGN, 0); }
		public TerminalNode SHLASSIGN() { return getToken(KumaParser.SHLASSIGN, 0); }
		public TerminalNode SHRASSIGN() { return getToken(KumaParser.SHRASSIGN, 0); }
		public TerminalNode ANDASSIGN() { return getToken(KumaParser.ANDASSIGN, 0); }
		public TerminalNode ORASSIGN() { return getToken(KumaParser.ORASSIGN, 0); }
		public TerminalNode XORASSIGN() { return getToken(KumaParser.XORASSIGN, 0); }
		public TerminalNode EXPASSIGN() { return getToken(KumaParser.EXPASSIGN, 0); }
		public TerminalNode CONDASSIGNO() { return getToken(KumaParser.CONDASSIGNO, 0); }
		public TerminalNode CONDASSIGNA() { return getToken(KumaParser.CONDASSIGNA, 0); }
		public Lvalue_accessContext lvalue_access() {
			return getRuleContext(Lvalue_accessContext.class,0);
		}
		public Lvalue_instance_refContext lvalue_instance_ref() {
			return getRuleContext(Lvalue_instance_refContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode SET() { return getToken(KumaParser.SET, 0); }
		public TerminalNode CONST() { return getToken(KumaParser.CONST, 0); }
		public Prefix_incrementContext prefix_increment() {
			return getRuleContext(Prefix_incrementContext.class,0);
		}
		public Postfix_incrementContext postfix_increment() {
			return getRuleContext(Postfix_incrementContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignment);
		int _la;
		try {
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET || _la==CONST) {
					{
					setState(415);
					_la = _input.LA(1);
					if ( !(_la==SET || _la==CONST) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(418);
					lvalue_access();
					}
					break;
				case 2:
					{
					setState(419);
					lvalue_instance_ref();
					}
					break;
				case 3:
					{
					setState(420);
					lvalue();
					}
					break;
				}
				setState(423);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << ADDASSIGN) | (1L << SUBASSIGN) | (1L << MULASSIGN) | (1L << DIVASSIGN) | (1L << MODASSIGN) | (1L << SHLASSIGN) | (1L << SHRASSIGN) | (1L << ANDASSIGN) | (1L << ORASSIGN) | (1L << XORASSIGN) | (1L << EXPASSIGN) | (1L << CONDASSIGNO) | (1L << CONDASSIGNA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(424);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				prefix_increment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				postfix_increment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prefix_opContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(KumaParser.OP, 0); }
		public Op_expressionContext op_expression() {
			return getRuleContext(Op_expressionContext.class,0);
		}
		public Prefix_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_op; }
	}

	public final Prefix_opContext prefix_op() throws RecognitionException {
		Prefix_opContext _localctx = new Prefix_opContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_prefix_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(OP);
			setState(431);
			op_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_opContext extends ParserRuleContext {
		public Op_expressionContext op_expression() {
			return getRuleContext(Op_expressionContext.class,0);
		}
		public TerminalNode OP() { return getToken(KumaParser.OP, 0); }
		public Postfix_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_op; }
	}

	public final Postfix_opContext postfix_op() throws RecognitionException {
		Postfix_opContext _localctx = new Postfix_opContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_postfix_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			op_expression();
			setState(434);
			match(OP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public Prefix_opContext prefix_op() {
			return getRuleContext(Prefix_opContext.class,0);
		}
		public Postfix_opContext postfix_op() {
			return getRuleContext(Postfix_opContext.class,0);
		}
		public Op_expressionContext op_expression() {
			return getRuleContext(Op_expressionContext.class,0);
		}
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arg);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				prefix_op();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				postfix_op();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				op_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_expressionContext extends ParserRuleContext {
		public List<Pipe_expressionContext> pipe_expression() {
			return getRuleContexts(Pipe_expressionContext.class);
		}
		public Pipe_expressionContext pipe_expression(int i) {
			return getRuleContext(Pipe_expressionContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(KumaParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(KumaParser.OP, i);
		}
		public Op_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_expression; }
	}

	public final Op_expressionContext op_expression() throws RecognitionException {
		Op_expressionContext _localctx = new Op_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_op_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			pipe_expression();
			setState(446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(442);
					match(OP);
					setState(443);
					pipe_expression();
					}
					} 
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pipe_opContext extends ParserRuleContext {
		public TerminalNode BACKWARDPIPE() { return getToken(KumaParser.BACKWARDPIPE, 0); }
		public TerminalNode FORWARDPIPE() { return getToken(KumaParser.FORWARDPIPE, 0); }
		public Pipe_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipe_op; }
	}

	public final Pipe_opContext pipe_op() throws RecognitionException {
		Pipe_opContext _localctx = new Pipe_opContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pipe_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_la = _input.LA(1);
			if ( !(_la==BACKWARDPIPE || _la==FORWARDPIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pipe_expressionContext extends ParserRuleContext {
		public List<Logical_or_expressionContext> logical_or_expression() {
			return getRuleContexts(Logical_or_expressionContext.class);
		}
		public Logical_or_expressionContext logical_or_expression(int i) {
			return getRuleContext(Logical_or_expressionContext.class,i);
		}
		public List<Pipe_opContext> pipe_op() {
			return getRuleContexts(Pipe_opContext.class);
		}
		public Pipe_opContext pipe_op(int i) {
			return getRuleContext(Pipe_opContext.class,i);
		}
		public Pipe_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipe_expression; }
	}

	public final Pipe_expressionContext pipe_expression() throws RecognitionException {
		Pipe_expressionContext _localctx = new Pipe_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_pipe_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			logical_or_expression();
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(452);
					pipe_op();
					setState(453);
					logical_or_expression();
					}
					} 
				}
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public List<Logical_xor_expressionContext> logical_xor_expression() {
			return getRuleContexts(Logical_xor_expressionContext.class);
		}
		public Logical_xor_expressionContext logical_xor_expression(int i) {
			return getRuleContext(Logical_xor_expressionContext.class,i);
		}
		public List<TerminalNode> LOGICALOR() { return getTokens(KumaParser.LOGICALOR); }
		public TerminalNode LOGICALOR(int i) {
			return getToken(KumaParser.LOGICALOR, i);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_logical_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			logical_xor_expression();
			setState(465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(461);
					match(LOGICALOR);
					setState(462);
					logical_xor_expression();
					}
					} 
				}
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_xor_expressionContext extends ParserRuleContext {
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public List<TerminalNode> LOGICALXOR() { return getTokens(KumaParser.LOGICALXOR); }
		public TerminalNode LOGICALXOR(int i) {
			return getToken(KumaParser.LOGICALXOR, i);
		}
		public Logical_xor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_xor_expression; }
	}

	public final Logical_xor_expressionContext logical_xor_expression() throws RecognitionException {
		Logical_xor_expressionContext _localctx = new Logical_xor_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_logical_xor_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			logical_and_expression();
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(469);
					match(LOGICALXOR);
					setState(470);
					logical_and_expression();
					}
					} 
				}
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<TerminalNode> LOGICALAND() { return getTokens(KumaParser.LOGICALAND); }
		public TerminalNode LOGICALAND(int i) {
			return getToken(KumaParser.LOGICALAND, i);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_logical_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			equality_expression();
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(477);
					match(LOGICALAND);
					setState(478);
					equality_expression();
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_op_eq_neqContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(KumaParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(KumaParser.NOTEQUAL, 0); }
		public Equality_op_eq_neqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_op_eq_neq; }
	}

	public final Equality_op_eq_neqContext equality_op_eq_neq() throws RecognitionException {
		Equality_op_eq_neqContext _localctx = new Equality_op_eq_neqContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_equality_op_eq_neq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_opContext extends ParserRuleContext {
		public TerminalNode COMPARE() { return getToken(KumaParser.COMPARE, 0); }
		public TerminalNode REGEXMATCH() { return getToken(KumaParser.REGEXMATCH, 0); }
		public TerminalNode REGEXNOMATCH() { return getToken(KumaParser.REGEXNOMATCH, 0); }
		public Equality_op_eq_neqContext equality_op_eq_neq() {
			return getRuleContext(Equality_op_eq_neqContext.class,0);
		}
		public Equality_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_op; }
	}

	public final Equality_opContext equality_op() throws RecognitionException {
		Equality_opContext _localctx = new Equality_opContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_equality_op);
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMPARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(COMPARE);
				}
				break;
			case REGEXMATCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				match(REGEXMATCH);
				}
				break;
			case REGEXNOMATCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				match(REGEXNOMATCH);
				}
				break;
			case EQUAL:
			case NOTEQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				equality_op_eq_neq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Comparison_expressionContext> comparison_expression() {
			return getRuleContexts(Comparison_expressionContext.class);
		}
		public Comparison_expressionContext comparison_expression(int i) {
			return getRuleContext(Comparison_expressionContext.class,i);
		}
		public List<Equality_opContext> equality_op() {
			return getRuleContexts(Equality_opContext.class);
		}
		public Equality_opContext equality_op(int i) {
			return getRuleContext(Equality_opContext.class,i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_equality_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			comparison_expression();
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(493);
					equality_op();
					setState(494);
					comparison_expression();
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_opContext extends ParserRuleContext {
		public TerminalNode LESSTHANEQUAL() { return getToken(KumaParser.LESSTHANEQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(KumaParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHANEQUAL() { return getToken(KumaParser.GREATERTHANEQUAL, 0); }
		public TerminalNode GREATERTHAN() { return getToken(KumaParser.GREATERTHAN, 0); }
		public Comparison_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_op; }
	}

	public final Comparison_opContext comparison_op() throws RecognitionException {
		Comparison_opContext _localctx = new Comparison_opContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_comparison_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESSTHANEQUAL) | (1L << LESSTHAN) | (1L << GREATERTHANEQUAL) | (1L << GREATERTHAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_expressionContext extends ParserRuleContext {
		public List<Bitwise_or_expressionContext> bitwise_or_expression() {
			return getRuleContexts(Bitwise_or_expressionContext.class);
		}
		public Bitwise_or_expressionContext bitwise_or_expression(int i) {
			return getRuleContext(Bitwise_or_expressionContext.class,i);
		}
		public List<Comparison_opContext> comparison_op() {
			return getRuleContexts(Comparison_opContext.class);
		}
		public Comparison_opContext comparison_op(int i) {
			return getRuleContext(Comparison_opContext.class,i);
		}
		public Comparison_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expression; }
	}

	public final Comparison_expressionContext comparison_expression() throws RecognitionException {
		Comparison_expressionContext _localctx = new Comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_comparison_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			bitwise_or_expression();
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(504);
					comparison_op();
					setState(505);
					bitwise_or_expression();
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitwise_or_opContext extends ParserRuleContext {
		public TerminalNode BITWISEXOR() { return getToken(KumaParser.BITWISEXOR, 0); }
		public TerminalNode BITWISEOR() { return getToken(KumaParser.BITWISEOR, 0); }
		public Bitwise_or_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_or_op; }
	}

	public final Bitwise_or_opContext bitwise_or_op() throws RecognitionException {
		Bitwise_or_opContext _localctx = new Bitwise_or_opContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_bitwise_or_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_la = _input.LA(1);
			if ( !(_la==BITWISEXOR || _la==BITWISEOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitwise_or_expressionContext extends ParserRuleContext {
		public List<Bitwise_and_expressionContext> bitwise_and_expression() {
			return getRuleContexts(Bitwise_and_expressionContext.class);
		}
		public Bitwise_and_expressionContext bitwise_and_expression(int i) {
			return getRuleContext(Bitwise_and_expressionContext.class,i);
		}
		public List<Bitwise_or_opContext> bitwise_or_op() {
			return getRuleContexts(Bitwise_or_opContext.class);
		}
		public Bitwise_or_opContext bitwise_or_op(int i) {
			return getRuleContext(Bitwise_or_opContext.class,i);
		}
		public Bitwise_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_or_expression; }
	}

	public final Bitwise_or_expressionContext bitwise_or_expression() throws RecognitionException {
		Bitwise_or_expressionContext _localctx = new Bitwise_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_bitwise_or_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			bitwise_and_expression();
			setState(520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(515);
					bitwise_or_op();
					setState(516);
					bitwise_and_expression();
					}
					} 
				}
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bitwise_and_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public List<TerminalNode> BITWISEAND() { return getTokens(KumaParser.BITWISEAND); }
		public TerminalNode BITWISEAND(int i) {
			return getToken(KumaParser.BITWISEAND, i);
		}
		public Bitwise_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwise_and_expression; }
	}

	public final Bitwise_and_expressionContext bitwise_and_expression() throws RecognitionException {
		Bitwise_and_expressionContext _localctx = new Bitwise_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_bitwise_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			shift_expression();
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(524);
					match(BITWISEAND);
					setState(525);
					shift_expression();
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_opContext extends ParserRuleContext {
		public TerminalNode SHIFTLEFT() { return getToken(KumaParser.SHIFTLEFT, 0); }
		public TerminalNode SHIFTRIGHT() { return getToken(KumaParser.SHIFTRIGHT, 0); }
		public Shift_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_op; }
	}

	public final Shift_opContext shift_op() throws RecognitionException {
		Shift_opContext _localctx = new Shift_opContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_shift_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			_la = _input.LA(1);
			if ( !(_la==SHIFTLEFT || _la==SHIFTRIGHT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public List<Shift_opContext> shift_op() {
			return getRuleContexts(Shift_opContext.class);
		}
		public Shift_opContext shift_op(int i) {
			return getRuleContext(Shift_opContext.class,i);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_shift_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			additive_expression();
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(534);
					shift_op();
					setState(535);
					additive_expression();
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additive_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(KumaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(KumaParser.MINUS, 0); }
		public Additive_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_op; }
	}

	public final Additive_opContext additive_op() throws RecognitionException {
		Additive_opContext _localctx = new Additive_opContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_additive_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<Additive_opContext> additive_op() {
			return getRuleContexts(Additive_opContext.class);
		}
		public Additive_opContext additive_op(int i) {
			return getRuleContext(Additive_opContext.class,i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_additive_expression);
		int _la;
		try {
			int _alt;
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				multiplicative_expression();
				setState(548); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(545);
						additive_op();
						setState(546);
						multiplicative_expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(550); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(552);
					additive_op();
					}
					}
					setState(555); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PLUS || _la==MINUS );
				setState(557);
				multiplicative_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				multiplicative_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplicative_opContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(KumaParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(KumaParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(KumaParser.MODULO, 0); }
		public Multiplicative_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_op; }
	}

	public final Multiplicative_opContext multiplicative_op() throws RecognitionException {
		Multiplicative_opContext _localctx = new Multiplicative_opContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_multiplicative_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (MULTIPLY - 67)) | (1L << (DIVIDE - 67)) | (1L << (MODULO - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
		}
		public List<Multiplicative_opContext> multiplicative_op() {
			return getRuleContexts(Multiplicative_opContext.class);
		}
		public Multiplicative_opContext multiplicative_op(int i) {
			return getRuleContext(Multiplicative_opContext.class,i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_multiplicative_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			unary_expression();
			setState(570);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(565);
					multiplicative_op();
					setState(566);
					unary_expression();
					}
					} 
				}
				setState(572);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public List<TerminalNode> NOT() { return getTokens(KumaParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(KumaParser.NOT, i);
		}
		public List<TerminalNode> BITWISEINVERSE() { return getTokens(KumaParser.BITWISEINVERSE); }
		public TerminalNode BITWISEINVERSE(int i) {
			return getToken(KumaParser.BITWISEINVERSE, i);
		}
		public TerminalNode TYPEOF() { return getToken(KumaParser.TYPEOF, 0); }
		public TerminalNode YIELD() { return getToken(KumaParser.YIELD, 0); }
		public Call_argsContext call_args() {
			return getRuleContext(Call_argsContext.class,0);
		}
		public TerminalNode UNDEF() { return getToken(KumaParser.UNDEF, 0); }
		public TerminalNode STRING() { return getToken(KumaParser.STRING, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(KumaParser.REMOVE, 0); }
		public Power_expressionContext power_expression() {
			return getRuleContext(Power_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_unary_expression);
		try {
			int _alt;
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(573);
						match(NOT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(576); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(578);
				unary_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(579);
						match(BITWISEINVERSE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(582); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(584);
				unary_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
				match(TYPEOF);
				setState(586);
				unary_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(587);
				match(YIELD);
				setState(589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(588);
					call_args();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(591);
				match(UNDEF);
				setState(592);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(593);
				match(UNDEF);
				setState(594);
				symbol();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(595);
				match(REMOVE);
				setState(596);
				match(STRING);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(597);
				match(REMOVE);
				setState(598);
				symbol();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(599);
				power_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Power_expressionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode EXPONENT() { return getToken(KumaParser.EXPONENT, 0); }
		public Power_expressionContext power_expression() {
			return getRuleContext(Power_expressionContext.class,0);
		}
		public Power_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power_expression; }
	}

	public final Power_expressionContext power_expression() throws RecognitionException {
		Power_expressionContext _localctx = new Power_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_power_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			atom();
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPONENT) {
				{
				setState(603);
				match(EXPONENT);
				setState(604);
				power_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KumaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KumaParser.RPAREN, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_atom);
		try {
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				match(LPAREN);
				setState(608);
				expression();
				setState(609);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_right_side_parensContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KumaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KumaParser.RPAREN, 0); }
		public Call_argsContext call_args() {
			return getRuleContext(Call_argsContext.class,0);
		}
		public Yield_blockContext yield_block() {
			return getRuleContext(Yield_blockContext.class,0);
		}
		public Primary_right_side_parensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_right_side_parens; }
	}

	public final Primary_right_side_parensContext primary_right_side_parens() throws RecognitionException {
		Primary_right_side_parensContext _localctx = new Primary_right_side_parensContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_primary_right_side_parens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(LPAREN);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << COLON) | (1L << LPAREN) | (1L << IDENTIFIER) | (1L << OP) | (1L << BITWISEXOR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (MINUS - 65)) | (1L << (NOT - 65)) | (1L << (BITWISEINVERSE - 65)) | (1L << (TYPEOF - 65)) | (1L << (YIELD - 65)) | (1L << (UNDEF - 65)) | (1L << (STRING - 65)) | (1L << (REMOVE - 65)) | (1L << (LBRACKET - 65)) | (1L << (BRACKETS - 65)) | (1L << (NUMBER - 65)) | (1L << (INTEGER - 65)) | (1L << (NIL - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (SELF - 65)) | (1L << (SUPER - 65)) | (1L << (CONTEXT - 65)) | (1L << (REGEX - 65)))) != 0)) {
				{
				setState(615);
				call_args();
				}
			}

			setState(618);
			match(RPAREN);
			setState(620);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(619);
				yield_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_right_side_accessContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(KumaParser.LBRACKET, 0); }
		public Call_argsContext call_args() {
			return getRuleContext(Call_argsContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(KumaParser.RBRACKET, 0); }
		public Primary_right_side_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_right_side_access; }
	}

	public final Primary_right_side_accessContext primary_right_side_access() throws RecognitionException {
		Primary_right_side_accessContext _localctx = new Primary_right_side_accessContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_primary_right_side_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(LBRACKET);
			setState(623);
			call_args();
			setState(624);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_right_side_yield_blockContext extends ParserRuleContext {
		public Yield_blockContext yield_block() {
			return getRuleContext(Yield_blockContext.class,0);
		}
		public Do_yield_blockContext do_yield_block() {
			return getRuleContext(Do_yield_blockContext.class,0);
		}
		public Primary_right_side_yield_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_right_side_yield_block; }
	}

	public final Primary_right_side_yield_blockContext primary_right_side_yield_block() throws RecognitionException {
		Primary_right_side_yield_blockContext _localctx = new Primary_right_side_yield_blockContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_primary_right_side_yield_block);
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				yield_block();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				do_yield_block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_right_side_parens_accessContext extends ParserRuleContext {
		public Primary_right_side_parensContext primary_right_side_parens() {
			return getRuleContext(Primary_right_side_parensContext.class,0);
		}
		public Primary_right_side_accessContext primary_right_side_access() {
			return getRuleContext(Primary_right_side_accessContext.class,0);
		}
		public Primary_right_side_parens_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_right_side_parens_access; }
	}

	public final Primary_right_side_parens_accessContext primary_right_side_parens_access() throws RecognitionException {
		Primary_right_side_parens_accessContext _localctx = new Primary_right_side_parens_accessContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_primary_right_side_parens_access);
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				primary_right_side_parens();
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				primary_right_side_access();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_function_callContext extends ParserRuleContext {
		public List<Primary_right_side_parens_accessContext> primary_right_side_parens_access() {
			return getRuleContexts(Primary_right_side_parens_accessContext.class);
		}
		public Primary_right_side_parens_accessContext primary_right_side_parens_access(int i) {
			return getRuleContext(Primary_right_side_parens_accessContext.class,i);
		}
		public Primary_right_side_yield_blockContext primary_right_side_yield_block() {
			return getRuleContext(Primary_right_side_yield_blockContext.class,0);
		}
		public Primary_function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_function_call; }
	}

	public final Primary_function_callContext primary_function_call() throws RecognitionException {
		Primary_function_callContext _localctx = new Primary_function_callContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_primary_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(634);
				primary_right_side_parens_access();
				}
				}
				setState(637); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN || _la==LBRACKET );
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(639);
				primary_right_side_yield_block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_left_sideContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Lvalue_instance_refContext lvalue_instance_ref() {
			return getRuleContext(Lvalue_instance_refContext.class,0);
		}
		public Lvalue_method_changeContext lvalue_method_change() {
			return getRuleContext(Lvalue_method_changeContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public HashContext hash() {
			return getRuleContext(HashContext.class,0);
		}
		public Anonymous_functionContext anonymous_function() {
			return getRuleContext(Anonymous_functionContext.class,0);
		}
		public Anonymous_class_declarationContext anonymous_class_declaration() {
			return getRuleContext(Anonymous_class_declarationContext.class,0);
		}
		public Primary_left_sideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_left_side; }
	}

	public final Primary_left_sideContext primary_left_side() throws RecognitionException {
		Primary_left_sideContext _localctx = new Primary_left_sideContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_primary_left_side);
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				lvalue_instance_ref();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				lvalue_method_change();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(645);
				lvalue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(646);
				array();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(647);
				hash();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(648);
				anonymous_function();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(649);
				anonymous_class_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public Primary_left_sideContext primary_left_side() {
			return getRuleContext(Primary_left_sideContext.class,0);
		}
		public Primary_function_callContext primary_function_call() {
			return getRuleContext(Primary_function_callContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			primary_left_side();
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN || _la==LBRACKET) {
				{
				setState(653);
				primary_function_call();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HashContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(KumaParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(KumaParser.RBRACE, 0); }
		public TerminalNode COLON() { return getToken(KumaParser.COLON, 0); }
		public List<Hash_keyContext> hash_key() {
			return getRuleContexts(Hash_keyContext.class);
		}
		public Hash_keyContext hash_key(int i) {
			return getRuleContext(Hash_keyContext.class,i);
		}
		public List<TerminalNode> HASH() { return getTokens(KumaParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(KumaParser.HASH, i);
		}
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KumaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KumaParser.COMMA, i);
		}
		public HashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash; }
	}

	public final HashContext hash() throws RecognitionException {
		HashContext _localctx = new HashContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_hash);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(LBRACE);
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				{
				{
				setState(657);
				hash_key();
				setState(658);
				match(HASH);
				setState(659);
				arg();
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(661);
					match(COMMA);
					setState(662);
					hash_key();
					setState(663);
					match(HASH);
					setState(664);
					arg();
					}
					}
					setState(670);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(671);
				match(COLON);
				}
				break;
			}
			setState(674);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_hash_keyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(KumaParser.STRING, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Single_hash_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_hash_key; }
	}

	public final Single_hash_keyContext single_hash_key() throws RecognitionException {
		Single_hash_keyContext _localctx = new Single_hash_keyContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_single_hash_key);
		try {
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				match(STRING);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 3);
				{
				setState(678);
				symbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hash_keyContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public Hash_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash_key; }
	}

	public final Hash_keyContext hash_key() throws RecognitionException {
		Hash_keyContext _localctx = new Hash_keyContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_hash_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			arg();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode BRACKETS() { return getToken(KumaParser.BRACKETS, 0); }
		public TerminalNode LBRACKET() { return getToken(KumaParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(KumaParser.RBRACKET, 0); }
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KumaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KumaParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_array);
		int _la;
		try {
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BRACKETS:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				match(BRACKETS);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				match(LBRACKET);
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << COLON) | (1L << LPAREN) | (1L << IDENTIFIER) | (1L << OP) | (1L << BITWISEXOR))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (PLUS - 65)) | (1L << (MINUS - 65)) | (1L << (NOT - 65)) | (1L << (BITWISEINVERSE - 65)) | (1L << (TYPEOF - 65)) | (1L << (YIELD - 65)) | (1L << (UNDEF - 65)) | (1L << (STRING - 65)) | (1L << (REMOVE - 65)) | (1L << (LBRACKET - 65)) | (1L << (BRACKETS - 65)) | (1L << (NUMBER - 65)) | (1L << (INTEGER - 65)) | (1L << (NIL - 65)) | (1L << (TRUE - 65)) | (1L << (FALSE - 65)) | (1L << (SELF - 65)) | (1L << (SUPER - 65)) | (1L << (CONTEXT - 65)) | (1L << (REGEX - 65)))) != 0)) {
					{
					setState(685);
					arg();
					setState(690);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(686);
						match(COMMA);
						setState(687);
						arg();
						}
						}
						setState(692);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(695);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(KumaParser.NUMBER, 0); }
		public TerminalNode INTEGER() { return getToken(KumaParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(KumaParser.STRING, 0); }
		public TerminalNode REGEX() { return getToken(KumaParser.REGEX, 0); }
		public TerminalNode NIL() { return getToken(KumaParser.NIL, 0); }
		public TerminalNode TRUE() { return getToken(KumaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KumaParser.FALSE, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_literal);
		try {
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				match(NUMBER);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				match(INTEGER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(700);
				match(STRING);
				}
				break;
			case REGEX:
				enterOuterAlt(_localctx, 4);
				{
				setState(701);
				match(REGEX);
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 5);
				{
				setState(702);
				match(NIL);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(703);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(704);
				match(FALSE);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 8);
				{
				setState(705);
				symbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(KumaParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(KumaParser.STRING, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_symbol);
		try {
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				match(COLON);
				setState(709);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				match(COLON);
				setState(711);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			variable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lvalue_instance_ref_optContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(KumaParser.CLASS, 0); }
		public Lvalue_instance_ref_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue_instance_ref_opt; }
	}

	public final Lvalue_instance_ref_optContext lvalue_instance_ref_opt() throws RecognitionException {
		Lvalue_instance_ref_optContext _localctx = new Lvalue_instance_ref_optContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_lvalue_instance_ref_opt);
		try {
			setState(718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case INCREMENT:
			case DECREMENT:
			case OP:
			case COMPARE:
			case REGEXMATCH:
			case EQUAL:
			case LESSTHANEQUAL:
			case LESSTHAN:
			case GREATERTHANEQUAL:
			case GREATERTHAN:
			case BITWISEXOR:
			case BITWISEOR:
			case BITWISEAND:
			case SHIFTLEFT:
			case SHIFTRIGHT:
			case PLUS:
			case MINUS:
			case MULTIPLY:
			case DIVIDE:
			case MODULO:
			case EXPONENT:
			case BRACKETS:
			case IRANGE:
			case ERANGE:
			case WHENCOMP:
			case UPLUS:
			case UMINUS:
			case BRACKETSASSIGN:
			case DCOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				function_name();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(717);
				match(CLASS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lvalue_instance_refContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(KumaParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(KumaParser.DOT, i);
		}
		public List<Lvalue_instance_ref_optContext> lvalue_instance_ref_opt() {
			return getRuleContexts(Lvalue_instance_ref_optContext.class);
		}
		public Lvalue_instance_ref_optContext lvalue_instance_ref_opt(int i) {
			return getRuleContext(Lvalue_instance_ref_optContext.class,i);
		}
		public Lvalue_instance_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue_instance_ref; }
	}

	public final Lvalue_instance_refContext lvalue_instance_ref() throws RecognitionException {
		Lvalue_instance_refContext _localctx = new Lvalue_instance_refContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_lvalue_instance_ref);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			variable();
			setState(723); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(721);
				match(DOT);
				setState(722);
				lvalue_instance_ref_opt();
				}
				}
				setState(725); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lvalue_method_changeContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(KumaParser.DOT, 0); }
		public TerminalNode UNDEF() { return getToken(KumaParser.UNDEF, 0); }
		public TerminalNode STRING() { return getToken(KumaParser.STRING, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(KumaParser.REMOVE, 0); }
		public Lvalue_method_changeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue_method_change; }
	}

	public final Lvalue_method_changeContext lvalue_method_change() throws RecognitionException {
		Lvalue_method_changeContext _localctx = new Lvalue_method_changeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_lvalue_method_change);
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				variable();
				setState(728);
				match(DOT);
				setState(729);
				match(UNDEF);
				setState(730);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				variable();
				setState(733);
				match(DOT);
				setState(734);
				match(UNDEF);
				setState(735);
				symbol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(737);
				variable();
				setState(738);
				match(DOT);
				setState(739);
				match(REMOVE);
				setState(740);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(742);
				variable();
				setState(743);
				match(DOT);
				setState(744);
				match(REMOVE);
				setState(745);
				symbol();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lvalue_accessContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(KumaParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(KumaParser.LBRACKET, i);
		}
		public List<Call_argsContext> call_args() {
			return getRuleContexts(Call_argsContext.class);
		}
		public Call_argsContext call_args(int i) {
			return getRuleContext(Call_argsContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(KumaParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(KumaParser.RBRACKET, i);
		}
		public Lvalue_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue_access; }
	}

	public final Lvalue_accessContext lvalue_access() throws RecognitionException {
		Lvalue_accessContext _localctx = new Lvalue_accessContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_lvalue_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			variable();
			setState(754); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(750);
				match(LBRACKET);
				setState(751);
				call_args();
				setState(752);
				match(RBRACKET);
				}
				}
				setState(756); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public TerminalNode SELF() { return getToken(KumaParser.SELF, 0); }
		public TerminalNode SUPER() { return getToken(KumaParser.SUPER, 0); }
		public TerminalNode CONTEXT() { return getToken(KumaParser.CONTEXT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (SELF - 90)) | (1L << (SUPER - 90)) | (1L << (CONTEXT - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_argsContext extends ParserRuleContext {
		public List<Call_argContext> call_arg() {
			return getRuleContexts(Call_argContext.class);
		}
		public Call_argContext call_arg(int i) {
			return getRuleContext(Call_argContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KumaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KumaParser.COMMA, i);
		}
		public Call_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_args; }
	}

	public final Call_argsContext call_args() throws RecognitionException {
		Call_argsContext _localctx = new Call_argsContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_call_args);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			call_arg();
			setState(765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(761);
					match(COMMA);
					setState(762);
					call_arg();
					}
					} 
				}
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_arg_single_hashContext extends ParserRuleContext {
		public Single_hash_keyContext single_hash_key() {
			return getRuleContext(Single_hash_keyContext.class,0);
		}
		public TerminalNode HASH() { return getToken(KumaParser.HASH, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public Call_arg_single_hashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_arg_single_hash; }
	}

	public final Call_arg_single_hashContext call_arg_single_hash() throws RecognitionException {
		Call_arg_single_hashContext _localctx = new Call_arg_single_hashContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_call_arg_single_hash);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(768);
			single_hash_key();
			setState(769);
			match(HASH);
			setState(770);
			arg();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_argContext extends ParserRuleContext {
		public Call_arg_single_hashContext call_arg_single_hash() {
			return getRuleContext(Call_arg_single_hashContext.class,0);
		}
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(KumaParser.COLON, 0); }
		public Call_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_arg; }
	}

	public final Call_argContext call_arg() throws RecognitionException {
		Call_argContext _localctx = new Call_argContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_call_arg);
		try {
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				call_arg_single_hash();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(773);
					match(IDENTIFIER);
					setState(774);
					match(COLON);
					}
					break;
				}
				setState(777);
				arg();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class First_argContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(KumaParser.COLON, 0); }
		public TerminalNode ASSIGN() { return getToken(KumaParser.ASSIGN, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public First_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_arg; }
	}

	public final First_argContext first_arg() throws RecognitionException {
		First_argContext _localctx = new First_argContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_first_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(780);
				match(COLON);
				}
			}

			setState(783);
			match(IDENTIFIER);
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(784);
				match(ASSIGN);
				setState(785);
				arg();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class First_var_argContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(KumaParser.MULTIPLY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public First_var_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_var_arg; }
	}

	public final First_var_argContext first_var_arg() throws RecognitionException {
		First_var_argContext _localctx = new First_var_argContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_first_var_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(788);
			match(MULTIPLY);
			setState(789);
			match(IDENTIFIER);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class First_block_argContext extends ParserRuleContext {
		public TerminalNode BITWISEAND() { return getToken(KumaParser.BITWISEAND, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public First_block_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_block_arg; }
	}

	public final First_block_argContext first_block_arg() throws RecognitionException {
		First_block_argContext _localctx = new First_block_argContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_first_block_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(791);
			match(BITWISEAND);
			setState(792);
			match(IDENTIFIER);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_var_argContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(KumaParser.COMMA, 0); }
		public TerminalNode MULTIPLY() { return getToken(KumaParser.MULTIPLY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public End_var_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_var_arg; }
	}

	public final End_var_argContext end_var_arg() throws RecognitionException {
		End_var_argContext _localctx = new End_var_argContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_end_var_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(794);
			match(COMMA);
			setState(795);
			match(MULTIPLY);
			setState(796);
			match(IDENTIFIER);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_block_argContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(KumaParser.COMMA, 0); }
		public TerminalNode BITWISEAND() { return getToken(KumaParser.BITWISEAND, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public End_block_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_block_arg; }
	}

	public final End_block_argContext end_block_arg() throws RecognitionException {
		End_block_argContext _localctx = new End_block_argContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_end_block_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(798);
			match(COMMA);
			setState(799);
			match(BITWISEAND);
			setState(800);
			match(IDENTIFIER);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Next_argContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(KumaParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(KumaParser.COLON, 0); }
		public TerminalNode ASSIGN() { return getToken(KumaParser.ASSIGN, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public Next_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_arg; }
	}

	public final Next_argContext next_arg() throws RecognitionException {
		Next_argContext _localctx = new Next_argContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_next_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(COMMA);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(803);
				match(COLON);
				}
			}

			setState(806);
			match(IDENTIFIER);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(807);
				match(ASSIGN);
				setState(808);
				arg();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definition_argument_list_no_parenContext extends ParserRuleContext {
		public First_var_argContext first_var_arg() {
			return getRuleContext(First_var_argContext.class,0);
		}
		public First_block_argContext first_block_arg() {
			return getRuleContext(First_block_argContext.class,0);
		}
		public First_argContext first_arg() {
			return getRuleContext(First_argContext.class,0);
		}
		public List<Next_argContext> next_arg() {
			return getRuleContexts(Next_argContext.class);
		}
		public Next_argContext next_arg(int i) {
			return getRuleContext(Next_argContext.class,i);
		}
		public End_var_argContext end_var_arg() {
			return getRuleContext(End_var_argContext.class,0);
		}
		public End_block_argContext end_block_arg() {
			return getRuleContext(End_block_argContext.class,0);
		}
		public Definition_argument_list_no_parenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_argument_list_no_paren; }
	}

	public final Definition_argument_list_no_parenContext definition_argument_list_no_paren() throws RecognitionException {
		Definition_argument_list_no_parenContext _localctx = new Definition_argument_list_no_parenContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_definition_argument_list_no_paren);
		int _la;
		try {
			int _alt;
			setState(829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				first_var_arg();
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BITWISEAND) {
					{
					setState(812);
					first_block_arg();
					}
				}

				}
				break;
			case BITWISEAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				first_block_arg();
				}
				break;
			case COLON:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(816);
				first_arg();
				setState(820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(817);
						next_arg();
						}
						} 
					}
					setState(822);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(824);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(823);
					end_var_arg();
					}
					break;
				}
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(826);
					end_block_arg();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definition_argument_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KumaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KumaParser.RPAREN, 0); }
		public Definition_argument_list_no_parenContext definition_argument_list_no_paren() {
			return getRuleContext(Definition_argument_list_no_parenContext.class,0);
		}
		public Definition_argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_argument_list; }
	}

	public final Definition_argument_listContext definition_argument_list() throws RecognitionException {
		Definition_argument_listContext _localctx = new Definition_argument_listContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_definition_argument_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(LPAREN);
			{
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (COLON - 17)) | (1L << (IDENTIFIER - 17)) | (1L << (BITWISEAND - 17)) | (1L << (MULTIPLY - 17)))) != 0)) {
				{
				setState(832);
				definition_argument_list_no_paren();
				}
			}

			}
			setState(835);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public TerminalNode IRANGE() { return getToken(KumaParser.IRANGE, 0); }
		public TerminalNode ERANGE() { return getToken(KumaParser.ERANGE, 0); }
		public TerminalNode BITWISEOR() { return getToken(KumaParser.BITWISEOR, 0); }
		public TerminalNode BITWISEXOR() { return getToken(KumaParser.BITWISEXOR, 0); }
		public TerminalNode BITWISEAND() { return getToken(KumaParser.BITWISEAND, 0); }
		public TerminalNode COMPARE() { return getToken(KumaParser.COMPARE, 0); }
		public TerminalNode EQUAL() { return getToken(KumaParser.EQUAL, 0); }
		public TerminalNode WHENCOMP() { return getToken(KumaParser.WHENCOMP, 0); }
		public TerminalNode REGEXMATCH() { return getToken(KumaParser.REGEXMATCH, 0); }
		public TerminalNode LESSTHAN() { return getToken(KumaParser.LESSTHAN, 0); }
		public TerminalNode LESSTHANEQUAL() { return getToken(KumaParser.LESSTHANEQUAL, 0); }
		public TerminalNode GREATERTHAN() { return getToken(KumaParser.GREATERTHAN, 0); }
		public TerminalNode GREATERTHANEQUAL() { return getToken(KumaParser.GREATERTHANEQUAL, 0); }
		public TerminalNode PLUS() { return getToken(KumaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(KumaParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(KumaParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(KumaParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(KumaParser.MODULO, 0); }
		public TerminalNode EXPONENT() { return getToken(KumaParser.EXPONENT, 0); }
		public TerminalNode SHIFTLEFT() { return getToken(KumaParser.SHIFTLEFT, 0); }
		public TerminalNode SHIFTRIGHT() { return getToken(KumaParser.SHIFTRIGHT, 0); }
		public TerminalNode UPLUS() { return getToken(KumaParser.UPLUS, 0); }
		public TerminalNode UMINUS() { return getToken(KumaParser.UMINUS, 0); }
		public TerminalNode BRACKETS() { return getToken(KumaParser.BRACKETS, 0); }
		public TerminalNode BRACKETSASSIGN() { return getToken(KumaParser.BRACKETSASSIGN, 0); }
		public TerminalNode DCOLON() { return getToken(KumaParser.DCOLON, 0); }
		public TerminalNode OP() { return getToken(KumaParser.OP, 0); }
		public TerminalNode INCREMENT() { return getToken(KumaParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(KumaParser.DECREMENT, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_function_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << OP) | (1L << COMPARE) | (1L << REGEXMATCH) | (1L << EQUAL) | (1L << LESSTHANEQUAL) | (1L << LESSTHAN) | (1L << GREATERTHANEQUAL) | (1L << GREATERTHAN) | (1L << BITWISEXOR) | (1L << BITWISEOR) | (1L << BITWISEAND) | (1L << SHIFTLEFT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SHIFTRIGHT - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (MULTIPLY - 64)) | (1L << (DIVIDE - 64)) | (1L << (MODULO - 64)) | (1L << (EXPONENT - 64)) | (1L << (BRACKETS - 64)) | (1L << (IRANGE - 64)) | (1L << (ERANGE - 64)) | (1L << (WHENCOMP - 64)) | (1L << (UPLUS - 64)) | (1L << (UMINUS - 64)) | (1L << (BRACKETSASSIGN - 64)) | (1L << (DCOLON - 64)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(KumaParser.DEF, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode DOT() { return getToken(KumaParser.DOT, 0); }
		public Definition_argument_listContext definition_argument_list() {
			return getRuleContext(Definition_argument_listContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(DEF);
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(840);
				lvalue();
				setState(841);
				match(DOT);
				}
				break;
			}
			setState(845);
			function_name();
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(846);
				definition_argument_list();
				}
			}

			setState(849);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anonymous_functionContext extends ParserRuleContext {
		public TerminalNode BITWISEXOR() { return getToken(KumaParser.BITWISEXOR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Definition_argument_listContext definition_argument_list() {
			return getRuleContext(Definition_argument_listContext.class,0);
		}
		public Anonymous_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_function; }
	}

	public final Anonymous_functionContext anonymous_function() throws RecognitionException {
		Anonymous_functionContext _localctx = new Anonymous_functionContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_anonymous_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(BITWISEXOR);
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(852);
				definition_argument_list();
				}
			}

			setState(855);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Yield_blockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(KumaParser.LBRACE, 0); }
		public Block_contentsContext block_contents() {
			return getRuleContext(Block_contentsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KumaParser.RBRACE, 0); }
		public List<TerminalNode> BITWISEOR() { return getTokens(KumaParser.BITWISEOR); }
		public TerminalNode BITWISEOR(int i) {
			return getToken(KumaParser.BITWISEOR, i);
		}
		public Definition_argument_list_no_parenContext definition_argument_list_no_paren() {
			return getRuleContext(Definition_argument_list_no_parenContext.class,0);
		}
		public Yield_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_block; }
	}

	public final Yield_blockContext yield_block() throws RecognitionException {
		Yield_blockContext _localctx = new Yield_blockContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_yield_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(LBRACE);
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BITWISEOR) {
				{
				setState(858);
				match(BITWISEOR);
				setState(859);
				definition_argument_list_no_paren();
				setState(860);
				match(BITWISEOR);
				}
			}

			setState(864);
			block_contents();
			setState(865);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Do_yield_blockContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(KumaParser.DO, 0); }
		public Block_contentsContext block_contents() {
			return getRuleContext(Block_contentsContext.class,0);
		}
		public TerminalNode END() { return getToken(KumaParser.END, 0); }
		public List<TerminalNode> BITWISEOR() { return getTokens(KumaParser.BITWISEOR); }
		public TerminalNode BITWISEOR(int i) {
			return getToken(KumaParser.BITWISEOR, i);
		}
		public Definition_argument_list_no_parenContext definition_argument_list_no_paren() {
			return getRuleContext(Definition_argument_list_no_parenContext.class,0);
		}
		public Do_yield_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_yield_block; }
	}

	public final Do_yield_blockContext do_yield_block() throws RecognitionException {
		Do_yield_blockContext _localctx = new Do_yield_blockContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_do_yield_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			match(DO);
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BITWISEOR) {
				{
				setState(868);
				match(BITWISEOR);
				setState(869);
				definition_argument_list_no_paren();
				setState(870);
				match(BITWISEOR);
				}
			}

			setState(874);
			block_contents();
			setState(875);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parallel_assign_leftContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(KumaParser.MULTIPLY, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(KumaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KumaParser.COMMA, i);
		}
		public List<Parallel_assign_left_itemContext> parallel_assign_left_item() {
			return getRuleContexts(Parallel_assign_left_itemContext.class);
		}
		public Parallel_assign_left_itemContext parallel_assign_left_item(int i) {
			return getRuleContext(Parallel_assign_left_itemContext.class,i);
		}
		public Parallel_assign_leftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallel_assign_left; }
	}

	public final Parallel_assign_leftContext parallel_assign_left() throws RecognitionException {
		Parallel_assign_leftContext _localctx = new Parallel_assign_leftContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_parallel_assign_left);
		int _la;
		try {
			setState(886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(877);
				match(MULTIPLY);
				setState(878);
				lvalue();
				}
				break;
			case IDENTIFIER:
			case SELF:
			case SUPER:
			case CONTEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				lvalue();
				setState(882); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(880);
					match(COMMA);
					setState(881);
					parallel_assign_left_item();
					}
					}
					setState(884); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parallel_assign_left_itemContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KumaParser.LPAREN, 0); }
		public Parallel_assign_leftContext parallel_assign_left() {
			return getRuleContext(Parallel_assign_leftContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KumaParser.RPAREN, 0); }
		public TerminalNode MULTIPLY() { return getToken(KumaParser.MULTIPLY, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Parallel_assign_left_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallel_assign_left_item; }
	}

	public final Parallel_assign_left_itemContext parallel_assign_left_item() throws RecognitionException {
		Parallel_assign_left_itemContext _localctx = new Parallel_assign_left_itemContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_parallel_assign_left_item);
		try {
			setState(895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(888);
				match(LPAREN);
				setState(889);
				parallel_assign_left();
				setState(890);
				match(RPAREN);
				}
				break;
			case MULTIPLY:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(892);
				match(MULTIPLY);
				setState(893);
				lvalue();
				}
				}
				break;
			case IDENTIFIER:
			case SELF:
			case SUPER:
			case CONTEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(894);
				lvalue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parallel_assign_rightContext extends ParserRuleContext {
		public List<Parallel_assign_right_itemContext> parallel_assign_right_item() {
			return getRuleContexts(Parallel_assign_right_itemContext.class);
		}
		public Parallel_assign_right_itemContext parallel_assign_right_item(int i) {
			return getRuleContext(Parallel_assign_right_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KumaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KumaParser.COMMA, i);
		}
		public Parallel_assign_rightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallel_assign_right; }
	}

	public final Parallel_assign_rightContext parallel_assign_right() throws RecognitionException {
		Parallel_assign_rightContext _localctx = new Parallel_assign_rightContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_parallel_assign_right);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			parallel_assign_right_item();
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(898);
				match(COMMA);
				setState(899);
				parallel_assign_right_item();
				}
				}
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parallel_assign_right_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(KumaParser.MULTIPLY, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Parallel_assign_right_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallel_assign_right_item; }
	}

	public final Parallel_assign_right_itemContext parallel_assign_right_item() throws RecognitionException {
		Parallel_assign_right_itemContext _localctx = new Parallel_assign_right_itemContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_parallel_assign_right_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(908);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLY:
				{
				{
				setState(905);
				match(MULTIPLY);
				setState(906);
				lvalue();
				}
				}
				break;
			case LBRACE:
			case COLON:
			case LPAREN:
			case IDENTIFIER:
			case SET:
			case CONST:
			case INCREMENT:
			case DECREMENT:
			case OP:
			case BITWISEXOR:
			case PLUS:
			case MINUS:
			case NOT:
			case BITWISEINVERSE:
			case TYPEOF:
			case YIELD:
			case UNDEF:
			case STRING:
			case REMOVE:
			case LBRACKET:
			case BRACKETS:
			case NUMBER:
			case INTEGER:
			case NIL:
			case TRUE:
			case FALSE:
			case SELF:
			case SUPER:
			case CONTEXT:
			case REGEX:
				{
				setState(907);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public TerminalNode ALIAS() { return getToken(KumaParser.ALIAS, 0); }
		public List<Alias_partContext> alias_part() {
			return getRuleContexts(Alias_partContext.class);
		}
		public Alias_partContext alias_part(int i) {
			return getRuleContext(Alias_partContext.class,i);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			match(ALIAS);
			setState(911);
			alias_part();
			setState(912);
			alias_part();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alias_partContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public Alias_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_part; }
	}

	public final Alias_partContext alias_part() throws RecognitionException {
		Alias_partContext _localctx = new Alias_partContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_alias_part);
		try {
			setState(916);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				match(IDENTIFIER);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				symbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(KumaParser.INCLUDE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(KumaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(KumaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DCOLON() { return getTokens(KumaParser.DCOLON); }
		public TerminalNode DCOLON(int i) {
			return getToken(KumaParser.DCOLON, i);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_include);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			match(INCLUDE);
			setState(919);
			match(IDENTIFIER);
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DCOLON) {
				{
				{
				setState(920);
				match(DCOLON);
				setState(921);
				match(IDENTIFIER);
				}
				}
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(KumaParser.CLASS, 0); }
		public TerminalNode LBRACE() { return getToken(KumaParser.LBRACE, 0); }
		public Block_contentsContext block_contents() {
			return getRuleContext(Block_contentsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KumaParser.RBRACE, 0); }
		public TerminalNode SHIFTLEFT() { return getToken(KumaParser.SHIFTLEFT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(KumaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(KumaParser.IDENTIFIER, i);
		}
		public TerminalNode LESSTHAN() { return getToken(KumaParser.LESSTHAN, 0); }
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(CLASS);
			setState(935);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHIFTLEFT:
				{
				{
				setState(928);
				match(SHIFTLEFT);
				setState(929);
				primary();
				}
				}
				break;
			case IDENTIFIER:
				{
				{
				setState(930);
				match(IDENTIFIER);
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESSTHAN) {
					{
					setState(931);
					match(LESSTHAN);
					setState(932);
					match(IDENTIFIER);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(937);
			match(LBRACE);
			setState(938);
			block_contents();
			setState(939);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anonymous_class_declarationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KumaParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(KumaParser.LBRACE, 0); }
		public Block_contentsContext block_contents() {
			return getRuleContext(Block_contentsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KumaParser.RBRACE, 0); }
		public TerminalNode RPAREN() { return getToken(KumaParser.RPAREN, 0); }
		public TerminalNode LESSTHAN() { return getToken(KumaParser.LESSTHAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public Anonymous_class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_class_declaration; }
	}

	public final Anonymous_class_declarationContext anonymous_class_declaration() throws RecognitionException {
		Anonymous_class_declarationContext _localctx = new Anonymous_class_declarationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_anonymous_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(LPAREN);
			setState(942);
			match(LBRACE);
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LESSTHAN) {
				{
				setState(943);
				match(LESSTHAN);
				setState(944);
				match(IDENTIFIER);
				}
			}

			setState(947);
			block_contents();
			setState(948);
			match(RBRACE);
			setState(949);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_declarationContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(KumaParser.MODULE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(KumaParser.LBRACE, 0); }
		public Block_contentsContext block_contents() {
			return getRuleContext(Block_contentsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KumaParser.RBRACE, 0); }
		public Module_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_declaration; }
	}

	public final Module_declarationContext module_declaration() throws RecognitionException {
		Module_declarationContext _localctx = new Module_declarationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_module_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(MODULE);
			setState(952);
			match(IDENTIFIER);
			setState(953);
			match(LBRACE);
			setState(954);
			block_contents();
			setState(955);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_constructContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(KumaParser.BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Rescue_blockContext> rescue_block() {
			return getRuleContexts(Rescue_blockContext.class);
		}
		public Rescue_blockContext rescue_block(int i) {
			return getRuleContext(Rescue_blockContext.class,i);
		}
		public Rescue_else_blockContext rescue_else_block() {
			return getRuleContext(Rescue_else_blockContext.class,0);
		}
		public Rescue_ensure_blockContext rescue_ensure_block() {
			return getRuleContext(Rescue_ensure_blockContext.class,0);
		}
		public Begin_constructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_construct; }
	}

	public final Begin_constructContext begin_construct() throws RecognitionException {
		Begin_constructContext _localctx = new Begin_constructContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_begin_construct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(BEGIN);
			setState(958);
			block();
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RESCUE) {
				{
				{
				setState(959);
				rescue_block();
				}
				}
				setState(964);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(965);
				rescue_else_block();
				}
			}

			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENSURE) {
				{
				setState(968);
				rescue_ensure_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rescue_blockContext extends ParserRuleContext {
		public TerminalNode RESCUE() { return getToken(KumaParser.RESCUE, 0); }
		public TerminalNode MULTIPLY() { return getToken(KumaParser.MULTIPLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode HASH() { return getToken(KumaParser.HASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public Rescue_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rescue_block; }
	}

	public final Rescue_blockContext rescue_block() throws RecognitionException {
		Rescue_blockContext _localctx = new Rescue_blockContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_rescue_block);
		int _la;
		try {
			setState(987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				match(RESCUE);
				setState(972);
				match(MULTIPLY);
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HASH) {
					{
					setState(973);
					match(HASH);
					setState(974);
					match(IDENTIFIER);
					}
				}

				setState(977);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(978);
				match(RESCUE);
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(979);
					identifiers();
					setState(982);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==HASH) {
						{
						setState(980);
						match(HASH);
						setState(981);
						match(IDENTIFIER);
						}
					}

					}
				}

				setState(986);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rescue_else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(KumaParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Rescue_else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rescue_else_block; }
	}

	public final Rescue_else_blockContext rescue_else_block() throws RecognitionException {
		Rescue_else_blockContext _localctx = new Rescue_else_blockContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_rescue_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(ELSE);
			setState(990);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rescue_ensure_blockContext extends ParserRuleContext {
		public TerminalNode ENSURE() { return getToken(KumaParser.ENSURE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Rescue_ensure_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rescue_ensure_block; }
	}

	public final Rescue_ensure_blockContext rescue_ensure_block() throws RecognitionException {
		Rescue_ensure_blockContext _localctx = new Rescue_ensure_blockContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_rescue_ensure_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			match(ENSURE);
			setState(993);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifiersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(KumaParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(KumaParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(KumaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(KumaParser.COMMA, i);
		}
		public IdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers; }
	}

	public final IdentifiersContext identifiers() throws RecognitionException {
		IdentifiersContext _localctx = new IdentifiersContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_identifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			match(IDENTIFIER);
			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(996);
				match(COMMA);
				setState(997);
				match(IDENTIFIER);
				}
				}
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sync_constructContext extends ParserRuleContext {
		public TerminalNode SYNC() { return getToken(KumaParser.SYNC, 0); }
		public TerminalNode LPAREN() { return getToken(KumaParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(KumaParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(KumaParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Sync_constructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sync_construct; }
	}

	public final Sync_constructContext sync_construct() throws RecognitionException {
		Sync_constructContext _localctx = new Sync_constructContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_sync_construct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			match(SYNC);
			setState(1004);
			match(LPAREN);
			setState(1005);
			match(IDENTIFIER);
			setState(1006);
			match(RPAREN);
			setState(1007);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3p\u03f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\3\2\3\2\7\2\u00d3"+
		"\n\2\f\2\16\2\u00d6\13\2\3\2\3\2\3\2\3\2\3\2\5\2\u00dd\n\2\3\3\3\3\7\3"+
		"\u00e1\n\3\f\3\16\3\u00e4\13\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\5\6\u00ed\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u0103\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0121\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u012b\n\n\3\n\6\n\u012e"+
		"\n\n\r\n\16\n\u012f\3\n\5\n\u0133\n\n\3\n\5\n\u0136\n\n\3\n\5\n\u0139"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0141\n\13\f\13\16\13\u0144\13\13"+
		"\3\13\3\13\3\13\5\13\u0149\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u015b\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u0168\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\5\22\u0172\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\5\24\u017d\n\24\3\25\3\25\3\25\3\25\5\25\u0183\n\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u018b\n\26\3\27\3\27\5\27\u018f\n\27\3\30"+
		"\3\30\5\30\u0193\n\30\3\31\3\31\3\31\3\31\5\31\u0199\n\31\3\32\3\32\3"+
		"\32\5\32\u019e\n\32\3\32\3\32\3\33\5\33\u01a3\n\33\3\33\3\33\3\33\5\33"+
		"\u01a8\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u01af\n\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\5\36\u01ba\n\36\3\37\3\37\3\37\7\37\u01bf"+
		"\n\37\f\37\16\37\u01c2\13\37\3 \3 \3!\3!\3!\3!\7!\u01ca\n!\f!\16!\u01cd"+
		"\13!\3\"\3\"\3\"\7\"\u01d2\n\"\f\"\16\"\u01d5\13\"\3#\3#\3#\7#\u01da\n"+
		"#\f#\16#\u01dd\13#\3$\3$\3$\7$\u01e2\n$\f$\16$\u01e5\13$\3%\3%\3&\3&\3"+
		"&\3&\5&\u01ed\n&\3\'\3\'\3\'\3\'\7\'\u01f3\n\'\f\'\16\'\u01f6\13\'\3("+
		"\3(\3)\3)\3)\3)\7)\u01fe\n)\f)\16)\u0201\13)\3*\3*\3+\3+\3+\3+\7+\u0209"+
		"\n+\f+\16+\u020c\13+\3,\3,\3,\7,\u0211\n,\f,\16,\u0214\13,\3-\3-\3.\3"+
		".\3.\3.\7.\u021c\n.\f.\16.\u021f\13.\3/\3/\3\60\3\60\3\60\3\60\6\60\u0227"+
		"\n\60\r\60\16\60\u0228\3\60\6\60\u022c\n\60\r\60\16\60\u022d\3\60\3\60"+
		"\3\60\5\60\u0233\n\60\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u023b\n\62\f"+
		"\62\16\62\u023e\13\62\3\63\6\63\u0241\n\63\r\63\16\63\u0242\3\63\3\63"+
		"\6\63\u0247\n\63\r\63\16\63\u0248\3\63\3\63\3\63\3\63\3\63\5\63\u0250"+
		"\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u025b\n\63\3\64"+
		"\3\64\3\64\5\64\u0260\n\64\3\65\3\65\3\65\3\65\3\65\5\65\u0267\n\65\3"+
		"\66\3\66\5\66\u026b\n\66\3\66\3\66\5\66\u026f\n\66\3\67\3\67\3\67\3\67"+
		"\38\38\58\u0277\n8\39\39\59\u027b\n9\3:\6:\u027e\n:\r:\16:\u027f\3:\5"+
		":\u0283\n:\3;\3;\3;\3;\3;\3;\3;\3;\5;\u028d\n;\3<\3<\5<\u0291\n<\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\7=\u029d\n=\f=\16=\u02a0\13=\3=\5=\u02a3\n="+
		"\3=\3=\3>\3>\3>\5>\u02aa\n>\3?\3?\3@\3@\3@\3@\3@\7@\u02b3\n@\f@\16@\u02b6"+
		"\13@\5@\u02b8\n@\3@\5@\u02bb\n@\3A\3A\3A\3A\3A\3A\3A\3A\5A\u02c5\nA\3"+
		"B\3B\3B\3B\5B\u02cb\nB\3C\3C\3D\3D\5D\u02d1\nD\3E\3E\3E\6E\u02d6\nE\r"+
		"E\16E\u02d7\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\3"+
		"F\5F\u02ee\nF\3G\3G\3G\3G\3G\6G\u02f5\nG\rG\16G\u02f6\3H\3H\3I\3I\3I\7"+
		"I\u02fe\nI\fI\16I\u0301\13I\3J\3J\3J\3J\3K\3K\3K\5K\u030a\nK\3K\5K\u030d"+
		"\nK\3L\5L\u0310\nL\3L\3L\3L\5L\u0315\nL\3M\3M\3M\3N\3N\3N\3O\3O\3O\3O"+
		"\3P\3P\3P\3P\3Q\3Q\5Q\u0327\nQ\3Q\3Q\3Q\5Q\u032c\nQ\3R\3R\5R\u0330\nR"+
		"\3R\3R\3R\7R\u0335\nR\fR\16R\u0338\13R\3R\5R\u033b\nR\3R\5R\u033e\nR\5"+
		"R\u0340\nR\3S\3S\5S\u0344\nS\3S\3S\3T\3T\3U\3U\3U\3U\5U\u034e\nU\3U\3"+
		"U\5U\u0352\nU\3U\3U\3V\3V\5V\u0358\nV\3V\3V\3W\3W\3W\3W\3W\5W\u0361\n"+
		"W\3W\3W\3W\3X\3X\3X\3X\3X\5X\u036b\nX\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\6Y\u0375"+
		"\nY\rY\16Y\u0376\5Y\u0379\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0382\nZ\3[\3[\3"+
		"[\7[\u0387\n[\f[\16[\u038a\13[\3\\\3\\\3\\\5\\\u038f\n\\\3]\3]\3]\3]\3"+
		"^\3^\5^\u0397\n^\3_\3_\3_\3_\7_\u039d\n_\f_\16_\u03a0\13_\3`\3`\3`\3`"+
		"\3`\3`\5`\u03a8\n`\5`\u03aa\n`\3`\3`\3`\3`\3a\3a\3a\3a\5a\u03b4\na\3a"+
		"\3a\3a\3a\3b\3b\3b\3b\3b\3b\3c\3c\3c\7c\u03c3\nc\fc\16c\u03c6\13c\3c\5"+
		"c\u03c9\nc\3c\5c\u03cc\nc\3d\3d\3d\3d\5d\u03d2\nd\3d\3d\3d\3d\3d\5d\u03d9"+
		"\nd\5d\u03db\nd\3d\5d\u03de\nd\3e\3e\3e\3f\3f\3f\3g\3g\3g\7g\u03e9\ng"+
		"\fg\16g\u03ec\13g\3h\3h\3h\3h\3h\3h\3h\2\2i\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\2\17\3\2\3\4\3\2-.\3\2\36\37\4\2\n\n ,\3\2\60"+
		"\61\3\289\3\2:=\3\2>?\3\2AB\3\2CD\3\2EG\4\2\30\30\\^\n\2\30\30-/\65\66"+
		"88:GOOTT_e\2\u042f\2\u00dc\3\2\2\2\4\u00e2\3\2\2\2\6\u00e5\3\2\2\2\b\u00e7"+
		"\3\2\2\2\n\u00ec\3\2\2\2\f\u0102\3\2\2\2\16\u0120\3\2\2\2\20\u0122\3\2"+
		"\2\2\22\u0126\3\2\2\2\24\u013c\3\2\2\2\26\u014a\3\2\2\2\30\u014e\3\2\2"+
		"\2\32\u0151\3\2\2\2\34\u015c\3\2\2\2\36\u0164\3\2\2\2 \u0169\3\2\2\2\""+
		"\u016e\3\2\2\2$\u0173\3\2\2\2&\u0178\3\2\2\2(\u017e\3\2\2\2*\u018a\3\2"+
		"\2\2,\u018c\3\2\2\2.\u0192\3\2\2\2\60\u0194\3\2\2\2\62\u019d\3\2\2\2\64"+
		"\u01ae\3\2\2\2\66\u01b0\3\2\2\28\u01b3\3\2\2\2:\u01b9\3\2\2\2<\u01bb\3"+
		"\2\2\2>\u01c3\3\2\2\2@\u01c5\3\2\2\2B\u01ce\3\2\2\2D\u01d6\3\2\2\2F\u01de"+
		"\3\2\2\2H\u01e6\3\2\2\2J\u01ec\3\2\2\2L\u01ee\3\2\2\2N\u01f7\3\2\2\2P"+
		"\u01f9\3\2\2\2R\u0202\3\2\2\2T\u0204\3\2\2\2V\u020d\3\2\2\2X\u0215\3\2"+
		"\2\2Z\u0217\3\2\2\2\\\u0220\3\2\2\2^\u0232\3\2\2\2`\u0234\3\2\2\2b\u0236"+
		"\3\2\2\2d\u025a\3\2\2\2f\u025c\3\2\2\2h\u0266\3\2\2\2j\u0268\3\2\2\2l"+
		"\u0270\3\2\2\2n\u0276\3\2\2\2p\u027a\3\2\2\2r\u027d\3\2\2\2t\u028c\3\2"+
		"\2\2v\u028e\3\2\2\2x\u0292\3\2\2\2z\u02a9\3\2\2\2|\u02ab\3\2\2\2~\u02ba"+
		"\3\2\2\2\u0080\u02c4\3\2\2\2\u0082\u02ca\3\2\2\2\u0084\u02cc\3\2\2\2\u0086"+
		"\u02d0\3\2\2\2\u0088\u02d2\3\2\2\2\u008a\u02ed\3\2\2\2\u008c\u02ef\3\2"+
		"\2\2\u008e\u02f8\3\2\2\2\u0090\u02fa\3\2\2\2\u0092\u0302\3\2\2\2\u0094"+
		"\u030c\3\2\2\2\u0096\u030f\3\2\2\2\u0098\u0316\3\2\2\2\u009a\u0319\3\2"+
		"\2\2\u009c\u031c\3\2\2\2\u009e\u0320\3\2\2\2\u00a0\u0324\3\2\2\2\u00a2"+
		"\u033f\3\2\2\2\u00a4\u0341\3\2\2\2\u00a6\u0347\3\2\2\2\u00a8\u0349\3\2"+
		"\2\2\u00aa\u0355\3\2\2\2\u00ac\u035b\3\2\2\2\u00ae\u0365\3\2\2\2\u00b0"+
		"\u0378\3\2\2\2\u00b2\u0381\3\2\2\2\u00b4\u0383\3\2\2\2\u00b6\u038e\3\2"+
		"\2\2\u00b8\u0390\3\2\2\2\u00ba\u0396\3\2\2\2\u00bc\u0398\3\2\2\2\u00be"+
		"\u03a1\3\2\2\2\u00c0\u03af\3\2\2\2\u00c2\u03b9\3\2\2\2\u00c4\u03bf\3\2"+
		"\2\2\u00c6\u03dd\3\2\2\2\u00c8\u03df\3\2\2\2\u00ca\u03e2\3\2\2\2\u00cc"+
		"\u03e5\3\2\2\2\u00ce\u03ed\3\2\2\2\u00d0\u00d4\5\4\3\2\u00d1\u00d3\5\6"+
		"\4\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\2"+
		"\2\3\u00d8\u00dd\3\2\2\2\u00d9\u00da\5\n\6\2\u00da\u00db\7\2\2\3\u00db"+
		"\u00dd\3\2\2\2\u00dc\u00d0\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dd\3\3\2\2\2"+
		"\u00de\u00e1\5\b\5\2\u00df\u00e1\5\6\4\2\u00e0\u00de\3\2\2\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\t\2\2\2\u00e6\7\3\2\2\2\u00e7"+
		"\u00e8\5\n\6\2\u00e8\u00e9\5\6\4\2\u00e9\t\3\2\2\2\u00ea\u00ed\5\f\7\2"+
		"\u00eb\u00ed\5\16\b\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\13"+
		"\3\2\2\2\u00ee\u00ef\5\16\b\2\u00ef\u00f0\7\5\2\2\u00f0\u00f1\5.\30\2"+
		"\u00f1\u0103\3\2\2\2\u00f2\u00f3\5\16\b\2\u00f3\u00f4\7\6\2\2\u00f4\u00f5"+
		"\5.\30\2\u00f5\u0103\3\2\2\2\u00f6\u00f7\5\16\b\2\u00f7\u00f8\7\7\2\2"+
		"\u00f8\u00f9\5.\30\2\u00f9\u0103\3\2\2\2\u00fa\u00fb\5\16\b\2\u00fb\u00fc"+
		"\7\b\2\2\u00fc\u00fd\5.\30\2\u00fd\u0103\3\2\2\2\u00fe\u00ff\5\16\b\2"+
		"\u00ff\u0100\7\t\2\2\u0100\u0101\5x=\2\u0101\u0103\3\2\2\2\u0102\u00ee"+
		"\3\2\2\2\u0102\u00f2\3\2\2\2\u0102\u00f6\3\2\2\2\u0102\u00fa\3\2\2\2\u0102"+
		"\u00fe\3\2\2\2\u0103\r\3\2\2\2\u0104\u0105\5\u00b0Y\2\u0105\u0106\7\n"+
		"\2\2\u0106\u0107\5\u00b4[\2\u0107\u0121\3\2\2\2\u0108\u0121\5\30\r\2\u0109"+
		"\u0121\5\u00be`\2\u010a\u0121\5\u00c2b\2\u010b\u0121\5\22\n\2\u010c\u0121"+
		"\5\32\16\2\u010d\u0121\5\34\17\2\u010e\u0121\5\36\20\2\u010f\u0121\5 "+
		"\21\2\u0110\u0121\5\"\22\2\u0111\u0121\5$\23\2\u0112\u0121\5&\24\2\u0113"+
		"\u0121\5(\25\2\u0114\u0121\5\u00c4c\2\u0115\u0121\5\u00ceh\2\u0116\u0121"+
		"\5\u00b8]\2\u0117\u0121\5\u00bc_\2\u0118\u0121\7\13\2\2\u0119\u0121\7"+
		"\f\2\2\u011a\u0121\7\r\2\2\u011b\u011c\7\16\2\2\u011c\u0121\5.\30\2\u011d"+
		"\u0121\5,\27\2\u011e\u0121\5\u00a8U\2\u011f\u0121\5.\30\2\u0120\u0104"+
		"\3\2\2\2\u0120\u0108\3\2\2\2\u0120\u0109\3\2\2\2\u0120\u010a\3\2\2\2\u0120"+
		"\u010b\3\2\2\2\u0120\u010c\3\2\2\2\u0120\u010d\3\2\2\2\u0120\u010e\3\2"+
		"\2\2\u0120\u010f\3\2\2\2\u0120\u0110\3\2\2\2\u0120\u0111\3\2\2\2\u0120"+
		"\u0112\3\2\2\2\u0120\u0113\3\2\2\2\u0120\u0114\3\2\2\2\u0120\u0115\3\2"+
		"\2\2\u0120\u0116\3\2\2\2\u0120\u0117\3\2\2\2\u0120\u0118\3\2\2\2\u0120"+
		"\u0119\3\2\2\2\u0120\u011a\3\2\2\2\u0120\u011b\3\2\2\2\u0120\u011d\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\17\3\2\2\2\u0122\u0123"+
		"\7\17\2\2\u0123\u0124\5\4\3\2\u0124\u0125\7\20\2\2\u0125\21\3\2\2\2\u0126"+
		"\u0127\7\21\2\2\u0127\u0128\5.\30\2\u0128\u012a\7\17\2\2\u0129\u012b\5"+
		"\6\4\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c"+
		"\u012e\5\24\13\2\u012d\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3"+
		"\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u0133\5\6\4\2\u0132"+
		"\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0136\5\26"+
		"\f\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137"+
		"\u0139\5\6\4\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013b\7\20\2\2\u013b\23\3\2\2\2\u013c\u013d\7\22\2\2\u013d"+
		"\u0142\5.\30\2\u013e\u013f\7S\2\2\u013f\u0141\5.\30\2\u0140\u013e\3\2"+
		"\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7\23\2\2\u0146\u0148\5"+
		"\20\t\2\u0147\u0149\5\6\4\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\25\3\2\2\2\u014a\u014b\7\24\2\2\u014b\u014c\7\23\2\2\u014c\u014d\5\20"+
		"\t\2\u014d\27\3\2\2\2\u014e\u014f\7\25\2\2\u014f\u0150\5\20\t\2\u0150"+
		"\31\3\2\2\2\u0151\u0152\7\26\2\2\u0152\u0153\7\27\2\2\u0153\u0154\5.\30"+
		"\2\u0154\u0155\7\4\2\2\u0155\u0156\5.\30\2\u0156\u0157\7\4\2\2\u0157\u0158"+
		"\5.\30\2\u0158\u015a\7\32\2\2\u0159\u015b\5\20\t\2\u015a\u0159\3\2\2\2"+
		"\u015a\u015b\3\2\2\2\u015b\33\3\2\2\2\u015c\u015d\7\26\2\2\u015d\u015e"+
		"\7\27\2\2\u015e\u015f\7\30\2\2\u015f\u0160\7\31\2\2\u0160\u0161\5.\30"+
		"\2\u0161\u0162\7\32\2\2\u0162\u0163\5\20\t\2\u0163\35\3\2\2\2\u0164\u0165"+
		"\7\b\2\2\u0165\u0167\5.\30\2\u0166\u0168\5\20\t\2\u0167\u0166\3\2\2\2"+
		"\u0167\u0168\3\2\2\2\u0168\37\3\2\2\2\u0169\u016a\7\33\2\2\u016a\u016b"+
		"\5\20\t\2\u016b\u016c\7\b\2\2\u016c\u016d\5.\30\2\u016d!\3\2\2\2\u016e"+
		"\u016f\7\6\2\2\u016f\u0171\5.\30\2\u0170\u0172\5\20\t\2\u0171\u0170\3"+
		"\2\2\2\u0171\u0172\3\2\2\2\u0172#\3\2\2\2\u0173\u0174\7\33\2\2\u0174\u0175"+
		"\5\20\t\2\u0175\u0176\7\6\2\2\u0176\u0177\5.\30\2\u0177%\3\2\2\2\u0178"+
		"\u0179\7\7\2\2\u0179\u017a\5.\30\2\u017a\u017c\5\20\t\2\u017b\u017d\5"+
		"*\26\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d\'\3\2\2\2\u017e\u017f"+
		"\7\5\2\2\u017f\u0180\5.\30\2\u0180\u0182\5\20\t\2\u0181\u0183\5*\26\2"+
		"\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183)\3\2\2\2\u0184\u0185\7"+
		"\34\2\2\u0185\u018b\5(\25\2\u0186\u0187\7\34\2\2\u0187\u018b\5&\24\2\u0188"+
		"\u0189\7\34\2\2\u0189\u018b\5\20\t\2\u018a\u0184\3\2\2\2\u018a\u0186\3"+
		"\2\2\2\u018a\u0188\3\2\2\2\u018b+\3\2\2\2\u018c\u018e\7\35\2\2\u018d\u018f"+
		"\5\u0090I\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f-\3\2\2\2\u0190"+
		"\u0193\5\64\33\2\u0191\u0193\5:\36\2\u0192\u0190\3\2\2\2\u0192\u0191\3"+
		"\2\2\2\u0193/\3\2\2\2\u0194\u0198\t\3\2\2\u0195\u0199\5\u008cG\2\u0196"+
		"\u0199\5\u0088E\2\u0197\u0199\5\u0084C\2\u0198\u0195\3\2\2\2\u0198\u0196"+
		"\3\2\2\2\u0198\u0197\3\2\2\2\u0199\61\3\2\2\2\u019a\u019e\5\u008cG\2\u019b"+
		"\u019e\5\u0088E\2\u019c\u019e\5\u0084C\2\u019d\u019a\3\2\2\2\u019d\u019b"+
		"\3\2\2\2\u019d\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\t\3\2\2\u01a0"+
		"\63\3\2\2\2\u01a1\u01a3\t\4\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2"+
		"\2\u01a3\u01a7\3\2\2\2\u01a4\u01a8\5\u008cG\2\u01a5\u01a8\5\u0088E\2\u01a6"+
		"\u01a8\5\u0084C\2\u01a7\u01a4\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a6"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\t\5\2\2\u01aa\u01ab\5.\30\2\u01ab"+
		"\u01af\3\2\2\2\u01ac\u01af\5\60\31\2\u01ad\u01af\5\62\32\2\u01ae\u01a2"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2\u01af\65\3\2\2\2\u01b0"+
		"\u01b1\7/\2\2\u01b1\u01b2\5<\37\2\u01b2\67\3\2\2\2\u01b3\u01b4\5<\37\2"+
		"\u01b4\u01b5\7/\2\2\u01b59\3\2\2\2\u01b6\u01ba\5\66\34\2\u01b7\u01ba\5"+
		"8\35\2\u01b8\u01ba\5<\37\2\u01b9\u01b6\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01b8\3\2\2\2\u01ba;\3\2\2\2\u01bb\u01c0\5@!\2\u01bc\u01bd\7/\2\2\u01bd"+
		"\u01bf\5@!\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2"+
		"\2\u01c0\u01c1\3\2\2\2\u01c1=\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4"+
		"\t\6\2\2\u01c4?\3\2\2\2\u01c5\u01cb\5B\"\2\u01c6\u01c7\5> \2\u01c7\u01c8"+
		"\5B\"\2\u01c8\u01ca\3\2\2\2\u01c9\u01c6\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01ccA\3\2\2\2\u01cd\u01cb\3\2\2\2"+
		"\u01ce\u01d3\5D#\2\u01cf\u01d0\7\62\2\2\u01d0\u01d2\5D#\2\u01d1\u01cf"+
		"\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"C\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01db\5F$\2\u01d7\u01d8\7\63\2\2\u01d8"+
		"\u01da\5F$\2\u01d9\u01d7\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2"+
		"\2\u01db\u01dc\3\2\2\2\u01dcE\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01e3"+
		"\5L\'\2\u01df\u01e0\7\64\2\2\u01e0\u01e2\5L\'\2\u01e1\u01df\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4G\3\2\2\2"+
		"\u01e5\u01e3\3\2\2\2\u01e6\u01e7\t\7\2\2\u01e7I\3\2\2\2\u01e8\u01ed\7"+
		"\65\2\2\u01e9\u01ed\7\66\2\2\u01ea\u01ed\7\67\2\2\u01eb\u01ed\5H%\2\u01ec"+
		"\u01e8\3\2\2\2\u01ec\u01e9\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2"+
		"\2\2\u01edK\3\2\2\2\u01ee\u01f4\5P)\2\u01ef\u01f0\5J&\2\u01f0\u01f1\5"+
		"P)\2\u01f1\u01f3\3\2\2\2\u01f2\u01ef\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5M\3\2\2\2\u01f6\u01f4\3\2\2\2"+
		"\u01f7\u01f8\t\b\2\2\u01f8O\3\2\2\2\u01f9\u01ff\5T+\2\u01fa\u01fb\5N("+
		"\2\u01fb\u01fc\5T+\2\u01fc\u01fe\3\2\2\2\u01fd\u01fa\3\2\2\2\u01fe\u0201"+
		"\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200Q\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0202\u0203\t\t\2\2\u0203S\3\2\2\2\u0204\u020a\5V,\2\u0205"+
		"\u0206\5R*\2\u0206\u0207\5V,\2\u0207\u0209\3\2\2\2\u0208\u0205\3\2\2\2"+
		"\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020bU\3"+
		"\2\2\2\u020c\u020a\3\2\2\2\u020d\u0212\5Z.\2\u020e\u020f\7@\2\2\u020f"+
		"\u0211\5Z.\2\u0210\u020e\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2"+
		"\2\u0212\u0213\3\2\2\2\u0213W\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216"+
		"\t\n\2\2\u0216Y\3\2\2\2\u0217\u021d\5^\60\2\u0218\u0219\5X-\2\u0219\u021a"+
		"\5^\60\2\u021a\u021c\3\2\2\2\u021b\u0218\3\2\2\2\u021c\u021f\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e[\3\2\2\2\u021f\u021d\3\2\2\2"+
		"\u0220\u0221\t\13\2\2\u0221]\3\2\2\2\u0222\u0226\5b\62\2\u0223\u0224\5"+
		"\\/\2\u0224\u0225\5b\62\2\u0225\u0227\3\2\2\2\u0226\u0223\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0233\3\2"+
		"\2\2\u022a\u022c\5\\/\2\u022b\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\5b"+
		"\62\2\u0230\u0233\3\2\2\2\u0231\u0233\5b\62\2\u0232\u0222\3\2\2\2\u0232"+
		"\u022b\3\2\2\2\u0232\u0231\3\2\2\2\u0233_\3\2\2\2\u0234\u0235\t\f\2\2"+
		"\u0235a\3\2\2\2\u0236\u023c\5d\63\2\u0237\u0238\5`\61\2\u0238\u0239\5"+
		"d\63\2\u0239\u023b\3\2\2\2\u023a\u0237\3\2\2\2\u023b\u023e\3\2\2\2\u023c"+
		"\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023dc\3\2\2\2\u023e\u023c\3\2\2\2"+
		"\u023f\u0241\7H\2\2\u0240\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0240"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u025b\5d\63\2\u0245"+
		"\u0247\7I\2\2\u0246\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0246\3\2"+
		"\2\2\u0248\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u025b\5d\63\2\u024b"+
		"\u024c\7J\2\2\u024c\u025b\5d\63\2\u024d\u024f\7K\2\2\u024e\u0250\5\u0090"+
		"I\2\u024f\u024e\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u025b\3\2\2\2\u0251"+
		"\u0252\7L\2\2\u0252\u025b\7M\2\2\u0253\u0254\7L\2\2\u0254\u025b\5\u0082"+
		"B\2\u0255\u0256\7N\2\2\u0256\u025b\7M\2\2\u0257\u0258\7N\2\2\u0258\u025b"+
		"\5\u0082B\2\u0259\u025b\5f\64\2\u025a\u0240\3\2\2\2\u025a\u0246\3\2\2"+
		"\2\u025a\u024b\3\2\2\2\u025a\u024d\3\2\2\2\u025a\u0251\3\2\2\2\u025a\u0253"+
		"\3\2\2\2\u025a\u0255\3\2\2\2\u025a\u0257\3\2\2\2\u025a\u0259\3\2\2\2\u025b"+
		"e\3\2\2\2\u025c\u025f\5h\65\2\u025d\u025e\7O\2\2\u025e\u0260\5f\64\2\u025f"+
		"\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260g\3\2\2\2\u0261\u0262\7\27\2\2"+
		"\u0262\u0263\5.\30\2\u0263\u0264\7\32\2\2\u0264\u0267\3\2\2\2\u0265\u0267"+
		"\5v<\2\u0266\u0261\3\2\2\2\u0266\u0265\3\2\2\2\u0267i\3\2\2\2\u0268\u026a"+
		"\7\27\2\2\u0269\u026b\5\u0090I\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2"+
		"\2\u026b\u026c\3\2\2\2\u026c\u026e\7\32\2\2\u026d\u026f\5\u00acW\2\u026e"+
		"\u026d\3\2\2\2\u026e\u026f\3\2\2\2\u026fk\3\2\2\2\u0270\u0271\7P\2\2\u0271"+
		"\u0272\5\u0090I\2\u0272\u0273\7Q\2\2\u0273m\3\2\2\2\u0274\u0277\5\u00ac"+
		"W\2\u0275\u0277\5\u00aeX\2\u0276\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277"+
		"o\3\2\2\2\u0278\u027b\5j\66\2\u0279\u027b\5l\67\2\u027a\u0278\3\2\2\2"+
		"\u027a\u0279\3\2\2\2\u027bq\3\2\2\2\u027c\u027e\5p9\2\u027d\u027c\3\2"+
		"\2\2\u027e\u027f\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0282\3\2\2\2\u0281\u0283\5n8\2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2"+
		"\2\u0283s\3\2\2\2\u0284\u028d\5\u0080A\2\u0285\u028d\5\u0088E\2\u0286"+
		"\u028d\5\u008aF\2\u0287\u028d\5\u0084C\2\u0288\u028d\5~@\2\u0289\u028d"+
		"\5x=\2\u028a\u028d\5\u00aaV\2\u028b\u028d\5\u00c0a\2\u028c\u0284\3\2\2"+
		"\2\u028c\u0285\3\2\2\2\u028c\u0286\3\2\2\2\u028c\u0287\3\2\2\2\u028c\u0288"+
		"\3\2\2\2\u028c\u0289\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028b\3\2\2\2\u028d"+
		"u\3\2\2\2\u028e\u0290\5t;\2\u028f\u0291\5r:\2\u0290\u028f\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291w\3\2\2\2\u0292\u02a2\7\17\2\2\u0293\u0294\5|?\2\u0294"+
		"\u0295\7R\2\2\u0295\u0296\5:\36\2\u0296\u029e\3\2\2\2\u0297\u0298\7S\2"+
		"\2\u0298\u0299\5|?\2\u0299\u029a\7R\2\2\u029a\u029b\5:\36\2\u029b\u029d"+
		"\3\2\2\2\u029c\u0297\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u02a3\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a3\7\23"+
		"\2\2\u02a2\u0293\3\2\2\2\u02a2\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"\u02a5\7\20\2\2\u02a5y\3\2\2\2\u02a6\u02aa\7\30\2\2\u02a7\u02aa\7M\2\2"+
		"\u02a8\u02aa\5\u0082B\2\u02a9\u02a6\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9"+
		"\u02a8\3\2\2\2\u02aa{\3\2\2\2\u02ab\u02ac\5:\36\2\u02ac}\3\2\2\2\u02ad"+
		"\u02bb\7T\2\2\u02ae\u02b7\7P\2\2\u02af\u02b4\5:\36\2\u02b0\u02b1\7S\2"+
		"\2\u02b1\u02b3\5:\36\2\u02b2\u02b0\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7"+
		"\u02af\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02bb\7Q"+
		"\2\2\u02ba\u02ad\3\2\2\2\u02ba\u02ae\3\2\2\2\u02bb\177\3\2\2\2\u02bc\u02c5"+
		"\7U\2\2\u02bd\u02c5\7V\2\2\u02be\u02c5\7M\2\2\u02bf\u02c5\7o\2\2\u02c0"+
		"\u02c5\7W\2\2\u02c1\u02c5\7X\2\2\u02c2\u02c5\7Y\2\2\u02c3\u02c5\5\u0082"+
		"B\2\u02c4\u02bc\3\2\2\2\u02c4\u02bd\3\2\2\2\u02c4\u02be\3\2\2\2\u02c4"+
		"\u02bf\3\2\2\2\u02c4\u02c0\3\2\2\2\u02c4\u02c1\3\2\2\2\u02c4\u02c2\3\2"+
		"\2\2\u02c4\u02c3\3\2\2\2\u02c5\u0081\3\2\2\2\u02c6\u02c7\7\23\2\2\u02c7"+
		"\u02cb\7\30\2\2\u02c8\u02c9\7\23\2\2\u02c9\u02cb\7M\2\2\u02ca\u02c6\3"+
		"\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u0083\3\2\2\2\u02cc\u02cd\5\u008eH\2"+
		"\u02cd\u0085\3\2\2\2\u02ce\u02d1\5\u00a6T\2\u02cf\u02d1\7[\2\2\u02d0\u02ce"+
		"\3\2\2\2\u02d0\u02cf\3\2\2\2\u02d1\u0087\3\2\2\2\u02d2\u02d5\5\u008eH"+
		"\2\u02d3\u02d4\7Z\2\2\u02d4\u02d6\5\u0086D\2\u02d5\u02d3\3\2\2\2\u02d6"+
		"\u02d7\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u0089\3\2"+
		"\2\2\u02d9\u02da\5\u008eH\2\u02da\u02db\7Z\2\2\u02db\u02dc\7L\2\2\u02dc"+
		"\u02dd\7M\2\2\u02dd\u02ee\3\2\2\2\u02de\u02df\5\u008eH\2\u02df\u02e0\7"+
		"Z\2\2\u02e0\u02e1\7L\2\2\u02e1\u02e2\5\u0082B\2\u02e2\u02ee\3\2\2\2\u02e3"+
		"\u02e4\5\u008eH\2\u02e4\u02e5\7Z\2\2\u02e5\u02e6\7N\2\2\u02e6\u02e7\7"+
		"M\2\2\u02e7\u02ee\3\2\2\2\u02e8\u02e9\5\u008eH\2\u02e9\u02ea\7Z\2\2\u02ea"+
		"\u02eb\7N\2\2\u02eb\u02ec\5\u0082B\2\u02ec\u02ee\3\2\2\2\u02ed\u02d9\3"+
		"\2\2\2\u02ed\u02de\3\2\2\2\u02ed\u02e3\3\2\2\2\u02ed\u02e8\3\2\2\2\u02ee"+
		"\u008b\3\2\2\2\u02ef\u02f4\5\u008eH\2\u02f0\u02f1\7P\2\2\u02f1\u02f2\5"+
		"\u0090I\2\u02f2\u02f3\7Q\2\2\u02f3\u02f5\3\2\2\2\u02f4\u02f0\3\2\2\2\u02f5"+
		"\u02f6\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u008d\3\2"+
		"\2\2\u02f8\u02f9\t\r\2\2\u02f9\u008f\3\2\2\2\u02fa\u02ff\5\u0094K\2\u02fb"+
		"\u02fc\7S\2\2\u02fc\u02fe\5\u0094K\2\u02fd\u02fb\3\2\2\2\u02fe\u0301\3"+
		"\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0091\3\2\2\2\u0301"+
		"\u02ff\3\2\2\2\u0302\u0303\5z>\2\u0303\u0304\7R\2\2\u0304\u0305\5:\36"+
		"\2\u0305\u0093\3\2\2\2\u0306\u030d\5\u0092J\2\u0307\u0308\7\30\2\2\u0308"+
		"\u030a\7\23\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\3"+
		"\2\2\2\u030b\u030d\5:\36\2\u030c\u0306\3\2\2\2\u030c\u0309\3\2\2\2\u030d"+
		"\u0095\3\2\2\2\u030e\u0310\7\23\2\2\u030f\u030e\3\2\2\2\u030f\u0310\3"+
		"\2\2\2\u0310\u0311\3\2\2\2\u0311\u0314\7\30\2\2\u0312\u0313\7\n\2\2\u0313"+
		"\u0315\5:\36\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0097\3\2"+
		"\2\2\u0316\u0317\7E\2\2\u0317\u0318\7\30\2\2\u0318\u0099\3\2\2\2\u0319"+
		"\u031a\7@\2\2\u031a\u031b\7\30\2\2\u031b\u009b\3\2\2\2\u031c\u031d\7S"+
		"\2\2\u031d\u031e\7E\2\2\u031e\u031f\7\30\2\2\u031f\u009d\3\2\2\2\u0320"+
		"\u0321\7S\2\2\u0321\u0322\7@\2\2\u0322\u0323\7\30\2\2\u0323\u009f\3\2"+
		"\2\2\u0324\u0326\7S\2\2\u0325\u0327\7\23\2\2\u0326\u0325\3\2\2\2\u0326"+
		"\u0327\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032b\7\30\2\2\u0329\u032a\7"+
		"\n\2\2\u032a\u032c\5:\36\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u00a1\3\2\2\2\u032d\u032f\5\u0098M\2\u032e\u0330\5\u009aN\2\u032f\u032e"+
		"\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0340\3\2\2\2\u0331\u0340\5\u009aN"+
		"\2\u0332\u0336\5\u0096L\2\u0333\u0335\5\u00a0Q\2\u0334\u0333\3\2\2\2\u0335"+
		"\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u033a\3\2"+
		"\2\2\u0338\u0336\3\2\2\2\u0339\u033b\5\u009cO\2\u033a\u0339\3\2\2\2\u033a"+
		"\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c\u033e\5\u009eP\2\u033d\u033c"+
		"\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0340\3\2\2\2\u033f\u032d\3\2\2\2\u033f"+
		"\u0331\3\2\2\2\u033f\u0332\3\2\2\2\u0340\u00a3\3\2\2\2\u0341\u0343\7\27"+
		"\2\2\u0342\u0344\5\u00a2R\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344"+
		"\u0345\3\2\2\2\u0345\u0346\7\32\2\2\u0346\u00a5\3\2\2\2\u0347\u0348\t"+
		"\16\2\2\u0348\u00a7\3\2\2\2\u0349\u034d\7f\2\2\u034a\u034b\5\u0084C\2"+
		"\u034b\u034c\7Z\2\2\u034c\u034e\3\2\2\2\u034d\u034a\3\2\2\2\u034d\u034e"+
		"\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\5\u00a6T\2\u0350\u0352\5\u00a4"+
		"S\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0354\5\20\t\2\u0354\u00a9\3\2\2\2\u0355\u0357\7>\2\2\u0356\u0358\5\u00a4"+
		"S\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"\u035a\5\20\t\2\u035a\u00ab\3\2\2\2\u035b\u0360\7\17\2\2\u035c\u035d\7"+
		"?\2\2\u035d\u035e\5\u00a2R\2\u035e\u035f\7?\2\2\u035f\u0361\3\2\2\2\u0360"+
		"\u035c\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363\5\4"+
		"\3\2\u0363\u0364\7\20\2\2\u0364\u00ad\3\2\2\2\u0365\u036a\7\33\2\2\u0366"+
		"\u0367\7?\2\2\u0367\u0368\5\u00a2R\2\u0368\u0369\7?\2\2\u0369\u036b\3"+
		"\2\2\2\u036a\u0366\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
		"\u036d\5\4\3\2\u036d\u036e\7g\2\2\u036e\u00af\3\2\2\2\u036f\u0370\7E\2"+
		"\2\u0370\u0379\5\u0084C\2\u0371\u0374\5\u0084C\2\u0372\u0373\7S\2\2\u0373"+
		"\u0375\5\u00b2Z\2\u0374\u0372\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0374"+
		"\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0379\3\2\2\2\u0378\u036f\3\2\2\2\u0378"+
		"\u0371\3\2\2\2\u0379\u00b1\3\2\2\2\u037a\u037b\7\27\2\2\u037b\u037c\5"+
		"\u00b0Y\2\u037c\u037d\7\32\2\2\u037d\u0382\3\2\2\2\u037e\u037f\7E\2\2"+
		"\u037f\u0382\5\u0084C\2\u0380\u0382\5\u0084C\2\u0381\u037a\3\2\2\2\u0381"+
		"\u037e\3\2\2\2\u0381\u0380\3\2\2\2\u0382\u00b3\3\2\2\2\u0383\u0388\5\u00b6"+
		"\\\2\u0384\u0385\7S\2\2\u0385\u0387\5\u00b6\\\2\u0386\u0384\3\2\2\2\u0387"+
		"\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u00b5\3\2"+
		"\2\2\u038a\u0388\3\2\2\2\u038b\u038c\7E\2\2\u038c\u038f\5\u0084C\2\u038d"+
		"\u038f\5.\30\2\u038e\u038b\3\2\2\2\u038e\u038d\3\2\2\2\u038f\u00b7\3\2"+
		"\2\2\u0390\u0391\7h\2\2\u0391\u0392\5\u00ba^\2\u0392\u0393\5\u00ba^\2"+
		"\u0393\u00b9\3\2\2\2\u0394\u0397\7\30\2\2\u0395\u0397\5\u0082B\2\u0396"+
		"\u0394\3\2\2\2\u0396\u0395\3\2\2\2\u0397\u00bb\3\2\2\2\u0398\u0399\7i"+
		"\2\2\u0399\u039e\7\30\2\2\u039a\u039b\7e\2\2\u039b\u039d\7\30\2\2\u039c"+
		"\u039a\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2"+
		"\2\2\u039f\u00bd\3\2\2\2\u03a0\u039e\3\2\2\2\u03a1\u03a9\7[\2\2\u03a2"+
		"\u03a3\7A\2\2\u03a3\u03aa\5v<\2\u03a4\u03a7\7\30\2\2\u03a5\u03a6\7;\2"+
		"\2\u03a6\u03a8\7\30\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8"+
		"\u03aa\3\2\2\2\u03a9\u03a2\3\2\2\2\u03a9\u03a4\3\2\2\2\u03aa\u03ab\3\2"+
		"\2\2\u03ab\u03ac\7\17\2\2\u03ac\u03ad\5\4\3\2\u03ad\u03ae\7\20\2\2\u03ae"+
		"\u00bf\3\2\2\2\u03af\u03b0\7\27\2\2\u03b0\u03b3\7\17\2\2\u03b1\u03b2\7"+
		";\2\2\u03b2\u03b4\7\30\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4"+
		"\u03b5\3\2\2\2\u03b5\u03b6\5\4\3\2\u03b6\u03b7\7\20\2\2\u03b7\u03b8\7"+
		"\32\2\2\u03b8\u00c1\3\2\2\2\u03b9\u03ba\7j\2\2\u03ba\u03bb\7\30\2\2\u03bb"+
		"\u03bc\7\17\2\2\u03bc\u03bd\5\4\3\2\u03bd\u03be\7\20\2\2\u03be\u00c3\3"+
		"\2\2\2\u03bf\u03c0\7k\2\2\u03c0\u03c4\5\20\t\2\u03c1\u03c3\5\u00c6d\2"+
		"\u03c2\u03c1\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5"+
		"\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c7\u03c9\5\u00c8e"+
		"\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb\3\2\2\2\u03ca\u03cc"+
		"\5\u00caf\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u00c5\3\2\2"+
		"\2\u03cd\u03ce\7m\2\2\u03ce\u03d1\7E\2\2\u03cf\u03d0\7R\2\2\u03d0\u03d2"+
		"\7\30\2\2\u03d1\u03cf\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2\2\2"+
		"\u03d3\u03de\5\20\t\2\u03d4\u03da\7m\2\2\u03d5\u03d8\5\u00ccg\2\u03d6"+
		"\u03d7\7R\2\2\u03d7\u03d9\7\30\2\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9\3\2"+
		"\2\2\u03d9\u03db\3\2\2\2\u03da\u03d5\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u03de\5\20\t\2\u03dd\u03cd\3\2\2\2\u03dd\u03d4\3"+
		"\2\2\2\u03de\u00c7\3\2\2\2\u03df\u03e0\7\34\2\2\u03e0\u03e1\5\20\t\2\u03e1"+
		"\u00c9\3\2\2\2\u03e2\u03e3\7l\2\2\u03e3\u03e4\5\20\t\2\u03e4\u00cb\3\2"+
		"\2\2\u03e5\u03ea\7\30\2\2\u03e6\u03e7\7S\2\2\u03e7\u03e9\7\30\2\2\u03e8"+
		"\u03e6\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2"+
		"\2\2\u03eb\u00cd\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ed\u03ee\7n\2\2\u03ee"+
		"\u03ef\7\27\2\2\u03ef\u03f0\7\30\2\2\u03f0\u03f1\7\32\2\2\u03f1\u03f2"+
		"\5\20\t\2\u03f2\u00cf\3\2\2\2k\u00d4\u00dc\u00e0\u00e2\u00ec\u0102\u0120"+
		"\u012a\u012f\u0132\u0135\u0138\u0142\u0148\u015a\u0167\u0171\u017c\u0182"+
		"\u018a\u018e\u0192\u0198\u019d\u01a2\u01a7\u01ae\u01b9\u01c0\u01cb\u01d3"+
		"\u01db\u01e3\u01ec\u01f4\u01ff\u020a\u0212\u021d\u0228\u022d\u0232\u023c"+
		"\u0242\u0248\u024f\u025a\u025f\u0266\u026a\u026e\u0276\u027a\u027f\u0282"+
		"\u028c\u0290\u029e\u02a2\u02a9\u02b4\u02b7\u02ba\u02c4\u02ca\u02d0\u02d7"+
		"\u02ed\u02f6\u02ff\u0309\u030c\u030f\u0314\u0326\u032b\u032f\u0336\u033a"+
		"\u033d\u033f\u0343\u034d\u0351\u0357\u0360\u036a\u0376\u0378\u0381\u0388"+
		"\u038e\u0396\u039e\u03a7\u03a9\u03b3\u03c4\u03c8\u03cb\u03d1\u03d8\u03da"+
		"\u03dd\u03ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}