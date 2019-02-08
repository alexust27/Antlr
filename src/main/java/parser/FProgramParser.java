// Generated from /home/alex/IdeaProjects/MT3/src/main/antlr/FProgram.g4 by ANTLR 4.7.2
package main.java.parser;

import main.java.expression.*;
import main.java.expression.logical.*;
import main.java.expression.arithmetic.*;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FProgramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, ASSIGN=2, LPAR=3, RPAR=4, COLON2=5, PIPE=6, COMMA=7, ADD=8, SUB=9, 
		MUL=10, DIV=11, MOD=12, EQ=13, NEQ=14, LESS=15, GR=16, LESSEQ=17, GREQ=18, 
		ARROW=19, NOT=20, AND=21, OR=22, NAME=23, NUM=24, NEWLINE=25, WS=26, WhiteSpace=27, 
		NL=28;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_func = 2, RULE_var = 3, RULE_add_sub = 4, 
		RULE_mul_div = 5, RULE_unary_ar = 6, RULE_or = 7, RULE_and = 8, RULE_unary_logic = 9, 
		RULE_cmp = 10, RULE_cmp_op = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "func", "var", "add_sub", "mul_div", "unary_ar", 
			"or", "and", "unary_logic", "cmp", "cmp_op"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "'('", "')'", "'::'", "'|'", "','", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'->'", 
			"'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "ASSIGN", "LPAR", "RPAR", "COLON2", "PIPE", "COMMA", "ADD", 
			"SUB", "MUL", "DIV", "MOD", "EQ", "NEQ", "LESS", "GR", "LESSEQ", "GREQ", 
			"ARROW", "NOT", "AND", "OR", "NAME", "NUM", "NEWLINE", "WS", "WhiteSpace", 
			"NL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "FProgram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public FProgram p;
		public ProgramContext program;
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((StartContext)_localctx).program = program();
			((StartContext)_localctx).p =  new FProgram(((StartContext)_localctx).program.f);
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

	public static class ProgramContext extends ParserRuleContext {
		public List <Function> f;
		public FuncContext func;
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);

		        List<Function> res = new ArrayList<>();
		    
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			((ProgramContext)_localctx).func = func();
			 res.add(((ProgramContext)_localctx).func.f); 
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(29);
				((ProgramContext)_localctx).func = func();
				 res.add(((ProgramContext)_localctx).func.f); 
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((ProgramContext)_localctx).f =  res; 
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

	public static class FuncContext extends ParserRuleContext {
		public Function f;
		public Token NAME;
		public Token TYPE;
		public VarContext var;
		public OrContext or;
		public Add_subContext add_sub;
		public TerminalNode NAME() { return getToken(FProgramParser.NAME, 0); }
		public TerminalNode COLON2() { return getToken(FProgramParser.COLON2, 0); }
		public List<TerminalNode> TYPE() { return getTokens(FProgramParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(FProgramParser.TYPE, i);
		}
		public List<TerminalNode> ARROW() { return getTokens(FProgramParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(FProgramParser.ARROW, i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(FProgramParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(FProgramParser.ASSIGN, i);
		}
		public List<Add_subContext> add_sub() {
			return getRuleContexts(Add_subContext.class);
		}
		public Add_subContext add_sub(int i) {
			return getRuleContext(Add_subContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(FProgramParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(FProgramParser.PIPE, i);
		}
		public List<OrContext> or() {
			return getRuleContexts(OrContext.class);
		}
		public OrContext or(int i) {
			return getRuleContext(OrContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_func);

		            Function res;
		            LogicExpression c = null;
		            
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				((FuncContext)_localctx).NAME = match(NAME);
				setState(40);
				match(COLON2);
				 res = new Function((((FuncContext)_localctx).NAME!=null?((FuncContext)_localctx).NAME.getText():null)); 
				setState(42);
				((FuncContext)_localctx).TYPE = match(TYPE);
				 List<String> types = new ArrayList<>(); 
				 types.add(new String((((FuncContext)_localctx).TYPE!=null?((FuncContext)_localctx).TYPE.getText():null))); 
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ARROW) {
					{
					{
					setState(45);
					match(ARROW);
					setState(46);
					((FuncContext)_localctx).TYPE = match(TYPE);
					 types.add(new String((((FuncContext)_localctx).TYPE!=null?((FuncContext)_localctx).TYPE.getText():null))); 
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 res.addTypes(types); 
				 ((FuncContext)_localctx).f =  res; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				((FuncContext)_localctx).NAME = match(NAME);
				 res = new Function((((FuncContext)_localctx).NAME!=null?((FuncContext)_localctx).NAME.getText():null));           
				 List<String> vars = new ArrayList<>();    
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==NUM) {
					{
					{
					setState(58);
					((FuncContext)_localctx).var = var();
					 vars.add(((FuncContext)_localctx).var.v);     
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 res.addVars(vars);        
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					 c = null; 
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PIPE) {
						{
						setState(68);
						match(PIPE);
						setState(69);
						((FuncContext)_localctx).or = or(0);
						 c = ((FuncContext)_localctx).or.v; 
						}
					}

					setState(74);
					match(ASSIGN);
					setState(75);
					((FuncContext)_localctx).add_sub = add_sub(0);
					 res.addFunc(c, ((FuncContext)_localctx).add_sub.v); 
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ASSIGN || _la==PIPE );
				 ((FuncContext)_localctx).f =  res; 
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

	public static class VarContext extends ParserRuleContext {
		public String v;
		public Token NUM;
		public Token NAME;
		public TerminalNode NUM() { return getToken(FProgramParser.NUM, 0); }
		public TerminalNode NAME() { return getToken(FProgramParser.NAME, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((VarContext)_localctx).NUM = match(NUM);
				 ((VarContext)_localctx).v =  (((VarContext)_localctx).NUM!=null?((VarContext)_localctx).NUM.getText():null); 
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				((VarContext)_localctx).NAME = match(NAME);
				 ((VarContext)_localctx).v =  (((VarContext)_localctx).NAME!=null?((VarContext)_localctx).NAME.getText():null); 
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

	public static class Add_subContext extends ParserRuleContext {
		public ArithmeticExpression v;
		public Add_subContext l;
		public Mul_divContext mul_div;
		public Mul_divContext r;
		public Mul_divContext mul_div() {
			return getRuleContext(Mul_divContext.class,0);
		}
		public TerminalNode ADD() { return getToken(FProgramParser.ADD, 0); }
		public Add_subContext add_sub() {
			return getRuleContext(Add_subContext.class,0);
		}
		public TerminalNode SUB() { return getToken(FProgramParser.SUB, 0); }
		public Add_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).enterAdd_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).exitAdd_sub(this);
		}
	}

	public final Add_subContext add_sub() throws RecognitionException {
		return add_sub(0);
	}

	private Add_subContext add_sub(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Add_subContext _localctx = new Add_subContext(_ctx, _parentState);
		Add_subContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_add_sub, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(93);
			((Add_subContext)_localctx).mul_div = mul_div(0);
			 ((Add_subContext)_localctx).v =  ((Add_subContext)_localctx).mul_div.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new Add_subContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_add_sub);
						setState(96);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(97);
						match(ADD);
						setState(98);
						((Add_subContext)_localctx).r = ((Add_subContext)_localctx).mul_div = mul_div(0);
						 ((Add_subContext)_localctx).v =  new BinaryArithmeticExpression("+", ((Add_subContext)_localctx).l.v, ((Add_subContext)_localctx).r.v); 
						}
						break;
					case 2:
						{
						_localctx = new Add_subContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_add_sub);
						setState(101);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(102);
						match(SUB);
						setState(103);
						((Add_subContext)_localctx).r = ((Add_subContext)_localctx).mul_div = mul_div(0);
						 ((Add_subContext)_localctx).v =  new BinaryArithmeticExpression("-", ((Add_subContext)_localctx).l.v, ((Add_subContext)_localctx).r.v); 
						}
						break;
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Mul_divContext extends ParserRuleContext {
		public ArithmeticExpression v;
		public Mul_divContext l;
		public Unary_arContext unary_ar;
		public Unary_arContext unary_ar() {
			return getRuleContext(Unary_arContext.class,0);
		}
		public TerminalNode MUL() { return getToken(FProgramParser.MUL, 0); }
		public Mul_divContext mul_div() {
			return getRuleContext(Mul_divContext.class,0);
		}
		public TerminalNode DIV() { return getToken(FProgramParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FProgramParser.MOD, 0); }
		public Mul_divContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).enterMul_div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).exitMul_div(this);
		}
	}

	public final Mul_divContext mul_div() throws RecognitionException {
		return mul_div(0);
	}

	private Mul_divContext mul_div(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Mul_divContext _localctx = new Mul_divContext(_ctx, _parentState);
		Mul_divContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_mul_div, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(112);
			((Mul_divContext)_localctx).unary_ar = unary_ar();
			 ((Mul_divContext)_localctx).v =  ((Mul_divContext)_localctx).unary_ar.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Mul_divContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mul_div);
						setState(115);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(116);
						match(MUL);
						setState(117);
						((Mul_divContext)_localctx).unary_ar = unary_ar();
						 ((Mul_divContext)_localctx).v =  new BinaryArithmeticExpression("*", ((Mul_divContext)_localctx).l.v, ((Mul_divContext)_localctx).unary_ar.v); 
						}
						break;
					case 2:
						{
						_localctx = new Mul_divContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mul_div);
						setState(120);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(121);
						match(DIV);
						setState(122);
						((Mul_divContext)_localctx).unary_ar = unary_ar();
						 ((Mul_divContext)_localctx).v =  new BinaryArithmeticExpression("/", ((Mul_divContext)_localctx).l.v, ((Mul_divContext)_localctx).unary_ar.v); 
						}
						break;
					case 3:
						{
						_localctx = new Mul_divContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mul_div);
						setState(125);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(126);
						match(MOD);
						setState(127);
						((Mul_divContext)_localctx).unary_ar = unary_ar();
						 ((Mul_divContext)_localctx).v =  new BinaryArithmeticExpression("%", ((Mul_divContext)_localctx).l.v, ((Mul_divContext)_localctx).unary_ar.v); 
						}
						break;
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Unary_arContext extends ParserRuleContext {
		public ArithmeticExpression v;
		public Add_subContext add_sub;
		public Token NAME;
		public Token NUM;
		public TerminalNode LPAR() { return getToken(FProgramParser.LPAR, 0); }
		public List<Add_subContext> add_sub() {
			return getRuleContexts(Add_subContext.class);
		}
		public Add_subContext add_sub(int i) {
			return getRuleContext(Add_subContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(FProgramParser.RPAR, 0); }
		public TerminalNode NAME() { return getToken(FProgramParser.NAME, 0); }
		public List<TerminalNode> COMMA() { return getTokens(FProgramParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FProgramParser.COMMA, i);
		}
		public TerminalNode NUM() { return getToken(FProgramParser.NUM, 0); }
		public Unary_arContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_ar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).enterUnary_ar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).exitUnary_ar(this);
		}
	}

	public final Unary_arContext unary_ar() throws RecognitionException {
		Unary_arContext _localctx = new Unary_arContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unary_ar);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(LPAR);
				setState(136);
				((Unary_arContext)_localctx).add_sub = add_sub(0);
				setState(137);
				match(RPAR);
				 ((Unary_arContext)_localctx).v =  ((Unary_arContext)_localctx).add_sub.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				((Unary_arContext)_localctx).NAME = match(NAME);
				 ((Unary_arContext)_localctx).v =  new Variable((((Unary_arContext)_localctx).NAME!=null?((Unary_arContext)_localctx).NAME.getText():null)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				((Unary_arContext)_localctx).NAME = match(NAME);
				 List<ArithmeticExpression> ae = new ArrayList(); 
				setState(144);
				match(LPAR);
				setState(145);
				((Unary_arContext)_localctx).add_sub = add_sub(0);
				 ae.add(((Unary_arContext)_localctx).add_sub.v); 
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(147);
					match(COMMA);
					setState(148);
					((Unary_arContext)_localctx).add_sub = add_sub(0);
					 ae.add(((Unary_arContext)_localctx).add_sub.v); 
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(RPAR);
				 ((Unary_arContext)_localctx).v =  new Func((((Unary_arContext)_localctx).NAME!=null?((Unary_arContext)_localctx).NAME.getText():null), ae); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				((Unary_arContext)_localctx).NUM = match(NUM);
				 ((Unary_arContext)_localctx).v =  new Num((((Unary_arContext)_localctx).NUM!=null?((Unary_arContext)_localctx).NUM.getText():null)); 
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

	public static class OrContext extends ParserRuleContext {
		public LogicExpression v;
		public OrContext l;
		public AndContext and;
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public TerminalNode OR() { return getToken(FProgramParser.OR, 0); }
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		return or(0);
	}

	private OrContext or(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OrContext _localctx = new OrContext(_ctx, _parentState);
		OrContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(164);
			((OrContext)_localctx).and = and(0);
			 ((OrContext)_localctx).v =  ((OrContext)_localctx).and.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_or);
					setState(167);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(168);
					match(OR);
					setState(169);
					((OrContext)_localctx).and = and(0);
					 ((OrContext)_localctx).v =  new BinaryLogicExpression("||", ((OrContext)_localctx).l.v, ((OrContext)_localctx).and.v); 
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public LogicExpression v;
		public AndContext l;
		public Unary_logicContext unary_logic;
		public Unary_logicContext unary_logic() {
			return getRuleContext(Unary_logicContext.class,0);
		}
		public TerminalNode AND() { return getToken(FProgramParser.AND, 0); }
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		return and(0);
	}

	private AndContext and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndContext _localctx = new AndContext(_ctx, _parentState);
		AndContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(178);
			((AndContext)_localctx).unary_logic = unary_logic();
			 ((AndContext)_localctx).v =  ((AndContext)_localctx).unary_logic.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_and);
					setState(181);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(182);
					match(AND);
					setState(183);
					((AndContext)_localctx).unary_logic = unary_logic();
					 ((AndContext)_localctx).v =  new BinaryLogicExpression("&&", ((AndContext)_localctx).l.v, ((AndContext)_localctx).unary_logic.v); 
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Unary_logicContext extends ParserRuleContext {
		public LogicExpression v;
		public Unary_logicContext unary_logic;
		public CmpContext cmp;
		public OrContext or;
		public TerminalNode NOT() { return getToken(FProgramParser.NOT, 0); }
		public Unary_logicContext unary_logic() {
			return getRuleContext(Unary_logicContext.class,0);
		}
		public CmpContext cmp() {
			return getRuleContext(CmpContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FProgramParser.LPAR, 0); }
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FProgramParser.RPAR, 0); }
		public Unary_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).enterUnary_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).exitUnary_logic(this);
		}
	}

	public final Unary_logicContext unary_logic() throws RecognitionException {
		Unary_logicContext _localctx = new Unary_logicContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unary_logic);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(NOT);
				setState(192);
				((Unary_logicContext)_localctx).unary_logic = unary_logic();
				 ((Unary_logicContext)_localctx).v =  new Negation(((Unary_logicContext)_localctx).unary_logic.v); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				((Unary_logicContext)_localctx).cmp = cmp();
				 ((Unary_logicContext)_localctx).v =  ((Unary_logicContext)_localctx).cmp.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(LPAR);
				setState(199);
				((Unary_logicContext)_localctx).or = or(0);
				setState(200);
				match(RPAR);
				 ((Unary_logicContext)_localctx).v =  ((Unary_logicContext)_localctx).or.v; 
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

	public static class CmpContext extends ParserRuleContext {
		public LogicExpression v;
		public Add_subContext l;
		public Cmp_opContext cmp_op;
		public Add_subContext r;
		public Token NAME;
		public Cmp_opContext cmp_op() {
			return getRuleContext(Cmp_opContext.class,0);
		}
		public List<Add_subContext> add_sub() {
			return getRuleContexts(Add_subContext.class);
		}
		public Add_subContext add_sub(int i) {
			return getRuleContext(Add_subContext.class,i);
		}
		public TerminalNode NAME() { return getToken(FProgramParser.NAME, 0); }
		public CmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).exitCmp(this);
		}
	}

	public final CmpContext cmp() throws RecognitionException {
		CmpContext _localctx = new CmpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmp);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				((CmpContext)_localctx).l = add_sub(0);
				setState(206);
				((CmpContext)_localctx).cmp_op = cmp_op();
				setState(207);
				((CmpContext)_localctx).r = add_sub(0);
				((CmpContext)_localctx).v =  new CmpExpression(((CmpContext)_localctx).cmp_op.v, ((CmpContext)_localctx).l.v, ((CmpContext)_localctx).r.v); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				((CmpContext)_localctx).NAME = match(NAME);
				((CmpContext)_localctx).v =  new LogicVar((((CmpContext)_localctx).NAME!=null?((CmpContext)_localctx).NAME.getText():null)); 
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

	public static class Cmp_opContext extends ParserRuleContext {
		public String v;
		public TerminalNode EQ() { return getToken(FProgramParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(FProgramParser.NEQ, 0); }
		public TerminalNode LESS() { return getToken(FProgramParser.LESS, 0); }
		public TerminalNode GR() { return getToken(FProgramParser.GR, 0); }
		public TerminalNode LESSEQ() { return getToken(FProgramParser.LESSEQ, 0); }
		public TerminalNode GREQ() { return getToken(FProgramParser.GREQ, 0); }
		public Cmp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).enterCmp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FProgramListener ) ((FProgramListener)listener).exitCmp_op(this);
		}
	}

	public final Cmp_opContext cmp_op() throws RecognitionException {
		Cmp_opContext _localctx = new Cmp_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmp_op);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(EQ);
				 ((Cmp_opContext)_localctx).v =  "=="; 
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(NEQ);
				 ((Cmp_opContext)_localctx).v =  "!="; 
				}
				break;
			case LESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(LESS);
				 ((Cmp_opContext)_localctx).v =  "<"; 
				}
				break;
			case GR:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				match(GR);
				 ((Cmp_opContext)_localctx).v =  ">"; 
				}
				break;
			case LESSEQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(222);
				match(LESSEQ);
				 ((Cmp_opContext)_localctx).v =  "<="; 
				}
				break;
			case GREQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(224);
				match(GREQ);
				 ((Cmp_opContext)_localctx).v =  ">="; 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return add_sub_sempred((Add_subContext)_localctx, predIndex);
		case 5:
			return mul_div_sempred((Mul_divContext)_localctx, predIndex);
		case 7:
			return or_sempred((OrContext)_localctx, predIndex);
		case 8:
			return and_sempred((AndContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean add_sub_sempred(Add_subContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mul_div_sempred(Mul_divContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean or_sempred(OrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean and_sempred(AndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00e7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16"+
		"\3&\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\63\n\4\f\4\16"+
		"\4\66\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\4\3\4\3\4\3\4\6\4Q\n\4\r\4\16\4R\3\4\3"+
		"\4\5\4W\n\4\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0085\n\7\f\7"+
		"\16\7\u0088\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u009a\n\b\f\b\16\b\u009d\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a4"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00af\n\t\f\t\16\t\u00b2"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00bd\n\n\f\n\16\n\u00c0"+
		"\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00ce\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d7\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e5\n\r\3\r\2\6\n\f\20\22\16\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u00f4\2\32\3\2\2\2\4\35\3\2\2\2\6V"+
		"\3\2\2\2\b\\\3\2\2\2\n^\3\2\2\2\fq\3\2\2\2\16\u00a3\3\2\2\2\20\u00a5\3"+
		"\2\2\2\22\u00b3\3\2\2\2\24\u00cd\3\2\2\2\26\u00d6\3\2\2\2\30\u00e4\3\2"+
		"\2\2\32\33\5\4\3\2\33\34\b\2\1\2\34\3\3\2\2\2\35\36\5\6\4\2\36$\b\3\1"+
		"\2\37 \5\6\4\2 !\b\3\1\2!#\3\2\2\2\"\37\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$"+
		"%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\b\3\1\2(\5\3\2\2\2)*\7\31\2\2*+\7\7"+
		"\2\2+,\b\4\1\2,-\7\3\2\2-.\b\4\1\2.\64\b\4\1\2/\60\7\25\2\2\60\61\7\3"+
		"\2\2\61\63\b\4\1\2\62/\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2"+
		"\2\65\67\3\2\2\2\66\64\3\2\2\2\678\b\4\1\28W\b\4\1\29:\7\31\2\2:;\b\4"+
		"\1\2;A\b\4\1\2<=\5\b\5\2=>\b\4\1\2>@\3\2\2\2?<\3\2\2\2@C\3\2\2\2A?\3\2"+
		"\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DP\b\4\1\2EJ\b\4\1\2FG\7\b\2\2GH\5\20"+
		"\t\2HI\b\4\1\2IK\3\2\2\2JF\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\4\2\2MN\5\n"+
		"\6\2NO\b\4\1\2OQ\3\2\2\2PE\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2"+
		"\2\2TU\b\4\1\2UW\3\2\2\2V)\3\2\2\2V9\3\2\2\2W\7\3\2\2\2XY\7\32\2\2Y]\b"+
		"\5\1\2Z[\7\31\2\2[]\b\5\1\2\\X\3\2\2\2\\Z\3\2\2\2]\t\3\2\2\2^_\b\6\1\2"+
		"_`\5\f\7\2`a\b\6\1\2an\3\2\2\2bc\f\5\2\2cd\7\n\2\2de\5\f\7\2ef\b\6\1\2"+
		"fm\3\2\2\2gh\f\4\2\2hi\7\13\2\2ij\5\f\7\2jk\b\6\1\2km\3\2\2\2lb\3\2\2"+
		"\2lg\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\13\3\2\2\2pn\3\2\2\2qr\b\7"+
		"\1\2rs\5\16\b\2st\b\7\1\2t\u0086\3\2\2\2uv\f\6\2\2vw\7\f\2\2wx\5\16\b"+
		"\2xy\b\7\1\2y\u0085\3\2\2\2z{\f\5\2\2{|\7\r\2\2|}\5\16\b\2}~\b\7\1\2~"+
		"\u0085\3\2\2\2\177\u0080\f\4\2\2\u0080\u0081\7\16\2\2\u0081\u0082\5\16"+
		"\b\2\u0082\u0083\b\7\1\2\u0083\u0085\3\2\2\2\u0084u\3\2\2\2\u0084z\3\2"+
		"\2\2\u0084\177\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\r\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\5\2\2\u008a"+
		"\u008b\5\n\6\2\u008b\u008c\7\6\2\2\u008c\u008d\b\b\1\2\u008d\u00a4\3\2"+
		"\2\2\u008e\u008f\7\31\2\2\u008f\u00a4\b\b\1\2\u0090\u0091\7\31\2\2\u0091"+
		"\u0092\b\b\1\2\u0092\u0093\7\5\2\2\u0093\u0094\5\n\6\2\u0094\u009b\b\b"+
		"\1\2\u0095\u0096\7\t\2\2\u0096\u0097\5\n\6\2\u0097\u0098\b\b\1\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0095\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u009f\7\6\2\2\u009f\u00a0\b\b\1\2\u00a0\u00a4\3\2\2\2\u00a1\u00a2\7\32"+
		"\2\2\u00a2\u00a4\b\b\1\2\u00a3\u0089\3\2\2\2\u00a3\u008e\3\2\2\2\u00a3"+
		"\u0090\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\17\3\2\2\2\u00a5\u00a6\b\t\1"+
		"\2\u00a6\u00a7\5\22\n\2\u00a7\u00a8\b\t\1\2\u00a8\u00b0\3\2\2\2\u00a9"+
		"\u00aa\f\4\2\2\u00aa\u00ab\7\30\2\2\u00ab\u00ac\5\22\n\2\u00ac\u00ad\b"+
		"\t\1\2\u00ad\u00af\3\2\2\2\u00ae\u00a9\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\21\3\2\2\2\u00b2\u00b0\3\2\2"+
		"\2\u00b3\u00b4\b\n\1\2\u00b4\u00b5\5\24\13\2\u00b5\u00b6\b\n\1\2\u00b6"+
		"\u00be\3\2\2\2\u00b7\u00b8\f\4\2\2\u00b8\u00b9\7\27\2\2\u00b9\u00ba\5"+
		"\24\13\2\u00ba\u00bb\b\n\1\2\u00bb\u00bd\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bd"+
		"\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\23\3\2\2"+
		"\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\26\2\2\u00c2\u00c3\5\24\13\2\u00c3"+
		"\u00c4\b\13\1\2\u00c4\u00ce\3\2\2\2\u00c5\u00c6\5\26\f\2\u00c6\u00c7\b"+
		"\13\1\2\u00c7\u00ce\3\2\2\2\u00c8\u00c9\7\5\2\2\u00c9\u00ca\5\20\t\2\u00ca"+
		"\u00cb\7\6\2\2\u00cb\u00cc\b\13\1\2\u00cc\u00ce\3\2\2\2\u00cd\u00c1\3"+
		"\2\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00c8\3\2\2\2\u00ce\25\3\2\2\2\u00cf"+
		"\u00d0\5\n\6\2\u00d0\u00d1\5\30\r\2\u00d1\u00d2\5\n\6\2\u00d2\u00d3\b"+
		"\f\1\2\u00d3\u00d7\3\2\2\2\u00d4\u00d5\7\31\2\2\u00d5\u00d7\b\f\1\2\u00d6"+
		"\u00cf\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\27\3\2\2\2\u00d8\u00d9\7\17\2"+
		"\2\u00d9\u00e5\b\r\1\2\u00da\u00db\7\20\2\2\u00db\u00e5\b\r\1\2\u00dc"+
		"\u00dd\7\21\2\2\u00dd\u00e5\b\r\1\2\u00de\u00df\7\22\2\2\u00df\u00e5\b"+
		"\r\1\2\u00e0\u00e1\7\23\2\2\u00e1\u00e5\b\r\1\2\u00e2\u00e3\7\24\2\2\u00e3"+
		"\u00e5\b\r\1\2\u00e4\u00d8\3\2\2\2\u00e4\u00da\3\2\2\2\u00e4\u00dc\3\2"+
		"\2\2\u00e4\u00de\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\31\3\2\2\2\24$\64AJRV\\ln\u0084\u0086\u009b\u00a3\u00b0\u00be\u00cd\u00d6"+
		"\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}