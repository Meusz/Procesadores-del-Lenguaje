// Generated from c:\antlr\gramaticas\Pseudocodigo.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudocodigoParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_instrucciones = 1, RULE_definir = 2, RULE_asignacion = 3, 
		RULE_entrada = 4, RULE_salidas = 5, RULE_dimensionamiento = 6, RULE_condicional = 7, 
		RULE_sino = 8, RULE_si = 9, RULE_seleccionmultiple = 10, RULE_instruccion = 11, 
		RULE_deotromodo = 12, RULE_mientras = 13, RULE_repetir = 14, RULE_hastaque = 15, 
		RULE_lazospara = 16, RULE_invocafuncion = 17, RULE_inicio = 18, RULE_expr = 19, 
		RULE_operadorfun = 20, RULE_raizcuadrada = 21, RULE_valorabsoluto = 22, 
		RULE_logaritmonatural = 23, RULE_funcionexponencial = 24, RULE_seno = 25, 
		RULE_coseno = 26, RULE_arcotangente = 27, RULE_parteentera = 28, RULE_redondear = 29, 
		RULE_aleatorio = 30, RULE_array = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "instrucciones", "definir", "asignacion", "entrada", "salidas", 
			"dimensionamiento", "condicional", "sino", "si", "seleccionmultiple", 
			"instruccion", "deotromodo", "mientras", "repetir", "hastaque", "lazospara", 
			"invocafuncion", "inicio", "expr", "operadorfun", "raizcuadrada", "valorabsoluto", 
			"logaritmonatural", "funcionexponencial", "seno", "coseno", "arcotangente", 
			"parteentera", "redondear", "aleatorio", "array"
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

	@Override
	public String getGrammarFileName() { return "Pseudocodigo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PseudocodigoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public InicioContext inicio() {
			return getRuleContext(InicioContext.class,0);
		}
		public TerminalNode FIN() { return getToken(PseudocodigoParser.FIN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INI) {
				{
				setState(64);
				inicio();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << DEFINIR) | (1L << DIMENSION) | (1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << SEGUN) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FLOAT - 66)) | (1L << (INT - 66)) | (1L << (BOOL - 66)) | (1L << (STRING - 66)) | (1L << (ID - 66)) | (1L << (PI - 66)) | (1L << (CI - 66)))) != 0)) {
					{
					setState(67);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(65);
						expr(0);
						}
						break;
					case 2:
						{
						setState(66);
						instrucciones();
						}
						break;
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(72);
				match(FIN);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public SalidasContext salidas() {
			return getRuleContext(SalidasContext.class,0);
		}
		public DimensionamientoContext dimensionamiento() {
			return getRuleContext(DimensionamientoContext.class,0);
		}
		public SeleccionmultipleContext seleccionmultiple() {
			return getRuleContext(SeleccionmultipleContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public RepetirContext repetir() {
			return getRuleContext(RepetirContext.class,0);
		}
		public LazosparaContext lazospara() {
			return getRuleContext(LazosparaContext.class,0);
		}
		public DefinirContext definir() {
			return getRuleContext(DefinirContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SI:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				condicional();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				asignacion();
				}
				break;
			case LEER:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				entrada();
				}
				break;
			case ESCRIBIR:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				salidas();
				}
				break;
			case DIMENSION:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				dimensionamiento();
				}
				break;
			case SEGUN:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				seleccionmultiple();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 7);
				{
				setState(82);
				mientras();
				}
				break;
			case REPETIR:
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				repetir();
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 9);
				{
				setState(84);
				lazospara();
				}
				break;
			case DEFINIR:
				enterOuterAlt(_localctx, 10);
				{
				setState(85);
				definir();
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

	public static class DefinirContext extends ParserRuleContext {
		public TerminalNode DEFINIR() { return getToken(PseudocodigoParser.DEFINIR, 0); }
		public TerminalNode ID() { return getToken(PseudocodigoParser.ID, 0); }
		public TerminalNode COMO() { return getToken(PseudocodigoParser.COMO, 0); }
		public TerminalNode TIPO() { return getToken(PseudocodigoParser.TIPO, 0); }
		public DefinirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definir; }
	}

	public final DefinirContext definir() throws RecognitionException {
		DefinirContext _localctx = new DefinirContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(DEFINIR);
			setState(89);
			match(ID);
			setState(90);
			match(COMO);
			setState(91);
			match(TIPO);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseudocodigoParser.ID, 0); }
		public TerminalNode FLECHA() { return getToken(PseudocodigoParser.FLECHA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ID);
			setState(94);
			match(FLECHA);
			setState(95);
			expr(0);
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

	public static class EntradaContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(PseudocodigoParser.LEER, 0); }
		public TerminalNode ID() { return getToken(PseudocodigoParser.ID, 0); }
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(LEER);
			setState(98);
			match(ID);
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

	public static class SalidasContext extends ParserRuleContext {
		public TerminalNode ESCRIBIR() { return getToken(PseudocodigoParser.ESCRIBIR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SalidasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salidas; }
	}

	public final SalidasContext salidas() throws RecognitionException {
		SalidasContext _localctx = new SalidasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_salidas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ESCRIBIR);
			setState(101);
			expr(0);
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

	public static class DimensionamientoContext extends ParserRuleContext {
		public TerminalNode DIMENSION() { return getToken(PseudocodigoParser.DIMENSION, 0); }
		public TerminalNode ID() { return getToken(PseudocodigoParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public DimensionamientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionamiento; }
	}

	public final DimensionamientoContext dimensionamiento() throws RecognitionException {
		DimensionamientoContext _localctx = new DimensionamientoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dimensionamiento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(DIMENSION);
			setState(104);
			match(ID);
			setState(105);
			array();
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

	public static class CondicionalContext extends ParserRuleContext {
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public TerminalNode CIERRASI() { return getToken(PseudocodigoParser.CIERRASI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public List<SinoContext> sino() {
			return getRuleContexts(SinoContext.class);
		}
		public SinoContext sino(int i) {
			return getRuleContext(SinoContext.class,i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			si();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << DEFINIR) | (1L << DIMENSION) | (1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << SEGUN) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FLOAT - 66)) | (1L << (INT - 66)) | (1L << (BOOL - 66)) | (1L << (STRING - 66)) | (1L << (ID - 66)) | (1L << (PI - 66)) | (1L << (CI - 66)))) != 0)) {
				{
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(108);
					expr(0);
					}
					break;
				case 2:
					{
					setState(109);
					instrucciones();
					}
					break;
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINO) {
				{
				{
				setState(115);
				sino();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << DEFINIR) | (1L << DIMENSION) | (1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << SEGUN) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FLOAT - 66)) | (1L << (INT - 66)) | (1L << (BOOL - 66)) | (1L << (STRING - 66)) | (1L << (ID - 66)) | (1L << (PI - 66)) | (1L << (CI - 66)))) != 0)) {
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(116);
						expr(0);
						}
						break;
					case 2:
						{
						setState(117);
						instrucciones();
						}
						break;
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(CIERRASI);
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

	public static class SinoContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(PseudocodigoParser.SINO, 0); }
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public SinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sino; }
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(SINO);
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(131);
				si();
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

	public static class SiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(PseudocodigoParser.SI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENTONCES() { return getToken(PseudocodigoParser.ENTONCES, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(SI);
			setState(135);
			expr(0);
			setState(136);
			match(ENTONCES);
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

	public static class SeleccionmultipleContext extends ParserRuleContext {
		public TerminalNode SEGUN() { return getToken(PseudocodigoParser.SEGUN, 0); }
		public TerminalNode ID() { return getToken(PseudocodigoParser.ID, 0); }
		public TerminalNode HACER() { return getToken(PseudocodigoParser.HACER, 0); }
		public DeotromodoContext deotromodo() {
			return getRuleContext(DeotromodoContext.class,0);
		}
		public TerminalNode FINSEGUN() { return getToken(PseudocodigoParser.FINSEGUN, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public SeleccionmultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccionmultiple; }
	}

	public final SeleccionmultipleContext seleccionmultiple() throws RecognitionException {
		SeleccionmultipleContext _localctx = new SeleccionmultipleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_seleccionmultiple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(SEGUN);
			setState(139);
			match(ID);
			setState(140);
			match(HACER);
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				instruccion();
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FLOAT - 66)) | (1L << (INT - 66)) | (1L << (BOOL - 66)) | (1L << (STRING - 66)) | (1L << (ID - 66)) | (1L << (PI - 66)) | (1L << (CI - 66)))) != 0) );
			setState(146);
			deotromodo();
			setState(147);
			match(FINSEGUN);
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

	public static class InstruccionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instruccion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			expr(0);
			setState(150);
			match(T__0);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(151);
						expr(0);
						}
						break;
					case 2:
						{
						setState(152);
						instrucciones();
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class DeotromodoContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public DeotromodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deotromodo; }
	}

	public final DeotromodoContext deotromodo() throws RecognitionException {
		DeotromodoContext _localctx = new DeotromodoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_deotromodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			match(T__0);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << DEFINIR) | (1L << DIMENSION) | (1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << SEGUN) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FLOAT - 66)) | (1L << (INT - 66)) | (1L << (BOOL - 66)) | (1L << (STRING - 66)) | (1L << (ID - 66)) | (1L << (PI - 66)) | (1L << (CI - 66)))) != 0)) {
				{
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(160);
					expr(0);
					}
					break;
				case 2:
					{
					setState(161);
					instrucciones();
					}
					break;
				}
				}
				setState(166);
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(PseudocodigoParser.MIENTRAS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode HACER() { return getToken(PseudocodigoParser.HACER, 0); }
		public TerminalNode FINMIENTRAS() { return getToken(PseudocodigoParser.FINMIENTRAS, 0); }
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(MIENTRAS);
			setState(168);
			expr(0);
			setState(169);
			match(HACER);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << DEFINIR) | (1L << DIMENSION) | (1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << SEGUN) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FLOAT - 66)) | (1L << (INT - 66)) | (1L << (BOOL - 66)) | (1L << (STRING - 66)) | (1L << (ID - 66)) | (1L << (PI - 66)) | (1L << (CI - 66)))) != 0)) {
				{
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(170);
					expr(0);
					}
					break;
				case 2:
					{
					setState(171);
					instrucciones();
					}
					break;
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(FINMIENTRAS);
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

	public static class RepetirContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(PseudocodigoParser.REPETIR, 0); }
		public HastaqueContext hastaque() {
			return getRuleContext(HastaqueContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public RepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetir; }
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(REPETIR);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << DEFINIR) | (1L << DIMENSION) | (1L << LEER) | (1L << ESCRIBIR) | (1L << SI) | (1L << SEGUN) | (1L << MIENTRAS) | (1L << REPETIR) | (1L << PARA))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FLOAT - 66)) | (1L << (INT - 66)) | (1L << (BOOL - 66)) | (1L << (STRING - 66)) | (1L << (ID - 66)) | (1L << (PI - 66)) | (1L << (CI - 66)))) != 0)) {
				{
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(180);
					expr(0);
					}
					break;
				case 2:
					{
					setState(181);
					instrucciones();
					}
					break;
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			hastaque();
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

	public static class HastaqueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HastaqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hastaque; }
	}

	public final HastaqueContext hastaque() throws RecognitionException {
		HastaqueContext _localctx = new HastaqueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_hastaque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(190);
			expr(0);
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

	public static class LazosparaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(PseudocodigoParser.PARA, 0); }
		public TerminalNode ID() { return getToken(PseudocodigoParser.ID, 0); }
		public TerminalNode FLECHA() { return getToken(PseudocodigoParser.FLECHA, 0); }
		public List<TerminalNode> INT() { return getTokens(PseudocodigoParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(PseudocodigoParser.INT, i);
		}
		public TerminalNode HASTA() { return getToken(PseudocodigoParser.HASTA, 0); }
		public TerminalNode HACER() { return getToken(PseudocodigoParser.HACER, 0); }
		public TerminalNode FINPARA() { return getToken(PseudocodigoParser.FINPARA, 0); }
		public List<TerminalNode> CONPASO() { return getTokens(PseudocodigoParser.CONPASO); }
		public TerminalNode CONPASO(int i) {
			return getToken(PseudocodigoParser.CONPASO, i);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public LazosparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazospara; }
	}

	public final LazosparaContext lazospara() throws RecognitionException {
		LazosparaContext _localctx = new LazosparaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lazospara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(PARA);
			setState(193);
			match(ID);
			setState(194);
			match(FLECHA);
			setState(195);
			match(INT);
			setState(196);
			match(HASTA);
			setState(197);
			match(INT);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONPASO) {
				{
				{
				setState(198);
				match(CONPASO);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(HACER);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (DEFINIR - 30)) | (1L << (DIMENSION - 30)) | (1L << (LEER - 30)) | (1L << (ESCRIBIR - 30)) | (1L << (SI - 30)) | (1L << (SEGUN - 30)) | (1L << (MIENTRAS - 30)) | (1L << (REPETIR - 30)) | (1L << (PARA - 30)) | (1L << (ID - 30)))) != 0)) {
				{
				{
				setState(205);
				instrucciones();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(FINPARA);
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

	public static class InvocafuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PseudocodigoParser.ID, 0); }
		public TerminalNode PI() { return getToken(PseudocodigoParser.PI, 0); }
		public TerminalNode PD() { return getToken(PseudocodigoParser.PD, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InvocafuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocafuncion; }
	}

	public final InvocafuncionContext invocafuncion() throws RecognitionException {
		InvocafuncionContext _localctx = new InvocafuncionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_invocafuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(ID);
			setState(214);
			match(PI);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (FLOAT - 66)) | (1L << (INT - 66)) | (1L << (BOOL - 66)) | (1L << (STRING - 66)) | (1L << (ID - 66)) | (1L << (PI - 66)) | (1L << (CI - 66)))) != 0)) {
				{
				{
				setState(215);
				expr(0);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(PD);
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

	public static class InicioContext extends ParserRuleContext {
		public TerminalNode INI() { return getToken(PseudocodigoParser.INI, 0); }
		public TerminalNode ID() { return getToken(PseudocodigoParser.ID, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(INI);
			setState(224);
			match(ID);
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

	public static class ExprContext extends ParserRuleContext {
		public OperadorfunContext operadorfun() {
			return getRuleContext(OperadorfunContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(PseudocodigoParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PseudocodigoParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(PseudocodigoParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(PseudocodigoParser.STRING, 0); }
		public TerminalNode ID() { return getToken(PseudocodigoParser.ID, 0); }
		public TerminalNode PI() { return getToken(PseudocodigoParser.PI, 0); }
		public TerminalNode PD() { return getToken(PseudocodigoParser.PD, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public InvocafuncionContext invocafuncion() {
			return getRuleContext(InvocafuncionContext.class,0);
		}
		public TerminalNode OPERADORALGE() { return getToken(PseudocodigoParser.OPERADORALGE, 0); }
		public TerminalNode OPERADORLOG() { return getToken(PseudocodigoParser.OPERADORLOG, 0); }
		public TerminalNode OPERADORREL() { return getToken(PseudocodigoParser.OPERADORREL, 0); }
		public TerminalNode OPERADORSEPARADOR() { return getToken(PseudocodigoParser.OPERADORSEPARADOR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(227);
				operadorfun();
				setState(228);
				expr(9);
				}
				break;
			case 2:
				{
				setState(230);
				match(INT);
				}
				break;
			case 3:
				{
				setState(231);
				match(FLOAT);
				}
				break;
			case 4:
				{
				setState(232);
				match(BOOL);
				}
				break;
			case 5:
				{
				setState(233);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(234);
				match(ID);
				}
				break;
			case 7:
				{
				setState(235);
				match(PI);
				setState(236);
				expr(0);
				setState(237);
				match(PD);
				}
				break;
			case 8:
				{
				setState(239);
				array();
				}
				break;
			case 9:
				{
				setState(240);
				invocafuncion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(243);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(244);
						match(OPERADORALGE);
						setState(245);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(246);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(247);
						match(OPERADORLOG);
						setState(248);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(249);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(250);
						match(OPERADORREL);
						setState(251);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(253);
						match(OPERADORSEPARADOR);
						setState(254);
						expr(11);
						}
						break;
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class OperadorfunContext extends ParserRuleContext {
		public RaizcuadradaContext raizcuadrada() {
			return getRuleContext(RaizcuadradaContext.class,0);
		}
		public ValorabsolutoContext valorabsoluto() {
			return getRuleContext(ValorabsolutoContext.class,0);
		}
		public LogaritmonaturalContext logaritmonatural() {
			return getRuleContext(LogaritmonaturalContext.class,0);
		}
		public FuncionexponencialContext funcionexponencial() {
			return getRuleContext(FuncionexponencialContext.class,0);
		}
		public SenoContext seno() {
			return getRuleContext(SenoContext.class,0);
		}
		public CosenoContext coseno() {
			return getRuleContext(CosenoContext.class,0);
		}
		public ArcotangenteContext arcotangente() {
			return getRuleContext(ArcotangenteContext.class,0);
		}
		public ParteenteraContext parteentera() {
			return getRuleContext(ParteenteraContext.class,0);
		}
		public RedondearContext redondear() {
			return getRuleContext(RedondearContext.class,0);
		}
		public AleatorioContext aleatorio() {
			return getRuleContext(AleatorioContext.class,0);
		}
		public OperadorfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorfun; }
	}

	public final OperadorfunContext operadorfun() throws RecognitionException {
		OperadorfunContext _localctx = new OperadorfunContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_operadorfun);
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				raizcuadrada();
				}
				break;
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				valorabsoluto();
				}
				break;
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				logaritmonatural();
				}
				break;
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				funcionexponencial();
				}
				break;
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
				seno();
				}
				break;
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(265);
				coseno();
				}
				break;
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 7);
				{
				setState(266);
				arcotangente();
				}
				break;
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 8);
				{
				setState(267);
				parteentera();
				}
				break;
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 9);
				{
				setState(268);
				redondear();
				}
				break;
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 10);
				{
				setState(269);
				aleatorio();
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

	public static class RaizcuadradaContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(PseudocodigoParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(PseudocodigoParser.PD, 0); }
		public RaizcuadradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raizcuadrada; }
	}

	public final RaizcuadradaContext raizcuadrada() throws RecognitionException {
		RaizcuadradaContext _localctx = new RaizcuadradaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_raizcuadrada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(273);
			match(PI);
			setState(274);
			expr(0);
			setState(275);
			match(PD);
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

	public static class ValorabsolutoContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(PseudocodigoParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(PseudocodigoParser.PD, 0); }
		public ValorabsolutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorabsoluto; }
	}

	public final ValorabsolutoContext valorabsoluto() throws RecognitionException {
		ValorabsolutoContext _localctx = new ValorabsolutoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_valorabsoluto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(278);
			match(PI);
			setState(279);
			expr(0);
			setState(280);
			match(PD);
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

	public static class LogaritmonaturalContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(PseudocodigoParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(PseudocodigoParser.PD, 0); }
		public LogaritmonaturalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logaritmonatural; }
	}

	public final LogaritmonaturalContext logaritmonatural() throws RecognitionException {
		LogaritmonaturalContext _localctx = new LogaritmonaturalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logaritmonatural);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(283);
			match(PI);
			setState(284);
			expr(0);
			setState(285);
			match(PD);
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

	public static class FuncionexponencialContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(PseudocodigoParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(PseudocodigoParser.PD, 0); }
		public FuncionexponencialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionexponencial; }
	}

	public final FuncionexponencialContext funcionexponencial() throws RecognitionException {
		FuncionexponencialContext _localctx = new FuncionexponencialContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_funcionexponencial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(288);
			match(PI);
			setState(289);
			expr(0);
			setState(290);
			match(PD);
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

	public static class SenoContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(PseudocodigoParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(PseudocodigoParser.PD, 0); }
		public SenoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seno; }
	}

	public final SenoContext seno() throws RecognitionException {
		SenoContext _localctx = new SenoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_seno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(293);
			match(PI);
			setState(294);
			expr(0);
			setState(295);
			match(PD);
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

	public static class CosenoContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(PseudocodigoParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(PseudocodigoParser.PD, 0); }
		public CosenoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coseno; }
	}

	public final CosenoContext coseno() throws RecognitionException {
		CosenoContext _localctx = new CosenoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_coseno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(298);
			match(PI);
			setState(299);
			expr(0);
			setState(300);
			match(PD);
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

	public static class ArcotangenteContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(PseudocodigoParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(PseudocodigoParser.PD, 0); }
		public ArcotangenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arcotangente; }
	}

	public final ArcotangenteContext arcotangente() throws RecognitionException {
		ArcotangenteContext _localctx = new ArcotangenteContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arcotangente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(303);
			match(PI);
			setState(304);
			expr(0);
			setState(305);
			match(PD);
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

	public static class ParteenteraContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(PseudocodigoParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(PseudocodigoParser.PD, 0); }
		public ParteenteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parteentera; }
	}

	public final ParteenteraContext parteentera() throws RecognitionException {
		ParteenteraContext _localctx = new ParteenteraContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parteentera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(308);
			match(PI);
			setState(309);
			expr(0);
			setState(310);
			match(PD);
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

	public static class RedondearContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(PseudocodigoParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(PseudocodigoParser.PD, 0); }
		public RedondearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redondear; }
	}

	public final RedondearContext redondear() throws RecognitionException {
		RedondearContext _localctx = new RedondearContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_redondear);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==T__24) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(313);
			match(PI);
			setState(314);
			expr(0);
			setState(315);
			match(PD);
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

	public static class AleatorioContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(PseudocodigoParser.PI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PD() { return getToken(PseudocodigoParser.PD, 0); }
		public AleatorioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aleatorio; }
	}

	public final AleatorioContext aleatorio() throws RecognitionException {
		AleatorioContext _localctx = new AleatorioContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_aleatorio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(318);
			match(PI);
			setState(319);
			expr(0);
			setState(320);
			match(PD);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PI() { return getToken(PseudocodigoParser.PI, 0); }
		public TerminalNode CI() { return getToken(PseudocodigoParser.CI, 0); }
		public TerminalNode PD() { return getToken(PseudocodigoParser.PD, 0); }
		public TerminalNode CD() { return getToken(PseudocodigoParser.CD, 0); }
		public List<TerminalNode> COMA() { return getTokens(PseudocodigoParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(PseudocodigoParser.COMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==PI || _la==CI) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(323);
			expr(0);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(324);
				match(COMA);
				setState(325);
				expr(0);
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
			_la = _input.LA(1);
			if ( !(_la==PD || _la==CD) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Q\u0150\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\5\2M\n\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Y\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tq\n\t\f\t\16"+
		"\tt\13\t\3\t\3\t\3\t\7\ty\n\t\f\t\16\t|\13\t\7\t~\n\t\f\t\16\t\u0081\13"+
		"\t\3\t\3\t\3\n\3\n\5\n\u0087\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\6"+
		"\f\u0091\n\f\r\f\16\f\u0092\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u009c\n\r"+
		"\f\r\16\r\u009f\13\r\3\16\3\16\3\16\3\16\7\16\u00a5\n\16\f\16\16\16\u00a8"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\7\17\u00af\n\17\f\17\16\17\u00b2\13\17"+
		"\3\17\3\17\3\20\3\20\3\20\7\20\u00b9\n\20\f\20\16\20\u00bc\13\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00ca\n\22"+
		"\f\22\16\22\u00cd\13\22\3\22\3\22\7\22\u00d1\n\22\f\22\16\22\u00d4\13"+
		"\22\3\22\3\22\3\23\3\23\3\23\7\23\u00db\n\23\f\23\16\23\u00de\13\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f4\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0102\n\25\f\25\16\25\u0105\13"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0111\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\7!\u0149\n!\f!\16!\u014c\13"+
		"!\3!\3!\3!\2\3(\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@\2\20\3\2\4\6\3\2\7\t\3\2\n\13\3\2\f\r\3\2\16\17\3\2\20\21"+
		"\3\2\22\23\3\2\24\25\3\2\26\27\3\2\30\31\3\2\32\33\3\2\34\35\4\2IIKK\4"+
		"\2JJLL\2\u0163\2L\3\2\2\2\4X\3\2\2\2\6Z\3\2\2\2\b_\3\2\2\2\nc\3\2\2\2"+
		"\ff\3\2\2\2\16i\3\2\2\2\20m\3\2\2\2\22\u0084\3\2\2\2\24\u0088\3\2\2\2"+
		"\26\u008c\3\2\2\2\30\u0097\3\2\2\2\32\u00a0\3\2\2\2\34\u00a9\3\2\2\2\36"+
		"\u00b5\3\2\2\2 \u00bf\3\2\2\2\"\u00c2\3\2\2\2$\u00d7\3\2\2\2&\u00e1\3"+
		"\2\2\2(\u00f3\3\2\2\2*\u0110\3\2\2\2,\u0112\3\2\2\2.\u0117\3\2\2\2\60"+
		"\u011c\3\2\2\2\62\u0121\3\2\2\2\64\u0126\3\2\2\2\66\u012b\3\2\2\28\u0130"+
		"\3\2\2\2:\u0135\3\2\2\2<\u013a\3\2\2\2>\u013f\3\2\2\2@\u0144\3\2\2\2B"+
		"G\5&\24\2CF\5(\25\2DF\5\4\3\2EC\3\2\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2"+
		"GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\36\2\2KM\3\2\2\2LB\3\2\2\2LM\3\2\2"+
		"\2M\3\3\2\2\2NY\5\20\t\2OY\5\b\5\2PY\5\n\6\2QY\5\f\7\2RY\5\16\b\2SY\5"+
		"\26\f\2TY\5\34\17\2UY\5\36\20\2VY\5\"\22\2WY\5\6\4\2XN\3\2\2\2XO\3\2\2"+
		"\2XP\3\2\2\2XQ\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2"+
		"\2XW\3\2\2\2Y\5\3\2\2\2Z[\7 \2\2[\\\7H\2\2\\]\7!\2\2]^\7C\2\2^\7\3\2\2"+
		"\2_`\7H\2\2`a\7\"\2\2ab\5(\25\2b\t\3\2\2\2cd\7$\2\2de\7H\2\2e\13\3\2\2"+
		"\2fg\7%\2\2gh\5(\25\2h\r\3\2\2\2ij\7#\2\2jk\7H\2\2kl\5@!\2l\17\3\2\2\2"+
		"mr\5\24\13\2nq\5(\25\2oq\5\4\3\2pn\3\2\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2"+
		"\2rs\3\2\2\2s\177\3\2\2\2tr\3\2\2\2uz\5\22\n\2vy\5(\25\2wy\5\4\3\2xv\3"+
		"\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}u\3"+
		"\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0082\u0083\7&\2\2\u0083\21\3\2\2\2\u0084\u0086\7"+
		"\'\2\2\u0085\u0087\5\24\13\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\23\3\2\2\2\u0088\u0089\7)\2\2\u0089\u008a\5(\25\2\u008a\u008b\7(\2\2"+
		"\u008b\25\3\2\2\2\u008c\u008d\7+\2\2\u008d\u008e\7H\2\2\u008e\u0090\7"+
		",\2\2\u008f\u0091\5\30\r\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5\32"+
		"\16\2\u0095\u0096\7*\2\2\u0096\27\3\2\2\2\u0097\u0098\5(\25\2\u0098\u009d"+
		"\7\3\2\2\u0099\u009c\5(\25\2\u009a\u009c\5\4\3\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\31\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\t\2\2\2\u00a1\u00a6"+
		"\7\3\2\2\u00a2\u00a5\5(\25\2\u00a3\u00a5\5\4\3\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\33\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7.\2\2\u00aa\u00ab"+
		"\5(\25\2\u00ab\u00b0\7,\2\2\u00ac\u00af\5(\25\2\u00ad\u00af\5\4\3\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b4\7-\2\2\u00b4\35\3\2\2\2\u00b5\u00ba\7/\2\2\u00b6\u00b9\5(\25\2"+
		"\u00b7\u00b9\5\4\3\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\5 \21\2\u00be\37\3\2\2\2\u00bf\u00c0\t\3\2"+
		"\2\u00c0\u00c1\5(\25\2\u00c1!\3\2\2\2\u00c2\u00c3\7\61\2\2\u00c3\u00c4"+
		"\7H\2\2\u00c4\u00c5\7\"\2\2\u00c5\u00c6\7E\2\2\u00c6\u00c7\7\62\2\2\u00c7"+
		"\u00cb\7E\2\2\u00c8\u00ca\7\63\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00d2\7,\2\2\u00cf\u00d1\5\4\3\2\u00d0\u00cf\3\2"+
		"\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\60\2\2\u00d6#\3\2\2\2"+
		"\u00d7\u00d8\7H\2\2\u00d8\u00dc\7I\2\2\u00d9\u00db\5(\25\2\u00da\u00d9"+
		"\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7J\2\2\u00e0%\3\2\2\2\u00e1"+
		"\u00e2\7\37\2\2\u00e2\u00e3\7H\2\2\u00e3\'\3\2\2\2\u00e4\u00e5\b\25\1"+
		"\2\u00e5\u00e6\5*\26\2\u00e6\u00e7\5(\25\13\u00e7\u00f4\3\2\2\2\u00e8"+
		"\u00f4\7E\2\2\u00e9\u00f4\7D\2\2\u00ea\u00f4\7F\2\2\u00eb\u00f4\7G\2\2"+
		"\u00ec\u00f4\7H\2\2\u00ed\u00ee\7I\2\2\u00ee\u00ef\5(\25\2\u00ef\u00f0"+
		"\7J\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f4\5@!\2\u00f2\u00f4\5$\23\2\u00f3"+
		"\u00e4\3\2\2\2\u00f3\u00e8\3\2\2\2\u00f3\u00e9\3\2\2\2\u00f3\u00ea\3\2"+
		"\2\2\u00f3\u00eb\3\2\2\2\u00f3\u00ec\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u0103\3\2\2\2\u00f5\u00f6\f\17"+
		"\2\2\u00f6\u00f7\79\2\2\u00f7\u0102\5(\25\20\u00f8\u00f9\f\16\2\2\u00f9"+
		"\u00fa\7\65\2\2\u00fa\u0102\5(\25\17\u00fb\u00fc\f\r\2\2\u00fc\u00fd\7"+
		"\64\2\2\u00fd\u0102\5(\25\16\u00fe\u00ff\f\f\2\2\u00ff\u0100\7@\2\2\u0100"+
		"\u0102\5(\25\r\u0101\u00f5\3\2\2\2\u0101\u00f8\3\2\2\2\u0101\u00fb\3\2"+
		"\2\2\u0101\u00fe\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104)\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0111\5,\27\2"+
		"\u0107\u0111\5.\30\2\u0108\u0111\5\60\31\2\u0109\u0111\5\62\32\2\u010a"+
		"\u0111\5\64\33\2\u010b\u0111\5\66\34\2\u010c\u0111\58\35\2\u010d\u0111"+
		"\5:\36\2\u010e\u0111\5<\37\2\u010f\u0111\5> \2\u0110\u0106\3\2\2\2\u0110"+
		"\u0107\3\2\2\2\u0110\u0108\3\2\2\2\u0110\u0109\3\2\2\2\u0110\u010a\3\2"+
		"\2\2\u0110\u010b\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u010d\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111+\3\2\2\2\u0112\u0113\t\4\2\2"+
		"\u0113\u0114\7I\2\2\u0114\u0115\5(\25\2\u0115\u0116\7J\2\2\u0116-\3\2"+
		"\2\2\u0117\u0118\t\5\2\2\u0118\u0119\7I\2\2\u0119\u011a\5(\25\2\u011a"+
		"\u011b\7J\2\2\u011b/\3\2\2\2\u011c\u011d\t\6\2\2\u011d\u011e\7I\2\2\u011e"+
		"\u011f\5(\25\2\u011f\u0120\7J\2\2\u0120\61\3\2\2\2\u0121\u0122\t\7\2\2"+
		"\u0122\u0123\7I\2\2\u0123\u0124\5(\25\2\u0124\u0125\7J\2\2\u0125\63\3"+
		"\2\2\2\u0126\u0127\t\b\2\2\u0127\u0128\7I\2\2\u0128\u0129\5(\25\2\u0129"+
		"\u012a\7J\2\2\u012a\65\3\2\2\2\u012b\u012c\t\t\2\2\u012c\u012d\7I\2\2"+
		"\u012d\u012e\5(\25\2\u012e\u012f\7J\2\2\u012f\67\3\2\2\2\u0130\u0131\t"+
		"\n\2\2\u0131\u0132\7I\2\2\u0132\u0133\5(\25\2\u0133\u0134\7J\2\2\u0134"+
		"9\3\2\2\2\u0135\u0136\t\13\2\2\u0136\u0137\7I\2\2\u0137\u0138\5(\25\2"+
		"\u0138\u0139\7J\2\2\u0139;\3\2\2\2\u013a\u013b\t\f\2\2\u013b\u013c\7I"+
		"\2\2\u013c\u013d\5(\25\2\u013d\u013e\7J\2\2\u013e=\3\2\2\2\u013f\u0140"+
		"\t\r\2\2\u0140\u0141\7I\2\2\u0141\u0142\5(\25\2\u0142\u0143\7J\2\2\u0143"+
		"?\3\2\2\2\u0144\u0145\t\16\2\2\u0145\u014a\5(\25\2\u0146\u0147\7A\2\2"+
		"\u0147\u0149\5(\25\2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d"+
		"\u014e\t\17\2\2\u014eA\3\2\2\2\35EGLXprxz\177\u0086\u0092\u009b\u009d"+
		"\u00a4\u00a6\u00ae\u00b0\u00b8\u00ba\u00cb\u00d2\u00dc\u00f3\u0101\u0103"+
		"\u0110\u014a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}