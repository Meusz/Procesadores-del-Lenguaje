// Generated from c:\antlr\gramaticas\.antlr\Pseudocodigo.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudocodigoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INI=1, FIN=2, REGLAS=3, ASIGNACION=4, ENTRADAS=5, SALIDAS=6, IF=7, ELSE=8, 
		LETRA=9, DIGITO=10, PI=11, PD=12, ID=13, INT=14, FLOAT=15, BOOL=16, STRING=17, 
		NOMBRE=18, COMENTARIO_LINEA=19, COMENTARIO_BLOQUE=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INI", "FIN", "REGLAS", "ASIGNACION", "ENTRADAS", "SALIDAS", "IF", "ELSE", 
			"LETRA", "DIGITO", "PI", "PD", "ID", "INT", "FLOAT", "BOOL", "STRING", 
			"ESC", "NOMBRE", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'if'", "'else'", null, null, 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INI", "FIN", "REGLAS", "ASIGNACION", "ENTRADAS", "SALIDAS", "IF", 
			"ELSE", "LETRA", "DIGITO", "PI", "PD", "ID", "INT", "FLOAT", "BOOL", 
			"STRING", "NOMBRE", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "WS"
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


	public PseudocodigoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pseudocodigo.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00fd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2F\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3^\n\3\3\4\3\4\3\4\5\4c\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5}\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0092\n\7\3\7\3\7\3\7\5\7\u0097"+
		"\n\7\7\7\u0099\n\7\f\7\16\7\u009c\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16\u00b1\n\16\f\16"+
		"\16\16\u00b4\13\16\3\17\6\17\u00b7\n\17\r\17\16\17\u00b8\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c8\n\21\3\22"+
		"\3\22\3\22\7\22\u00cd\n\22\f\22\16\22\u00d0\13\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\6\24\u00d8\n\24\r\24\16\24\u00d9\3\25\3\25\3\25\3\25\7\25\u00e0"+
		"\n\25\f\25\16\25\u00e3\13\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7"+
		"\26\u00ed\n\26\f\26\16\26\u00f0\13\26\3\26\3\26\3\26\3\26\3\26\3\27\6"+
		"\27\u00f8\n\27\r\27\16\27\u00f9\3\27\3\27\5\u00ce\u00e1\u00ee\2\30\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\2\'\24)\25+\26-\27\3\2\7\4\2-.~~\4\2C\\c|\3\2\62;\b\2$$^^dd"+
		"ppttvv\5\2\13\f\17\17\"\"\2\u010f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\3E\3\2\2\2\5]\3\2\2\2\7b\3\2\2\2\t|\3\2\2\2\13~\3\2\2\2"+
		"\r\u0085\3\2\2\2\17\u009d\3\2\2\2\21\u00a0\3\2\2\2\23\u00a5\3\2\2\2\25"+
		"\u00a7\3\2\2\2\27\u00a9\3\2\2\2\31\u00ab\3\2\2\2\33\u00ad\3\2\2\2\35\u00b6"+
		"\3\2\2\2\37\u00ba\3\2\2\2!\u00c7\3\2\2\2#\u00c9\3\2\2\2%\u00d3\3\2\2\2"+
		"\'\u00d7\3\2\2\2)\u00db\3\2\2\2+\u00e8\3\2\2\2-\u00f7\3\2\2\2/\60\7R\2"+
		"\2\60\61\7t\2\2\61\62\7q\2\2\62\63\7e\2\2\63\64\7g\2\2\64\65\7u\2\2\65"+
		"\66\7q\2\2\66\67\7\"\2\2\678\3\2\2\28F\5\'\24\29:\7C\2\2:;\7n\2\2;<\7"+
		"i\2\2<=\7q\2\2=>\7t\2\2>?\7k\2\2?@\7v\2\2@A\7o\2\2AB\7q\2\2BC\7\"\2\2"+
		"CD\3\2\2\2DF\5\'\24\2E/\3\2\2\2E9\3\2\2\2F\4\3\2\2\2GH\7H\2\2HI\7k\2\2"+
		"IJ\7p\2\2JK\7R\2\2KL\7t\2\2LM\7q\2\2MN\7e\2\2NO\7g\2\2OP\7u\2\2P^\7q\2"+
		"\2QR\7H\2\2RS\7k\2\2ST\7p\2\2TU\7C\2\2UV\7n\2\2VW\7i\2\2WX\7q\2\2XY\7"+
		"t\2\2YZ\7k\2\2Z[\7v\2\2[\\\7o\2\2\\^\7q\2\2]G\3\2\2\2]Q\3\2\2\2^\6\3\2"+
		"\2\2_c\5\t\5\2`c\5\13\6\2ac\5\r\7\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\b\3"+
		"\2\2\2de\5\33\16\2ef\7>\2\2fg\7/\2\2gh\3\2\2\2hi\5\35\17\2i}\3\2\2\2j"+
		"k\5\33\16\2kl\7>\2\2lm\7/\2\2mn\3\2\2\2no\5\37\20\2o}\3\2\2\2pq\5\33\16"+
		"\2qr\7>\2\2rs\7/\2\2st\3\2\2\2tu\5#\22\2u}\3\2\2\2vw\5\33\16\2wx\7>\2"+
		"\2xy\7/\2\2yz\3\2\2\2z{\5!\21\2{}\3\2\2\2|d\3\2\2\2|j\3\2\2\2|p\3\2\2"+
		"\2|v\3\2\2\2}\n\3\2\2\2~\177\7N\2\2\177\u0080\7g\2\2\u0080\u0081\7g\2"+
		"\2\u0081\u0082\7t\2\2\u0082\u0083\3\2\2\2\u0083\u0084\5\33\16\2\u0084"+
		"\f\3\2\2\2\u0085\u0086\7G\2\2\u0086\u0087\7u\2\2\u0087\u0088\7e\2\2\u0088"+
		"\u0089\7t\2\2\u0089\u008a\7k\2\2\u008a\u008b\7d\2\2\u008b\u008c\7k\2\2"+
		"\u008c\u008d\7t\2\2\u008d\u008e\7\"\2\2\u008e\u0091\3\2\2\2\u008f\u0092"+
		"\5#\22\2\u0090\u0092\5\33\16\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2"+
		"\u0092\u009a\3\2\2\2\u0093\u0096\t\2\2\2\u0094\u0097\5#\22\2\u0095\u0097"+
		"\5\33\16\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u0099\3\2\2\2"+
		"\u0098\u0093\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\16\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7k\2\2\u009e"+
		"\u009f\7h\2\2\u009f\20\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7n\2\2\u00a2"+
		"\u00a3\7u\2\2\u00a3\u00a4\7g\2\2\u00a4\22\3\2\2\2\u00a5\u00a6\t\3\2\2"+
		"\u00a6\24\3\2\2\2\u00a7\u00a8\t\4\2\2\u00a8\26\3\2\2\2\u00a9\u00aa\7*"+
		"\2\2\u00aa\30\3\2\2\2\u00ab\u00ac\7+\2\2\u00ac\32\3\2\2\2\u00ad\u00b2"+
		"\5\23\n\2\u00ae\u00b1\5\23\n\2\u00af\u00b1\5\25\13\2\u00b0\u00ae\3\2\2"+
		"\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\34\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\5\25\13\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\36\3\2\2\2\u00ba\u00bb\5\35\17\2\u00bb\u00bc\7\60\2\2\u00bc"+
		"\u00bd\5\35\17\2\u00bd \3\2\2\2\u00be\u00bf\7V\2\2\u00bf\u00c0\7T\2\2"+
		"\u00c0\u00c1\7W\2\2\u00c1\u00c8\7G\2\2\u00c2\u00c3\7H\2\2\u00c3\u00c4"+
		"\7C\2\2\u00c4\u00c5\7N\2\2\u00c5\u00c6\7U\2\2\u00c6\u00c8\7G\2\2\u00c7"+
		"\u00be\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c8\"\3\2\2\2\u00c9\u00ce\7)\2\2"+
		"\u00ca\u00cd\5%\23\2\u00cb\u00cd\13\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7)\2\2\u00d2$\3\2\2\2\u00d3"+
		"\u00d4\7^\2\2\u00d4\u00d5\t\5\2\2\u00d5&\3\2\2\2\u00d6\u00d8\5\23\n\2"+
		"\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da(\3\2\2\2\u00db\u00dc\7\61\2\2\u00dc\u00dd\7\61\2\2\u00dd"+
		"\u00e1\3\2\2\2\u00de\u00e0\13\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3"+
		"\2\2\2\u00e1\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e5\7\f\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\25"+
		"\2\2\u00e7*\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e9\u00ea\7,\2\2\u00ea\u00ee"+
		"\3\2\2\2\u00eb\u00ed\13\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2"+
		"\u00ee\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00f2\7,\2\2\u00f2\u00f3\7\61\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\b\26\2\2\u00f5,\3\2\2\2\u00f6\u00f8\t\6\2\2\u00f7\u00f6\3\2\2\2"+
		"\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fc\b\27\2\2\u00fc.\3\2\2\2\24\2E]b|\u0091\u0096\u009a"+
		"\u00b0\u00b2\u00b8\u00c7\u00cc\u00ce\u00d9\u00e1\u00ee\u00f9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}