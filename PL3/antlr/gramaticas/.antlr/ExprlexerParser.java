// Generated from c:\antlr\gramaticas\Exprlexer.g4 by ANTLR 4.8

    
 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprlexerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FIN=1, INI=2, DEFINIR=3, COMO=4, FLECHA=5, DIMENSION=6, LEER=7, ESCRIBIR=8, 
		CIERRASI=9, SINO=10, ENTONCES=11, SI=12, DEOTROMODO=13, FINSEGUN=14, SEGUN=15, 
		HACER=16, FINMIENTRAS=17, MIENTRAS=18, REPETIR=19, HASTAQUE=20, FINPARA=21, 
		PARA=22, HASTA=23, CONPASO=24, OPERADORREL=25, OPERADORLOG=26, CONJUNCION=27, 
		DISYUNCION=28, NEGACION=29, OPERADORALGE=30, SUMA=31, RESTA=32, MULTIPLICACION=33, 
		DIVISION=34, POTENCIACION=35, MODULO=36, OPERADORSEPARADOR=37, RC=38, 
		ABS=39, LN=40, EXP=41, SEN=42, COS=43, ATAN=44, TRUNC=45, REDON=46, AZAR=47, 
		TIPO=48, FLOAT=49, INT=50, BOOL=51, STRING=52, ID=53, PI=54, PD=55, CI=56, 
		CD=57, COMA=58, DOSPUNTOS=59, BARRABAJA=60, COMENTARIO_LINEA=61, COMENTARIO_BLOQUE=62, 
		WS=63, NEWLINE=64, SPACE=65;
	public static final int
		RULE_prog = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'<-'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'^'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'('", "')'", "'['", "']'", 
			"','", "':'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FIN", "INI", "DEFINIR", "COMO", "FLECHA", "DIMENSION", "LEER", 
			"ESCRIBIR", "CIERRASI", "SINO", "ENTONCES", "SI", "DEOTROMODO", "FINSEGUN", 
			"SEGUN", "HACER", "FINMIENTRAS", "MIENTRAS", "REPETIR", "HASTAQUE", "FINPARA", 
			"PARA", "HASTA", "CONPASO", "OPERADORREL", "OPERADORLOG", "CONJUNCION", 
			"DISYUNCION", "NEGACION", "OPERADORALGE", "SUMA", "RESTA", "MULTIPLICACION", 
			"DIVISION", "POTENCIACION", "MODULO", "OPERADORSEPARADOR", "RC", "ABS", 
			"LN", "EXP", "SEN", "COS", "ATAN", "TRUNC", "REDON", "AZAR", "TIPO", 
			"FLOAT", "INT", "BOOL", "STRING", "ID", "PI", "PD", "CI", "CD", "COMA", 
			"DOSPUNTOS", "BARRABAJA", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", "WS", 
			"NEWLINE", "SPACE"
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
	public String getGrammarFileName() { return "Exprlexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprlexerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2);
					matchWildcard();
					}
					} 
				}
				setState(7);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\13\4\2\t\2\3\2\7"+
		"\2\6\n\2\f\2\16\2\t\13\2\3\2\3\7\2\3\2\2\2\2\n\2\7\3\2\2\2\4\6\13\2\2"+
		"\2\5\4\3\2\2\2\6\t\3\2\2\2\7\b\3\2\2\2\7\5\3\2\2\2\b\3\3\2\2\2\t\7\3\2"+
		"\2\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}