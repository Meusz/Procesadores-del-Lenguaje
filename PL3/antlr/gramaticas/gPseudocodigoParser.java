// Generated from .\gPseudocodigoParser.g4 by ANTLR 4.9
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
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

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
		RULE_instruccion = 12, RULE_valor = 13, RULE_deotromodo = 14, RULE_mientras = 15, 
		RULE_repetir = 16, RULE_hastaque = 17, RULE_lazospara = 18, RULE_deffuncion = 19, 
		RULE_cabecera = 20, RULE_retorno = 21, RULE_exprlogica = 22, RULE_expr = 23, 
		RULE_array = 24, RULE_kwinicio = 25, RULE_kwfin = 26, RULE_kwini = 27, 
		RULE_kwdefinir = 28, RULE_kwcomo = 29, RULE_kwflecha = 30, RULE_kwdimension = 31, 
		RULE_kwleer = 32, RULE_kwescribir = 33, RULE_kwcierrasi = 34, RULE_kwsino = 35, 
		RULE_kwentonces = 36, RULE_kwsi = 37, RULE_kwdeotromodo = 38, RULE_kwfinsegun = 39, 
		RULE_kwsegun = 40, RULE_kwhacer = 41, RULE_kwfinmientras = 42, RULE_kwmientras = 43, 
		RULE_kwrepetir = 44, RULE_kwhastaque = 45, RULE_kwfinpara = 46, RULE_kwpara = 47, 
		RULE_kwhasta = 48, RULE_kwconpaso = 49, RULE_kwfuncion = 50, RULE_invocafuncion = 51, 
		RULE_argumentos = 52, RULE_kwfinfuncion = 53, RULE_operadorrel = 54, RULE_operadorlog = 55, 
		RULE_conjuncion = 56, RULE_disyuncion = 57, RULE_negacion = 58, RULE_operadoralge = 59, 
		RULE_igual = 60, RULE_suma = 61, RULE_resta = 62, RULE_multiplicacion = 63, 
		RULE_division = 64, RULE_potenciacion = 65, RULE_modulo = 66, RULE_operadorseparador = 67, 
		RULE_coma = 68, RULE_barrabaja = 69, RULE_funciones = 70, RULE_rc = 71, 
		RULE_abs = 72, RULE_ln = 73, RULE_exp = 74, RULE_sen = 75, RULE_cos = 76, 
		RULE_atan = 77, RULE_trunc = 78, RULE_redon = 79, RULE_azar = 80, RULE_tipo = 81, 
		RULE_real = 82, RULE_entero = 83, RULE_bool = 84, RULE_string = 85, RULE_id = 86, 
		RULE_comentario = 87, RULE_dospuntos = 88, RULE_pi = 89, RULE_pd = 90, 
		RULE_ci = 91, RULE_cd = 92, RULE_puntoycoma = 93;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "main", "instrucciones", "definir", "asignacion", "entrada", 
			"salidas", "dimensionamiento", "condicional", "sino", "si", "seleccionmultiple", 
			"instruccion", "valor", "deotromodo", "mientras", "repetir", "hastaque", 
			"lazospara", "deffuncion", "cabecera", "retorno", "exprlogica", "expr", 
			"array", "kwinicio", "kwfin", "kwini", "kwdefinir", "kwcomo", "kwflecha", 
			"kwdimension", "kwleer", "kwescribir", "kwcierrasi", "kwsino", "kwentonces", 
			"kwsi", "kwdeotromodo", "kwfinsegun", "kwsegun", "kwhacer", "kwfinmientras", 
			"kwmientras", "kwrepetir", "kwhastaque", "kwfinpara", "kwpara", "kwhasta", 
			"kwconpaso", "kwfuncion", "invocafuncion", "argumentos", "kwfinfuncion", 
			"operadorrel", "operadorlog", "conjuncion", "disyuncion", "negacion", 
			"operadoralge", "igual", "suma", "resta", "multiplicacion", "division", 
			"potenciacion", "modulo", "operadorseparador", "coma", "barrabaja", "funciones", 
			"rc", "abs", "ln", "exp", "sen", "cos", "atan", "trunc", "redon", "azar", 
			"tipo", "real", "entero", "bool", "string", "id", "comentario", "dospuntos", 
			"pi", "pd", "ci", "cd", "puntoycoma"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INI || _la==FUNCION || _la==COMENTARIO_LINEA || _la==COMENTARIO_BLOQUE) {
				{
				setState(191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INI:
					{
					setState(188);
					main();
					}
					break;
				case COMENTARIO_LINEA:
				case COMENTARIO_BLOQUE:
					{
					setState(189);
					comentario();
					}
					break;
				case FUNCION:
					{
					setState(190);
					deffuncion();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			kwinicio();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)) | (1L << (COMENTARIO_LINEA - 3)) | (1L << (COMENTARIO_BLOQUE - 3)))) != 0)) {
				{
				setState(199);
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
					setState(197);
					instrucciones();
					}
					break;
				case COMENTARIO_LINEA:
				case COMENTARIO_BLOQUE:
					{
					setState(198);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitInstrucciones(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(206);
				expr(0);
				}
				break;
			case 2:
				{
				setState(207);
				condicional();
				}
				break;
			case 3:
				{
				setState(208);
				asignacion();
				}
				break;
			case 4:
				{
				setState(209);
				entrada();
				}
				break;
			case 5:
				{
				setState(210);
				salidas();
				}
				break;
			case 6:
				{
				setState(211);
				dimensionamiento();
				}
				break;
			case 7:
				{
				setState(212);
				seleccionmultiple();
				}
				break;
			case 8:
				{
				setState(213);
				mientras();
				}
				break;
			case 9:
				{
				setState(214);
				repetir();
				}
				break;
			case 10:
				{
				setState(215);
				lazospara();
				}
				break;
			case 11:
				{
				setState(216);
				definir();
				}
				break;
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PUNTOCOMA) {
				{
				setState(219);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterDefinir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitDefinir(this);
		}
	}

	public final DefinirContext definir() throws RecognitionException {
		DefinirContext _localctx = new DefinirContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			kwdefinir();
			setState(223);
			id();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(224);
				coma();
				setState(225);
				id();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			kwcomo();
			setState(233);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				id();
				setState(236);
				kwflecha();
				setState(237);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				expr(0);
				setState(240);
				igual();
				setState(241);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitEntrada(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_entrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			kwleer();
			setState(246);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterSalidas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitSalidas(this);
		}
	}

	public final SalidasContext salidas() throws RecognitionException {
		SalidasContext _localctx = new SalidasContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_salidas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			kwescribir();
			setState(249);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterDimensionamiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitDimensionamiento(this);
		}
	}

	public final DimensionamientoContext dimensionamiento() throws RecognitionException {
		DimensionamientoContext _localctx = new DimensionamientoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dimensionamiento);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIMENSION:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				kwdimension();
				setState(252);
				id();
				setState(253);
				array();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				id();
				setState(256);
				ci();
				setState(257);
				expr(0);
				setState(258);
				cd();
				setState(259);
				kwflecha();
				setState(266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(260);
					id();
					setState(261);
					ci();
					setState(262);
					expr(0);
					setState(263);
					cd();
					}
					break;
				case STRING:
					{
					setState(265);
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
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			si();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)) | (1L << (COMENTARIO_LINEA - 3)) | (1L << (COMENTARIO_BLOQUE - 3)))) != 0)) {
				{
				setState(273);
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
					setState(271);
					instrucciones();
					}
					break;
				case COMENTARIO_LINEA:
				case COMENTARIO_BLOQUE:
					{
					setState(272);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SINO) {
				{
				{
				setState(278);
				sino();
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)) | (1L << (COMENTARIO_LINEA - 3)) | (1L << (COMENTARIO_BLOQUE - 3)))) != 0)) {
					{
					setState(281);
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
						setState(279);
						instrucciones();
						}
						break;
					case COMENTARIO_LINEA:
					case COMENTARIO_BLOQUE:
						{
						setState(280);
						comentario();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterSino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitSino(this);
		}
	}

	public final SinoContext sino() throws RecognitionException {
		SinoContext _localctx = new SinoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			kwsino();
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(294);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitSi(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			kwsi();
			setState(298);
			exprlogica(0);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENTONCES) {
				{
				setState(299);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterSeleccionmultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitSeleccionmultiple(this);
		}
	}

	public final SeleccionmultipleContext seleccionmultiple() throws RecognitionException {
		SeleccionmultipleContext _localctx = new SeleccionmultipleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_seleccionmultiple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			kwsegun();
			setState(303);
			id();
			setState(304);
			kwhacer();
			setState(306); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(305);
				instruccion();
				}
				}
				setState(308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (RC - 43)) | (1L << (ABS - 43)) | (1L << (LN - 43)) | (1L << (EXP - 43)) | (1L << (SEN - 43)) | (1L << (COS - 43)) | (1L << (ATAN - 43)) | (1L << (TRUNC - 43)) | (1L << (REDON - 43)) | (1L << (AZAR - 43)) | (1L << (FLOAT - 43)) | (1L << (INT - 43)) | (1L << (BOOL - 43)) | (1L << (STRING - 43)) | (1L << (PI - 43)) | (1L << (CI - 43)) | (1L << (ID - 43)))) != 0) );
			setState(310);
			deotromodo();
			setState(311);
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
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
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
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitInstruccion(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instruccion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			valor();
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(316);
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
						setState(314);
						instrucciones();
						}
						break;
					case COMENTARIO_LINEA:
					case COMENTARIO_BLOQUE:
						{
						setState(315);
						comentario();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class ValorContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DospuntosContext dospuntos() {
			return getRuleContext(DospuntosContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_valor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			expr(0);
			setState(322);
			dospuntos();
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
		public DeotromodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deotromodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterDeotromodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitDeotromodo(this);
		}
	}

	public final DeotromodoContext deotromodo() throws RecognitionException {
		DeotromodoContext _localctx = new DeotromodoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_deotromodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			kwdeotromodo();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)) | (1L << (COMENTARIO_LINEA - 3)) | (1L << (COMENTARIO_BLOQUE - 3)))) != 0)) {
				{
				setState(327);
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
					setState(325);
					instrucciones();
					}
					break;
				case COMENTARIO_LINEA:
				case COMENTARIO_BLOQUE:
					{
					setState(326);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(331);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitMientras(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mientras);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			kwmientras();
			setState(334); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(333);
					exprlogica(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(336); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HACER) {
				{
				setState(338);
				kwhacer();
				}
			}

			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)) | (1L << (COMENTARIO_LINEA - 3)) | (1L << (COMENTARIO_BLOQUE - 3)))) != 0)) {
				{
				setState(343);
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
					setState(341);
					instrucciones();
					}
					break;
				case COMENTARIO_LINEA:
				case COMENTARIO_BLOQUE:
					{
					setState(342);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterRepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitRepetir(this);
		}
	}

	public final RepetirContext repetir() throws RecognitionException {
		RepetirContext _localctx = new RepetirContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_repetir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			kwrepetir();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)))) != 0)) {
				{
				{
				setState(351);
				instrucciones();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterHastaque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitHastaque(this);
		}
	}

	public final HastaqueContext hastaque() throws RecognitionException {
		HastaqueContext _localctx = new HastaqueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_hastaque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			kwhastaque();
			setState(360);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterLazospara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitLazospara(this);
		}
	}

	public final LazosparaContext lazospara() throws RecognitionException {
		LazosparaContext _localctx = new LazosparaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lazospara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			kwpara();
			setState(363);
			id();
			setState(364);
			kwflecha();
			setState(365);
			entero();
			setState(366);
			kwhasta();
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(367);
				entero();
				}
				break;
			case ID:
				{
				setState(368);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PI:
				{
				setState(371);
				pi();
				setState(372);
				kwconpaso();
				setState(373);
				entero();
				setState(374);
				pd();
				}
				break;
			case CONPASO:
				{
				setState(376);
				kwconpaso();
				setState(377);
				entero();
				}
				break;
			case HACER:
				break;
			default:
				break;
			}
			setState(381);
			kwhacer();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)) | (1L << (COMENTARIO_LINEA - 3)) | (1L << (COMENTARIO_BLOQUE - 3)))) != 0)) {
				{
				setState(384);
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
					setState(382);
					instrucciones();
					}
					break;
				case COMENTARIO_LINEA:
				case COMENTARIO_BLOQUE:
					{
					setState(383);
					comentario();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
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
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public KwflechaContext kwflecha() {
			return getRuleContext(KwflechaContext.class,0);
		}
		public CabeceraContext cabecera() {
			return getRuleContext(CabeceraContext.class,0);
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
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public DeffuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deffuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterDeffuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitDeffuncion(this);
		}
	}

	public final DeffuncionContext deffuncion() throws RecognitionException {
		DeffuncionContext _localctx = new DeffuncionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_deffuncion);
		int _la;
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				kwfuncion();
				setState(392);
				retorno();
				setState(393);
				kwflecha();
				setState(394);
				cabecera();
				setState(397); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(397);
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
						setState(395);
						instrucciones();
						}
						break;
					case COMENTARIO_LINEA:
					case COMENTARIO_BLOQUE:
						{
						setState(396);
						comentario();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(399); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)) | (1L << (COMENTARIO_LINEA - 3)) | (1L << (COMENTARIO_BLOQUE - 3)))) != 0) );
				setState(401);
				kwfinfuncion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				kwfuncion();
				setState(404);
				cabecera();
				setState(406); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(405);
					instrucciones();
					}
					}
					setState(408); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (DEFINIR - 3)) | (1L << (DIMENSION - 3)) | (1L << (LEER - 3)) | (1L << (ESCRIBIR - 3)) | (1L << (SI - 3)) | (1L << (SEGUN - 3)) | (1L << (MIENTRAS - 3)) | (1L << (REPETIR - 3)) | (1L << (PARA - 3)) | (1L << (RC - 3)) | (1L << (ABS - 3)) | (1L << (LN - 3)) | (1L << (EXP - 3)) | (1L << (SEN - 3)) | (1L << (COS - 3)) | (1L << (ATAN - 3)) | (1L << (TRUNC - 3)) | (1L << (REDON - 3)) | (1L << (AZAR - 3)) | (1L << (FLOAT - 3)) | (1L << (INT - 3)) | (1L << (BOOL - 3)) | (1L << (STRING - 3)) | (1L << (PI - 3)) | (1L << (CI - 3)) | (1L << (ID - 3)))) != 0) );
				setState(410);
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

	public static class CabeceraContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PiContext pi() {
			return getRuleContext(PiContext.class,0);
		}
		public PdContext pd() {
			return getRuleContext(PdContext.class,0);
		}
		public List<ArgumentosContext> argumentos() {
			return getRuleContexts(ArgumentosContext.class);
		}
		public ArgumentosContext argumentos(int i) {
			return getRuleContext(ArgumentosContext.class,i);
		}
		public List<ComaContext> coma() {
			return getRuleContexts(ComaContext.class);
		}
		public ComaContext coma(int i) {
			return getRuleContext(ComaContext.class,i);
		}
		public CabeceraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterCabecera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitCabecera(this);
		}
	}

	public final CabeceraContext cabecera() throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cabecera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			id();
			setState(415);
			pi();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (RC - 43)) | (1L << (ABS - 43)) | (1L << (LN - 43)) | (1L << (EXP - 43)) | (1L << (SEN - 43)) | (1L << (COS - 43)) | (1L << (ATAN - 43)) | (1L << (TRUNC - 43)) | (1L << (REDON - 43)) | (1L << (AZAR - 43)) | (1L << (FLOAT - 43)) | (1L << (INT - 43)) | (1L << (BOOL - 43)) | (1L << (STRING - 43)) | (1L << (PI - 43)) | (1L << (CI - 43)) | (1L << (ID - 43)))) != 0)) {
				{
				setState(416);
				argumentos();
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(417);
					coma();
					setState(418);
					argumentos();
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(427);
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

	public static class RetornoContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterExprlogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitExprlogica(this);
		}
	}

	public final ExprlogicaContext exprlogica() throws RecognitionException {
		return exprlogica(0);
	}

	private ExprlogicaContext exprlogica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprlogicaContext _localctx = new ExprlogicaContext(_ctx, _parentState);
		ExprlogicaContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_exprlogica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(432);
				pi();
				setState(433);
				exprlogica(0);
				setState(434);
				pd();
				}
				break;
			case 2:
				{
				setState(436);
				negacion();
				setState(437);
				exprlogica(2);
				}
				break;
			case 3:
				{
				setState(439);
				expr(0);
				setState(440);
				operadorrel();
				setState(441);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprlogicaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exprlogica);
					setState(445);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(446);
					operadorlog();
					setState(447);
					exprlogica(4);
					}
					} 
				}
				setState(453);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(455);
				invocafuncion();
				}
				break;
			case 2:
				{
				setState(456);
				funciones();
				setState(457);
				pi();
				setState(458);
				expr(0);
				setState(459);
				pd();
				}
				break;
			case 3:
				{
				setState(461);
				array();
				}
				break;
			case 4:
				{
				setState(462);
				entero();
				}
				break;
			case 5:
				{
				setState(463);
				real();
				}
				break;
			case 6:
				{
				setState(464);
				bool();
				}
				break;
			case 7:
				{
				setState(465);
				string();
				}
				break;
			case 8:
				{
				setState(466);
				id();
				}
				break;
			case 9:
				{
				setState(467);
				pi();
				setState(468);
				expr(0);
				setState(469);
				pd();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(481);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(473);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(474);
						operadoralge();
						setState(475);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(477);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(478);
						operadorseparador();
						setState(479);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_array);
		int _la;
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				id();
				setState(487);
				ci();
				setState(488);
				expr(0);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(489);
					coma();
					setState(490);
					expr(0);
					}
					}
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(497);
				cd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				id();
				setState(500);
				pi();
				setState(501);
				expr(0);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(502);
					coma();
					setState(503);
					expr(0);
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(510);
				pd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(512);
				pi();
				setState(513);
				expr(0);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(514);
					coma();
					setState(515);
					expr(0);
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(522);
				pd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(524);
				ci();
				setState(525);
				expr(0);
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(526);
					coma();
					setState(527);
					expr(0);
					}
					}
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(534);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwinicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwinicio(this);
		}
	}

	public final KwinicioContext kwinicio() throws RecognitionException {
		KwinicioContext _localctx = new KwinicioContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_kwinicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			kwini();
			setState(539);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwfin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwfin(this);
		}
	}

	public final KwfinContext kwfin() throws RecognitionException {
		KwfinContext _localctx = new KwfinContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_kwfin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwini(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwini(this);
		}
	}

	public final KwiniContext kwini() throws RecognitionException {
		KwiniContext _localctx = new KwiniContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_kwini);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwdefinir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwdefinir(this);
		}
	}

	public final KwdefinirContext kwdefinir() throws RecognitionException {
		KwdefinirContext _localctx = new KwdefinirContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_kwdefinir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwcomo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwcomo(this);
		}
	}

	public final KwcomoContext kwcomo() throws RecognitionException {
		KwcomoContext _localctx = new KwcomoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_kwcomo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwflecha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwflecha(this);
		}
	}

	public final KwflechaContext kwflecha() throws RecognitionException {
		KwflechaContext _localctx = new KwflechaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_kwflecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwdimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwdimension(this);
		}
	}

	public final KwdimensionContext kwdimension() throws RecognitionException {
		KwdimensionContext _localctx = new KwdimensionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_kwdimension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwleer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwleer(this);
		}
	}

	public final KwleerContext kwleer() throws RecognitionException {
		KwleerContext _localctx = new KwleerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_kwleer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwescribir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwescribir(this);
		}
	}

	public final KwescribirContext kwescribir() throws RecognitionException {
		KwescribirContext _localctx = new KwescribirContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_kwescribir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwcierrasi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwcierrasi(this);
		}
	}

	public final KwcierrasiContext kwcierrasi() throws RecognitionException {
		KwcierrasiContext _localctx = new KwcierrasiContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_kwcierrasi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwsino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwsino(this);
		}
	}

	public final KwsinoContext kwsino() throws RecognitionException {
		KwsinoContext _localctx = new KwsinoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_kwsino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwentonces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwentonces(this);
		}
	}

	public final KwentoncesContext kwentonces() throws RecognitionException {
		KwentoncesContext _localctx = new KwentoncesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_kwentonces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwsi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwsi(this);
		}
	}

	public final KwsiContext kwsi() throws RecognitionException {
		KwsiContext _localctx = new KwsiContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_kwsi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
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
		public DospuntosContext dospuntos() {
			return getRuleContext(DospuntosContext.class,0);
		}
		public KwdeotromodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwdeotromodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwdeotromodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwdeotromodo(this);
		}
	}

	public final KwdeotromodoContext kwdeotromodo() throws RecognitionException {
		KwdeotromodoContext _localctx = new KwdeotromodoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_kwdeotromodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(DEOTROMODO);
			setState(566);
			dospuntos();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwfinsegun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwfinsegun(this);
		}
	}

	public final KwfinsegunContext kwfinsegun() throws RecognitionException {
		KwfinsegunContext _localctx = new KwfinsegunContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_kwfinsegun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwsegun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwsegun(this);
		}
	}

	public final KwsegunContext kwsegun() throws RecognitionException {
		KwsegunContext _localctx = new KwsegunContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_kwsegun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwhacer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwhacer(this);
		}
	}

	public final KwhacerContext kwhacer() throws RecognitionException {
		KwhacerContext _localctx = new KwhacerContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_kwhacer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwfinmientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwfinmientras(this);
		}
	}

	public final KwfinmientrasContext kwfinmientras() throws RecognitionException {
		KwfinmientrasContext _localctx = new KwfinmientrasContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_kwfinmientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwmientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwmientras(this);
		}
	}

	public final KwmientrasContext kwmientras() throws RecognitionException {
		KwmientrasContext _localctx = new KwmientrasContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_kwmientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwrepetir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwrepetir(this);
		}
	}

	public final KwrepetirContext kwrepetir() throws RecognitionException {
		KwrepetirContext _localctx = new KwrepetirContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_kwrepetir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwhastaque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwhastaque(this);
		}
	}

	public final KwhastaqueContext kwhastaque() throws RecognitionException {
		KwhastaqueContext _localctx = new KwhastaqueContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_kwhastaque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwfinpara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwfinpara(this);
		}
	}

	public final KwfinparaContext kwfinpara() throws RecognitionException {
		KwfinparaContext _localctx = new KwfinparaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_kwfinpara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwpara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwpara(this);
		}
	}

	public final KwparaContext kwpara() throws RecognitionException {
		KwparaContext _localctx = new KwparaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_kwpara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwhasta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwhasta(this);
		}
	}

	public final KwhastaContext kwhasta() throws RecognitionException {
		KwhastaContext _localctx = new KwhastaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_kwhasta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwconpaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwconpaso(this);
		}
	}

	public final KwconpasoContext kwconpaso() throws RecognitionException {
		KwconpasoContext _localctx = new KwconpasoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_kwconpaso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwfuncion(this);
		}
	}

	public final KwfuncionContext kwfuncion() throws RecognitionException {
		KwfuncionContext _localctx = new KwfuncionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_kwfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
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
		public List<ArgumentosContext> argumentos() {
			return getRuleContexts(ArgumentosContext.class);
		}
		public ArgumentosContext argumentos(int i) {
			return getRuleContext(ArgumentosContext.class,i);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterInvocafuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitInvocafuncion(this);
		}
	}

	public final InvocafuncionContext invocafuncion() throws RecognitionException {
		InvocafuncionContext _localctx = new InvocafuncionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_invocafuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			id();
			setState(593);
			pi();
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (RC - 43)) | (1L << (ABS - 43)) | (1L << (LN - 43)) | (1L << (EXP - 43)) | (1L << (SEN - 43)) | (1L << (COS - 43)) | (1L << (ATAN - 43)) | (1L << (TRUNC - 43)) | (1L << (REDON - 43)) | (1L << (AZAR - 43)) | (1L << (FLOAT - 43)) | (1L << (INT - 43)) | (1L << (BOOL - 43)) | (1L << (STRING - 43)) | (1L << (PI - 43)) | (1L << (CI - 43)) | (1L << (ID - 43)))) != 0)) {
				{
				setState(594);
				argumentos();
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(595);
					coma();
					setState(596);
					argumentos();
					}
					}
					setState(602);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(605);
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

	public static class ArgumentosContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public InvocafuncionContext invocafuncion() {
			return getRuleContext(InvocafuncionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_argumentos);
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(608);
				invocafuncion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
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

	public static class KwfinfuncionContext extends ParserRuleContext {
		public TerminalNode FINFUNCION() { return getToken(gPseudocodigoParser.FINFUNCION, 0); }
		public KwfinfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwfinfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterKwfinfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitKwfinfuncion(this);
		}
	}

	public final KwfinfuncionContext kwfinfuncion() throws RecognitionException {
		KwfinfuncionContext _localctx = new KwfinfuncionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_kwfinfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterOperadorrel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitOperadorrel(this);
		}
	}

	public final OperadorrelContext operadorrel() throws RecognitionException {
		OperadorrelContext _localctx = new OperadorrelContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_operadorrel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterOperadorlog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitOperadorlog(this);
		}
	}

	public final OperadorlogContext operadorlog() throws RecognitionException {
		OperadorlogContext _localctx = new OperadorlogContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_operadorlog);
		try {
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONJUNCION:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				conjuncion();
				}
				break;
			case DISYUNCION:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterConjuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitConjuncion(this);
		}
	}

	public final ConjuncionContext conjuncion() throws RecognitionException {
		ConjuncionContext _localctx = new ConjuncionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_conjuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterDisyuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitDisyuncion(this);
		}
	}

	public final DisyuncionContext disyuncion() throws RecognitionException {
		DisyuncionContext _localctx = new DisyuncionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_disyuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterNegacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitNegacion(this);
		}
	}

	public final NegacionContext negacion() throws RecognitionException {
		NegacionContext _localctx = new NegacionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_negacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterOperadoralge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitOperadoralge(this);
		}
	}

	public final OperadoralgeContext operadoralge() throws RecognitionException {
		OperadoralgeContext _localctx = new OperadoralgeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_operadoralge);
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				suma();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				resta();
				}
				break;
			case MULTIPLICACION:
				enterOuterAlt(_localctx, 3);
				{
				setState(628);
				multiplicacion();
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 4);
				{
				setState(629);
				division();
				}
				break;
			case POTENCIACION:
				enterOuterAlt(_localctx, 5);
				{
				setState(630);
				potenciacion();
				}
				break;
			case MODULO:
				enterOuterAlt(_localctx, 6);
				{
				setState(631);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitIgual(this);
		}
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitSuma(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitResta(this);
		}
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterMultiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitMultiplicacion(this);
		}
	}

	public final MultiplicacionContext multiplicacion() throws RecognitionException {
		MultiplicacionContext _localctx = new MultiplicacionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_multiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitDivision(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterPotenciacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitPotenciacion(this);
		}
	}

	public final PotenciacionContext potenciacion() throws RecognitionException {
		PotenciacionContext _localctx = new PotenciacionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_potenciacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitModulo(this);
		}
	}

	public final ModuloContext modulo() throws RecognitionException {
		ModuloContext _localctx = new ModuloContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_modulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterOperadorseparador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitOperadorseparador(this);
		}
	}

	public final OperadorseparadorContext operadorseparador() throws RecognitionException {
		OperadorseparadorContext _localctx = new OperadorseparadorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_operadorseparador);
		try {
			setState(650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(648);
				coma();
				}
				break;
			case BARRABAJA:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterComa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitComa(this);
		}
	}

	public final ComaContext coma() throws RecognitionException {
		ComaContext _localctx = new ComaContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_coma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterBarrabaja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitBarrabaja(this);
		}
	}

	public final BarrabajaContext barrabaja() throws RecognitionException {
		BarrabajaContext _localctx = new BarrabajaContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_barrabaja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterFunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitFunciones(this);
		}
	}

	public final FuncionesContext funciones() throws RecognitionException {
		FuncionesContext _localctx = new FuncionesContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_funciones);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RC:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				rc();
				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				abs();
				}
				break;
			case LN:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				ln();
				}
				break;
			case EXP:
				enterOuterAlt(_localctx, 4);
				{
				setState(659);
				exp();
				}
				break;
			case SEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(660);
				sen();
				}
				break;
			case COS:
				enterOuterAlt(_localctx, 6);
				{
				setState(661);
				cos();
				}
				break;
			case ATAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(662);
				atan();
				}
				break;
			case TRUNC:
				enterOuterAlt(_localctx, 8);
				{
				setState(663);
				trunc();
				}
				break;
			case REDON:
				enterOuterAlt(_localctx, 9);
				{
				setState(664);
				redon();
				}
				break;
			case AZAR:
				enterOuterAlt(_localctx, 10);
				{
				setState(665);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterRc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitRc(this);
		}
	}

	public final RcContext rc() throws RecognitionException {
		RcContext _localctx = new RcContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_rc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterAbs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitAbs(this);
		}
	}

	public final AbsContext abs() throws RecognitionException {
		AbsContext _localctx = new AbsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_abs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterLn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitLn(this);
		}
	}

	public final LnContext ln() throws RecognitionException {
		LnContext _localctx = new LnContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterSen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitSen(this);
		}
	}

	public final SenContext sen() throws RecognitionException {
		SenContext _localctx = new SenContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_sen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitCos(this);
		}
	}

	public final CosContext cos() throws RecognitionException {
		CosContext _localctx = new CosContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterAtan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitAtan(this);
		}
	}

	public final AtanContext atan() throws RecognitionException {
		AtanContext _localctx = new AtanContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_atan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterTrunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitTrunc(this);
		}
	}

	public final TruncContext trunc() throws RecognitionException {
		TruncContext _localctx = new TruncContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_trunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterRedon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitRedon(this);
		}
	}

	public final RedonContext redon() throws RecognitionException {
		RedonContext _localctx = new RedonContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_redon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterAzar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitAzar(this);
		}
	}

	public final AzarContext azar() throws RecognitionException {
		AzarContext _localctx = new AzarContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_azar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitReal(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitEntero(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterDospuntos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitDospuntos(this);
		}
	}

	public final DospuntosContext dospuntos() throws RecognitionException {
		DospuntosContext _localctx = new DospuntosContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_dospuntos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterPi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitPi(this);
		}
	}

	public final PiContext pi() throws RecognitionException {
		PiContext _localctx = new PiContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_pi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterPd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitPd(this);
		}
	}

	public final PdContext pd() throws RecognitionException {
		PdContext _localctx = new PdContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_pd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterCi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitCi(this);
		}
	}

	public final CiContext ci() throws RecognitionException {
		CiContext _localctx = new CiContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_ci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterCd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitCd(this);
		}
	}

	public final CdContext cd() throws RecognitionException {
		CdContext _localctx = new CdContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_cd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).enterPuntoycoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gPseudocodigoParserListener ) ((gPseudocodigoParserListener)listener).exitPuntoycoma(this);
		}
	}

	public final PuntoycomaContext puntoycoma() throws RecognitionException {
		PuntoycomaContext _localctx = new PuntoycomaContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_puntoycoma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
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
		case 22:
			return exprlogica_sempred((ExprlogicaContext)_localctx, predIndex);
		case 23:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3G\u02cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\3\2\7\2\u00c2\n\2\f\2\16\2\u00c5\13\2\3\3\3\3\3\3\7\3\u00ca\n\3"+
		"\f\3\16\3\u00cd\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u00dc\n\4\3\4\5\4\u00df\n\4\3\5\3\5\3\5\3\5\3\5\7\5\u00e6\n\5\f"+
		"\5\16\5\u00e9\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00f6"+
		"\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u010d\n\t\5\t\u010f\n\t\3\n\3\n\3\n\7\n\u0114\n"+
		"\n\f\n\16\n\u0117\13\n\3\n\3\n\3\n\7\n\u011c\n\n\f\n\16\n\u011f\13\n\7"+
		"\n\u0121\n\n\f\n\16\n\u0124\13\n\3\n\3\n\3\13\3\13\5\13\u012a\n\13\3\f"+
		"\3\f\3\f\5\f\u012f\n\f\3\r\3\r\3\r\3\r\6\r\u0135\n\r\r\r\16\r\u0136\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\7\16\u013f\n\16\f\16\16\16\u0142\13\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\7\20\u014a\n\20\f\20\16\20\u014d\13\20\3\21"+
		"\3\21\6\21\u0151\n\21\r\21\16\21\u0152\3\21\5\21\u0156\n\21\3\21\3\21"+
		"\7\21\u015a\n\21\f\21\16\21\u015d\13\21\3\21\3\21\3\22\3\22\7\22\u0163"+
		"\n\22\f\22\16\22\u0166\13\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u0174\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u017e\n\24\3\24\3\24\3\24\7\24\u0183\n\24\f\24\16\24\u0186"+
		"\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u0190\n\25\r\25\16"+
		"\25\u0191\3\25\3\25\3\25\3\25\3\25\6\25\u0199\n\25\r\25\16\25\u019a\3"+
		"\25\3\25\5\25\u019f\n\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01a7\n\26"+
		"\f\26\16\26\u01aa\13\26\5\26\u01ac\n\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01be\n\30\3\30"+
		"\3\30\3\30\3\30\7\30\u01c4\n\30\f\30\16\30\u01c7\13\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u01da\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01e4\n"+
		"\31\f\31\16\31\u01e7\13\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01ef\n"+
		"\32\f\32\16\32\u01f2\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u01fc\n\32\f\32\16\32\u01ff\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\7\32\u0208\n\32\f\32\16\32\u020b\13\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\7\32\u0214\n\32\f\32\16\32\u0217\13\32\3\32\3\32\5\32\u021b\n\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0259\n\65\f\65\16\65\u025c\13\65"+
		"\5\65\u025e\n\65\3\65\3\65\3\66\3\66\3\66\5\66\u0265\n\66\3\67\3\67\3"+
		"8\38\39\39\59\u026d\n9\3:\3:\3;\3;\3<\3<\3=\3=\3=\3=\3=\3=\5=\u027b\n"+
		"=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\5E\u028d\nE\3F\3F\3"+
		"G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u029d\nH\3I\3I\3J\3J\3K\3K\3L\3"+
		"L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3"+
		"X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3_\2\4.\60`\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\2\4\3\2\35"+
		"!\3\2CD\2\u02c6\2\u00c3\3\2\2\2\4\u00c6\3\2\2\2\6\u00db\3\2\2\2\b\u00e0"+
		"\3\2\2\2\n\u00f5\3\2\2\2\f\u00f7\3\2\2\2\16\u00fa\3\2\2\2\20\u010e\3\2"+
		"\2\2\22\u0110\3\2\2\2\24\u0127\3\2\2\2\26\u012b\3\2\2\2\30\u0130\3\2\2"+
		"\2\32\u013b\3\2\2\2\34\u0143\3\2\2\2\36\u0146\3\2\2\2 \u014e\3\2\2\2\""+
		"\u0160\3\2\2\2$\u0169\3\2\2\2&\u016c\3\2\2\2(\u019e\3\2\2\2*\u01a0\3\2"+
		"\2\2,\u01af\3\2\2\2.\u01bd\3\2\2\2\60\u01d9\3\2\2\2\62\u021a\3\2\2\2\64"+
		"\u021c\3\2\2\2\66\u021f\3\2\2\28\u0221\3\2\2\2:\u0223\3\2\2\2<\u0225\3"+
		"\2\2\2>\u0227\3\2\2\2@\u0229\3\2\2\2B\u022b\3\2\2\2D\u022d\3\2\2\2F\u022f"+
		"\3\2\2\2H\u0231\3\2\2\2J\u0233\3\2\2\2L\u0235\3\2\2\2N\u0237\3\2\2\2P"+
		"\u023a\3\2\2\2R\u023c\3\2\2\2T\u023e\3\2\2\2V\u0240\3\2\2\2X\u0242\3\2"+
		"\2\2Z\u0244\3\2\2\2\\\u0246\3\2\2\2^\u0248\3\2\2\2`\u024a\3\2\2\2b\u024c"+
		"\3\2\2\2d\u024e\3\2\2\2f\u0250\3\2\2\2h\u0252\3\2\2\2j\u0264\3\2\2\2l"+
		"\u0266\3\2\2\2n\u0268\3\2\2\2p\u026c\3\2\2\2r\u026e\3\2\2\2t\u0270\3\2"+
		"\2\2v\u0272\3\2\2\2x\u027a\3\2\2\2z\u027c\3\2\2\2|\u027e\3\2\2\2~\u0280"+
		"\3\2\2\2\u0080\u0282\3\2\2\2\u0082\u0284\3\2\2\2\u0084\u0286\3\2\2\2\u0086"+
		"\u0288\3\2\2\2\u0088\u028c\3\2\2\2\u008a\u028e\3\2\2\2\u008c\u0290\3\2"+
		"\2\2\u008e\u029c\3\2\2\2\u0090\u029e\3\2\2\2\u0092\u02a0\3\2\2\2\u0094"+
		"\u02a2\3\2\2\2\u0096\u02a4\3\2\2\2\u0098\u02a6\3\2\2\2\u009a\u02a8\3\2"+
		"\2\2\u009c\u02aa\3\2\2\2\u009e\u02ac\3\2\2\2\u00a0\u02ae\3\2\2\2\u00a2"+
		"\u02b0\3\2\2\2\u00a4\u02b2\3\2\2\2\u00a6\u02b4\3\2\2\2\u00a8\u02b6\3\2"+
		"\2\2\u00aa\u02b8\3\2\2\2\u00ac\u02ba\3\2\2\2\u00ae\u02bc\3\2\2\2\u00b0"+
		"\u02be\3\2\2\2\u00b2\u02c0\3\2\2\2\u00b4\u02c2\3\2\2\2\u00b6\u02c4\3\2"+
		"\2\2\u00b8\u02c6\3\2\2\2\u00ba\u02c8\3\2\2\2\u00bc\u02ca\3\2\2\2\u00be"+
		"\u00c2\5\4\3\2\u00bf\u00c2\5\u00b0Y\2\u00c0\u00c2\5(\25\2\u00c1\u00be"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\3\3\2\2\2\u00c5\u00c3\3\2\2\2"+
		"\u00c6\u00cb\5\64\33\2\u00c7\u00ca\5\6\4\2\u00c8\u00ca\5\u00b0Y\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00cf\5\66\34\2\u00cf\5\3\2\2\2\u00d0\u00dc\5\60\31\2\u00d1\u00dc\5\22"+
		"\n\2\u00d2\u00dc\5\n\6\2\u00d3\u00dc\5\f\7\2\u00d4\u00dc\5\16\b\2\u00d5"+
		"\u00dc\5\20\t\2\u00d6\u00dc\5\30\r\2\u00d7\u00dc\5 \21\2\u00d8\u00dc\5"+
		"\"\22\2\u00d9\u00dc\5&\24\2\u00da\u00dc\5\b\5\2\u00db\u00d0\3\2\2\2\u00db"+
		"\u00d1\3\2\2\2\u00db\u00d2\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d4\3\2"+
		"\2\2\u00db\u00d5\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00db"+
		"\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00de\3\2"+
		"\2\2\u00dd\u00df\5\u00bc_\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\7\3\2\2\2\u00e0\u00e1\5:\36\2\u00e1\u00e7\5\u00aeX\2\u00e2\u00e3\5\u008a"+
		"F\2\u00e3\u00e4\5\u00aeX\2\u00e4\u00e6\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5<\37\2\u00eb\u00ec\5\u00a4S\2\u00ec"+
		"\t\3\2\2\2\u00ed\u00ee\5\u00aeX\2\u00ee\u00ef\5> \2\u00ef\u00f0\5\60\31"+
		"\2\u00f0\u00f6\3\2\2\2\u00f1\u00f2\5\60\31\2\u00f2\u00f3\5z>\2\u00f3\u00f4"+
		"\5\60\31\2\u00f4\u00f6\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5\u00f1\3\2\2\2"+
		"\u00f6\13\3\2\2\2\u00f7\u00f8\5B\"\2\u00f8\u00f9\5\u00aeX\2\u00f9\r\3"+
		"\2\2\2\u00fa\u00fb\5D#\2\u00fb\u00fc\5\60\31\2\u00fc\17\3\2\2\2\u00fd"+
		"\u00fe\5@!\2\u00fe\u00ff\5\u00aeX\2\u00ff\u0100\5\62\32\2\u0100\u010f"+
		"\3\2\2\2\u0101\u0102\5\u00aeX\2\u0102\u0103\5\u00b8]\2\u0103\u0104\5\60"+
		"\31\2\u0104\u0105\5\u00ba^\2\u0105\u010c\5> \2\u0106\u0107\5\u00aeX\2"+
		"\u0107\u0108\5\u00b8]\2\u0108\u0109\5\60\31\2\u0109\u010a\5\u00ba^\2\u010a"+
		"\u010d\3\2\2\2\u010b\u010d\5\u00acW\2\u010c\u0106\3\2\2\2\u010c\u010b"+
		"\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u00fd\3\2\2\2\u010e\u0101\3\2\2\2\u010f"+
		"\21\3\2\2\2\u0110\u0115\5\26\f\2\u0111\u0114\5\6\4\2\u0112\u0114\5\u00b0"+
		"Y\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0122\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0118\u011d\5\24\13\2\u0119\u011c\5\6\4\2\u011a\u011c\5\u00b0Y\2"+
		"\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u0120"+
		"\u0118\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\5F$\2\u0126\23"+
		"\3\2\2\2\u0127\u0129\5H%\2\u0128\u012a\5\26\f\2\u0129\u0128\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\25\3\2\2\2\u012b\u012c\5L\'\2\u012c\u012e\5.\30\2"+
		"\u012d\u012f\5J&\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\27\3"+
		"\2\2\2\u0130\u0131\5R*\2\u0131\u0132\5\u00aeX\2\u0132\u0134\5T+\2\u0133"+
		"\u0135\5\32\16\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0134\3"+
		"\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\5\36\20\2\u0139"+
		"\u013a\5P)\2\u013a\31\3\2\2\2\u013b\u0140\5\34\17\2\u013c\u013f\5\6\4"+
		"\2\u013d\u013f\5\u00b0Y\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\33\3\2\2"+
		"\2\u0142\u0140\3\2\2\2\u0143\u0144\5\60\31\2\u0144\u0145\5\u00b2Z\2\u0145"+
		"\35\3\2\2\2\u0146\u014b\5N(\2\u0147\u014a\5\6\4\2\u0148\u014a\5\u00b0"+
		"Y\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\37\3\2\2\2\u014d\u014b\3\2\2"+
		"\2\u014e\u0150\5X-\2\u014f\u0151\5.\30\2\u0150\u014f\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154"+
		"\u0156\5T+\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u015b\3\2\2"+
		"\2\u0157\u015a\5\6\4\2\u0158\u015a\5\u00b0Y\2\u0159\u0157\3\2\2\2\u0159"+
		"\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\5V,\2\u015f!"+
		"\3\2\2\2\u0160\u0164\5Z.\2\u0161\u0163\5\6\4\2\u0162\u0161\3\2\2\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0167\u0168\5$\23\2\u0168#\3\2\2\2\u0169\u016a"+
		"\5\\/\2\u016a\u016b\5.\30\2\u016b%\3\2\2\2\u016c\u016d\5`\61\2\u016d\u016e"+
		"\5\u00aeX\2\u016e\u016f\5> \2\u016f\u0170\5\u00a8U\2\u0170\u0173\5b\62"+
		"\2\u0171\u0174\5\u00a8U\2\u0172\u0174\5\u00aeX\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0172\3\2\2\2\u0174\u017d\3\2\2\2\u0175\u0176\5\u00b4[\2\u0176\u0177"+
		"\5d\63\2\u0177\u0178\5\u00a8U\2\u0178\u0179\5\u00b6\\\2\u0179\u017e\3"+
		"\2\2\2\u017a\u017b\5d\63\2\u017b\u017c\5\u00a8U\2\u017c\u017e\3\2\2\2"+
		"\u017d\u0175\3\2\2\2\u017d\u017a\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017f\u0184\5T+\2\u0180\u0183\5\6\4\2\u0181\u0183\5\u00b0Y\2"+
		"\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187"+
		"\u0188\5^\60\2\u0188\'\3\2\2\2\u0189\u018a\5f\64\2\u018a\u018b\5,\27\2"+
		"\u018b\u018c\5> \2\u018c\u018f\5*\26\2\u018d\u0190\5\6\4\2\u018e\u0190"+
		"\5\u00b0Y\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2\2"+
		"\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194"+
		"\5l\67\2\u0194\u019f\3\2\2\2\u0195\u0196\5f\64\2\u0196\u0198\5*\26\2\u0197"+
		"\u0199\5\6\4\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\5l\67\2\u019d"+
		"\u019f\3\2\2\2\u019e\u0189\3\2\2\2\u019e\u0195\3\2\2\2\u019f)\3\2\2\2"+
		"\u01a0\u01a1\5\u00aeX\2\u01a1\u01ab\5\u00b4[\2\u01a2\u01a8\5j\66\2\u01a3"+
		"\u01a4\5\u008aF\2\u01a4\u01a5\5j\66\2\u01a5\u01a7\3\2\2\2\u01a6\u01a3"+
		"\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01a2\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\5\u00b6\\\2\u01ae+\3\2\2\2\u01af"+
		"\u01b0\5\u00aeX\2\u01b0-\3\2\2\2\u01b1\u01b2\b\30\1\2\u01b2\u01b3\5\u00b4"+
		"[\2\u01b3\u01b4\5.\30\2\u01b4\u01b5\5\u00b6\\\2\u01b5\u01be\3\2\2\2\u01b6"+
		"\u01b7\5v<\2\u01b7\u01b8\5.\30\4\u01b8\u01be\3\2\2\2\u01b9\u01ba\5\60"+
		"\31\2\u01ba\u01bb\5n8\2\u01bb\u01bc\5\60\31\2\u01bc\u01be\3\2\2\2\u01bd"+
		"\u01b1\3\2\2\2\u01bd\u01b6\3\2\2\2\u01bd\u01b9\3\2\2\2\u01be\u01c5\3\2"+
		"\2\2\u01bf\u01c0\f\5\2\2\u01c0\u01c1\5p9\2\u01c1\u01c2\5.\30\6\u01c2\u01c4"+
		"\3\2\2\2\u01c3\u01bf\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6/\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\b\31\1\2"+
		"\u01c9\u01da\5h\65\2\u01ca\u01cb\5\u008eH\2\u01cb\u01cc\5\u00b4[\2\u01cc"+
		"\u01cd\5\60\31\2\u01cd\u01ce\5\u00b6\\\2\u01ce\u01da\3\2\2\2\u01cf\u01da"+
		"\5\62\32\2\u01d0\u01da\5\u00a8U\2\u01d1\u01da\5\u00a6T\2\u01d2\u01da\5"+
		"\u00aaV\2\u01d3\u01da\5\u00acW\2\u01d4\u01da\5\u00aeX\2\u01d5\u01d6\5"+
		"\u00b4[\2\u01d6\u01d7\5\60\31\2\u01d7\u01d8\5\u00b6\\\2\u01d8\u01da\3"+
		"\2\2\2\u01d9\u01c8\3\2\2\2\u01d9\u01ca\3\2\2\2\u01d9\u01cf\3\2\2\2\u01d9"+
		"\u01d0\3\2\2\2\u01d9\u01d1\3\2\2\2\u01d9\u01d2\3\2\2\2\u01d9\u01d3\3\2"+
		"\2\2\u01d9\u01d4\3\2\2\2\u01d9\u01d5\3\2\2\2\u01da\u01e5\3\2\2\2\u01db"+
		"\u01dc\f\f\2\2\u01dc\u01dd\5x=\2\u01dd\u01de\5\60\31\r\u01de\u01e4\3\2"+
		"\2\2\u01df\u01e0\f\13\2\2\u01e0\u01e1\5\u0088E\2\u01e1\u01e2\5\60\31\f"+
		"\u01e2\u01e4\3\2\2\2\u01e3\u01db\3\2\2\2\u01e3\u01df\3\2\2\2\u01e4\u01e7"+
		"\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\61\3\2\2\2\u01e7"+
		"\u01e5\3\2\2\2\u01e8\u01e9\5\u00aeX\2\u01e9\u01ea\5\u00b8]\2\u01ea\u01f0"+
		"\5\60\31\2\u01eb\u01ec\5\u008aF\2\u01ec\u01ed\5\60\31\2\u01ed\u01ef\3"+
		"\2\2\2\u01ee\u01eb\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\5\u00ba"+
		"^\2\u01f4\u021b\3\2\2\2\u01f5\u01f6\5\u00aeX\2\u01f6\u01f7\5\u00b4[\2"+
		"\u01f7\u01fd\5\60\31\2\u01f8\u01f9\5\u008aF\2\u01f9\u01fa\5\60\31\2\u01fa"+
		"\u01fc\3\2\2\2\u01fb\u01f8\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2"+
		"\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200"+
		"\u0201\5\u00b6\\\2\u0201\u021b\3\2\2\2\u0202\u0203\5\u00b4[\2\u0203\u0209"+
		"\5\60\31\2\u0204\u0205\5\u008aF\2\u0205\u0206\5\60\31\2\u0206\u0208\3"+
		"\2\2\2\u0207\u0204\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\5\u00b6"+
		"\\\2\u020d\u021b\3\2\2\2\u020e\u020f\5\u00b8]\2\u020f\u0215\5\60\31\2"+
		"\u0210\u0211\5\u008aF\2\u0211\u0212\5\60\31\2\u0212\u0214\3\2\2\2\u0213"+
		"\u0210\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216\u0218\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u0219\5\u00ba^\2\u0219"+
		"\u021b\3\2\2\2\u021a\u01e8\3\2\2\2\u021a\u01f5\3\2\2\2\u021a\u0202\3\2"+
		"\2\2\u021a\u020e\3\2\2\2\u021b\63\3\2\2\2\u021c\u021d\58\35\2\u021d\u021e"+
		"\5\u00aeX\2\u021e\65\3\2\2\2\u021f\u0220\7\3\2\2\u0220\67\3\2\2\2\u0221"+
		"\u0222\7\4\2\2\u02229\3\2\2\2\u0223\u0224\7\5\2\2\u0224;\3\2\2\2\u0225"+
		"\u0226\7\6\2\2\u0226=\3\2\2\2\u0227\u0228\7\7\2\2\u0228?\3\2\2\2\u0229"+
		"\u022a\7\b\2\2\u022aA\3\2\2\2\u022b\u022c\7\t\2\2\u022cC\3\2\2\2\u022d"+
		"\u022e\7\n\2\2\u022eE\3\2\2\2\u022f\u0230\7\13\2\2\u0230G\3\2\2\2\u0231"+
		"\u0232\7\f\2\2\u0232I\3\2\2\2\u0233\u0234\7\r\2\2\u0234K\3\2\2\2\u0235"+
		"\u0236\7\16\2\2\u0236M\3\2\2\2\u0237\u0238\7\17\2\2\u0238\u0239\5\u00b2"+
		"Z\2\u0239O\3\2\2\2\u023a\u023b\7\20\2\2\u023bQ\3\2\2\2\u023c\u023d\7\21"+
		"\2\2\u023dS\3\2\2\2\u023e\u023f\7\22\2\2\u023fU\3\2\2\2\u0240\u0241\7"+
		"\23\2\2\u0241W\3\2\2\2\u0242\u0243\7\24\2\2\u0243Y\3\2\2\2\u0244\u0245"+
		"\7\25\2\2\u0245[\3\2\2\2\u0246\u0247\7\26\2\2\u0247]\3\2\2\2\u0248\u0249"+
		"\7\27\2\2\u0249_\3\2\2\2\u024a\u024b\7\30\2\2\u024ba\3\2\2\2\u024c\u024d"+
		"\7\31\2\2\u024dc\3\2\2\2\u024e\u024f\7\32\2\2\u024fe\3\2\2\2\u0250\u0251"+
		"\7\33\2\2\u0251g\3\2\2\2\u0252\u0253\5\u00aeX\2\u0253\u025d\5\u00b4[\2"+
		"\u0254\u025a\5j\66\2\u0255\u0256\5\u008aF\2\u0256\u0257\5j\66\2\u0257"+
		"\u0259\3\2\2\2\u0258\u0255\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2"+
		"\2\2\u025a\u025b\3\2\2\2\u025b\u025e\3\2\2\2\u025c\u025a\3\2\2\2\u025d"+
		"\u0254\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\5\u00b6"+
		"\\\2\u0260i\3\2\2\2\u0261\u0265\5\u00aeX\2\u0262\u0265\5h\65\2\u0263\u0265"+
		"\5\60\31\2\u0264\u0261\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0263\3\2\2\2"+
		"\u0265k\3\2\2\2\u0266\u0267\7\34\2\2\u0267m\3\2\2\2\u0268\u0269\t\2\2"+
		"\2\u0269o\3\2\2\2\u026a\u026d\5r:\2\u026b\u026d\5t;\2\u026c\u026a\3\2"+
		"\2\2\u026c\u026b\3\2\2\2\u026dq\3\2\2\2\u026e\u026f\7\"\2\2\u026fs\3\2"+
		"\2\2\u0270\u0271\7#\2\2\u0271u\3\2\2\2\u0272\u0273\7$\2\2\u0273w\3\2\2"+
		"\2\u0274\u027b\5|?\2\u0275\u027b\5~@\2\u0276\u027b\5\u0080A\2\u0277\u027b"+
		"\5\u0082B\2\u0278\u027b\5\u0084C\2\u0279\u027b\5\u0086D\2\u027a\u0274"+
		"\3\2\2\2\u027a\u0275\3\2\2\2\u027a\u0276\3\2\2\2\u027a\u0277\3\2\2\2\u027a"+
		"\u0278\3\2\2\2\u027a\u0279\3\2\2\2\u027by\3\2\2\2\u027c\u027d\7\37\2\2"+
		"\u027d{\3\2\2\2\u027e\u027f\7%\2\2\u027f}\3\2\2\2\u0280\u0281\7&\2\2\u0281"+
		"\177\3\2\2\2\u0282\u0283\7\'\2\2\u0283\u0081\3\2\2\2\u0284\u0285\7(\2"+
		"\2\u0285\u0083\3\2\2\2\u0286\u0287\7)\2\2\u0287\u0085\3\2\2\2\u0288\u0289"+
		"\7*\2\2\u0289\u0087\3\2\2\2\u028a\u028d\5\u008aF\2\u028b\u028d\5\u008c"+
		"G\2\u028c\u028a\3\2\2\2\u028c\u028b\3\2\2\2\u028d\u0089\3\2\2\2\u028e"+
		"\u028f\7+\2\2\u028f\u008b\3\2\2\2\u0290\u0291\7,\2\2\u0291\u008d\3\2\2"+
		"\2\u0292\u029d\5\u0090I\2\u0293\u029d\5\u0092J\2\u0294\u029d\5\u0094K"+
		"\2\u0295\u029d\5\u0096L\2\u0296\u029d\5\u0098M\2\u0297\u029d\5\u009aN"+
		"\2\u0298\u029d\5\u009cO\2\u0299\u029d\5\u009eP\2\u029a\u029d\5\u00a0Q"+
		"\2\u029b\u029d\5\u00a2R\2\u029c\u0292\3\2\2\2\u029c\u0293\3\2\2\2\u029c"+
		"\u0294\3\2\2\2\u029c\u0295\3\2\2\2\u029c\u0296\3\2\2\2\u029c\u0297\3\2"+
		"\2\2\u029c\u0298\3\2\2\2\u029c\u0299\3\2\2\2\u029c\u029a\3\2\2\2\u029c"+
		"\u029b\3\2\2\2\u029d\u008f\3\2\2\2\u029e\u029f\7-\2\2\u029f\u0091\3\2"+
		"\2\2\u02a0\u02a1\7.\2\2\u02a1\u0093\3\2\2\2\u02a2\u02a3\7/\2\2\u02a3\u0095"+
		"\3\2\2\2\u02a4\u02a5\7\60\2\2\u02a5\u0097\3\2\2\2\u02a6\u02a7\7\61\2\2"+
		"\u02a7\u0099\3\2\2\2\u02a8\u02a9\7\62\2\2\u02a9\u009b\3\2\2\2\u02aa\u02ab"+
		"\7\63\2\2\u02ab\u009d\3\2\2\2\u02ac\u02ad\7\64\2\2\u02ad\u009f\3\2\2\2"+
		"\u02ae\u02af\7\65\2\2\u02af\u00a1\3\2\2\2\u02b0\u02b1\7\66\2\2\u02b1\u00a3"+
		"\3\2\2\2\u02b2\u02b3\7\67\2\2\u02b3\u00a5\3\2\2\2\u02b4\u02b5\78\2\2\u02b5"+
		"\u00a7\3\2\2\2\u02b6\u02b7\79\2\2\u02b7\u00a9\3\2\2\2\u02b8\u02b9\7:\2"+
		"\2\u02b9\u00ab\3\2\2\2\u02ba\u02bb\7;\2\2\u02bb\u00ad\3\2\2\2\u02bc\u02bd"+
		"\7B\2\2\u02bd\u00af\3\2\2\2\u02be\u02bf\t\3\2\2\u02bf\u00b1\3\2\2\2\u02c0"+
		"\u02c1\7@\2\2\u02c1\u00b3\3\2\2\2\u02c2\u02c3\7<\2\2\u02c3\u00b5\3\2\2"+
		"\2\u02c4\u02c5\7=\2\2\u02c5\u00b7\3\2\2\2\u02c6\u02c7\7>\2\2\u02c7\u00b9"+
		"\3\2\2\2\u02c8\u02c9\7?\2\2\u02c9\u00bb\3\2\2\2\u02ca\u02cb\7A\2\2\u02cb"+
		"\u00bd\3\2\2\28\u00c1\u00c3\u00c9\u00cb\u00db\u00de\u00e7\u00f5\u010c"+
		"\u010e\u0113\u0115\u011b\u011d\u0122\u0129\u012e\u0136\u013e\u0140\u0149"+
		"\u014b\u0152\u0155\u0159\u015b\u0164\u0173\u017d\u0182\u0184\u018f\u0191"+
		"\u019a\u019e\u01a8\u01ab\u01bd\u01c5\u01d9\u01e3\u01e5\u01f0\u01fd\u0209"+
		"\u0215\u021a\u025a\u025d\u0264\u026c\u027a\u028c\u029c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}