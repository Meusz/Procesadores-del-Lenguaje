// Generated from c:\antlr\gramaticas\gPseudocodigoParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gPseudocodigoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FIN=1, INI=2, DEFINIR=3, COMO=4, FLECHA=5, DIMENSION=6, LEER=7, ESCRIBIR=8, 
		CIERRASI=9, SINO=10, ENTONCES=11, SI=12, DEOTROMODO=13, FINSEGUN=14, SEGUN=15, 
		HACER=16, FINMIENTRAS=17, MIENTRAS=18, REPETIR=19, HASTAQUE=20, FINPARA=21, 
		PARA=22, HASTA=23, CONPASO=24, FUNCION=25, FINFUNCION=26, MAYORQUE=27, 
		MENORQUE=28, IGUALQUE=29, MENORIGUALQUE=30, MAYORIGUALQUE=31, CONJUNCION=32, 
		DISYUNCION=33, NEGACION=34, SUMA=35, RESTA=36, MULTIPLICACION=37, DIVISION=38, 
		POTENCIACION=39, MODULO=40, COMA=41, BARRABAJA=42, RC=43, ABS=44, LN=45, 
		EXP=46, SEN=47, COS=48, ATAN=49, TRUNC=50, REDON=51, AZAR=52, TIPO=53, 
		FLOAT=54, INT=55, BOOL=56, STRING=57, PI=58, PD=59, CI=60, CD=61, DOSPUNTOS=62, 
		PUNTOCOMA=63, ID=64, COMENTARIO_LINEA=65, COMENTARIO_BLOQUE=66, WS=67, 
		NEWLINE=68, SPACE=69;
	public static final int
		RULE_prog = 0, RULE_main = 1, RULE_instrucciones = 2, RULE_definir = 3, 
		RULE_asignacion = 4, RULE_entrada = 5, RULE_salidas = 6, RULE_dimensionamiento = 7, 
		RULE_condicional = 8, RULE_sino = 9, RULE_si = 10, RULE_seleccionmultiple = 11, 
		RULE_instruccion = 12, RULE_deotromodo = 13, RULE_mientras = 14, RULE_repetir = 15, 
		RULE_hastaque = 16, RULE_lazospara = 17, RULE_deffuncion = 18, RULE_exprlogica = 19, 
		RULE_expr = 20, RULE_array = 21, RULE_kwinicio = 22, RULE_kwfin = 23, 
		RULE_kwini = 24, RULE_kwdefinir = 25, RULE_kwcomo = 26, RULE_kwflecha = 27, 
		RULE_kwdimension = 28, RULE_kwleer = 29, RULE_kwescribir = 30, RULE_kwcierrasi = 31, 
		RULE_kwsino = 32, RULE_kwentonces = 33, RULE_kwsi = 34, RULE_kwdeotromodo = 35, 
		RULE_kwfinsegun = 36, RULE_kwsegun = 37, RULE_kwhacer = 38, RULE_kwfinmientras = 39, 
		RULE_kwmientras = 40, RULE_kwrepetir = 41, RULE_kwhastaque = 42, RULE_kwfinpara = 43, 
		RULE_kwpara = 44, RULE_kwhasta = 45, RULE_kwconpaso = 46, RULE_kwfuncion = 47, 
		RULE_invocafuncion = 48, RULE_kwfinfuncion = 49, RULE_operadorrel = 50, 
		RULE_operadorlog = 51, RULE_conjuncion = 52, RULE_disyuncion = 53, RULE_negacion = 54, 
		RULE_operadoralge = 55, RULE_igual = 56, RULE_suma = 57, RULE_resta = 58, 
		RULE_multiplicacion = 59, RULE_division = 60, RULE_potenciacion = 61, 
		RULE_modulo = 62, RULE_operadorseparador = 63, RULE_coma = 64, RULE_barrabaja = 65, 
		RULE_funciones = 66, RULE_rc = 67, RULE_abs = 68, RULE_ln = 69, RULE_exp = 70, 
		RULE_sen = 71, RULE_cos = 72, RULE_atan = 73, RULE_trunc = 74, RULE_redon = 75, 
		RULE_azar = 76, RULE_tipo = 77, RULE_real = 78, RULE_entero = 79, RULE_bool = 80, 
		RULE_string = 81, RULE_id = 82, RULE_comentario = 83, RULE_dospuntos = 84, 
		RULE_pi = 85, RULE_pd = 86, RULE_ci = 87, RULE_cd = 88, RULE_puntoycoma = 89;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "main", "instrucciones", "definir", "asignacion", "entrada", 
			"salidas", "dimensionamiento", "condicional", "sino", "si", "seleccionmultiple", 
			"instruccion", "deotromodo", "mientras", "repetir", "hastaque", "lazospara", 
			"deffuncion", "exprlogica", "expr", "array", "kwinicio", "kwfin", "kwini", 
			"kwdefinir", "kwcomo", "kwflecha", "kwdimension", "kwleer", "kwescribir", 
			"kwcierrasi", "kwsino", "kwentonces", "kwsi", "kwdeotromodo", "kwfinsegun", 
			"kwsegun", "kwhacer", "kwfinmientras", "kwmientras", "kwrepetir", "kwhastaque", 
			"kwfinpara", "kwpara", "kwhasta", "kwconpaso", "kwfuncion", "invocafuncion", 
			"kwfinfuncion", "operadorrel", "operadorlog", "conjuncion", "disyuncion", 
			"negacion", "operadoralge", "igual", "suma", "resta", "multiplicacion", 
			"division", "potenciacion", "modulo", "operadorseparador", "coma", "barrabaja", 
			"funciones", "rc", "abs", "ln", "exp", "sen", "cos", "atan", "trunc", 
			"redon", "azar", "tipo", "real", "entero", "bool", "string", "id", "comentario", 
			"dospuntos", "pi", "pd", "ci", "cd", "puntoycoma"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'<-'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'>'", "'<'", "'='", "'<='", "'>='", null, null, null, 
			"'+'", "'-'", "'*'", "'/'", "'^'", null, "','", "'_'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'('", "')'", "'['", "']'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FIN", "INI", "DEFINIR", "COMO", "FLECHA", "DIMENSION", "LEER", 
			"ESCRIBIR", "CIERRASI", "SINO", "ENTONCES", "SI", "DEOTROMODO", "FINSEGUN", 
			"SEGUN", "HACER", "FINMIENTRAS", "MIENTRAS", "REPETIR", "HASTAQUE", "FINPARA", 
			"PARA", "HASTA", "CONPASO", "FUNCION", "FINFUNCION", "MAYORQUE", "MENORQUE", 
			"IGUALQUE", "MENORIGUALQUE", "MAYORIGUALQUE", "CONJUNCION", "DISYUNCION", 
			"NEGACION", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "POTENCIACION", 
			"MODULO", "COMA", "BARRABAJA", "RC", "ABS", "LN", "EXP", "SEN", "COS", 
			"ATAN", "TRUNC", "REDON", "AZAR", "TIPO", "FLOAT", "INT", "BOOL", "STRING", 
			"PI", "PD", "CI", "CD", "DOSPUNTOS", "PUNTOCOMA", "ID", "COMENTARIO_LINEA", 
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
	public String getGrammarFileName() { return "gPseudocodigoParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gPseudocodigoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<MainContext> main() {
			return getRuleContexts(MainContext.class);
		}
		public MainContext main(int i) {
			return getRuleContext(MainContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public List<DeffuncionContext> deffuncion() {
			return getRuleContexts(DeffuncionContext.class);
		}
		public DeffuncionContext deffuncion(int i) {
			return getRuleContext(DeffuncionContext.class,i);
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
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INI || _la==FUNCION || _la==COMENTARIO_LINEA || _la==COMENTARIO_BLOQUE) {
				{
				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INI:
					{
					setState(180);
					main();
					}
					break;
				case COMENTARIO_LINEA:
				case COMENTARIO_BLOQUE:
					{
					setState(181);
					comentario();
					}
					break;
				case FUNCION:
					{
					setState(182);
					deffuncion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(187);
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

	public static class MainContext extends ParserRuleContext {
		public KwinicioContext kwinicio() {
			return getRuleContext(KwinicioContext.class,0);
		}
		public KwfinContext kwfin() {
			return getRuleContext(KwfinContext.class,0);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			kwinicio();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)) | (1L << (COMENTARIO_LINEA - 3)) | (1L << (COMENTARIO_BLOQUE - 3)))) != 0)) {
				{
				setState(191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFINIR:
				case DIMENSION:
				case LEER:
				case ESCRIBIR:
				case SI:
				case SEGUN:
				case MIENTRAS:
				case REPETIR:
				case PARA:
				case RC:
				case ABS:
				case LN:
				case EXP:
				case SEN:
				case COS:
				case ATAN:
				case TRUNC:
				case REDON:
				case AZAR:
				case FLOAT:
				case INT:
				case BOOL:
				case STRING:
				case PI:
				case CI:
				case ID:
					{
					setState(189);
					instrucciones();
					}
					break;
				case COMENTARIO_LINEA:
				case COMENTARIO_BLOQUE:
					{
					setState(190);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			kwfin();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		public PuntoycomaContext puntoycoma() {
			return getRuleContext(PuntoycomaContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(198);
				expr(0);
				}
				break;
			case 2:
				{
				setState(199);
				condicional();
				}
				break;
			case 3:
				{
				setState(200);
				asignacion();
				}
				break;
			case 4:
				{
				setState(201);
				entrada();
				}
				break;
			case 5:
				{
				setState(202);
				salidas();
				}
				break;
			case 6:
				{
				setState(203);
				dimensionamiento();
				}
				break;
			case 7:
				{
				setState(204);
				seleccionmultiple();
				}
				break;
			case 8:
				{
				setState(205);
				mientras();
				}
				break;
			case 9:
				{
				setState(206);
				repetir();
				}
				break;
			case 10:
				{
				setState(207);
				lazospara();
				}
				break;
			case 11:
				{
				setState(208);
				definir();
				}
				break;
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(211);
				puntoycoma();
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

	public static class DefinirContext extends ParserRuleContext {
		public KwdefinirContext kwdefinir() {
			return getRuleContext(KwdefinirContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public KwcomoContext kwcomo() {
			return getRuleContext(KwcomoContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public DefinirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definir; }
	}

	public final DefinirContext definir() throws RecognitionException {
		DefinirContext _localctx = new DefinirContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			kwdefinir();
			setState(215);
			id();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(216);
				coma();
				setState(217);
				id();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			kwcomo();
			setState(225);
			tipo();
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public KwflechaContext kwflecha() {
			return getRuleContext(KwflechaContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				id();
				setState(228);
				kwflecha();
				setState(229);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				expr(0);
				setState(232);
				igual();
				setState(233);
				expr(0);
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

	public static class EntradaContext extends ParserRuleContext {
		public KwleerContext kwleer() {
			return getRuleContext(KwleerContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			kwleer();
			setState(238);
			id();
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
		public KwescribirContext kwescribir() {
			return getRuleContext(KwescribirContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_salidas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			kwescribir();
			setState(241);
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
		public KwdimensionContext kwdimension() {
			return getRuleContext(KwdimensionContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public List<CiContext> ci() {
			return getRuleContexts(CiContext.class);
		}
		public CiContext ci(int i) {
			return getRuleContext(CiContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<CdContext> cd() {
			return getRuleContexts(CdContext.class);
		}
		public CdContext cd(int i) {
			return getRuleContext(CdContext.class,i);
		}
		public KwflechaContext kwflecha() {
			return getRuleContext(KwflechaContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DimensionamientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionamiento; }
	}

	public final DimensionamientoContext dimensionamiento() throws RecognitionException {
		DimensionamientoContext _localctx = new DimensionamientoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dimensionamiento);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIMENSION:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				kwdimension();
				setState(244);
				id();
				setState(245);
				array();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				id();
				setState(248);
				ci();
				setState(249);
				expr(0);
				setState(250);
				cd();
				setState(251);
				kwflecha();
				setState(258);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(252);
					id();
					setState(253);
					ci();
					setState(254);
					expr(0);
					setState(255);
					cd();
					}
					break;
				case STRING:
					{
					setState(257);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class CondicionalContext extends ParserRuleContext {
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public KwcierrasiContext kwcierrasi() {
			return getRuleContext(KwcierrasiContext.class,0);
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
		enterRule(_localctx, 16, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			si();
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)))) != 0)) {
				{
				{
				setState(263);
				instrucciones();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINO) {
				{
				{
				setState(269);
				sino();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)))) != 0)) {
					{
					{
					setState(270);
					instrucciones();
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			kwcierrasi();
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
		public KwsinoContext kwsino() {
			return getRuleContext(KwsinoContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			kwsino();
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(284);
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
		public KwsiContext kwsi() {
			return getRuleContext(KwsiContext.class,0);
		}
		public ExprlogicaContext exprlogica() {
			return getRuleContext(ExprlogicaContext.class,0);
		}
		public KwentoncesContext kwentonces() {
			return getRuleContext(KwentoncesContext.class,0);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			kwsi();
			setState(288);
			exprlogica(0);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTONCES) {
				{
				setState(289);
				kwentonces();
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

	public static class SeleccionmultipleContext extends ParserRuleContext {
		public KwsegunContext kwsegun() {
			return getRuleContext(KwsegunContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public KwhacerContext kwhacer() {
			return getRuleContext(KwhacerContext.class,0);
		}
		public DeotromodoContext deotromodo() {
			return getRuleContext(DeotromodoContext.class,0);
		}
		public KwfinsegunContext kwfinsegun() {
			return getRuleContext(KwfinsegunContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_seleccionmultiple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			kwsegun();
			setState(293);
			id();
			setState(294);
			kwhacer();
			setState(296); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(295);
				instruccion();
				}
				}
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (RC - 43)) | (1L << (ABS - 43)) | (1L << (LN - 43)) | (1L << (EXP - 43)) | (1L << (SEN - 43)) | (1L << (COS - 43)) | (1L << (ATAN - 43)) | (1L << (TRUNC - 43)) | (1L << (REDON - 43)) | (1L << (AZAR - 43)) | (1L << (FLOAT - 43)) | (1L << (INT - 43)) | (1L << (BOOL - 43)) | (1L << (STRING - 43)) | (1L << (PI - 43)) | (1L << (CI - 43)) | (1L << (ID - 43)))) != 0) );
			setState(300);
			deotromodo();
			setState(301);
			kwfinsegun();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DospuntosContext dospuntos() {
			return getRuleContext(DospuntosContext.class,0);
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
		enterRule(_localctx, 24, RULE_instruccion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			expr(0);
			setState(304);
			dospuntos();
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					instrucciones();
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		public KwdeotromodoContext kwdeotromodo() {
			return getRuleContext(KwdeotromodoContext.class,0);
		}
		public DospuntosContext dospuntos() {
			return getRuleContext(DospuntosContext.class,0);
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
		enterRule(_localctx, 26, RULE_deotromodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			kwdeotromodo();
			setState(312);
			dospuntos();
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)))) != 0)) {
				{
				{
				setState(313);
				instrucciones();
				}
				}
				setState(318);
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
		public KwmientrasContext kwmientras() {
			return getRuleContext(KwmientrasContext.class,0);
		}
		public KwfinmientrasContext kwfinmientras() {
			return getRuleContext(KwfinmientrasContext.class,0);
		}
		public List<ExprlogicaContext> exprlogica() {
			return getRuleContexts(ExprlogicaContext.class);
		}
		public ExprlogicaContext exprlogica(int i) {
			return getRuleContext(ExprlogicaContext.class,i);
		}
		public KwhacerContext kwhacer() {
			return getRuleContext(KwhacerContext.class,0);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mientras);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			kwmientras();
			setState(321); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(320);
					exprlogica(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(323); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HACER) {
				{
				setState(325);
				kwhacer();
				}
			}

			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)) | (1L << (COMENTARIO_LINEA - 3)) | (1L << (COMENTARIO_BLOQUE - 3)))) != 0)) {
				{
				setState(330);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFINIR:
				case DIMENSION:
				case LEER:
				case ESCRIBIR:
				case SI:
				case SEGUN:
				case MIENTRAS:
				case REPETIR:
				case PARA:
				case RC:
				case ABS:
				case LN:
				case EXP:
				case SEN:
				case COS:
				case ATAN:
				case TRUNC:
				case REDON:
				case AZAR:
				case FLOAT:
				case INT:
				case BOOL:
				case STRING:
				case PI:
				case CI:
				case ID:
					{
					setState(328);
					instrucciones();
					}
					break;
				case COMENTARIO_LINEA:
				case COMENTARIO_BLOQUE:
					{
					setState(329);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			kwfinmientras();
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
		public KwrepetirContext kwrepetir() {
			return getRuleContext(KwrepetirContext.class,0);
		}
		public HastaqueContext hastaque() {
			return getRuleContext(HastaqueContext.class,0);
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
		enterRule(_localctx, 30, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			kwrepetir();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)))) != 0)) {
				{
				{
				setState(338);
				instrucciones();
				}
				}
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(344);
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
		public KwhastaqueContext kwhastaque() {
			return getRuleContext(KwhastaqueContext.class,0);
		}
		public ExprlogicaContext exprlogica() {
			return getRuleContext(ExprlogicaContext.class,0);
		}
		public HastaqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hastaque; }
	}

	public final HastaqueContext hastaque() throws RecognitionException {
		HastaqueContext _localctx = new HastaqueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_hastaque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			kwhastaque();
			setState(347);
			exprlogica(0);
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
		public KwparaContext kwpara() {
			return getRuleContext(KwparaContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public KwflechaContext kwflecha() {
			return getRuleContext(KwflechaContext.class,0);
		}
		public List<EnteroContext> entero() {
			return getRuleContexts(EnteroContext.class);
		}
		public EnteroContext entero(int i) {
			return getRuleContext(EnteroContext.class,i);
		}
		public KwhastaContext kwhasta() {
			return getRuleContext(KwhastaContext.class,0);
		}
		public KwhacerContext kwhacer() {
			return getRuleContext(KwhacerContext.class,0);
		}
		public KwfinparaContext kwfinpara() {
			return getRuleContext(KwfinparaContext.class,0);
		}
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public KwconpasoContext kwconpaso() {
			return getRuleContext(KwconpasoContext.class,0);
		}
		public PdContext pd() {
			return getRuleContext(PdContext.class,0);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public LazosparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazospara; }
	}

	public final LazosparaContext lazospara() throws RecognitionException {
		LazosparaContext _localctx = new LazosparaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lazospara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			kwpara();
			setState(350);
			id();
			setState(351);
			kwflecha();
			setState(352);
			entero();
			setState(353);
			kwhasta();
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(354);
				entero();
				}
				break;
			case ID:
				{
				setState(355);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PI:
				{
				setState(358);
				pi();
				setState(359);
				kwconpaso();
				setState(360);
				entero();
				setState(361);
				pd();
				}
				break;
			case CONPASO:
				{
				setState(363);
				kwconpaso();
				setState(364);
				entero();
				}
				break;
			case HACER:
				break;
			default:
				break;
			}
			setState(368);
			kwhacer();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)) | (1L << (COMENTARIO_LINEA - 3)) | (1L << (COMENTARIO_BLOQUE - 3)))) != 0)) {
				{
				setState(371);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFINIR:
				case DIMENSION:
				case LEER:
				case ESCRIBIR:
				case SI:
				case SEGUN:
				case MIENTRAS:
				case REPETIR:
				case PARA:
				case RC:
				case ABS:
				case LN:
				case EXP:
				case SEN:
				case COS:
				case ATAN:
				case TRUNC:
				case REDON:
				case AZAR:
				case FLOAT:
				case INT:
				case BOOL:
				case STRING:
				case PI:
				case CI:
				case ID:
					{
					setState(369);
					instrucciones();
					}
					break;
				case COMENTARIO_LINEA:
				case COMENTARIO_BLOQUE:
					{
					setState(370);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			kwfinpara();
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

	public static class DeffuncionContext extends ParserRuleContext {
		public KwfuncionContext kwfuncion() {
			return getRuleContext(KwfuncionContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public KwflechaContext kwflecha() {
			return getRuleContext(KwflechaContext.class,0);
		}
		public InvocafuncionContext invocafuncion() {
			return getRuleContext(InvocafuncionContext.class,0);
		}
		public KwfinfuncionContext kwfinfuncion() {
			return getRuleContext(KwfinfuncionContext.class,0);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public DeffuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deffuncion; }
	}

	public final DeffuncionContext deffuncion() throws RecognitionException {
		DeffuncionContext _localctx = new DeffuncionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_deffuncion);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				kwfuncion();
				setState(379);
				id();
				setState(380);
				kwflecha();
				setState(381);
				invocafuncion();
				setState(383); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(382);
					instrucciones();
					}
					}
					setState(385); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)))) != 0) );
				setState(387);
				kwfinfuncion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				kwfuncion();
				setState(390);
				invocafuncion();
				setState(392); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(391);
					instrucciones();
					}
					}
					setState(394); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)))) != 0) );
				setState(396);
				kwfinfuncion();
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

	public static class ExprlogicaContext extends ParserRuleContext {
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public List<ExprlogicaContext> exprlogica() {
			return getRuleContexts(ExprlogicaContext.class);
		}
		public ExprlogicaContext exprlogica(int i) {
			return getRuleContext(ExprlogicaContext.class,i);
		}
		public PdContext pd() {
			return getRuleContext(PdContext.class,0);
		}
		public NegacionContext negacion() {
			return getRuleContext(NegacionContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperadorrelContext operadorrel() {
			return getRuleContext(OperadorrelContext.class,0);
		}
		public OperadorlogContext operadorlog() {
			return getRuleContext(OperadorlogContext.class,0);
		}
		public ExprlogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlogica; }
	}

	public final ExprlogicaContext exprlogica() throws RecognitionException {
		return exprlogica(0);
	}

	private ExprlogicaContext exprlogica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprlogicaContext _localctx = new ExprlogicaContext(_ctx, _parentState);
		ExprlogicaContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_exprlogica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(401);
				pi();
				setState(402);
				exprlogica(0);
				setState(403);
				pd();
				}
				break;
			case 2:
				{
				setState(405);
				negacion();
				setState(406);
				exprlogica(2);
				}
				break;
			case 3:
				{
				setState(408);
				expr(0);
				setState(409);
				operadorrel();
				setState(410);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprlogicaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprlogica);
					setState(414);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(415);
					operadorlog();
					setState(416);
					exprlogica(4);
					}
					} 
				}
				setState(422);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public InvocafuncionContext invocafuncion() {
			return getRuleContext(InvocafuncionContext.class,0);
		}
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PdContext pd() {
			return getRuleContext(PdContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OperadoralgeContext operadoralge() {
			return getRuleContext(OperadoralgeContext.class,0);
		}
		public OperadorseparadorContext operadorseparador() {
			return getRuleContext(OperadorseparadorContext.class,0);
		}
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(424);
				invocafuncion();
				}
				break;
			case 2:
				{
				setState(425);
				funciones();
				setState(426);
				pi();
				setState(427);
				expr(0);
				setState(428);
				pd();
				}
				break;
			case 3:
				{
				setState(430);
				array();
				}
				break;
			case 4:
				{
				setState(431);
				entero();
				}
				break;
			case 5:
				{
				setState(432);
				real();
				}
				break;
			case 6:
				{
				setState(433);
				bool();
				}
				break;
			case 7:
				{
				setState(434);
				string();
				}
				break;
			case 8:
				{
				setState(435);
				id();
				}
				break;
			case 9:
				{
				setState(436);
				pi();
				setState(437);
				expr(0);
				setState(438);
				pd();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(450);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(442);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(443);
						operadoralge();
						setState(444);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(446);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(447);
						operadorseparador();
						setState(448);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(454);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public CiContext ci() {
			return getRuleContext(CiContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CdContext cd() {
			return getRuleContext(CdContext.class,0);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public PdContext pd() {
			return getRuleContext(PdContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_array);
		int _la;
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				id();
				setState(456);
				ci();
				setState(457);
				expr(0);
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(458);
					coma();
					setState(459);
					expr(0);
					}
					}
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(466);
				cd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				id();
				setState(469);
				pi();
				setState(470);
				expr(0);
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(471);
					coma();
					setState(472);
					expr(0);
					}
					}
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(479);
				pd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				pi();
				setState(482);
				expr(0);
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(483);
					coma();
					setState(484);
					expr(0);
					}
					}
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(491);
				pd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				ci();
				setState(494);
				expr(0);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(495);
					coma();
					setState(496);
					expr(0);
					}
					}
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(503);
				cd();
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

	public static class KwinicioContext extends ParserRuleContext {
		public KwiniContext kwini() {
			return getRuleContext(KwiniContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public KwinicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwinicio; }
	}

	public final KwinicioContext kwinicio() throws RecognitionException {
		KwinicioContext _localctx = new KwinicioContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_kwinicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			kwini();
			setState(508);
			id();
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

	public static class KwfinContext extends ParserRuleContext {
		public TerminalNode FIN() { return getToken(gPseudocodigoParser.FIN, 0); }
		public KwfinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwfin; }
	}

	public final KwfinContext kwfin() throws RecognitionException {
		KwfinContext _localctx = new KwfinContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_kwfin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(FIN);
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

	public static class KwiniContext extends ParserRuleContext {
		public TerminalNode INI() { return getToken(gPseudocodigoParser.INI, 0); }
		public KwiniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwini; }
	}

	public final KwiniContext kwini() throws RecognitionException {
		KwiniContext _localctx = new KwiniContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_kwini);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(INI);
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

	public static class KwdefinirContext extends ParserRuleContext {
		public TerminalNode DEFINIR() { return getToken(gPseudocodigoParser.DEFINIR, 0); }
		public KwdefinirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwdefinir; }
	}

	public final KwdefinirContext kwdefinir() throws RecognitionException {
		KwdefinirContext _localctx = new KwdefinirContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_kwdefinir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(DEFINIR);
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

	public static class KwcomoContext extends ParserRuleContext {
		public TerminalNode COMO() { return getToken(gPseudocodigoParser.COMO, 0); }
		public KwcomoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwcomo; }
	}

	public final KwcomoContext kwcomo() throws RecognitionException {
		KwcomoContext _localctx = new KwcomoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_kwcomo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(COMO);
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

	public static class KwflechaContext extends ParserRuleContext {
		public TerminalNode FLECHA() { return getToken(gPseudocodigoParser.FLECHA, 0); }
		public KwflechaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwflecha; }
	}

	public final KwflechaContext kwflecha() throws RecognitionException {
		KwflechaContext _localctx = new KwflechaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_kwflecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(FLECHA);
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

	public static class KwdimensionContext extends ParserRuleContext {
		public TerminalNode DIMENSION() { return getToken(gPseudocodigoParser.DIMENSION, 0); }
		public KwdimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwdimension; }
	}

	public final KwdimensionContext kwdimension() throws RecognitionException {
		KwdimensionContext _localctx = new KwdimensionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_kwdimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(DIMENSION);
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

	public static class KwleerContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(gPseudocodigoParser.LEER, 0); }
		public KwleerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwleer; }
	}

	public final KwleerContext kwleer() throws RecognitionException {
		KwleerContext _localctx = new KwleerContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_kwleer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(LEER);
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

	public static class KwescribirContext extends ParserRuleContext {
		public TerminalNode ESCRIBIR() { return getToken(gPseudocodigoParser.ESCRIBIR, 0); }
		public KwescribirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwescribir; }
	}

	public final KwescribirContext kwescribir() throws RecognitionException {
		KwescribirContext _localctx = new KwescribirContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_kwescribir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(ESCRIBIR);
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

	public static class KwcierrasiContext extends ParserRuleContext {
		public TerminalNode CIERRASI() { return getToken(gPseudocodigoParser.CIERRASI, 0); }
		public KwcierrasiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwcierrasi; }
	}

	public final KwcierrasiContext kwcierrasi() throws RecognitionException {
		KwcierrasiContext _localctx = new KwcierrasiContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_kwcierrasi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
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

	public static class KwsinoContext extends ParserRuleContext {
		public TerminalNode SINO() { return getToken(gPseudocodigoParser.SINO, 0); }
		public KwsinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwsino; }
	}

	public final KwsinoContext kwsino() throws RecognitionException {
		KwsinoContext _localctx = new KwsinoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_kwsino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(SINO);
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

	public static class KwentoncesContext extends ParserRuleContext {
		public TerminalNode ENTONCES() { return getToken(gPseudocodigoParser.ENTONCES, 0); }
		public KwentoncesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwentonces; }
	}

	public final KwentoncesContext kwentonces() throws RecognitionException {
		KwentoncesContext _localctx = new KwentoncesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_kwentonces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
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

	public static class KwsiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(gPseudocodigoParser.SI, 0); }
		public KwsiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwsi; }
	}

	public final KwsiContext kwsi() throws RecognitionException {
		KwsiContext _localctx = new KwsiContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_kwsi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(SI);
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

	public static class KwdeotromodoContext extends ParserRuleContext {
		public TerminalNode DEOTROMODO() { return getToken(gPseudocodigoParser.DEOTROMODO, 0); }
		public KwdeotromodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwdeotromodo; }
	}

	public final KwdeotromodoContext kwdeotromodo() throws RecognitionException {
		KwdeotromodoContext _localctx = new KwdeotromodoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_kwdeotromodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(DEOTROMODO);
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

	public static class KwfinsegunContext extends ParserRuleContext {
		public TerminalNode FINSEGUN() { return getToken(gPseudocodigoParser.FINSEGUN, 0); }
		public KwfinsegunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwfinsegun; }
	}

	public final KwfinsegunContext kwfinsegun() throws RecognitionException {
		KwfinsegunContext _localctx = new KwfinsegunContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_kwfinsegun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
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

	public static class KwsegunContext extends ParserRuleContext {
		public TerminalNode SEGUN() { return getToken(gPseudocodigoParser.SEGUN, 0); }
		public KwsegunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwsegun; }
	}

	public final KwsegunContext kwsegun() throws RecognitionException {
		KwsegunContext _localctx = new KwsegunContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_kwsegun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(SEGUN);
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

	public static class KwhacerContext extends ParserRuleContext {
		public TerminalNode HACER() { return getToken(gPseudocodigoParser.HACER, 0); }
		public KwhacerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwhacer; }
	}

	public final KwhacerContext kwhacer() throws RecognitionException {
		KwhacerContext _localctx = new KwhacerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_kwhacer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(HACER);
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

	public static class KwfinmientrasContext extends ParserRuleContext {
		public TerminalNode FINMIENTRAS() { return getToken(gPseudocodigoParser.FINMIENTRAS, 0); }
		public KwfinmientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwfinmientras; }
	}

	public final KwfinmientrasContext kwfinmientras() throws RecognitionException {
		KwfinmientrasContext _localctx = new KwfinmientrasContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_kwfinmientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
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

	public static class KwmientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(gPseudocodigoParser.MIENTRAS, 0); }
		public KwmientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwmientras; }
	}

	public final KwmientrasContext kwmientras() throws RecognitionException {
		KwmientrasContext _localctx = new KwmientrasContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_kwmientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(MIENTRAS);
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

	public static class KwrepetirContext extends ParserRuleContext {
		public TerminalNode REPETIR() { return getToken(gPseudocodigoParser.REPETIR, 0); }
		public KwrepetirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwrepetir; }
	}

	public final KwrepetirContext kwrepetir() throws RecognitionException {
		KwrepetirContext _localctx = new KwrepetirContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_kwrepetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(REPETIR);
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

	public static class KwhastaqueContext extends ParserRuleContext {
		public TerminalNode HASTAQUE() { return getToken(gPseudocodigoParser.HASTAQUE, 0); }
		public KwhastaqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwhastaque; }
	}

	public final KwhastaqueContext kwhastaque() throws RecognitionException {
		KwhastaqueContext _localctx = new KwhastaqueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_kwhastaque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(HASTAQUE);
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

	public static class KwfinparaContext extends ParserRuleContext {
		public TerminalNode FINPARA() { return getToken(gPseudocodigoParser.FINPARA, 0); }
		public KwfinparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwfinpara; }
	}

	public final KwfinparaContext kwfinpara() throws RecognitionException {
		KwfinparaContext _localctx = new KwfinparaContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_kwfinpara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
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

	public static class KwparaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(gPseudocodigoParser.PARA, 0); }
		public KwparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwpara; }
	}

	public final KwparaContext kwpara() throws RecognitionException {
		KwparaContext _localctx = new KwparaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_kwpara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(PARA);
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

	public static class KwhastaContext extends ParserRuleContext {
		public TerminalNode HASTA() { return getToken(gPseudocodigoParser.HASTA, 0); }
		public KwhastaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwhasta; }
	}

	public final KwhastaContext kwhasta() throws RecognitionException {
		KwhastaContext _localctx = new KwhastaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_kwhasta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(HASTA);
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

	public static class KwconpasoContext extends ParserRuleContext {
		public TerminalNode CONPASO() { return getToken(gPseudocodigoParser.CONPASO, 0); }
		public KwconpasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwconpaso; }
	}

	public final KwconpasoContext kwconpaso() throws RecognitionException {
		KwconpasoContext _localctx = new KwconpasoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_kwconpaso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(CONPASO);
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

	public static class KwfuncionContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(gPseudocodigoParser.FUNCION, 0); }
		public KwfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwfuncion; }
	}

	public final KwfuncionContext kwfuncion() throws RecognitionException {
		KwfuncionContext _localctx = new KwfuncionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_kwfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(FUNCION);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public PdContext pd() {
			return getRuleContext(PdContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public InvocafuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocafuncion; }
	}

	public final InvocafuncionContext invocafuncion() throws RecognitionException {
		InvocafuncionContext _localctx = new InvocafuncionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_invocafuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			id();
			setState(561);
			pi();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (RC - 43)) | (1L << (ABS - 43)) | (1L << (LN - 43)) | (1L << (EXP - 43)) | (1L << (SEN - 43)) | (1L << (COS - 43)) | (1L << (ATAN - 43)) | (1L << (TRUNC - 43)) | (1L << (REDON - 43)) | (1L << (AZAR - 43)) | (1L << (FLOAT - 43)) | (1L << (INT - 43)) | (1L << (BOOL - 43)) | (1L << (STRING - 43)) | (1L << (PI - 43)) | (1L << (CI - 43)) | (1L << (ID - 43)))) != 0)) {
				{
				setState(562);
				expr(0);
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(563);
					coma();
					setState(564);
					expr(0);
					}
					}
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(573);
			pd();
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

	public static class KwfinfuncionContext extends ParserRuleContext {
		public TerminalNode FINFUNCION() { return getToken(gPseudocodigoParser.FINFUNCION, 0); }
		public KwfinfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwfinfuncion; }
	}

	public final KwfinfuncionContext kwfinfuncion() throws RecognitionException {
		KwfinfuncionContext _localctx = new KwfinfuncionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_kwfinfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(FINFUNCION);
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

	public static class OperadorrelContext extends ParserRuleContext {
		public TerminalNode MAYORQUE() { return getToken(gPseudocodigoParser.MAYORQUE, 0); }
		public TerminalNode MENORQUE() { return getToken(gPseudocodigoParser.MENORQUE, 0); }
		public TerminalNode IGUALQUE() { return getToken(gPseudocodigoParser.IGUALQUE, 0); }
		public TerminalNode MENORIGUALQUE() { return getToken(gPseudocodigoParser.MENORIGUALQUE, 0); }
		public TerminalNode MAYORIGUALQUE() { return getToken(gPseudocodigoParser.MAYORIGUALQUE, 0); }
		public OperadorrelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorrel; }
	}

	public final OperadorrelContext operadorrel() throws RecognitionException {
		OperadorrelContext _localctx = new OperadorrelContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_operadorrel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYORQUE) | (1L << MENORQUE) | (1L << IGUALQUE) | (1L << MENORIGUALQUE) | (1L << MAYORIGUALQUE))) != 0)) ) {
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

	public static class OperadorlogContext extends ParserRuleContext {
		public ConjuncionContext conjuncion() {
			return getRuleContext(ConjuncionContext.class,0);
		}
		public DisyuncionContext disyuncion() {
			return getRuleContext(DisyuncionContext.class,0);
		}
		public OperadorlogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorlog; }
	}

	public final OperadorlogContext operadorlog() throws RecognitionException {
		OperadorlogContext _localctx = new OperadorlogContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_operadorlog);
		try {
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONJUNCION:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				conjuncion();
				}
				break;
			case DISYUNCION:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				disyuncion();
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

	public static class ConjuncionContext extends ParserRuleContext {
		public TerminalNode CONJUNCION() { return getToken(gPseudocodigoParser.CONJUNCION, 0); }
		public ConjuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjuncion; }
	}

	public final ConjuncionContext conjuncion() throws RecognitionException {
		ConjuncionContext _localctx = new ConjuncionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_conjuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(CONJUNCION);
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

	public static class DisyuncionContext extends ParserRuleContext {
		public TerminalNode DISYUNCION() { return getToken(gPseudocodigoParser.DISYUNCION, 0); }
		public DisyuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disyuncion; }
	}

	public final DisyuncionContext disyuncion() throws RecognitionException {
		DisyuncionContext _localctx = new DisyuncionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_disyuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(DISYUNCION);
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

	public static class NegacionContext extends ParserRuleContext {
		public TerminalNode NEGACION() { return getToken(gPseudocodigoParser.NEGACION, 0); }
		public NegacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negacion; }
	}

	public final NegacionContext negacion() throws RecognitionException {
		NegacionContext _localctx = new NegacionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_negacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(NEGACION);
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

	public static class OperadoralgeContext extends ParserRuleContext {
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public RestaContext resta() {
			return getRuleContext(RestaContext.class,0);
		}
		public MultiplicacionContext multiplicacion() {
			return getRuleContext(MultiplicacionContext.class,0);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public PotenciacionContext potenciacion() {
			return getRuleContext(PotenciacionContext.class,0);
		}
		public ModuloContext modulo() {
			return getRuleContext(ModuloContext.class,0);
		}
		public OperadoralgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadoralge; }
	}

	public final OperadoralgeContext operadoralge() throws RecognitionException {
		OperadoralgeContext _localctx = new OperadoralgeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_operadoralge);
		try {
			setState(595);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				suma();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				resta();
				}
				break;
			case MULTIPLICACION:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				multiplicacion();
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
				division();
				}
				break;
			case POTENCIACION:
				enterOuterAlt(_localctx, 5);
				{
				setState(593);
				potenciacion();
				}
				break;
			case MODULO:
				enterOuterAlt(_localctx, 6);
				{
				setState(594);
				modulo();
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

	public static class IgualContext extends ParserRuleContext {
		public TerminalNode IGUALQUE() { return getToken(gPseudocodigoParser.IGUALQUE, 0); }
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(IGUALQUE);
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

	public static class SumaContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(gPseudocodigoParser.SUMA, 0); }
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(SUMA);
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

	public static class RestaContext extends ParserRuleContext {
		public TerminalNode RESTA() { return getToken(gPseudocodigoParser.RESTA, 0); }
		public RestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resta; }
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(RESTA);
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

	public static class MultiplicacionContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACION() { return getToken(gPseudocodigoParser.MULTIPLICACION, 0); }
		public MultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacion; }
	}

	public final MultiplicacionContext multiplicacion() throws RecognitionException {
		MultiplicacionContext _localctx = new MultiplicacionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_multiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(MULTIPLICACION);
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

	public static class DivisionContext extends ParserRuleContext {
		public TerminalNode DIVISION() { return getToken(gPseudocodigoParser.DIVISION, 0); }
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(DIVISION);
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

	public static class PotenciacionContext extends ParserRuleContext {
		public TerminalNode POTENCIACION() { return getToken(gPseudocodigoParser.POTENCIACION, 0); }
		public PotenciacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potenciacion; }
	}

	public final PotenciacionContext potenciacion() throws RecognitionException {
		PotenciacionContext _localctx = new PotenciacionContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_potenciacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(POTENCIACION);
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

	public static class ModuloContext extends ParserRuleContext {
		public TerminalNode MODULO() { return getToken(gPseudocodigoParser.MODULO, 0); }
		public ModuloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo; }
	}

	public final ModuloContext modulo() throws RecognitionException {
		ModuloContext _localctx = new ModuloContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_modulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(MODULO);
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

	public static class OperadorseparadorContext extends ParserRuleContext {
		public ComaContext coma() {
			return getRuleContext(ComaContext.class,0);
		}
		public BarrabajaContext barrabaja() {
			return getRuleContext(BarrabajaContext.class,0);
		}
		public OperadorseparadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorseparador; }
	}

	public final OperadorseparadorContext operadorseparador() throws RecognitionException {
		OperadorseparadorContext _localctx = new OperadorseparadorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_operadorseparador);
		try {
			setState(613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				coma();
				}
				break;
			case BARRABAJA:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				barrabaja();
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

	public static class ComaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(gPseudocodigoParser.COMA, 0); }
		public ComaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coma; }
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(COMA);
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

	public static class BarrabajaContext extends ParserRuleContext {
		public TerminalNode BARRABAJA() { return getToken(gPseudocodigoParser.BARRABAJA, 0); }
		public BarrabajaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barrabaja; }
	}

	public final BarrabajaContext barrabaja() throws RecognitionException {
		BarrabajaContext _localctx = new BarrabajaContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_barrabaja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(BARRABAJA);
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

	public static class FuncionesContext extends ParserRuleContext {
		public RcContext rc() {
			return getRuleContext(RcContext.class,0);
		}
		public AbsContext abs() {
			return getRuleContext(AbsContext.class,0);
		}
		public LnContext ln() {
			return getRuleContext(LnContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public SenContext sen() {
			return getRuleContext(SenContext.class,0);
		}
		public CosContext cos() {
			return getRuleContext(CosContext.class,0);
		}
		public AtanContext atan() {
			return getRuleContext(AtanContext.class,0);
		}
		public TruncContext trunc() {
			return getRuleContext(TruncContext.class,0);
		}
		public RedonContext redon() {
			return getRuleContext(RedonContext.class,0);
		}
		public AzarContext azar() {
			return getRuleContext(AzarContext.class,0);
		}
		public FuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciones; }
	}

	public final FuncionesContext funciones() throws RecognitionException {
		FuncionesContext _localctx = new FuncionesContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_funciones);
		try {
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RC:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				rc();
				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				abs();
				}
				break;
			case LN:
				enterOuterAlt(_localctx, 3);
				{
				setState(621);
				ln();
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 4);
				{
				setState(622);
				exp();
				}
				break;
			case SEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(623);
				sen();
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 6);
				{
				setState(624);
				cos();
				}
				break;
			case ATAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(625);
				atan();
				}
				break;
			case TRUNC:
				enterOuterAlt(_localctx, 8);
				{
				setState(626);
				trunc();
				}
				break;
			case REDON:
				enterOuterAlt(_localctx, 9);
				{
				setState(627);
				redon();
				}
				break;
			case AZAR:
				enterOuterAlt(_localctx, 10);
				{
				setState(628);
				azar();
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

	public static class RcContext extends ParserRuleContext {
		public TerminalNode RC() { return getToken(gPseudocodigoParser.RC, 0); }
		public RcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rc; }
	}

	public final RcContext rc() throws RecognitionException {
		RcContext _localctx = new RcContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_rc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(RC);
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

	public static class AbsContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(gPseudocodigoParser.ABS, 0); }
		public AbsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abs; }
	}

	public final AbsContext abs() throws RecognitionException {
		AbsContext _localctx = new AbsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_abs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(ABS);
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

	public static class LnContext extends ParserRuleContext {
		public TerminalNode LN() { return getToken(gPseudocodigoParser.LN, 0); }
		public LnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ln; }
	}

	public final LnContext ln() throws RecognitionException {
		LnContext _localctx = new LnContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_ln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(LN);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode EXP() { return getToken(gPseudocodigoParser.EXP, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(EXP);
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

	public static class SenContext extends ParserRuleContext {
		public TerminalNode SEN() { return getToken(gPseudocodigoParser.SEN, 0); }
		public SenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sen; }
	}

	public final SenContext sen() throws RecognitionException {
		SenContext _localctx = new SenContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_sen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			match(SEN);
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

	public static class CosContext extends ParserRuleContext {
		public TerminalNode COS() { return getToken(gPseudocodigoParser.COS, 0); }
		public CosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cos; }
	}

	public final CosContext cos() throws RecognitionException {
		CosContext _localctx = new CosContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(COS);
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

	public static class AtanContext extends ParserRuleContext {
		public TerminalNode ATAN() { return getToken(gPseudocodigoParser.ATAN, 0); }
		public AtanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atan; }
	}

	public final AtanContext atan() throws RecognitionException {
		AtanContext _localctx = new AtanContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_atan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(ATAN);
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

	public static class TruncContext extends ParserRuleContext {
		public TerminalNode TRUNC() { return getToken(gPseudocodigoParser.TRUNC, 0); }
		public TruncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trunc; }
	}

	public final TruncContext trunc() throws RecognitionException {
		TruncContext _localctx = new TruncContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_trunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(TRUNC);
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

	public static class RedonContext extends ParserRuleContext {
		public TerminalNode REDON() { return getToken(gPseudocodigoParser.REDON, 0); }
		public RedonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redon; }
	}

	public final RedonContext redon() throws RecognitionException {
		RedonContext _localctx = new RedonContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_redon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(REDON);
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

	public static class AzarContext extends ParserRuleContext {
		public TerminalNode AZAR() { return getToken(gPseudocodigoParser.AZAR, 0); }
		public AzarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_azar; }
	}

	public final AzarContext azar() throws RecognitionException {
		AzarContext _localctx = new AzarContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_azar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(AZAR);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(gPseudocodigoParser.TIPO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
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

	public static class RealContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(gPseudocodigoParser.FLOAT, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(FLOAT);
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

	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gPseudocodigoParser.INT, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(INT);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(gPseudocodigoParser.BOOL, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(BOOL);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(gPseudocodigoParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(STRING);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gPseudocodigoParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
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

	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIO_BLOQUE() { return getToken(gPseudocodigoParser.COMENTARIO_BLOQUE, 0); }
		public TerminalNode COMENTARIO_LINEA() { return getToken(gPseudocodigoParser.COMENTARIO_LINEA, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_la = _input.LA(1);
			if ( !(_la==COMENTARIO_LINEA || _la==COMENTARIO_BLOQUE) ) {
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

	public static class DospuntosContext extends ParserRuleContext {
		public TerminalNode DOSPUNTOS() { return getToken(gPseudocodigoParser.DOSPUNTOS, 0); }
		public DospuntosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dospuntos; }
	}

	public final DospuntosContext dospuntos() throws RecognitionException {
		DospuntosContext _localctx = new DospuntosContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_dospuntos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(DOSPUNTOS);
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

	public static class PiContext extends ParserRuleContext {
		public TerminalNode PI() { return getToken(gPseudocodigoParser.PI, 0); }
		public PiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pi; }
	}

	public final PiContext pi() throws RecognitionException {
		PiContext _localctx = new PiContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_pi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(PI);
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

	public static class PdContext extends ParserRuleContext {
		public TerminalNode PD() { return getToken(gPseudocodigoParser.PD, 0); }
		public PdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pd; }
	}

	public final PdContext pd() throws RecognitionException {
		PdContext _localctx = new PdContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_pd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
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

	public static class CiContext extends ParserRuleContext {
		public TerminalNode CI() { return getToken(gPseudocodigoParser.CI, 0); }
		public CiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ci; }
	}

	public final CiContext ci() throws RecognitionException {
		CiContext _localctx = new CiContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_ci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(CI);
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

	public static class CdContext extends ParserRuleContext {
		public TerminalNode CD() { return getToken(gPseudocodigoParser.CD, 0); }
		public CdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cd; }
	}

	public final CdContext cd() throws RecognitionException {
		CdContext _localctx = new CdContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_cd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(CD);
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

	public static class PuntoycomaContext extends ParserRuleContext {
		public TerminalNode PUNTOCOMA() { return getToken(gPseudocodigoParser.PUNTOCOMA, 0); }
		public PuntoycomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puntoycoma; }
	}

	public final PuntoycomaContext puntoycoma() throws RecognitionException {
		PuntoycomaContext _localctx = new PuntoycomaContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_puntoycoma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(PUNTOCOMA);
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
			return exprlogica_sempred((ExprlogicaContext)_localctx, predIndex);
		case 20:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprlogica_sempred(ExprlogicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u02a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\2\7\2\u00ba\n\2\f"+
		"\2\16\2\u00bd\13\2\3\3\3\3\3\3\7\3\u00c2\n\3\f\3\16\3\u00c5\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d4\n\4\3\4\5\4\u00d7"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\7\5\u00de\n\5\f\5\16\5\u00e1\13\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ee\n\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0105"+
		"\n\t\5\t\u0107\n\t\3\n\3\n\7\n\u010b\n\n\f\n\16\n\u010e\13\n\3\n\3\n\7"+
		"\n\u0112\n\n\f\n\16\n\u0115\13\n\7\n\u0117\n\n\f\n\16\n\u011a\13\n\3\n"+
		"\3\n\3\13\3\13\5\13\u0120\n\13\3\f\3\f\3\f\5\f\u0125\n\f\3\r\3\r\3\r\3"+
		"\r\6\r\u012b\n\r\r\r\16\r\u012c\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u0135"+
		"\n\16\f\16\16\16\u0138\13\16\3\17\3\17\3\17\7\17\u013d\n\17\f\17\16\17"+
		"\u0140\13\17\3\20\3\20\6\20\u0144\n\20\r\20\16\20\u0145\3\20\5\20\u0149"+
		"\n\20\3\20\3\20\7\20\u014d\n\20\f\20\16\20\u0150\13\20\3\20\3\20\3\21"+
		"\3\21\7\21\u0156\n\21\f\21\16\21\u0159\13\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0167\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0171\n\23\3\23\3\23\3\23\7\23\u0176\n\23\f"+
		"\23\16\23\u0179\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\6\24\u0182\n"+
		"\24\r\24\16\24\u0183\3\24\3\24\3\24\3\24\3\24\6\24\u018b\n\24\r\24\16"+
		"\24\u018c\3\24\3\24\5\24\u0191\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u019f\n\25\3\25\3\25\3\25\3\25\7\25\u01a5"+
		"\n\25\f\25\16\25\u01a8\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01bb\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01c5\n\26\f\26\16\26\u01c8\13\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01d0\n\27\f\27\16\27\u01d3\13\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01dd\n\27\f\27\16\27\u01e0"+
		"\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01e9\n\27\f\27\16\27\u01ec"+
		"\13\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01f5\n\27\f\27\16\27\u01f8"+
		"\13\27\3\27\3\27\5\27\u01fc\n\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3."+
		"\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0239"+
		"\n\62\f\62\16\62\u023c\13\62\5\62\u023e\n\62\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\5\65\u0248\n\65\3\66\3\66\3\67\3\67\38\38\39\39\39\39"+
		"\39\39\59\u0256\n9\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\5A"+
		"\u0268\nA\3B\3B\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0278\nD\3E\3E"+
		"\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q"+
		"\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3[\2\4"+
		"(*\\\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\2\4\3\2\35!\3\2CD\2\u029c"+
		"\2\u00bb\3\2\2\2\4\u00be\3\2\2\2\6\u00d3\3\2\2\2\b\u00d8\3\2\2\2\n\u00ed"+
		"\3\2\2\2\f\u00ef\3\2\2\2\16\u00f2\3\2\2\2\20\u0106\3\2\2\2\22\u0108\3"+
		"\2\2\2\24\u011d\3\2\2\2\26\u0121\3\2\2\2\30\u0126\3\2\2\2\32\u0131\3\2"+
		"\2\2\34\u0139\3\2\2\2\36\u0141\3\2\2\2 \u0153\3\2\2\2\"\u015c\3\2\2\2"+
		"$\u015f\3\2\2\2&\u0190\3\2\2\2(\u019e\3\2\2\2*\u01ba\3\2\2\2,\u01fb\3"+
		"\2\2\2.\u01fd\3\2\2\2\60\u0200\3\2\2\2\62\u0202\3\2\2\2\64\u0204\3\2\2"+
		"\2\66\u0206\3\2\2\28\u0208\3\2\2\2:\u020a\3\2\2\2<\u020c\3\2\2\2>\u020e"+
		"\3\2\2\2@\u0210\3\2\2\2B\u0212\3\2\2\2D\u0214\3\2\2\2F\u0216\3\2\2\2H"+
		"\u0218\3\2\2\2J\u021a\3\2\2\2L\u021c\3\2\2\2N\u021e\3\2\2\2P\u0220\3\2"+
		"\2\2R\u0222\3\2\2\2T\u0224\3\2\2\2V\u0226\3\2\2\2X\u0228\3\2\2\2Z\u022a"+
		"\3\2\2\2\\\u022c\3\2\2\2^\u022e\3\2\2\2`\u0230\3\2\2\2b\u0232\3\2\2\2"+
		"d\u0241\3\2\2\2f\u0243\3\2\2\2h\u0247\3\2\2\2j\u0249\3\2\2\2l\u024b\3"+
		"\2\2\2n\u024d\3\2\2\2p\u0255\3\2\2\2r\u0257\3\2\2\2t\u0259\3\2\2\2v\u025b"+
		"\3\2\2\2x\u025d\3\2\2\2z\u025f\3\2\2\2|\u0261\3\2\2\2~\u0263\3\2\2\2\u0080"+
		"\u0267\3\2\2\2\u0082\u0269\3\2\2\2\u0084\u026b\3\2\2\2\u0086\u0277\3\2"+
		"\2\2\u0088\u0279\3\2\2\2\u008a\u027b\3\2\2\2\u008c\u027d\3\2\2\2\u008e"+
		"\u027f\3\2\2\2\u0090\u0281\3\2\2\2\u0092\u0283\3\2\2\2\u0094\u0285\3\2"+
		"\2\2\u0096\u0287\3\2\2\2\u0098\u0289\3\2\2\2\u009a\u028b\3\2\2\2\u009c"+
		"\u028d\3\2\2\2\u009e\u028f\3\2\2\2\u00a0\u0291\3\2\2\2\u00a2\u0293\3\2"+
		"\2\2\u00a4\u0295\3\2\2\2\u00a6\u0297\3\2\2\2\u00a8\u0299\3\2\2\2\u00aa"+
		"\u029b\3\2\2\2\u00ac\u029d\3\2\2\2\u00ae\u029f\3\2\2\2\u00b0\u02a1\3\2"+
		"\2\2\u00b2\u02a3\3\2\2\2\u00b4\u02a5\3\2\2\2\u00b6\u00ba\5\4\3\2\u00b7"+
		"\u00ba\5\u00a8U\2\u00b8\u00ba\5&\24\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\3\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c3\5.\30\2"+
		"\u00bf\u00c2\5\6\4\2\u00c0\u00c2\5\u00a8U\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\5\60\31\2\u00c7"+
		"\5\3\2\2\2\u00c8\u00d4\5*\26\2\u00c9\u00d4\5\22\n\2\u00ca\u00d4\5\n\6"+
		"\2\u00cb\u00d4\5\f\7\2\u00cc\u00d4\5\16\b\2\u00cd\u00d4\5\20\t\2\u00ce"+
		"\u00d4\5\30\r\2\u00cf\u00d4\5\36\20\2\u00d0\u00d4\5 \21\2\u00d1\u00d4"+
		"\5$\23\2\u00d2\u00d4\5\b\5\2\u00d3\u00c8\3\2\2\2\u00d3\u00c9\3\2\2\2\u00d3"+
		"\u00ca\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00cc\3\2\2\2\u00d3\u00cd\3\2"+
		"\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00cf\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d7\5\u00b4"+
		"[\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\7\3\2\2\2\u00d8\u00d9"+
		"\5\64\33\2\u00d9\u00df\5\u00a6T\2\u00da\u00db\5\u0082B\2\u00db\u00dc\5"+
		"\u00a6T\2\u00dc\u00de\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\u00e1\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00df"+
		"\3\2\2\2\u00e2\u00e3\5\66\34\2\u00e3\u00e4\5\u009cO\2\u00e4\t\3\2\2\2"+
		"\u00e5\u00e6\5\u00a6T\2\u00e6\u00e7\58\35\2\u00e7\u00e8\5*\26\2\u00e8"+
		"\u00ee\3\2\2\2\u00e9\u00ea\5*\26\2\u00ea\u00eb\5r:\2\u00eb\u00ec\5*\26"+
		"\2\u00ec\u00ee\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee\13"+
		"\3\2\2\2\u00ef\u00f0\5<\37\2\u00f0\u00f1\5\u00a6T\2\u00f1\r\3\2\2\2\u00f2"+
		"\u00f3\5> \2\u00f3\u00f4\5*\26\2\u00f4\17\3\2\2\2\u00f5\u00f6\5:\36\2"+
		"\u00f6\u00f7\5\u00a6T\2\u00f7\u00f8\5,\27\2\u00f8\u0107\3\2\2\2\u00f9"+
		"\u00fa\5\u00a6T\2\u00fa\u00fb\5\u00b0Y\2\u00fb\u00fc\5*\26\2\u00fc\u00fd"+
		"\5\u00b2Z\2\u00fd\u0104\58\35\2\u00fe\u00ff\5\u00a6T\2\u00ff\u0100\5\u00b0"+
		"Y\2\u0100\u0101\5*\26\2\u0101\u0102\5\u00b2Z\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0105\5\u00a4S\2\u0104\u00fe\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u0107"+
		"\3\2\2\2\u0106\u00f5\3\2\2\2\u0106\u00f9\3\2\2\2\u0107\21\3\2\2\2\u0108"+
		"\u010c\5\26\f\2\u0109\u010b\5\6\4\2\u010a\u0109\3\2\2\2\u010b\u010e\3"+
		"\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0118\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010f\u0113\5\24\13\2\u0110\u0112\5\6\4\2\u0111\u0110\3"+
		"\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u010f\3\2\2\2\u0117\u011a\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011c\5@!\2\u011c\23\3\2\2\2\u011d\u011f\5B\"\2\u011e"+
		"\u0120\5\26\f\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\25\3\2\2"+
		"\2\u0121\u0122\5F$\2\u0122\u0124\5(\25\2\u0123\u0125\5D#\2\u0124\u0123"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\27\3\2\2\2\u0126\u0127\5L\'\2\u0127"+
		"\u0128\5\u00a6T\2\u0128\u012a\5N(\2\u0129\u012b\5\32\16\2\u012a\u0129"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u012f\5\34\17\2\u012f\u0130\5J&\2\u0130\31\3\2\2"+
		"\2\u0131\u0132\5*\26\2\u0132\u0136\5\u00aaV\2\u0133\u0135\5\6\4\2\u0134"+
		"\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\33\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\5H%\2\u013a\u013e"+
		"\5\u00aaV\2\u013b\u013d\5\6\4\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2"+
		"\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\35\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0141\u0143\5R*\2\u0142\u0144\5(\25\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2"+
		"\2\2\u0147\u0149\5N(\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014e"+
		"\3\2\2\2\u014a\u014d\5\6\4\2\u014b\u014d\5\u00a8U\2\u014c\u014a\3\2\2"+
		"\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\5P)\2\u0152"+
		"\37\3\2\2\2\u0153\u0157\5T+\2\u0154\u0156\5\6\4\2\u0155\u0154\3\2\2\2"+
		"\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a"+
		"\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\5\"\22\2\u015b!\3\2\2\2\u015c"+
		"\u015d\5V,\2\u015d\u015e\5(\25\2\u015e#\3\2\2\2\u015f\u0160\5Z.\2\u0160"+
		"\u0161\5\u00a6T\2\u0161\u0162\58\35\2\u0162\u0163\5\u00a0Q\2\u0163\u0166"+
		"\5\\/\2\u0164\u0167\5\u00a0Q\2\u0165\u0167\5\u00a6T\2\u0166\u0164\3\2"+
		"\2\2\u0166\u0165\3\2\2\2\u0167\u0170\3\2\2\2\u0168\u0169\5\u00acW\2\u0169"+
		"\u016a\5^\60\2\u016a\u016b\5\u00a0Q\2\u016b\u016c\5\u00aeX\2\u016c\u0171"+
		"\3\2\2\2\u016d\u016e\5^\60\2\u016e\u016f\5\u00a0Q\2\u016f\u0171\3\2\2"+
		"\2\u0170\u0168\3\2\2\2\u0170\u016d\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u0177\5N(\2\u0173\u0176\5\6\4\2\u0174\u0176\5\u00a8U\2"+
		"\u0175\u0173\3\2\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a"+
		"\u017b\5X-\2\u017b%\3\2\2\2\u017c\u017d\5`\61\2\u017d\u017e\5\u00a6T\2"+
		"\u017e\u017f\58\35\2\u017f\u0181\5b\62\2\u0180\u0182\5\6\4\2\u0181\u0180"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\5d\63\2\u0186\u0191\3\2\2\2\u0187\u0188\5`"+
		"\61\2\u0188\u018a\5b\62\2\u0189\u018b\5\6\4\2\u018a\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018e\u018f\5d\63\2\u018f\u0191\3\2\2\2\u0190\u017c\3\2\2\2\u0190"+
		"\u0187\3\2\2\2\u0191\'\3\2\2\2\u0192\u0193\b\25\1\2\u0193\u0194\5\u00ac"+
		"W\2\u0194\u0195\5(\25\2\u0195\u0196\5\u00aeX\2\u0196\u019f\3\2\2\2\u0197"+
		"\u0198\5n8\2\u0198\u0199\5(\25\4\u0199\u019f\3\2\2\2\u019a\u019b\5*\26"+
		"\2\u019b\u019c\5f\64\2\u019c\u019d\5*\26\2\u019d\u019f\3\2\2\2\u019e\u0192"+
		"\3\2\2\2\u019e\u0197\3\2\2\2\u019e\u019a\3\2\2\2\u019f\u01a6\3\2\2\2\u01a0"+
		"\u01a1\f\5\2\2\u01a1\u01a2\5h\65\2\u01a2\u01a3\5(\25\6\u01a3\u01a5\3\2"+
		"\2\2\u01a4\u01a0\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7)\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\b\26\1\2"+
		"\u01aa\u01bb\5b\62\2\u01ab\u01ac\5\u0086D\2\u01ac\u01ad\5\u00acW\2\u01ad"+
		"\u01ae\5*\26\2\u01ae\u01af\5\u00aeX\2\u01af\u01bb\3\2\2\2\u01b0\u01bb"+
		"\5,\27\2\u01b1\u01bb\5\u00a0Q\2\u01b2\u01bb\5\u009eP\2\u01b3\u01bb\5\u00a2"+
		"R\2\u01b4\u01bb\5\u00a4S\2\u01b5\u01bb\5\u00a6T\2\u01b6\u01b7\5\u00ac"+
		"W\2\u01b7\u01b8\5*\26\2\u01b8\u01b9\5\u00aeX\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01a9\3\2\2\2\u01ba\u01ab\3\2\2\2\u01ba\u01b0\3\2\2\2\u01ba\u01b1\3\2"+
		"\2\2\u01ba\u01b2\3\2\2\2\u01ba\u01b3\3\2\2\2\u01ba\u01b4\3\2\2\2\u01ba"+
		"\u01b5\3\2\2\2\u01ba\u01b6\3\2\2\2\u01bb\u01c6\3\2\2\2\u01bc\u01bd\f\f"+
		"\2\2\u01bd\u01be\5p9\2\u01be\u01bf\5*\26\r\u01bf\u01c5\3\2\2\2\u01c0\u01c1"+
		"\f\13\2\2\u01c1\u01c2\5\u0080A\2\u01c2\u01c3\5*\26\f\u01c3\u01c5\3\2\2"+
		"\2\u01c4\u01bc\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7+\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9"+
		"\u01ca\5\u00a6T\2\u01ca\u01cb\5\u00b0Y\2\u01cb\u01d1\5*\26\2\u01cc\u01cd"+
		"\5\u0082B\2\u01cd\u01ce\5*\26\2\u01ce\u01d0\3\2\2\2\u01cf\u01cc\3\2\2"+
		"\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4"+
		"\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\5\u00b2Z\2\u01d5\u01fc\3\2\2"+
		"\2\u01d6\u01d7\5\u00a6T\2\u01d7\u01d8\5\u00acW\2\u01d8\u01de\5*\26\2\u01d9"+
		"\u01da\5\u0082B\2\u01da\u01db\5*\26\2\u01db\u01dd\3\2\2\2\u01dc\u01d9"+
		"\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e1\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\5\u00aeX\2\u01e2\u01fc"+
		"\3\2\2\2\u01e3\u01e4\5\u00acW\2\u01e4\u01ea\5*\26\2\u01e5\u01e6\5\u0082"+
		"B\2\u01e6\u01e7\5*\26\2\u01e7\u01e9\3\2\2\2\u01e8\u01e5\3\2\2\2\u01e9"+
		"\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ed\3\2"+
		"\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01ee\5\u00aeX\2\u01ee\u01fc\3\2\2\2\u01ef"+
		"\u01f0\5\u00b0Y\2\u01f0\u01f6\5*\26\2\u01f1\u01f2\5\u0082B\2\u01f2\u01f3"+
		"\5*\26\2\u01f3\u01f5\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6"+
		"\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f6\3\2"+
		"\2\2\u01f9\u01fa\5\u00b2Z\2\u01fa\u01fc\3\2\2\2\u01fb\u01c9\3\2\2\2\u01fb"+
		"\u01d6\3\2\2\2\u01fb\u01e3\3\2\2\2\u01fb\u01ef\3\2\2\2\u01fc-\3\2\2\2"+
		"\u01fd\u01fe\5\62\32\2\u01fe\u01ff\5\u00a6T\2\u01ff/\3\2\2\2\u0200\u0201"+
		"\7\3\2\2\u0201\61\3\2\2\2\u0202\u0203\7\4\2\2\u0203\63\3\2\2\2\u0204\u0205"+
		"\7\5\2\2\u0205\65\3\2\2\2\u0206\u0207\7\6\2\2\u0207\67\3\2\2\2\u0208\u0209"+
		"\7\7\2\2\u02099\3\2\2\2\u020a\u020b\7\b\2\2\u020b;\3\2\2\2\u020c\u020d"+
		"\7\t\2\2\u020d=\3\2\2\2\u020e\u020f\7\n\2\2\u020f?\3\2\2\2\u0210\u0211"+
		"\7\13\2\2\u0211A\3\2\2\2\u0212\u0213\7\f\2\2\u0213C\3\2\2\2\u0214\u0215"+
		"\7\r\2\2\u0215E\3\2\2\2\u0216\u0217\7\16\2\2\u0217G\3\2\2\2\u0218\u0219"+
		"\7\17\2\2\u0219I\3\2\2\2\u021a\u021b\7\20\2\2\u021bK\3\2\2\2\u021c\u021d"+
		"\7\21\2\2\u021dM\3\2\2\2\u021e\u021f\7\22\2\2\u021fO\3\2\2\2\u0220\u0221"+
		"\7\23\2\2\u0221Q\3\2\2\2\u0222\u0223\7\24\2\2\u0223S\3\2\2\2\u0224\u0225"+
		"\7\25\2\2\u0225U\3\2\2\2\u0226\u0227\7\26\2\2\u0227W\3\2\2\2\u0228\u0229"+
		"\7\27\2\2\u0229Y\3\2\2\2\u022a\u022b\7\30\2\2\u022b[\3\2\2\2\u022c\u022d"+
		"\7\31\2\2\u022d]\3\2\2\2\u022e\u022f\7\32\2\2\u022f_\3\2\2\2\u0230\u0231"+
		"\7\33\2\2\u0231a\3\2\2\2\u0232\u0233\5\u00a6T\2\u0233\u023d\5\u00acW\2"+
		"\u0234\u023a\5*\26\2\u0235\u0236\5\u0082B\2\u0236\u0237\5*\26\2\u0237"+
		"\u0239\3\2\2\2\u0238\u0235\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2"+
		"\2\2\u023a\u023b\3\2\2\2\u023b\u023e\3\2\2\2\u023c\u023a\3\2\2\2\u023d"+
		"\u0234\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\5\u00ae"+
		"X\2\u0240c\3\2\2\2\u0241\u0242\7\34\2\2\u0242e\3\2\2\2\u0243\u0244\t\2"+
		"\2\2\u0244g\3\2\2\2\u0245\u0248\5j\66\2\u0246\u0248\5l\67\2\u0247\u0245"+
		"\3\2\2\2\u0247\u0246\3\2\2\2\u0248i\3\2\2\2\u0249\u024a\7\"\2\2\u024a"+
		"k\3\2\2\2\u024b\u024c\7#\2\2\u024cm\3\2\2\2\u024d\u024e\7$\2\2\u024eo"+
		"\3\2\2\2\u024f\u0256\5t;\2\u0250\u0256\5v<\2\u0251\u0256\5x=\2\u0252\u0256"+
		"\5z>\2\u0253\u0256\5|?\2\u0254\u0256\5~@\2\u0255\u024f\3\2\2\2\u0255\u0250"+
		"\3\2\2\2\u0255\u0251\3\2\2\2\u0255\u0252\3\2\2\2\u0255\u0253\3\2\2\2\u0255"+
		"\u0254\3\2\2\2\u0256q\3\2\2\2\u0257\u0258\7\37\2\2\u0258s\3\2\2\2\u0259"+
		"\u025a\7%\2\2\u025au\3\2\2\2\u025b\u025c\7&\2\2\u025cw\3\2\2\2\u025d\u025e"+
		"\7\'\2\2\u025ey\3\2\2\2\u025f\u0260\7(\2\2\u0260{\3\2\2\2\u0261\u0262"+
		"\7)\2\2\u0262}\3\2\2\2\u0263\u0264\7*\2\2\u0264\177\3\2\2\2\u0265\u0268"+
		"\5\u0082B\2\u0266\u0268\5\u0084C\2\u0267\u0265\3\2\2\2\u0267\u0266\3\2"+
		"\2\2\u0268\u0081\3\2\2\2\u0269\u026a\7+\2\2\u026a\u0083\3\2\2\2\u026b"+
		"\u026c\7,\2\2\u026c\u0085\3\2\2\2\u026d\u0278\5\u0088E\2\u026e\u0278\5"+
		"\u008aF\2\u026f\u0278\5\u008cG\2\u0270\u0278\5\u008eH\2\u0271\u0278\5"+
		"\u0090I\2\u0272\u0278\5\u0092J\2\u0273\u0278\5\u0094K\2\u0274\u0278\5"+
		"\u0096L\2\u0275\u0278\5\u0098M\2\u0276\u0278\5\u009aN\2\u0277\u026d\3"+
		"\2\2\2\u0277\u026e\3\2\2\2\u0277\u026f\3\2\2\2\u0277\u0270\3\2\2\2\u0277"+
		"\u0271\3\2\2\2\u0277\u0272\3\2\2\2\u0277\u0273\3\2\2\2\u0277\u0274\3\2"+
		"\2\2\u0277\u0275\3\2\2\2\u0277\u0276\3\2\2\2\u0278\u0087\3\2\2\2\u0279"+
		"\u027a\7-\2\2\u027a\u0089\3\2\2\2\u027b\u027c\7.\2\2\u027c\u008b\3\2\2"+
		"\2\u027d\u027e\7/\2\2\u027e\u008d\3\2\2\2\u027f\u0280\7\60\2\2\u0280\u008f"+
		"\3\2\2\2\u0281\u0282\7\61\2\2\u0282\u0091\3\2\2\2\u0283\u0284\7\62\2\2"+
		"\u0284\u0093\3\2\2\2\u0285\u0286\7\63\2\2\u0286\u0095\3\2\2\2\u0287\u0288"+
		"\7\64\2\2\u0288\u0097\3\2\2\2\u0289\u028a\7\65\2\2\u028a\u0099\3\2\2\2"+
		"\u028b\u028c\7\66\2\2\u028c\u009b\3\2\2\2\u028d\u028e\7\67\2\2\u028e\u009d"+
		"\3\2\2\2\u028f\u0290\78\2\2\u0290\u009f\3\2\2\2\u0291\u0292\79\2\2\u0292"+
		"\u00a1\3\2\2\2\u0293\u0294\7:\2\2\u0294\u00a3\3\2\2\2\u0295\u0296\7;\2"+
		"\2\u0296\u00a5\3\2\2\2\u0297\u0298\7B\2\2\u0298\u00a7\3\2\2\2\u0299\u029a"+
		"\t\3\2\2\u029a\u00a9\3\2\2\2\u029b\u029c\7@\2\2\u029c\u00ab\3\2\2\2\u029d"+
		"\u029e\7<\2\2\u029e\u00ad\3\2\2\2\u029f\u02a0\7=\2\2\u02a0\u00af\3\2\2"+
		"\2\u02a1\u02a2\7>\2\2\u02a2\u00b1\3\2\2\2\u02a3\u02a4\7?\2\2\u02a4\u00b3"+
		"\3\2\2\2\u02a5\u02a6\7A\2\2\u02a6\u00b5\3\2\2\2\60\u00b9\u00bb\u00c1\u00c3"+
		"\u00d3\u00d6\u00df\u00ed\u0104\u0106\u010c\u0113\u0118\u011f\u0124\u012c"+
		"\u0136\u013e\u0145\u0148\u014c\u014e\u0157\u0166\u0170\u0175\u0177\u0183"+
		"\u018c\u0190\u019e\u01a6\u01ba\u01c4\u01c6\u01d1\u01de\u01ea\u01f6\u01fb"+
		"\u023a\u023d\u0247\u0255\u0267\u0277";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}