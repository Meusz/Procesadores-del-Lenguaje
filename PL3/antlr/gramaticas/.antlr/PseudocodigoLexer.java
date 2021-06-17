// Generated from c:\antlr\gramaticas\Pseudocodigo.g4 by ANTLR 4.8
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, FIN=28, INI=29, DEFINIR=30, COMO=31, FLECHA=32, 
		DIMENSION=33, LEER=34, ESCRIBIR=35, CIERRASI=36, SINO=37, ENTONCES=38, 
		SI=39, FINSEGUN=40, SEGUN=41, HACER=42, FINMIENTRAS=43, MIENTRAS=44, REPETIR=45, 
		FINPARA=46, PARA=47, HASTA=48, CONPASO=49, OPERADORREL=50, OPERADORLOG=51, 
		CONJUNCION=52, DISYUNCION=53, NEGACION=54, OPERADORALGE=55, SUMA=56, RESTA=57, 
		MULTIPLICACION=58, DIVISION=59, POTENCIACION=60, MODULO=61, OPERADORSEPARADOR=62, 
		COMA=63, BARRABAJA=64, TIPO=65, FLOAT=66, INT=67, BOOL=68, STRING=69, 
		ID=70, PI=71, PD=72, CI=73, CD=74, COMENTARIO_LINEA=75, COMENTARIO_BLOQUE=76, 
		WS=77, NEWLINE=78, SPACE=79;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "FIN", "INI", "DEFINIR", "COMO", "FLECHA", "DIMENSION", 
			"LEER", "ESCRIBIR", "CIERRASI", "SINO", "ENTONCES", "SI", "FINSEGUN", 
			"SEGUN", "HACER", "FINMIENTRAS", "MIENTRAS", "REPETIR", "FINPARA", "PARA", 
			"HASTA", "CONPASO", "OPERADORREL", "MAYORQUE", "MENORQUE", "IGUALQUE", 
			"MENORIGUALQUE", "MAYORIGUALQUE", "OPERADORLOG", "CONJUNCION", "DISYUNCION", 
			"NEGACION", "OPERADORALGE", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", 
			"POTENCIACION", "MODULO", "OPERADORSEPARADOR", "COMA", "BARRABAJA", "TIPO", 
			"FLOAT", "INT", "DIGITO", "BOOL", "STRING", "ESC", "ID", "CHAR", "PI", 
			"PD", "CI", "CD", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "WS", "NEWLINE", 
			"SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'De Otro Modo'", "'de otro modo'", "'DE OTRO MODO'", "'Hasta Que'", 
			"'HASTA QUE'", "'hasta que'", "'RC'", "'rc'", "'ABS'", "'abs'", "'LN'", 
			"'ln'", "'EXP'", "'exp'", "'SEN'", "'sen'", "'COS'", "'cos'", "'ATAN'", 
			"'atan'", "'TRUNC'", "'trunc'", "'REDON'", "'redon'", "'AZAR'", "'azar'", 
			null, null, null, null, "'<-'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'^'", null, null, 
			"','", "'_'", null, null, null, null, null, null, "'('", "')'", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "FIN", "INI", "DEFINIR", "COMO", "FLECHA", "DIMENSION", 
			"LEER", "ESCRIBIR", "CIERRASI", "SINO", "ENTONCES", "SI", "FINSEGUN", 
			"SEGUN", "HACER", "FINMIENTRAS", "MIENTRAS", "REPETIR", "FINPARA", "PARA", 
			"HASTA", "CONPASO", "OPERADORREL", "OPERADORLOG", "CONJUNCION", "DISYUNCION", 
			"NEGACION", "OPERADORALGE", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", 
			"POTENCIACION", "MODULO", "OPERADORSEPARADOR", "COMA", "BARRABAJA", "TIPO", 
			"FLOAT", "INT", "BOOL", "STRING", "ID", "PI", "PD", "CI", "CD", "COMENTARIO_LINEA", 
			"COMENTARIO_BLOQUE", "WS", "NEWLINE", "SPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Q\u0404\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0167\n\35\3\35\7\35\u016a\n\35\f\35\16\35\u016d\13\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u017f\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0196\n\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01a4\n \3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01c4\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\5#\u01d2\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\5$\u01ec\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0208\n%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u021a\n&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\5\'\u0234\n\'\3(\3(\3(\3(\3(\3(\5(\u023c\n(\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\5)\u025e\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u026f"+
		"\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0280\n+\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u02ae\n,\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\5-\u02c8\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\5.\u02df\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\5/\u02f6\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u0304\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0315\n\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0340\n\62\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\63\5\63\u034a\n\63\3\64\3\64\3\65\3\65\3\66"+
		"\3\66\3\67\3\67\3\67\38\38\38\39\39\39\59\u035b\n9\3:\3:\3;\3;\3<\3<\3"+
		"<\5<\u0364\n<\3=\3=\3=\3=\3=\3=\5=\u036c\n=\3>\3>\3?\3?\3@\3@\3A\3A\3"+
		"B\3B\3C\3C\3C\3C\5C\u037c\nC\3D\3D\5D\u0380\nD\3E\3E\3F\3F\3G\3G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\5G\u03a4\nG\3H\3H\3H\3H\3I\6I\u03ab\nI\rI\16I\u03ac\3J\3J\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u03ba\nK\3L\3L\3L\7L\u03bf\nL\fL\16L\u03c2"+
		"\13L\3L\3L\3M\3M\3M\3N\3N\3N\3N\7N\u03cd\nN\fN\16N\u03d0\13N\3O\3O\3P"+
		"\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3T\3T\7T\u03e0\nT\fT\16T\u03e3\13T\3T\3T\3"+
		"T\3T\3U\3U\3U\3U\7U\u03ed\nU\fU\16U\u03f0\13U\3U\3U\3U\3U\3U\3V\6V\u03f8"+
		"\nV\rV\16V\u03f9\3V\3V\3W\3W\3X\6X\u0401\nX\rX\16X\u0402\6\u016b\u03c0"+
		"\u03e1\u03ee\2Y\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64"+
		"g\2i\2k\2m\2o\2q\65s\66u\67w8y9{:};\177<\u0081=\u0083>\u0085?\u0087@\u0089"+
		"A\u008bB\u008dC\u008fD\u0091E\u0093\2\u0095F\u0097G\u0099\2\u009bH\u009d"+
		"\2\u009fI\u00a1J\u00a3K\u00a5L\u00a7M\u00a9N\u00abO\u00adP\u00afQ\3\2"+
		"\13\4\2(([[\4\2QQ~~\3\2\62;\4\2$$))\b\2$$^^ddppttvv\4\2//aa\4\2C\\c|\5"+
		"\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0448\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2"+
		"\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7"+
		"\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2"+
		"\2\3\u00b1\3\2\2\2\5\u00b3\3\2\2\2\7\u00c0\3\2\2\2\t\u00cd\3\2\2\2\13"+
		"\u00da\3\2\2\2\r\u00e4\3\2\2\2\17\u00ee\3\2\2\2\21\u00f8\3\2\2\2\23\u00fb"+
		"\3\2\2\2\25\u00fe\3\2\2\2\27\u0102\3\2\2\2\31\u0106\3\2\2\2\33\u0109\3"+
		"\2\2\2\35\u010c\3\2\2\2\37\u0110\3\2\2\2!\u0114\3\2\2\2#\u0118\3\2\2\2"+
		"%\u011c\3\2\2\2\'\u0120\3\2\2\2)\u0124\3\2\2\2+\u0129\3\2\2\2-\u012e\3"+
		"\2\2\2/\u0134\3\2\2\2\61\u013a\3\2\2\2\63\u0140\3\2\2\2\65\u0146\3\2\2"+
		"\2\67\u014b\3\2\2\29\u0166\3\2\2\2;\u017e\3\2\2\2=\u0195\3\2\2\2?\u01a3"+
		"\3\2\2\2A\u01a5\3\2\2\2C\u01c3\3\2\2\2E\u01d1\3\2\2\2G\u01eb\3\2\2\2I"+
		"\u0207\3\2\2\2K\u0219\3\2\2\2M\u0233\3\2\2\2O\u023b\3\2\2\2Q\u025d\3\2"+
		"\2\2S\u026e\3\2\2\2U\u027f\3\2\2\2W\u02ad\3\2\2\2Y\u02c7\3\2\2\2[\u02de"+
		"\3\2\2\2]\u02f5\3\2\2\2_\u0303\3\2\2\2a\u0314\3\2\2\2c\u0316\3\2\2\2e"+
		"\u0349\3\2\2\2g\u034b\3\2\2\2i\u034d\3\2\2\2k\u034f\3\2\2\2m\u0351\3\2"+
		"\2\2o\u0354\3\2\2\2q\u035a\3\2\2\2s\u035c\3\2\2\2u\u035e\3\2\2\2w\u0363"+
		"\3\2\2\2y\u036b\3\2\2\2{\u036d\3\2\2\2}\u036f\3\2\2\2\177\u0371\3\2\2"+
		"\2\u0081\u0373\3\2\2\2\u0083\u0375\3\2\2\2\u0085\u037b\3\2\2\2\u0087\u037f"+
		"\3\2\2\2\u0089\u0381\3\2\2\2\u008b\u0383\3\2\2\2\u008d\u03a3\3\2\2\2\u008f"+
		"\u03a5\3\2\2\2\u0091\u03aa\3\2\2\2\u0093\u03ae\3\2\2\2\u0095\u03b9\3\2"+
		"\2\2\u0097\u03bb\3\2\2\2\u0099\u03c5\3\2\2\2\u009b\u03c8\3\2\2\2\u009d"+
		"\u03d1\3\2\2\2\u009f\u03d3\3\2\2\2\u00a1\u03d5\3\2\2\2\u00a3\u03d7\3\2"+
		"\2\2\u00a5\u03d9\3\2\2\2\u00a7\u03db\3\2\2\2\u00a9\u03e8\3\2\2\2\u00ab"+
		"\u03f7\3\2\2\2\u00ad\u03fd\3\2\2\2\u00af\u0400\3\2\2\2\u00b1\u00b2\7<"+
		"\2\2\u00b2\4\3\2\2\2\u00b3\u00b4\7F\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6"+
		"\7\"\2\2\u00b6\u00b7\7Q\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\u00ba\7q\2\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc\7O\2\2\u00bc\u00bd\7q\2"+
		"\2\u00bd\u00be\7f\2\2\u00be\u00bf\7q\2\2\u00bf\6\3\2\2\2\u00c0\u00c1\7"+
		"f\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7\"\2\2\u00c3\u00c4\7q\2\2\u00c4"+
		"\u00c5\7v\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7\"\2"+
		"\2\u00c8\u00c9\7o\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7f\2\2\u00cb\u00cc"+
		"\7q\2\2\u00cc\b\3\2\2\2\u00cd\u00ce\7F\2\2\u00ce\u00cf\7G\2\2\u00cf\u00d0"+
		"\7\"\2\2\u00d0\u00d1\7Q\2\2\u00d1\u00d2\7V\2\2\u00d2\u00d3\7T\2\2\u00d3"+
		"\u00d4\7Q\2\2\u00d4\u00d5\7\"\2\2\u00d5\u00d6\7O\2\2\u00d6\u00d7\7Q\2"+
		"\2\u00d7\u00d8\7F\2\2\u00d8\u00d9\7Q\2\2\u00d9\n\3\2\2\2\u00da\u00db\7"+
		"J\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7v\2\2\u00de\u00df"+
		"\7c\2\2\u00df\u00e0\7\"\2\2\u00e0\u00e1\7S\2\2\u00e1\u00e2\7w\2\2\u00e2"+
		"\u00e3\7g\2\2\u00e3\f\3\2\2\2\u00e4\u00e5\7J\2\2\u00e5\u00e6\7C\2\2\u00e6"+
		"\u00e7\7U\2\2\u00e7\u00e8\7V\2\2\u00e8\u00e9\7C\2\2\u00e9\u00ea\7\"\2"+
		"\2\u00ea\u00eb\7S\2\2\u00eb\u00ec\7W\2\2\u00ec\u00ed\7G\2\2\u00ed\16\3"+
		"\2\2\2\u00ee\u00ef\7j\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7u\2\2\u00f1"+
		"\u00f2\7v\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7\"\2\2\u00f4\u00f5\7s\2"+
		"\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7g\2\2\u00f7\20\3\2\2\2\u00f8\u00f9"+
		"\7T\2\2\u00f9\u00fa\7E\2\2\u00fa\22\3\2\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd"+
		"\7e\2\2\u00fd\24\3\2\2\2\u00fe\u00ff\7C\2\2\u00ff\u0100\7D\2\2\u0100\u0101"+
		"\7U\2\2\u0101\26\3\2\2\2\u0102\u0103\7c\2\2\u0103\u0104\7d\2\2\u0104\u0105"+
		"\7u\2\2\u0105\30\3\2\2\2\u0106\u0107\7N\2\2\u0107\u0108\7P\2\2\u0108\32"+
		"\3\2\2\2\u0109\u010a\7n\2\2\u010a\u010b\7p\2\2\u010b\34\3\2\2\2\u010c"+
		"\u010d\7G\2\2\u010d\u010e\7Z\2\2\u010e\u010f\7R\2\2\u010f\36\3\2\2\2\u0110"+
		"\u0111\7g\2\2\u0111\u0112\7z\2\2\u0112\u0113\7r\2\2\u0113 \3\2\2\2\u0114"+
		"\u0115\7U\2\2\u0115\u0116\7G\2\2\u0116\u0117\7P\2\2\u0117\"\3\2\2\2\u0118"+
		"\u0119\7u\2\2\u0119\u011a\7g\2\2\u011a\u011b\7p\2\2\u011b$\3\2\2\2\u011c"+
		"\u011d\7E\2\2\u011d\u011e\7Q\2\2\u011e\u011f\7U\2\2\u011f&\3\2\2\2\u0120"+
		"\u0121\7e\2\2\u0121\u0122\7q\2\2\u0122\u0123\7u\2\2\u0123(\3\2\2\2\u0124"+
		"\u0125\7C\2\2\u0125\u0126\7V\2\2\u0126\u0127\7C\2\2\u0127\u0128\7P\2\2"+
		"\u0128*\3\2\2\2\u0129\u012a\7c\2\2\u012a\u012b\7v\2\2\u012b\u012c\7c\2"+
		"\2\u012c\u012d\7p\2\2\u012d,\3\2\2\2\u012e\u012f\7V\2\2\u012f\u0130\7"+
		"T\2\2\u0130\u0131\7W\2\2\u0131\u0132\7P\2\2\u0132\u0133\7E\2\2\u0133."+
		"\3\2\2\2\u0134\u0135\7v\2\2\u0135\u0136\7t\2\2\u0136\u0137\7w\2\2\u0137"+
		"\u0138\7p\2\2\u0138\u0139\7e\2\2\u0139\60\3\2\2\2\u013a\u013b\7T\2\2\u013b"+
		"\u013c\7G\2\2\u013c\u013d\7F\2\2\u013d\u013e\7Q\2\2\u013e\u013f\7P\2\2"+
		"\u013f\62\3\2\2\2\u0140\u0141\7t\2\2\u0141\u0142\7g\2\2\u0142\u0143\7"+
		"f\2\2\u0143\u0144\7q\2\2\u0144\u0145\7p\2\2\u0145\64\3\2\2\2\u0146\u0147"+
		"\7C\2\2\u0147\u0148\7\\\2\2\u0148\u0149\7C\2\2\u0149\u014a\7T\2\2\u014a"+
		"\66\3\2\2\2\u014b\u014c\7c\2\2\u014c\u014d\7|\2\2\u014d\u014e\7c\2\2\u014e"+
		"\u014f\7t\2\2\u014f8\3\2\2\2\u0150\u0151\7H\2\2\u0151\u0152\7k\2\2\u0152"+
		"\u0153\7p\2\2\u0153\u0154\7R\2\2\u0154\u0155\7t\2\2\u0155\u0156\7q\2\2"+
		"\u0156\u0157\7e\2\2\u0157\u0158\7g\2\2\u0158\u0159\7u\2\2\u0159\u0167"+
		"\7q\2\2\u015a\u015b\7H\2\2\u015b\u015c\7k\2\2\u015c\u015d\7p\2\2\u015d"+
		"\u015e\7C\2\2\u015e\u015f\7n\2\2\u015f\u0160\7i\2\2\u0160\u0161\7q\2\2"+
		"\u0161\u0162\7t\2\2\u0162\u0163\7k\2\2\u0163\u0164\7v\2\2\u0164\u0165"+
		"\7o\2\2\u0165\u0167\7q\2\2\u0166\u0150\3\2\2\2\u0166\u015a\3\2\2\2\u0167"+
		"\u016b\3\2\2\2\u0168\u016a\13\2\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3"+
		"\2\2\2\u016b\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c:\3\2\2\2\u016d\u016b"+
		"\3\2\2\2\u016e\u016f\7R\2\2\u016f\u0170\7t\2\2\u0170\u0171\7q\2\2\u0171"+
		"\u0172\7e\2\2\u0172\u0173\7g\2\2\u0173\u0174\7u\2\2\u0174\u017f\7q\2\2"+
		"\u0175\u0176\7C\2\2\u0176\u0177\7n\2\2\u0177\u0178\7i\2\2\u0178\u0179"+
		"\7q\2\2\u0179\u017a\7t\2\2\u017a\u017b\7k\2\2\u017b\u017c\7v\2\2\u017c"+
		"\u017d\7o\2\2\u017d\u017f\7q\2\2\u017e\u016e\3\2\2\2\u017e\u0175\3\2\2"+
		"\2\u017f<\3\2\2\2\u0180\u0181\7F\2\2\u0181\u0182\7g\2\2\u0182\u0183\7"+
		"h\2\2\u0183\u0184\7k\2\2\u0184\u0185\7p\2\2\u0185\u0186\7k\2\2\u0186\u0196"+
		"\7t\2\2\u0187\u0188\7F\2\2\u0188\u0189\7G\2\2\u0189\u018a\7H\2\2\u018a"+
		"\u018b\7K\2\2\u018b\u018c\7P\2\2\u018c\u018d\7K\2\2\u018d\u0196\7T\2\2"+
		"\u018e\u018f\7f\2\2\u018f\u0190\7g\2\2\u0190\u0191\7h\2\2\u0191\u0192"+
		"\7k\2\2\u0192\u0193\7p\2\2\u0193\u0194\7k\2\2\u0194\u0196\7t\2\2\u0195"+
		"\u0180\3\2\2\2\u0195\u0187\3\2\2\2\u0195\u018e\3\2\2\2\u0196>\3\2\2\2"+
		"\u0197\u0198\7E\2\2\u0198\u0199\7q\2\2\u0199\u019a\7o\2\2\u019a\u01a4"+
		"\7q\2\2\u019b\u019c\7E\2\2\u019c\u019d\7Q\2\2\u019d\u019e\7O\2\2\u019e"+
		"\u01a4\7Q\2\2\u019f\u01a0\7e\2\2\u01a0\u01a1\7q\2\2\u01a1\u01a2\7o\2\2"+
		"\u01a2\u01a4\7q\2\2\u01a3\u0197\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u019f"+
		"\3\2\2\2\u01a4@\3\2\2\2\u01a5\u01a6\7>\2\2\u01a6\u01a7\7/\2\2\u01a7B\3"+
		"\2\2\2\u01a8\u01a9\7F\2\2\u01a9\u01aa\7k\2\2\u01aa\u01ab\7o\2\2\u01ab"+
		"\u01ac\7g\2\2\u01ac\u01ad\7p\2\2\u01ad\u01ae\7u\2\2\u01ae\u01af\7k\2\2"+
		"\u01af\u01b0\7q\2\2\u01b0\u01c4\7p\2\2\u01b1\u01b2\7F\2\2\u01b2\u01b3"+
		"\7K\2\2\u01b3\u01b4\7O\2\2\u01b4\u01b5\7G\2\2\u01b5\u01b6\7P\2\2\u01b6"+
		"\u01b7\7U\2\2\u01b7\u01b8\7K\2\2\u01b8\u01b9\7Q\2\2\u01b9\u01c4\7P\2\2"+
		"\u01ba\u01bb\7f\2\2\u01bb\u01bc\7k\2\2\u01bc\u01bd\7o\2\2\u01bd\u01be"+
		"\7g\2\2\u01be\u01bf\7p\2\2\u01bf\u01c0\7u\2\2\u01c0\u01c1\7k\2\2\u01c1"+
		"\u01c2\7q\2\2\u01c2\u01c4\7p\2\2\u01c3\u01a8\3\2\2\2\u01c3\u01b1\3\2\2"+
		"\2\u01c3\u01ba\3\2\2\2\u01c4D\3\2\2\2\u01c5\u01c6\7N\2\2\u01c6\u01c7\7"+
		"g\2\2\u01c7\u01c8\7g\2\2\u01c8\u01d2\7t\2\2\u01c9\u01ca\7N\2\2\u01ca\u01cb"+
		"\7G\2\2\u01cb\u01cc\7G\2\2\u01cc\u01d2\7T\2\2\u01cd\u01ce\7n\2\2\u01ce"+
		"\u01cf\7g\2\2\u01cf\u01d0\7g\2\2\u01d0\u01d2\7t\2\2\u01d1\u01c5\3\2\2"+
		"\2\u01d1\u01c9\3\2\2\2\u01d1\u01cd\3\2\2\2\u01d2F\3\2\2\2\u01d3\u01d4"+
		"\7G\2\2\u01d4\u01d5\7u\2\2\u01d5\u01d6\7e\2\2\u01d6\u01d7\7t\2\2\u01d7"+
		"\u01d8\7k\2\2\u01d8\u01d9\7d\2\2\u01d9\u01da\7k\2\2\u01da\u01ec\7t\2\2"+
		"\u01db\u01dc\7G\2\2\u01dc\u01dd\7U\2\2\u01dd\u01de\7E\2\2\u01de\u01df"+
		"\7T\2\2\u01df\u01e0\7K\2\2\u01e0\u01e1\7D\2\2\u01e1\u01e2\7K\2\2\u01e2"+
		"\u01ec\7T\2\2\u01e3\u01e4\7g\2\2\u01e4\u01e5\7u\2\2\u01e5\u01e6\7e\2\2"+
		"\u01e6\u01e7\7t\2\2\u01e7\u01e8\7k\2\2\u01e8\u01e9\7d\2\2\u01e9\u01ea"+
		"\7k\2\2\u01ea\u01ec\7t\2\2\u01eb\u01d3\3\2\2\2\u01eb\u01db\3\2\2\2\u01eb"+
		"\u01e3\3\2\2\2\u01ecH\3\2\2\2\u01ed\u01ee\7H\2\2\u01ee\u01ef\7k\2\2\u01ef"+
		"\u01f0\7p\2\2\u01f0\u01f1\7u\2\2\u01f1\u0208\7k\2\2\u01f2\u01f3\7H\2\2"+
		"\u01f3\u01f4\7K\2\2\u01f4\u01f5\7P\2\2\u01f5\u01f6\7U\2\2\u01f6\u0208"+
		"\7K\2\2\u01f7\u01f8\7h\2\2\u01f8\u01f9\7k\2\2\u01f9\u01fa\7p\2\2\u01fa"+
		"\u01fb\7u\2\2\u01fb\u0208\7k\2\2\u01fc\u01fd\7H\2\2\u01fd\u01fe\7k\2\2"+
		"\u01fe\u01ff\7p\2\2\u01ff\u0200\7U\2\2\u0200\u0208\7k\2\2\u0201\u0202"+
		"\7H\2\2\u0202\u0203\7k\2\2\u0203\u0204\7p\2\2\u0204\u0205\7\"\2\2\u0205"+
		"\u0206\7U\2\2\u0206\u0208\7k\2\2\u0207\u01ed\3\2\2\2\u0207\u01f2\3\2\2"+
		"\2\u0207\u01f7\3\2\2\2\u0207\u01fc\3\2\2\2\u0207\u0201\3\2\2\2\u0208J"+
		"\3\2\2\2\u0209\u020a\7U\2\2\u020a\u020b\7k\2\2\u020b\u020c\7p\2\2\u020c"+
		"\u021a\7q\2\2\u020d\u020e\7U\2\2\u020e\u020f\7K\2\2\u020f\u0210\7P\2\2"+
		"\u0210\u021a\7Q\2\2\u0211\u0212\7u\2\2\u0212\u0213\7k\2\2\u0213\u0214"+
		"\7p\2\2\u0214\u021a\7q\2\2\u0215\u0216\7U\2\2\u0216\u0217\7k\2\2\u0217"+
		"\u0218\7P\2\2\u0218\u021a\7q\2\2\u0219\u0209\3\2\2\2\u0219\u020d\3\2\2"+
		"\2\u0219\u0211\3\2\2\2\u0219\u0215\3\2\2\2\u021aL\3\2\2\2\u021b\u021c"+
		"\7G\2\2\u021c\u021d\7p\2\2\u021d\u021e\7v\2\2\u021e\u021f\7q\2\2\u021f"+
		"\u0220\7p\2\2\u0220\u0221\7e\2\2\u0221\u0222\7g\2\2\u0222\u0234\7u\2\2"+
		"\u0223\u0224\7G\2\2\u0224\u0225\7P\2\2\u0225\u0226\7V\2\2\u0226\u0227"+
		"\7Q\2\2\u0227\u0228\7P\2\2\u0228\u0229\7E\2\2\u0229\u022a\7G\2\2\u022a"+
		"\u0234\7U\2\2\u022b\u022c\7g\2\2\u022c\u022d\7p\2\2\u022d\u022e\7v\2\2"+
		"\u022e\u022f\7q\2\2\u022f\u0230\7p\2\2\u0230\u0231\7e\2\2\u0231\u0232"+
		"\7g\2\2\u0232\u0234\7u\2\2\u0233\u021b\3\2\2\2\u0233\u0223\3\2\2\2\u0233"+
		"\u022b\3\2\2\2\u0234N\3\2\2\2\u0235\u0236\7U\2\2\u0236\u023c\7k\2\2\u0237"+
		"\u0238\7U\2\2\u0238\u023c\7K\2\2\u0239\u023a\7u\2\2\u023a\u023c\7k\2\2"+
		"\u023b\u0235\3\2\2\2\u023b\u0237\3\2\2\2\u023b\u0239\3\2\2\2\u023cP\3"+
		"\2\2\2\u023d\u023e\7H\2\2\u023e\u023f\7k\2\2\u023f\u0240\7p\2\2\u0240"+
		"\u0241\7u\2\2\u0241\u0242\7g\2\2\u0242\u0243\7i\2\2\u0243\u0244\7w\2\2"+
		"\u0244\u025e\7p\2\2\u0245\u0246\7H\2\2\u0246\u0247\7K\2\2\u0247\u0248"+
		"\7P\2\2\u0248\u0249\7U\2\2\u0249\u024a\7G\2\2\u024a\u024b\7I\2\2\u024b"+
		"\u024c\7W\2\2\u024c\u025e\7P\2\2\u024d\u024e\7h\2\2\u024e\u024f\7k\2\2"+
		"\u024f\u0250\7p\2\2\u0250\u0251\7u\2\2\u0251\u0252\7g\2\2\u0252\u0253"+
		"\7i\2\2\u0253\u0254\7w\2\2\u0254\u025e\7p\2\2\u0255\u0256\7H\2\2\u0256"+
		"\u0257\7k\2\2\u0257\u0258\7p\2\2\u0258\u0259\7U\2\2\u0259\u025a\7g\2\2"+
		"\u025a\u025b\7i\2\2\u025b\u025c\7w\2\2\u025c\u025e\7p\2\2\u025d\u023d"+
		"\3\2\2\2\u025d\u0245\3\2\2\2\u025d\u024d\3\2\2\2\u025d\u0255\3\2\2\2\u025e"+
		"R\3\2\2\2\u025f\u0260\7U\2\2\u0260\u0261\7g\2\2\u0261\u0262\7i\2\2\u0262"+
		"\u0263\7w\2\2\u0263\u026f\7p\2\2\u0264\u0265\7u\2\2\u0265\u0266\7g\2\2"+
		"\u0266\u0267\7i\2\2\u0267\u0268\7w\2\2\u0268\u026f\7p\2\2\u0269\u026a"+
		"\7U\2\2\u026a\u026b\7G\2\2\u026b\u026c\7I\2\2\u026c\u026d\7W\2\2\u026d"+
		"\u026f\7P\2\2\u026e\u025f\3\2\2\2\u026e\u0264\3\2\2\2\u026e\u0269\3\2"+
		"\2\2\u026fT\3\2\2\2\u0270\u0271\7J\2\2\u0271\u0272\7c\2\2\u0272\u0273"+
		"\7e\2\2\u0273\u0274\7g\2\2\u0274\u0280\7t\2\2\u0275\u0276\7j\2\2\u0276"+
		"\u0277\7c\2\2\u0277\u0278\7e\2\2\u0278\u0279\7g\2\2\u0279\u0280\7t\2\2"+
		"\u027a\u027b\7J\2\2\u027b\u027c\7C\2\2\u027c\u027d\7E\2\2\u027d\u027e"+
		"\7G\2\2\u027e\u0280\7T\2\2\u027f\u0270\3\2\2\2\u027f\u0275\3\2\2\2\u027f"+
		"\u027a\3\2\2\2\u0280V\3\2\2\2\u0281\u0282\7H\2\2\u0282\u0283\7k\2\2\u0283"+
		"\u0284\7p\2\2\u0284\u0285\7o\2\2\u0285\u0286\7k\2\2\u0286\u0287\7g\2\2"+
		"\u0287\u0288\7p\2\2\u0288\u0289\7v\2\2\u0289\u028a\7t\2\2\u028a\u028b"+
		"\7c\2\2\u028b\u02ae\7u\2\2\u028c\u028d\7H\2\2\u028d\u028e\7K\2\2\u028e"+
		"\u028f\7P\2\2\u028f\u0290\7O\2\2\u0290\u0291\7K\2\2\u0291\u0292\7G\2\2"+
		"\u0292\u0293\7P\2\2\u0293\u0294\7V\2\2\u0294\u0295\7T\2\2\u0295\u0296"+
		"\7C\2\2\u0296\u02ae\7U\2\2\u0297\u0298\7h\2\2\u0298\u0299\7k\2\2\u0299"+
		"\u029a\7p\2\2\u029a\u029b\7o\2\2\u029b\u029c\7k\2\2\u029c\u029d\7g\2\2"+
		"\u029d\u029e\7p\2\2\u029e\u029f\7v\2\2\u029f\u02a0\7t\2\2\u02a0\u02a1"+
		"\7c\2\2\u02a1\u02ae\7u\2\2\u02a2\u02a3\7H\2\2\u02a3\u02a4\7k\2\2\u02a4"+
		"\u02a5\7p\2\2\u02a5\u02a6\7O\2\2\u02a6\u02a7\7k\2\2\u02a7\u02a8\7g\2\2"+
		"\u02a8\u02a9\7p\2\2\u02a9\u02aa\7v\2\2\u02aa\u02ab\7t\2\2\u02ab\u02ac"+
		"\7c\2\2\u02ac\u02ae\7u\2\2\u02ad\u0281\3\2\2\2\u02ad\u028c\3\2\2\2\u02ad"+
		"\u0297\3\2\2\2\u02ad\u02a2\3\2\2\2\u02aeX\3\2\2\2\u02af\u02b0\7O\2\2\u02b0"+
		"\u02b1\7k\2\2\u02b1\u02b2\7g\2\2\u02b2\u02b3\7p\2\2\u02b3\u02b4\7v\2\2"+
		"\u02b4\u02b5\7t\2\2\u02b5\u02b6\7c\2\2\u02b6\u02c8\7u\2\2\u02b7\u02b8"+
		"\7o\2\2\u02b8\u02b9\7k\2\2\u02b9\u02ba\7g\2\2\u02ba\u02bb\7p\2\2\u02bb"+
		"\u02bc\7v\2\2\u02bc\u02bd\7t\2\2\u02bd\u02be\7c\2\2\u02be\u02c8\7u\2\2"+
		"\u02bf\u02c0\7O\2\2\u02c0\u02c1\7K\2\2\u02c1\u02c2\7G\2\2\u02c2\u02c3"+
		"\7P\2\2\u02c3\u02c4\7V\2\2\u02c4\u02c5\7T\2\2\u02c5\u02c6\7C\2\2\u02c6"+
		"\u02c8\7U\2\2\u02c7\u02af\3\2\2\2\u02c7\u02b7\3\2\2\2\u02c7\u02bf\3\2"+
		"\2\2\u02c8Z\3\2\2\2\u02c9\u02ca\7T\2\2\u02ca\u02cb\7g\2\2\u02cb\u02cc"+
		"\7r\2\2\u02cc\u02cd\7g\2\2\u02cd\u02ce\7v\2\2\u02ce\u02cf\7k\2\2\u02cf"+
		"\u02df\7t\2\2\u02d0\u02d1\7T\2\2\u02d1\u02d2\7G\2\2\u02d2\u02d3\7R\2\2"+
		"\u02d3\u02d4\7G\2\2\u02d4\u02d5\7V\2\2\u02d5\u02d6\7K\2\2\u02d6\u02df"+
		"\7T\2\2\u02d7\u02d8\7t\2\2\u02d8\u02d9\7g\2\2\u02d9\u02da\7r\2\2\u02da"+
		"\u02db\7g\2\2\u02db\u02dc\7v\2\2\u02dc\u02dd\7k\2\2\u02dd\u02df\7t\2\2"+
		"\u02de\u02c9\3\2\2\2\u02de\u02d0\3\2\2\2\u02de\u02d7\3\2\2\2\u02df\\\3"+
		"\2\2\2\u02e0\u02e1\7H\2\2\u02e1\u02e2\7k\2\2\u02e2\u02e3\7p\2\2\u02e3"+
		"\u02e4\7R\2\2\u02e4\u02e5\7c\2\2\u02e5\u02e6\7t\2\2\u02e6\u02f6\7c\2\2"+
		"\u02e7\u02e8\7H\2\2\u02e8\u02e9\7K\2\2\u02e9\u02ea\7P\2\2\u02ea\u02eb"+
		"\7R\2\2\u02eb\u02ec\7C\2\2\u02ec\u02ed\7T\2\2\u02ed\u02f6\7C\2\2\u02ee"+
		"\u02ef\7h\2\2\u02ef\u02f0\7k\2\2\u02f0\u02f1\7p\2\2\u02f1\u02f2\7r\2\2"+
		"\u02f2\u02f3\7c\2\2\u02f3\u02f4\7t\2\2\u02f4\u02f6\7c\2\2\u02f5\u02e0"+
		"\3\2\2\2\u02f5\u02e7\3\2\2\2\u02f5\u02ee\3\2\2\2\u02f6^\3\2\2\2\u02f7"+
		"\u02f8\7R\2\2\u02f8\u02f9\7c\2\2\u02f9\u02fa\7t\2\2\u02fa\u0304\7c\2\2"+
		"\u02fb\u02fc\7R\2\2\u02fc\u02fd\7C\2\2\u02fd\u02fe\7T\2\2\u02fe\u0304"+
		"\7C\2\2\u02ff\u0300\7r\2\2\u0300\u0301\7c\2\2\u0301\u0302\7t\2\2\u0302"+
		"\u0304\7c\2\2\u0303\u02f7\3\2\2\2\u0303\u02fb\3\2\2\2\u0303\u02ff\3\2"+
		"\2\2\u0304`\3\2\2\2\u0305\u0306\7J\2\2\u0306\u0307\7c\2\2\u0307\u0308"+
		"\7u\2\2\u0308\u0309\7v\2\2\u0309\u0315\7c\2\2\u030a\u030b\7J\2\2\u030b"+
		"\u030c\7C\2\2\u030c\u030d\7U\2\2\u030d\u030e\7V\2\2\u030e\u0315\7C\2\2"+
		"\u030f\u0310\7j\2\2\u0310\u0311\7c\2\2\u0311\u0312\7u\2\2\u0312\u0313"+
		"\7v\2\2\u0313\u0315\7c\2\2\u0314\u0305\3\2\2\2\u0314\u030a\3\2\2\2\u0314"+
		"\u030f\3\2\2\2\u0315b\3\2\2\2\u0316\u033f\5\u009fP\2\u0317\u0318\7E\2"+
		"\2\u0318\u0319\7q\2\2\u0319\u031a\7p\2\2\u031a\u031b\7\"\2\2\u031b\u031c"+
		"\7R\2\2\u031c\u031d\7c\2\2\u031d\u031e\7u\2\2\u031e\u0340\7q\2\2\u031f"+
		"\u0320\7e\2\2\u0320\u0321\7q\2\2\u0321\u0322\7p\2\2\u0322\u0323\7\"\2"+
		"\2\u0323\u0324\7r\2\2\u0324\u0325\7c\2\2\u0325\u0326\7u\2\2\u0326\u0340"+
		"\7q\2\2\u0327\u0328\7E\2\2\u0328\u0329\7Q\2\2\u0329\u032a\7P\2\2\u032a"+
		"\u032b\7\"\2\2\u032b\u032c\7R\2\2\u032c\u032d\7C\2\2\u032d\u032e\7U\2"+
		"\2\u032e\u0340\7Q\2\2\u032f\u0330\7E\2\2\u0330\u0331\7Q\2\2\u0331\u0332"+
		"\7P\2\2\u0332\u0333\7\"\2\2\u0333\u0334\7r\2\2\u0334\u0335\7c\2\2\u0335"+
		"\u0336\7u\2\2\u0336\u0340\7q\2\2\u0337\u0338\7e\2\2\u0338\u0339\7q\2\2"+
		"\u0339\u033a\7p\2\2\u033a\u033b\7\"\2\2\u033b\u033c\7R\2\2\u033c\u033d"+
		"\7C\2\2\u033d\u033e\7U\2\2\u033e\u0340\7Q\2\2\u033f\u0317\3\2\2\2\u033f"+
		"\u031f\3\2\2\2\u033f\u0327\3\2\2\2\u033f\u032f\3\2\2\2\u033f\u0337\3\2"+
		"\2\2\u0340\u0341\3\2\2\2\u0341\u0342\5\u0091I\2\u0342\u0343\5\u00a1Q\2"+
		"\u0343d\3\2\2\2\u0344\u034a\5g\64\2\u0345\u034a\5i\65\2\u0346\u034a\5"+
		"k\66\2\u0347\u034a\5m\67\2\u0348\u034a\5o8\2\u0349\u0344\3\2\2\2\u0349"+
		"\u0345\3\2\2\2\u0349\u0346\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u0348\3\2"+
		"\2\2\u034af\3\2\2\2\u034b\u034c\7@\2\2\u034ch\3\2\2\2\u034d\u034e\7>\2"+
		"\2\u034ej\3\2\2\2\u034f\u0350\7?\2\2\u0350l\3\2\2\2\u0351\u0352\7>\2\2"+
		"\u0352\u0353\7?\2\2\u0353n\3\2\2\2\u0354\u0355\7@\2\2\u0355\u0356\7?\2"+
		"\2\u0356p\3\2\2\2\u0357\u035b\5s:\2\u0358\u035b\5u;\2\u0359\u035b\5w<"+
		"\2\u035a\u0357\3\2\2\2\u035a\u0358\3\2\2\2\u035a\u0359\3\2\2\2\u035br"+
		"\3\2\2\2\u035c\u035d\t\2\2\2\u035dt\3\2\2\2\u035e\u035f\t\3\2\2\u035f"+
		"v\3\2\2\2\u0360\u0364\7\u0080\2\2\u0361\u0362\7P\2\2\u0362\u0364\7Q\2"+
		"\2\u0363\u0360\3\2\2\2\u0363\u0361\3\2\2\2\u0364x\3\2\2\2\u0365\u036c"+
		"\5{>\2\u0366\u036c\5}?\2\u0367\u036c\5\177@\2\u0368\u036c\5\u0081A\2\u0369"+
		"\u036c\5\u0083B\2\u036a\u036c\5\u0085C\2\u036b\u0365\3\2\2\2\u036b\u0366"+
		"\3\2\2\2\u036b\u0367\3\2\2\2\u036b\u0368\3\2\2\2\u036b\u0369\3\2\2\2\u036b"+
		"\u036a\3\2\2\2\u036cz\3\2\2\2\u036d\u036e\7-\2\2\u036e|\3\2\2\2\u036f"+
		"\u0370\7/\2\2\u0370~\3\2\2\2\u0371\u0372\7,\2\2\u0372\u0080\3\2\2\2\u0373"+
		"\u0374\7\61\2\2\u0374\u0082\3\2\2\2\u0375\u0376\7`\2\2\u0376\u0084\3\2"+
		"\2\2\u0377\u037c\7\'\2\2\u0378\u0379\7O\2\2\u0379\u037a\7Q\2\2\u037a\u037c"+
		"\7F\2\2\u037b\u0377\3\2\2\2\u037b\u0378\3\2\2\2\u037c\u0086\3\2\2\2\u037d"+
		"\u0380\5\u0089E\2\u037e\u0380\5\u008bF\2\u037f\u037d\3\2\2\2\u037f\u037e"+
		"\3\2\2\2\u0380\u0088\3\2\2\2\u0381\u0382\7.\2\2\u0382\u008a\3\2\2\2\u0383"+
		"\u0384\7a\2\2\u0384\u008c\3\2\2\2\u0385\u0386\7G\2\2\u0386\u0387\7p\2"+
		"\2\u0387\u0388\7v\2\2\u0388\u0389\7g\2\2\u0389\u038a\7t\2\2\u038a\u03a4"+
		"\7q\2\2\u038b\u038c\7T\2\2\u038c\u038d\7g\2\2\u038d\u038e\7c\2\2\u038e"+
		"\u03a4\7n\2\2\u038f\u0390\7E\2\2\u0390\u0391\7c\2\2\u0391\u0392\7t\2\2"+
		"\u0392\u0393\7c\2\2\u0393\u0394\7e\2\2\u0394\u0395\7v\2\2\u0395\u0396"+
		"\7g\2\2\u0396\u03a4\7t\2\2\u0397\u0398\7N\2\2\u0398\u0399\7q\2\2\u0399"+
		"\u039a\7i\2\2\u039a\u039b\7k\2\2\u039b\u039c\7e\2\2\u039c\u03a4\7q\2\2"+
		"\u039d\u039e\7E\2\2\u039e\u039f\7c\2\2\u039f\u03a0\7f\2\2\u03a0\u03a1"+
		"\7g\2\2\u03a1\u03a2\7p\2\2\u03a2\u03a4\7c\2\2\u03a3\u0385\3\2\2\2\u03a3"+
		"\u038b\3\2\2\2\u03a3\u038f\3\2\2\2\u03a3\u0397\3\2\2\2\u03a3\u039d\3\2"+
		"\2\2\u03a4\u008e\3\2\2\2\u03a5\u03a6\5\u0091I\2\u03a6\u03a7\7\60\2\2\u03a7"+
		"\u03a8\5\u0091I\2\u03a8\u0090\3\2\2\2\u03a9\u03ab\5\u0093J\2\u03aa\u03a9"+
		"\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad"+
		"\u0092\3\2\2\2\u03ae\u03af\t\4\2\2\u03af\u0094\3\2\2\2\u03b0\u03b1\7V"+
		"\2\2\u03b1\u03b2\7T\2\2\u03b2\u03b3\7W\2\2\u03b3\u03ba\7G\2\2\u03b4\u03b5"+
		"\7H\2\2\u03b5\u03b6\7C\2\2\u03b6\u03b7\7N\2\2\u03b7\u03b8\7U\2\2\u03b8"+
		"\u03ba\7G\2\2\u03b9\u03b0\3\2\2\2\u03b9\u03b4\3\2\2\2\u03ba\u0096\3\2"+
		"\2\2\u03bb\u03c0\t\5\2\2\u03bc\u03bf\5\u0099M\2\u03bd\u03bf\13\2\2\2\u03be"+
		"\u03bc\3\2\2\2\u03be\u03bd\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03c1\3\2"+
		"\2\2\u03c0\u03be\3\2\2\2\u03c1\u03c3\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c3"+
		"\u03c4\t\5\2\2\u03c4\u0098\3\2\2\2\u03c5\u03c6\7^\2\2\u03c6\u03c7\t\6"+
		"\2\2\u03c7\u009a\3\2\2\2\u03c8\u03ce\5\u009dO\2\u03c9\u03cd\5\u009dO\2"+
		"\u03ca\u03cd\5\u0091I\2\u03cb\u03cd\t\7\2\2\u03cc\u03c9\3\2\2\2\u03cc"+
		"\u03ca\3\2\2\2\u03cc\u03cb\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2"+
		"\2\2\u03ce\u03cf\3\2\2\2\u03cf\u009c\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1"+
		"\u03d2\t\b\2\2\u03d2\u009e\3\2\2\2\u03d3\u03d4\7*\2\2\u03d4\u00a0\3\2"+
		"\2\2\u03d5\u03d6\7+\2\2\u03d6\u00a2\3\2\2\2\u03d7\u03d8\7]\2\2\u03d8\u00a4"+
		"\3\2\2\2\u03d9\u03da\7_\2\2\u03da\u00a6\3\2\2\2\u03db\u03dc\7\61\2\2\u03dc"+
		"\u03dd\7\61\2\2\u03dd\u03e1\3\2\2\2\u03de\u03e0\13\2\2\2\u03df\u03de\3"+
		"\2\2\2\u03e0\u03e3\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e1\u03df\3\2\2\2\u03e2"+
		"\u03e4\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e4\u03e5\7\f\2\2\u03e5\u03e6\3\2"+
		"\2\2\u03e6\u03e7\bT\2\2\u03e7\u00a8\3\2\2\2\u03e8\u03e9\7\61\2\2\u03e9"+
		"\u03ea\7,\2\2\u03ea\u03ee\3\2\2\2\u03eb\u03ed\13\2\2\2\u03ec\u03eb\3\2"+
		"\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ef"+
		"\u03f1\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03f2\7,\2\2\u03f2\u03f3\7\61"+
		"\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\bU\2\2\u03f5\u00aa\3\2\2\2\u03f6"+
		"\u03f8\t\t\2\2\u03f7\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03f7\3\2"+
		"\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\bV\2\2\u03fc"+
		"\u00ac\3\2\2\2\u03fd\u03fe\t\n\2\2\u03fe\u00ae\3\2\2\2\u03ff\u0401\7\""+
		"\2\2\u0400\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0400\3\2\2\2\u0402"+
		"\u0403\3\2\2\2\u0403\u00b0\3\2\2\2*\2\u0166\u016b\u017e\u0195\u01a3\u01c3"+
		"\u01d1\u01eb\u0207\u0219\u0233\u023b\u025d\u026e\u027f\u02ad\u02c7\u02de"+
		"\u02f5\u0303\u0314\u033f\u0349\u035a\u0363\u036b\u037b\u037f\u03a3\u03ac"+
		"\u03b9\u03be\u03c0\u03cc\u03ce\u03e1\u03ee\u03f9\u0402\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}