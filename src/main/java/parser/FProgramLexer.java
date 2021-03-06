// Generated from /home/alex/IdeaProjects/MT3/src/main/antlr/FProgram.g4 by ANTLR 4.7.2
package main.java.parser;

import main.java.expression.*;
import main.java.expression.logical.*;
import main.java.expression.arithmetic.*;
import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FProgramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, ASSIGN=2, LPAR=3, RPAR=4, COLON2=5, PIPE=6, COMMA=7, ADD=8, SUB=9, 
		MUL=10, DIV=11, MOD=12, EQ=13, NEQ=14, LESS=15, GR=16, LESSEQ=17, GREQ=18, 
		ARROW=19, NOT=20, AND=21, OR=22, NAME=23, NUM=24, NEWLINE=25, WS=26, WhiteSpace=27, 
		NL=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TYPE", "ASSIGN", "LPAR", "RPAR", "COLON2", "PIPE", "COMMA", "ADD", "SUB", 
			"MUL", "DIV", "MOD", "EQ", "NEQ", "LESS", "GR", "LESSEQ", "GREQ", "ARROW", 
			"NOT", "AND", "OR", "NAME", "NUM", "NEWLINE", "WS", "WhiteSpace", "NL"
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


	public FProgramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FProgram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00ad\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2T\n\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\7\30\u008a\n\30\f\30\16\30\u008d"+
		"\13\30\3\31\5\31\u0090\n\31\3\31\3\31\7\31\u0094\n\31\f\31\16\31\u0097"+
		"\13\31\3\31\5\31\u009a\n\31\3\32\6\32\u009d\n\32\r\32\16\32\u009e\3\32"+
		"\3\32\3\33\6\33\u00a4\n\33\r\33\16\33\u00a5\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36\3\2\6\4\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\2\u00b5"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3S\3"+
		"\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r^\3\2\2\2\17`\3\2"+
		"\2\2\21b\3\2\2\2\23d\3\2\2\2\25f\3\2\2\2\27h\3\2\2\2\31j\3\2\2\2\33l\3"+
		"\2\2\2\35o\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#v\3\2\2\2%y\3\2\2\2\'|\3\2\2"+
		"\2)\177\3\2\2\2+\u0081\3\2\2\2-\u0084\3\2\2\2/\u0087\3\2\2\2\61\u0099"+
		"\3\2\2\2\63\u009c\3\2\2\2\65\u00a3\3\2\2\2\67\u00a9\3\2\2\29\u00ab\3\2"+
		"\2\2;<\7U\2\2<=\7v\2\2=>\7t\2\2>?\7k\2\2?@\7p\2\2@T\7i\2\2AB\7K\2\2BC"+
		"\7p\2\2CD\7v\2\2DE\7g\2\2EF\7i\2\2FG\7g\2\2GT\7t\2\2HI\7E\2\2IJ\7j\2\2"+
		"JK\7c\2\2KT\7t\2\2LM\7D\2\2MN\7q\2\2NO\7q\2\2OP\7n\2\2PQ\7g\2\2QR\7c\2"+
		"\2RT\7p\2\2S;\3\2\2\2SA\3\2\2\2SH\3\2\2\2SL\3\2\2\2T\4\3\2\2\2UV\7?\2"+
		"\2V\6\3\2\2\2WX\7*\2\2X\b\3\2\2\2YZ\7+\2\2Z\n\3\2\2\2[\\\7<\2\2\\]\7<"+
		"\2\2]\f\3\2\2\2^_\7~\2\2_\16\3\2\2\2`a\7.\2\2a\20\3\2\2\2bc\7-\2\2c\22"+
		"\3\2\2\2de\7/\2\2e\24\3\2\2\2fg\7,\2\2g\26\3\2\2\2hi\7\61\2\2i\30\3\2"+
		"\2\2jk\7\'\2\2k\32\3\2\2\2lm\7?\2\2mn\7?\2\2n\34\3\2\2\2op\7#\2\2pq\7"+
		"?\2\2q\36\3\2\2\2rs\7>\2\2s \3\2\2\2tu\7@\2\2u\"\3\2\2\2vw\7>\2\2wx\7"+
		"?\2\2x$\3\2\2\2yz\7@\2\2z{\7?\2\2{&\3\2\2\2|}\7/\2\2}~\7@\2\2~(\3\2\2"+
		"\2\177\u0080\7#\2\2\u0080*\3\2\2\2\u0081\u0082\7(\2\2\u0082\u0083\7(\2"+
		"\2\u0083,\3\2\2\2\u0084\u0085\7~\2\2\u0085\u0086\7~\2\2\u0086.\3\2\2\2"+
		"\u0087\u008b\t\2\2\2\u0088\u008a\t\3\2\2\u0089\u0088\3\2\2\2\u008a\u008d"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\60\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0090\7/\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0095\4\63;\2\u0092\u0094\4\62;\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u009a\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\7\62\2\2\u0099"+
		"\u008f\3\2\2\2\u0099\u0098\3\2\2\2\u009a\62\3\2\2\2\u009b\u009d\59\35"+
		"\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\32\2\2\u00a1\64\3\2\2\2\u00a2"+
		"\u00a4\5\67\34\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3"+
		"\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\33\2\2\u00a8"+
		"\66\3\2\2\2\u00a9\u00aa\t\4\2\2\u00aa8\3\2\2\2\u00ab\u00ac\t\5\2\2\u00ac"+
		":\3\2\2\2\n\2S\u008b\u008f\u0095\u0099\u009e\u00a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}