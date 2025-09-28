// Generated from /home/jeremy/Semestre/Compiladores/Proyecto LogoTEC/LogoTEC/LogoTEC.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LogoTECParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, COLOR=2, BOOLEAN=3, HAZ=4, INIC=5, INC=6, AVANZA=7, RETROCEDE=8, 
		GIRADERECHA=9, GIRAIZQUIERDA=10, OCULTATORTUGA=11, PONPOS=12, PONXY=13, 
		PONRUMBO=14, RUMBO=15, PONX=16, PONY=17, BAJALAPIZ=18, SUBELAPIZ=19, PONCOLORLAPIZ=20, 
		CENTRO=21, ESPERA=22, EJECUTA=23, REPITE=24, SI=25, HAZ_HASTA=26, HASTA=27, 
		HAZ_MIENTRAS=28, MIENTRAS=29, IGUALES=30, Y=31, O=32, MAYORQUE=33, MENORQUE=34, 
		DIFERENCIA=35, AZAR=36, PRODUCTO=37, POTENCIA=38, DIVISION=39, SUMA=40, 
		PARA=41, FIN=42, TRUE=43, FALSE=44, IGUAL=45, SEMICOLON=46, STRING=47, 
		ID=48, LETRAS=49, GUION_BAJO=50, DIGITO=51, NUMERO=52, ESPACIO=53, SALTO_LINEA=54, 
		SQUARE_OPEN=55, SQUARE_CLOSE=56, BRACKET_OPEN=57, BRACKET_CLOSE=58, PAR_OPEN=59, 
		GUION=60, PAR_CLOSE=61, COMILLA=62, WS=63;
	public static final int
		RULE_program = 0, RULE_estructura_comentario = 1, RULE_comentario = 2, 
		RULE_procedimientos = 3, RULE_procedimiento = 4, RULE_parametros = 5, 
		RULE_ordenes = 6, RULE_instruccion = 7, RULE_haz = 8, RULE_inic = 9, RULE_inc = 10, 
		RULE_avanza = 11, RULE_retrocede = 12, RULE_giraderecha = 13, RULE_giraizquierda = 14, 
		RULE_ocultatortuga = 15, RULE_ponpos = 16, RULE_ponxy = 17, RULE_ponrumbo = 18, 
		RULE_ponx = 19, RULE_pony = 20, RULE_bajalapiz = 21, RULE_subelapiz = 22, 
		RULE_poncolor = 23, RULE_centro = 24, RULE_espera = 25, RULE_ejecuta = 26, 
		RULE_repite = 27, RULE_si = 28, RULE_haz_hasta = 29, RULE_hasta = 30, 
		RULE_haz_mientras = 31, RULE_mientras = 32, RULE_op_logica = 33, RULE_y = 34, 
		RULE_o = 35, RULE_boolean_val = 36, RULE_op_comparativa = 37, RULE_iguales = 38, 
		RULE_mayorque = 39, RULE_menorque = 40, RULE_operacion = 41, RULE_op_algebraicas = 42, 
		RULE_numeric_val = 43, RULE_diferencia = 44, RULE_azar = 45, RULE_producto = 46, 
		RULE_potencia = 47, RULE_division = 48, RULE_suma = 49, RULE_rumbo = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "estructura_comentario", "comentario", "procedimientos", "procedimiento", 
			"parametros", "ordenes", "instruccion", "haz", "inic", "inc", "avanza", 
			"retrocede", "giraderecha", "giraizquierda", "ocultatortuga", "ponpos", 
			"ponxy", "ponrumbo", "ponx", "pony", "bajalapiz", "subelapiz", "poncolor", 
			"centro", "espera", "ejecuta", "repite", "si", "haz_hasta", "hasta", 
			"haz_mientras", "mientras", "op_logica", "y", "o", "boolean_val", "op_comparativa", 
			"iguales", "mayorque", "menorque", "operacion", "op_algebraicas", "numeric_val", 
			"diferencia", "azar", "producto", "potencia", "division", "suma", "rumbo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", null, null, "'HAZ'", "'INIC'", "'INC'", null, null, null, 
			null, null, "'PONPOS'", "'PONXY'", "'PONRUMBO'", "'RUMBO'", "'PONX'", 
			"'PONY'", null, null, null, "'CENTRO'", "'ESPERA'", "'EJECUTA'", "'REPITE'", 
			"'SI'", "'HAZ.HASTA'", "'HASTA'", "'HAZ.MIENTRAS'", "'MIENTRAS'", "'IGUALES?'", 
			"'Y'", "'O'", "'MAYORQUE?'", "'MENORQUE?'", "'DIFERENCIA'", "'AZAR'", 
			"'PRODUCTO'", "'POTENCIA'", "'DIVISION'", "'SUMA'", "'PARA'", "'FIN'", 
			"'TRUE'", "'FALSE'", "'='", "';'", null, null, null, "'_'", null, null, 
			"' '", "'\\n'", "'['", "']'", "'{'", "'}'", "'('", "'-'", "')'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "COLOR", "BOOLEAN", "HAZ", "INIC", "INC", "AVANZA", "RETROCEDE", 
			"GIRADERECHA", "GIRAIZQUIERDA", "OCULTATORTUGA", "PONPOS", "PONXY", "PONRUMBO", 
			"RUMBO", "PONX", "PONY", "BAJALAPIZ", "SUBELAPIZ", "PONCOLORLAPIZ", "CENTRO", 
			"ESPERA", "EJECUTA", "REPITE", "SI", "HAZ_HASTA", "HASTA", "HAZ_MIENTRAS", 
			"MIENTRAS", "IGUALES", "Y", "O", "MAYORQUE", "MENORQUE", "DIFERENCIA", 
			"AZAR", "PRODUCTO", "POTENCIA", "DIVISION", "SUMA", "PARA", "FIN", "TRUE", 
			"FALSE", "IGUAL", "SEMICOLON", "STRING", "ID", "LETRAS", "GUION_BAJO", 
			"DIGITO", "NUMERO", "ESPACIO", "SALTO_LINEA", "SQUARE_OPEN", "SQUARE_CLOSE", 
			"BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "GUION", "PAR_CLOSE", "COMILLA", 
			"WS"
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
	public String getGrammarFileName() { return "LogoTEC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LogoTECParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LogoTECParser.EOF, 0); }
		public Estructura_comentarioContext estructura_comentario() {
			return getRuleContext(Estructura_comentarioContext.class,0);
		}
		public List<ProcedimientosContext> procedimientos() {
			return getRuleContexts(ProcedimientosContext.class);
		}
		public ProcedimientosContext procedimientos(int i) {
			return getRuleContext(ProcedimientosContext.class,i);
		}
		public List<OrdenesContext> ordenes() {
			return getRuleContexts(OrdenesContext.class);
		}
		public OrdenesContext ordenes(int i) {
			return getRuleContext(OrdenesContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(102);
			estructura_comentario();
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 27023797861187570L) != 0)) {
				{
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(103);
					procedimientos();
					}
					break;
				case 2:
					{
					setState(104);
					ordenes();
					}
					break;
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Estructura_comentarioContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(LogoTECParser.BRACKET_OPEN, 0); }
		public TerminalNode GUION() { return getToken(LogoTECParser.GUION, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(LogoTECParser.BRACKET_CLOSE, 0); }
		public TerminalNode SALTO_LINEA() { return getToken(LogoTECParser.SALTO_LINEA, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public List<TerminalNode> ID() { return getTokens(LogoTECParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogoTECParser.ID, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(LogoTECParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(LogoTECParser.NUMERO, i);
		}
		public Estructura_comentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructura_comentario; }
	}

	public final Estructura_comentarioContext estructura_comentario() throws RecognitionException {
		Estructura_comentarioContext _localctx = new Estructura_comentarioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_estructura_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__0);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESPACIO) {
				{
				{
				setState(113);
				match(ESPACIO);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(BRACKET_OPEN);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13792273858822144L) != 0)) {
				{
				{
				setState(120);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13792273858822144L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(GUION);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13792273858822144L) != 0)) {
				{
				{
				setState(127);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 13792273858822144L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(BRACKET_CLOSE);
			setState(134);
			match(SALTO_LINEA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComentarioContext extends ParserRuleContext {
		public List<TerminalNode> SALTO_LINEA() { return getTokens(LogoTECParser.SALTO_LINEA); }
		public TerminalNode SALTO_LINEA(int i) {
			return getToken(LogoTECParser.SALTO_LINEA, i);
		}
		public List<TerminalNode> ID() { return getTokens(LogoTECParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogoTECParser.ID, i);
		}
		public List<TerminalNode> DIGITO() { return getTokens(LogoTECParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(LogoTECParser.DIGITO, i);
		}
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comentario);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__0);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11540474045136896L) != 0)) {
				{
				{
				setState(137);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 11540474045136896L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(143);
					match(SALTO_LINEA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(146); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedimientosContext extends ParserRuleContext {
		public List<ProcedimientoContext> procedimiento() {
			return getRuleContexts(ProcedimientoContext.class);
		}
		public ProcedimientoContext procedimiento(int i) {
			return getRuleContext(ProcedimientoContext.class,i);
		}
		public List<TerminalNode> SALTO_LINEA() { return getTokens(LogoTECParser.SALTO_LINEA); }
		public TerminalNode SALTO_LINEA(int i) {
			return getToken(LogoTECParser.SALTO_LINEA, i);
		}
		public ProcedimientosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimientos; }
	}

	public final ProcedimientosContext procedimientos() throws RecognitionException {
		ProcedimientosContext _localctx = new ProcedimientosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedimientos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SALTO_LINEA) {
						{
						{
						setState(148);
						match(SALTO_LINEA);
						}
						}
						setState(153);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(154);
					procedimiento();
					setState(158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(155);
							match(SALTO_LINEA);
							}
							} 
						}
						setState(160);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(163); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedimientoContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(LogoTECParser.PARA, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(LogoTECParser.SQUARE_OPEN, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(LogoTECParser.SQUARE_CLOSE, 0); }
		public OrdenesContext ordenes() {
			return getRuleContext(OrdenesContext.class,0);
		}
		public TerminalNode SALTO_LINEA() { return getToken(LogoTECParser.SALTO_LINEA, 0); }
		public TerminalNode FIN() { return getToken(LogoTECParser.FIN, 0); }
		public ProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimiento; }
	}

	public final ProcedimientoContext procedimiento() throws RecognitionException {
		ProcedimientoContext _localctx = new ProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedimiento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(PARA);
			setState(166);
			match(ESPACIO);
			setState(167);
			match(ID);
			setState(168);
			match(ESPACIO);
			setState(169);
			match(SQUARE_OPEN);
			setState(170);
			parametros();
			setState(171);
			match(SQUARE_CLOSE);
			setState(172);
			ordenes();
			setState(173);
			match(SALTO_LINEA);
			setState(174);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LogoTECParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LogoTECParser.ID, i);
		}
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(176);
				match(ID);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ESPACIO) {
					{
					{
					setState(177);
					match(ESPACIO);
					setState(178);
					match(ID);
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class OrdenesContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<TerminalNode> SALTO_LINEA() { return getTokens(LogoTECParser.SALTO_LINEA); }
		public TerminalNode SALTO_LINEA(int i) {
			return getToken(LogoTECParser.SALTO_LINEA, i);
		}
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public OrdenesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordenes; }
	}

	public final OrdenesContext ordenes() throws RecognitionException {
		OrdenesContext _localctx = new OrdenesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ordenes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(211); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SALTO_LINEA) {
						{
						{
						setState(186);
						match(SALTO_LINEA);
						}
						}
						setState(191);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==ESPACIO) {
						{
						{
						setState(192);
						match(ESPACIO);
						}
						}
						setState(197);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(198);
					instruccion();
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(199);
							match(ESPACIO);
							}
							} 
						}
						setState(204);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					}
					setState(208);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(205);
							match(SALTO_LINEA);
							}
							} 
						}
						setState(210);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(213); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public HazContext haz() {
			return getRuleContext(HazContext.class,0);
		}
		public InicContext inic() {
			return getRuleContext(InicContext.class,0);
		}
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public AvanzaContext avanza() {
			return getRuleContext(AvanzaContext.class,0);
		}
		public RetrocedeContext retrocede() {
			return getRuleContext(RetrocedeContext.class,0);
		}
		public GiraderechaContext giraderecha() {
			return getRuleContext(GiraderechaContext.class,0);
		}
		public GiraizquierdaContext giraizquierda() {
			return getRuleContext(GiraizquierdaContext.class,0);
		}
		public OcultatortugaContext ocultatortuga() {
			return getRuleContext(OcultatortugaContext.class,0);
		}
		public PonposContext ponpos() {
			return getRuleContext(PonposContext.class,0);
		}
		public PonxyContext ponxy() {
			return getRuleContext(PonxyContext.class,0);
		}
		public PonrumboContext ponrumbo() {
			return getRuleContext(PonrumboContext.class,0);
		}
		public PonxContext ponx() {
			return getRuleContext(PonxContext.class,0);
		}
		public PonyContext pony() {
			return getRuleContext(PonyContext.class,0);
		}
		public BajalapizContext bajalapiz() {
			return getRuleContext(BajalapizContext.class,0);
		}
		public SubelapizContext subelapiz() {
			return getRuleContext(SubelapizContext.class,0);
		}
		public PoncolorContext poncolor() {
			return getRuleContext(PoncolorContext.class,0);
		}
		public CentroContext centro() {
			return getRuleContext(CentroContext.class,0);
		}
		public EsperaContext espera() {
			return getRuleContext(EsperaContext.class,0);
		}
		public EjecutaContext ejecuta() {
			return getRuleContext(EjecutaContext.class,0);
		}
		public RepiteContext repite() {
			return getRuleContext(RepiteContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public Haz_hastaContext haz_hasta() {
			return getRuleContext(Haz_hastaContext.class,0);
		}
		public HastaContext hasta() {
			return getRuleContext(HastaContext.class,0);
		}
		public Haz_mientrasContext haz_mientras() {
			return getRuleContext(Haz_mientrasContext.class,0);
		}
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instruccion);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HAZ:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				haz();
				}
				break;
			case INIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				inic();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				inc();
				}
				break;
			case AVANZA:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				avanza();
				}
				break;
			case RETROCEDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				retrocede();
				}
				break;
			case GIRADERECHA:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				giraderecha();
				}
				break;
			case GIRAIZQUIERDA:
				enterOuterAlt(_localctx, 7);
				{
				setState(221);
				giraizquierda();
				}
				break;
			case OCULTATORTUGA:
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
				ocultatortuga();
				}
				break;
			case PONPOS:
				enterOuterAlt(_localctx, 9);
				{
				setState(223);
				ponpos();
				}
				break;
			case PONXY:
				enterOuterAlt(_localctx, 10);
				{
				setState(224);
				ponxy();
				}
				break;
			case PONRUMBO:
				enterOuterAlt(_localctx, 11);
				{
				setState(225);
				ponrumbo();
				}
				break;
			case PONX:
				enterOuterAlt(_localctx, 12);
				{
				setState(226);
				ponx();
				}
				break;
			case PONY:
				enterOuterAlt(_localctx, 13);
				{
				setState(227);
				pony();
				}
				break;
			case BAJALAPIZ:
				enterOuterAlt(_localctx, 14);
				{
				setState(228);
				bajalapiz();
				}
				break;
			case SUBELAPIZ:
				enterOuterAlt(_localctx, 15);
				{
				setState(229);
				subelapiz();
				}
				break;
			case PONCOLORLAPIZ:
				enterOuterAlt(_localctx, 16);
				{
				setState(230);
				poncolor();
				}
				break;
			case CENTRO:
				enterOuterAlt(_localctx, 17);
				{
				setState(231);
				centro();
				}
				break;
			case ESPERA:
				enterOuterAlt(_localctx, 18);
				{
				setState(232);
				espera();
				}
				break;
			case EJECUTA:
				enterOuterAlt(_localctx, 19);
				{
				setState(233);
				ejecuta();
				}
				break;
			case REPITE:
				enterOuterAlt(_localctx, 20);
				{
				setState(234);
				repite();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 21);
				{
				setState(235);
				si();
				}
				break;
			case HAZ_HASTA:
				enterOuterAlt(_localctx, 22);
				{
				setState(236);
				haz_hasta();
				}
				break;
			case HASTA:
				enterOuterAlt(_localctx, 23);
				{
				setState(237);
				hasta();
				}
				break;
			case HAZ_MIENTRAS:
				enterOuterAlt(_localctx, 24);
				{
				setState(238);
				haz_mientras();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 25);
				{
				setState(239);
				mientras();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 26);
				{
				setState(240);
				comentario();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HazContext extends ParserRuleContext {
		public TerminalNode HAZ() { return getToken(LogoTECParser.HAZ, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public Numeric_valContext numeric_val() {
			return getRuleContext(Numeric_valContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LogoTECParser.STRING, 0); }
		public Boolean_valContext boolean_val() {
			return getRuleContext(Boolean_valContext.class,0);
		}
		public HazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haz; }
	}

	public final HazContext haz() throws RecognitionException {
		HazContext _localctx = new HazContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_haz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(HAZ);
			setState(244);
			match(ESPACIO);
			setState(245);
			match(ID);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESPACIO) {
				{
				{
				setState(246);
				match(ESPACIO);
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(252);
				numeric_val();
				}
				break;
			case 2:
				{
				setState(253);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(254);
				boolean_val();
				}
				break;
			}
			setState(257);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicContext extends ParserRuleContext {
		public TerminalNode INIC() { return getToken(LogoTECParser.INIC, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(LogoTECParser.IGUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public Numeric_valContext numeric_val() {
			return getRuleContext(Numeric_valContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LogoTECParser.STRING, 0); }
		public Boolean_valContext boolean_val() {
			return getRuleContext(Boolean_valContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public InicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inic; }
	}

	public final InicContext inic() throws RecognitionException {
		InicContext _localctx = new InicContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(INIC);
			setState(260);
			match(ESPACIO);
			setState(261);
			match(ID);
			setState(262);
			match(ESPACIO);
			setState(263);
			match(IGUAL);
			setState(264);
			match(ESPACIO);
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(265);
				numeric_val();
				}
				break;
			case 2:
				{
				setState(266);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(267);
				boolean_val();
				}
				break;
			case 4:
				{
				setState(268);
				operacion();
				}
				break;
			}
			setState(271);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(LogoTECParser.INC, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public TerminalNode SQUARE_OPEN() { return getToken(LogoTECParser.SQUARE_OPEN, 0); }
		public List<Numeric_valContext> numeric_val() {
			return getRuleContexts(Numeric_valContext.class);
		}
		public Numeric_valContext numeric_val(int i) {
			return getRuleContext(Numeric_valContext.class,i);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(LogoTECParser.SQUARE_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(INC);
			setState(274);
			match(ESPACIO);
			setState(275);
			match(SQUARE_OPEN);
			setState(276);
			numeric_val();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESPACIO) {
				{
				setState(277);
				match(ESPACIO);
				setState(278);
				numeric_val();
				}
			}

			setState(281);
			match(SQUARE_CLOSE);
			setState(282);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AvanzaContext extends ParserRuleContext {
		public TerminalNode AVANZA() { return getToken(LogoTECParser.AVANZA, 0); }
		public TerminalNode ESPACIO() { return getToken(LogoTECParser.ESPACIO, 0); }
		public Numeric_valContext numeric_val() {
			return getRuleContext(Numeric_valContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public AvanzaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avanza; }
	}

	public final AvanzaContext avanza() throws RecognitionException {
		AvanzaContext _localctx = new AvanzaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_avanza);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(AVANZA);
			setState(285);
			match(ESPACIO);
			setState(286);
			numeric_val();
			setState(287);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetrocedeContext extends ParserRuleContext {
		public TerminalNode RETROCEDE() { return getToken(LogoTECParser.RETROCEDE, 0); }
		public TerminalNode ESPACIO() { return getToken(LogoTECParser.ESPACIO, 0); }
		public Numeric_valContext numeric_val() {
			return getRuleContext(Numeric_valContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public RetrocedeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retrocede; }
	}

	public final RetrocedeContext retrocede() throws RecognitionException {
		RetrocedeContext _localctx = new RetrocedeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_retrocede);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(RETROCEDE);
			setState(290);
			match(ESPACIO);
			setState(291);
			numeric_val();
			setState(292);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GiraderechaContext extends ParserRuleContext {
		public TerminalNode GIRADERECHA() { return getToken(LogoTECParser.GIRADERECHA, 0); }
		public TerminalNode ESPACIO() { return getToken(LogoTECParser.ESPACIO, 0); }
		public Numeric_valContext numeric_val() {
			return getRuleContext(Numeric_valContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public GiraderechaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_giraderecha; }
	}

	public final GiraderechaContext giraderecha() throws RecognitionException {
		GiraderechaContext _localctx = new GiraderechaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_giraderecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(GIRADERECHA);
			setState(295);
			match(ESPACIO);
			setState(296);
			numeric_val();
			setState(297);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GiraizquierdaContext extends ParserRuleContext {
		public TerminalNode GIRAIZQUIERDA() { return getToken(LogoTECParser.GIRAIZQUIERDA, 0); }
		public TerminalNode ESPACIO() { return getToken(LogoTECParser.ESPACIO, 0); }
		public Numeric_valContext numeric_val() {
			return getRuleContext(Numeric_valContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public GiraizquierdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_giraizquierda; }
	}

	public final GiraizquierdaContext giraizquierda() throws RecognitionException {
		GiraizquierdaContext _localctx = new GiraizquierdaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_giraizquierda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(GIRAIZQUIERDA);
			setState(300);
			match(ESPACIO);
			setState(301);
			numeric_val();
			setState(302);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OcultatortugaContext extends ParserRuleContext {
		public TerminalNode OCULTATORTUGA() { return getToken(LogoTECParser.OCULTATORTUGA, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public OcultatortugaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ocultatortuga; }
	}

	public final OcultatortugaContext ocultatortuga() throws RecognitionException {
		OcultatortugaContext _localctx = new OcultatortugaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ocultatortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(OCULTATORTUGA);
			setState(305);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PonposContext extends ParserRuleContext {
		public TerminalNode PONPOS() { return getToken(LogoTECParser.PONPOS, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(LogoTECParser.SQUARE_OPEN, 0); }
		public List<Numeric_valContext> numeric_val() {
			return getRuleContexts(Numeric_valContext.class);
		}
		public Numeric_valContext numeric_val(int i) {
			return getRuleContext(Numeric_valContext.class,i);
		}
		public TerminalNode ESPACIO() { return getToken(LogoTECParser.ESPACIO, 0); }
		public TerminalNode SQUARE_CLOSE() { return getToken(LogoTECParser.SQUARE_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public PonposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponpos; }
	}

	public final PonposContext ponpos() throws RecognitionException {
		PonposContext _localctx = new PonposContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ponpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(PONPOS);
			setState(308);
			match(SQUARE_OPEN);
			setState(309);
			numeric_val();
			setState(310);
			match(ESPACIO);
			setState(311);
			numeric_val();
			setState(312);
			match(SQUARE_CLOSE);
			setState(313);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PonxyContext extends ParserRuleContext {
		public TerminalNode PONXY() { return getToken(LogoTECParser.PONXY, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public List<Numeric_valContext> numeric_val() {
			return getRuleContexts(Numeric_valContext.class);
		}
		public Numeric_valContext numeric_val(int i) {
			return getRuleContext(Numeric_valContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public PonxyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponxy; }
	}

	public final PonxyContext ponxy() throws RecognitionException {
		PonxyContext _localctx = new PonxyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ponxy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(PONXY);
			setState(316);
			match(ESPACIO);
			setState(317);
			numeric_val();
			setState(318);
			match(ESPACIO);
			setState(319);
			numeric_val();
			setState(320);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PonrumboContext extends ParserRuleContext {
		public TerminalNode PONRUMBO() { return getToken(LogoTECParser.PONRUMBO, 0); }
		public TerminalNode ESPACIO() { return getToken(LogoTECParser.ESPACIO, 0); }
		public Numeric_valContext numeric_val() {
			return getRuleContext(Numeric_valContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public PonrumboContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponrumbo; }
	}

	public final PonrumboContext ponrumbo() throws RecognitionException {
		PonrumboContext _localctx = new PonrumboContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ponrumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(PONRUMBO);
			setState(323);
			match(ESPACIO);
			setState(324);
			numeric_val();
			setState(325);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PonxContext extends ParserRuleContext {
		public TerminalNode PONX() { return getToken(LogoTECParser.PONX, 0); }
		public Numeric_valContext numeric_val() {
			return getRuleContext(Numeric_valContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public PonxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponx; }
	}

	public final PonxContext ponx() throws RecognitionException {
		PonxContext _localctx = new PonxContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ponx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(PONX);
			setState(328);
			numeric_val();
			setState(329);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PonyContext extends ParserRuleContext {
		public TerminalNode PONY() { return getToken(LogoTECParser.PONY, 0); }
		public Numeric_valContext numeric_val() {
			return getRuleContext(Numeric_valContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public PonyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pony; }
	}

	public final PonyContext pony() throws RecognitionException {
		PonyContext _localctx = new PonyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pony);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(PONY);
			setState(332);
			numeric_val();
			setState(333);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BajalapizContext extends ParserRuleContext {
		public TerminalNode BAJALAPIZ() { return getToken(LogoTECParser.BAJALAPIZ, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public BajalapizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bajalapiz; }
	}

	public final BajalapizContext bajalapiz() throws RecognitionException {
		BajalapizContext _localctx = new BajalapizContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bajalapiz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(BAJALAPIZ);
			setState(336);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubelapizContext extends ParserRuleContext {
		public TerminalNode SUBELAPIZ() { return getToken(LogoTECParser.SUBELAPIZ, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public SubelapizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subelapiz; }
	}

	public final SubelapizContext subelapiz() throws RecognitionException {
		SubelapizContext _localctx = new SubelapizContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_subelapiz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(SUBELAPIZ);
			setState(339);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PoncolorContext extends ParserRuleContext {
		public TerminalNode PONCOLORLAPIZ() { return getToken(LogoTECParser.PONCOLORLAPIZ, 0); }
		public TerminalNode ESPACIO() { return getToken(LogoTECParser.ESPACIO, 0); }
		public TerminalNode COLOR() { return getToken(LogoTECParser.COLOR, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public PoncolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poncolor; }
	}

	public final PoncolorContext poncolor() throws RecognitionException {
		PoncolorContext _localctx = new PoncolorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_poncolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(PONCOLORLAPIZ);
			setState(342);
			match(ESPACIO);
			setState(343);
			match(COLOR);
			setState(344);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CentroContext extends ParserRuleContext {
		public TerminalNode CENTRO() { return getToken(LogoTECParser.CENTRO, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public CentroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_centro; }
	}

	public final CentroContext centro() throws RecognitionException {
		CentroContext _localctx = new CentroContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_centro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(CENTRO);
			setState(347);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EsperaContext extends ParserRuleContext {
		public TerminalNode ESPERA() { return getToken(LogoTECParser.ESPERA, 0); }
		public TerminalNode ESPACIO() { return getToken(LogoTECParser.ESPACIO, 0); }
		public Numeric_valContext numeric_val() {
			return getRuleContext(Numeric_valContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public EsperaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espera; }
	}

	public final EsperaContext espera() throws RecognitionException {
		EsperaContext _localctx = new EsperaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_espera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(ESPERA);
			setState(350);
			match(ESPACIO);
			setState(351);
			numeric_val();
			setState(352);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EjecutaContext extends ParserRuleContext {
		public TerminalNode EJECUTA() { return getToken(LogoTECParser.EJECUTA, 0); }
		public TerminalNode ESPACIO() { return getToken(LogoTECParser.ESPACIO, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(LogoTECParser.SQUARE_OPEN, 0); }
		public OrdenesContext ordenes() {
			return getRuleContext(OrdenesContext.class,0);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(LogoTECParser.SQUARE_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public EjecutaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ejecuta; }
	}

	public final EjecutaContext ejecuta() throws RecognitionException {
		EjecutaContext _localctx = new EjecutaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ejecuta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(EJECUTA);
			setState(355);
			match(ESPACIO);
			setState(356);
			match(SQUARE_OPEN);
			setState(357);
			ordenes();
			setState(358);
			match(SQUARE_CLOSE);
			setState(359);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepiteContext extends ParserRuleContext {
		public TerminalNode REPITE() { return getToken(LogoTECParser.REPITE, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public Numeric_valContext numeric_val() {
			return getRuleContext(Numeric_valContext.class,0);
		}
		public TerminalNode SQUARE_OPEN() { return getToken(LogoTECParser.SQUARE_OPEN, 0); }
		public OrdenesContext ordenes() {
			return getRuleContext(OrdenesContext.class,0);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(LogoTECParser.SQUARE_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public RepiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repite; }
	}

	public final RepiteContext repite() throws RecognitionException {
		RepiteContext _localctx = new RepiteContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_repite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(REPITE);
			setState(362);
			match(ESPACIO);
			setState(363);
			numeric_val();
			setState(364);
			match(ESPACIO);
			setState(365);
			match(SQUARE_OPEN);
			setState(366);
			ordenes();
			setState(367);
			match(SQUARE_CLOSE);
			setState(368);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SiContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(LogoTECParser.SI, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(LogoTECParser.PAR_OPEN, 0); }
		public Boolean_valContext boolean_val() {
			return getRuleContext(Boolean_valContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(LogoTECParser.PAR_CLOSE, 0); }
		public List<TerminalNode> SQUARE_OPEN() { return getTokens(LogoTECParser.SQUARE_OPEN); }
		public TerminalNode SQUARE_OPEN(int i) {
			return getToken(LogoTECParser.SQUARE_OPEN, i);
		}
		public List<OrdenesContext> ordenes() {
			return getRuleContexts(OrdenesContext.class);
		}
		public OrdenesContext ordenes(int i) {
			return getRuleContext(OrdenesContext.class,i);
		}
		public List<TerminalNode> SQUARE_CLOSE() { return getTokens(LogoTECParser.SQUARE_CLOSE); }
		public TerminalNode SQUARE_CLOSE(int i) {
			return getToken(LogoTECParser.SQUARE_CLOSE, i);
		}
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(SI);
			setState(371);
			match(ESPACIO);
			setState(372);
			match(PAR_OPEN);
			setState(373);
			boolean_val();
			setState(374);
			match(PAR_CLOSE);
			setState(375);
			match(ESPACIO);
			setState(376);
			match(SQUARE_OPEN);
			setState(377);
			ordenes();
			setState(378);
			match(SQUARE_CLOSE);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESPACIO) {
				{
				setState(379);
				match(ESPACIO);
				setState(380);
				match(SQUARE_OPEN);
				setState(381);
				ordenes();
				setState(382);
				match(SQUARE_CLOSE);
				}
			}

			setState(386);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Haz_hastaContext extends ParserRuleContext {
		public TerminalNode HAZ_HASTA() { return getToken(LogoTECParser.HAZ_HASTA, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public TerminalNode SQUARE_OPEN() { return getToken(LogoTECParser.SQUARE_OPEN, 0); }
		public OrdenesContext ordenes() {
			return getRuleContext(OrdenesContext.class,0);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(LogoTECParser.SQUARE_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(LogoTECParser.PAR_OPEN, 0); }
		public Boolean_valContext boolean_val() {
			return getRuleContext(Boolean_valContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(LogoTECParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public Haz_hastaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haz_hasta; }
	}

	public final Haz_hastaContext haz_hasta() throws RecognitionException {
		Haz_hastaContext _localctx = new Haz_hastaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_haz_hasta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(HAZ_HASTA);
			setState(389);
			match(ESPACIO);
			setState(390);
			match(SQUARE_OPEN);
			setState(391);
			ordenes();
			setState(392);
			match(SQUARE_CLOSE);
			setState(393);
			match(ESPACIO);
			setState(394);
			match(PAR_OPEN);
			setState(395);
			boolean_val();
			setState(396);
			match(PAR_CLOSE);
			setState(397);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HastaContext extends ParserRuleContext {
		public TerminalNode HASTA() { return getToken(LogoTECParser.HASTA, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(LogoTECParser.PAR_OPEN, 0); }
		public Boolean_valContext boolean_val() {
			return getRuleContext(Boolean_valContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(LogoTECParser.PAR_CLOSE, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(LogoTECParser.SQUARE_OPEN, 0); }
		public OrdenesContext ordenes() {
			return getRuleContext(OrdenesContext.class,0);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(LogoTECParser.SQUARE_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public HastaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hasta; }
	}

	public final HastaContext hasta() throws RecognitionException {
		HastaContext _localctx = new HastaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_hasta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(HASTA);
			setState(400);
			match(ESPACIO);
			setState(401);
			match(PAR_OPEN);
			setState(402);
			boolean_val();
			setState(403);
			match(PAR_CLOSE);
			setState(404);
			match(ESPACIO);
			setState(405);
			match(SQUARE_OPEN);
			setState(406);
			ordenes();
			setState(407);
			match(SQUARE_CLOSE);
			setState(408);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Haz_mientrasContext extends ParserRuleContext {
		public TerminalNode HAZ_MIENTRAS() { return getToken(LogoTECParser.HAZ_MIENTRAS, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public TerminalNode SQUARE_OPEN() { return getToken(LogoTECParser.SQUARE_OPEN, 0); }
		public OrdenesContext ordenes() {
			return getRuleContext(OrdenesContext.class,0);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(LogoTECParser.SQUARE_CLOSE, 0); }
		public TerminalNode PAR_OPEN() { return getToken(LogoTECParser.PAR_OPEN, 0); }
		public Boolean_valContext boolean_val() {
			return getRuleContext(Boolean_valContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(LogoTECParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public Haz_mientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_haz_mientras; }
	}

	public final Haz_mientrasContext haz_mientras() throws RecognitionException {
		Haz_mientrasContext _localctx = new Haz_mientrasContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_haz_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(HAZ_MIENTRAS);
			setState(411);
			match(ESPACIO);
			setState(412);
			match(SQUARE_OPEN);
			setState(413);
			ordenes();
			setState(414);
			match(SQUARE_CLOSE);
			setState(415);
			match(ESPACIO);
			setState(416);
			match(PAR_OPEN);
			setState(417);
			boolean_val();
			setState(418);
			match(PAR_CLOSE);
			setState(419);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(LogoTECParser.MIENTRAS, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public TerminalNode PAR_OPEN() { return getToken(LogoTECParser.PAR_OPEN, 0); }
		public Boolean_valContext boolean_val() {
			return getRuleContext(Boolean_valContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(LogoTECParser.PAR_CLOSE, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(LogoTECParser.SQUARE_OPEN, 0); }
		public OrdenesContext ordenes() {
			return getRuleContext(OrdenesContext.class,0);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(LogoTECParser.SQUARE_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(MIENTRAS);
			setState(422);
			match(ESPACIO);
			setState(423);
			match(PAR_OPEN);
			setState(424);
			boolean_val();
			setState(425);
			match(PAR_CLOSE);
			setState(426);
			match(ESPACIO);
			setState(427);
			match(SQUARE_OPEN);
			setState(428);
			ordenes();
			setState(429);
			match(SQUARE_CLOSE);
			setState(430);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_logicaContext extends ParserRuleContext {
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public OContext o() {
			return getRuleContext(OContext.class,0);
		}
		public Op_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logica; }
	}

	public final Op_logicaContext op_logica() throws RecognitionException {
		Op_logicaContext _localctx = new Op_logicaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_op_logica);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Y:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				y();
				}
				break;
			case O:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				o();
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

	@SuppressWarnings("CheckReturnValue")
	public static class YContext extends ParserRuleContext {
		public TerminalNode Y() { return getToken(LogoTECParser.Y, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public List<Boolean_valContext> boolean_val() {
			return getRuleContexts(Boolean_valContext.class);
		}
		public Boolean_valContext boolean_val(int i) {
			return getRuleContext(Boolean_valContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(Y);
			setState(437);
			match(ESPACIO);
			setState(438);
			boolean_val();
			setState(439);
			match(ESPACIO);
			setState(440);
			boolean_val();
			setState(441);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OContext extends ParserRuleContext {
		public TerminalNode O() { return getToken(LogoTECParser.O, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public List<Boolean_valContext> boolean_val() {
			return getRuleContexts(Boolean_valContext.class);
		}
		public Boolean_valContext boolean_val(int i) {
			return getRuleContext(Boolean_valContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public OContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_o; }
	}

	public final OContext o() throws RecognitionException {
		OContext _localctx = new OContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_o);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(O);
			setState(444);
			match(ESPACIO);
			setState(445);
			boolean_val();
			setState(446);
			match(ESPACIO);
			setState(447);
			boolean_val();
			setState(448);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Boolean_valContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public TerminalNode BOOLEAN() { return getToken(LogoTECParser.BOOLEAN, 0); }
		public Op_logicaContext op_logica() {
			return getRuleContext(Op_logicaContext.class,0);
		}
		public Op_comparativaContext op_comparativa() {
			return getRuleContext(Op_comparativaContext.class,0);
		}
		public Boolean_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_val; }
	}

	public final Boolean_valContext boolean_val() throws RecognitionException {
		Boolean_valContext _localctx = new Boolean_valContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_boolean_val);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(ID);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(BOOLEAN);
				}
				break;
			case Y:
			case O:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				op_logica();
				}
				break;
			case IGUALES:
			case MAYORQUE:
			case MENORQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
				op_comparativa();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_comparativaContext extends ParserRuleContext {
		public IgualesContext iguales() {
			return getRuleContext(IgualesContext.class,0);
		}
		public MayorqueContext mayorque() {
			return getRuleContext(MayorqueContext.class,0);
		}
		public MenorqueContext menorque() {
			return getRuleContext(MenorqueContext.class,0);
		}
		public Op_comparativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_comparativa; }
	}

	public final Op_comparativaContext op_comparativa() throws RecognitionException {
		Op_comparativaContext _localctx = new Op_comparativaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_comparativa);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUALES:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				iguales();
				}
				break;
			case MAYORQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				mayorque();
				}
				break;
			case MENORQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				menorque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IgualesContext extends ParserRuleContext {
		public TerminalNode IGUALES() { return getToken(LogoTECParser.IGUALES, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public List<Numeric_valContext> numeric_val() {
			return getRuleContexts(Numeric_valContext.class);
		}
		public Numeric_valContext numeric_val(int i) {
			return getRuleContext(Numeric_valContext.class,i);
		}
		public IgualesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iguales; }
	}

	public final IgualesContext iguales() throws RecognitionException {
		IgualesContext _localctx = new IgualesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_iguales);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(IGUALES);
			setState(462);
			match(ESPACIO);
			setState(463);
			numeric_val();
			setState(464);
			match(ESPACIO);
			setState(465);
			numeric_val();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MayorqueContext extends ParserRuleContext {
		public TerminalNode MAYORQUE() { return getToken(LogoTECParser.MAYORQUE, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public List<Numeric_valContext> numeric_val() {
			return getRuleContexts(Numeric_valContext.class);
		}
		public Numeric_valContext numeric_val(int i) {
			return getRuleContext(Numeric_valContext.class,i);
		}
		public MayorqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayorque; }
	}

	public final MayorqueContext mayorque() throws RecognitionException {
		MayorqueContext _localctx = new MayorqueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_mayorque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(MAYORQUE);
			setState(468);
			match(ESPACIO);
			setState(469);
			numeric_val();
			setState(470);
			match(ESPACIO);
			setState(471);
			numeric_val();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MenorqueContext extends ParserRuleContext {
		public TerminalNode MENORQUE() { return getToken(LogoTECParser.MENORQUE, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public List<Numeric_valContext> numeric_val() {
			return getRuleContexts(Numeric_valContext.class);
		}
		public Numeric_valContext numeric_val(int i) {
			return getRuleContext(Numeric_valContext.class,i);
		}
		public MenorqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menorque; }
	}

	public final MenorqueContext menorque() throws RecognitionException {
		MenorqueContext _localctx = new MenorqueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_menorque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(MENORQUE);
			setState(474);
			match(ESPACIO);
			setState(475);
			numeric_val();
			setState(476);
			match(ESPACIO);
			setState(477);
			numeric_val();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperacionContext extends ParserRuleContext {
		public Op_algebraicasContext op_algebraicas() {
			return getRuleContext(Op_algebraicasContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			op_algebraicas();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_algebraicasContext extends ParserRuleContext {
		public DiferenciaContext diferencia() {
			return getRuleContext(DiferenciaContext.class,0);
		}
		public AzarContext azar() {
			return getRuleContext(AzarContext.class,0);
		}
		public ProductoContext producto() {
			return getRuleContext(ProductoContext.class,0);
		}
		public PotenciaContext potencia() {
			return getRuleContext(PotenciaContext.class,0);
		}
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public Op_algebraicasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_algebraicas; }
	}

	public final Op_algebraicasContext op_algebraicas() throws RecognitionException {
		Op_algebraicasContext _localctx = new Op_algebraicasContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_op_algebraicas);
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIFERENCIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				diferencia();
				}
				break;
			case AZAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				azar();
				}
				break;
			case PRODUCTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				producto();
				}
				break;
			case POTENCIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				potencia();
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 5);
				{
				setState(485);
				division();
				}
				break;
			case SUMA:
				enterOuterAlt(_localctx, 6);
				{
				setState(486);
				suma();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numeric_valContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LogoTECParser.ID, 0); }
		public TerminalNode NUMERO() { return getToken(LogoTECParser.NUMERO, 0); }
		public TerminalNode PAR_OPEN() { return getToken(LogoTECParser.PAR_OPEN, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(LogoTECParser.PAR_CLOSE, 0); }
		public Numeric_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_val; }
	}

	public final Numeric_valContext numeric_val() throws RecognitionException {
		Numeric_valContext _localctx = new Numeric_valContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_numeric_val);
		try {
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				match(ID);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(NUMERO);
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(491);
				match(PAR_OPEN);
				setState(492);
				operacion();
				setState(493);
				match(PAR_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DiferenciaContext extends ParserRuleContext {
		public TerminalNode DIFERENCIA() { return getToken(LogoTECParser.DIFERENCIA, 0); }
		public List<Numeric_valContext> numeric_val() {
			return getRuleContexts(Numeric_valContext.class);
		}
		public Numeric_valContext numeric_val(int i) {
			return getRuleContext(Numeric_valContext.class,i);
		}
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public DiferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diferencia; }
	}

	public final DiferenciaContext diferencia() throws RecognitionException {
		DiferenciaContext _localctx = new DiferenciaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_diferencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(DIFERENCIA);
			setState(498);
			numeric_val();
			setState(501); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(499);
				match(ESPACIO);
				setState(500);
				numeric_val();
				}
				}
				setState(503); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESPACIO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AzarContext extends ParserRuleContext {
		public TerminalNode AZAR() { return getToken(LogoTECParser.AZAR, 0); }
		public TerminalNode ESPACIO() { return getToken(LogoTECParser.ESPACIO, 0); }
		public Numeric_valContext numeric_val() {
			return getRuleContext(Numeric_valContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public AzarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_azar; }
	}

	public final AzarContext azar() throws RecognitionException {
		AzarContext _localctx = new AzarContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_azar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(AZAR);
			setState(506);
			match(ESPACIO);
			setState(507);
			numeric_val();
			setState(508);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProductoContext extends ParserRuleContext {
		public TerminalNode PRODUCTO() { return getToken(LogoTECParser.PRODUCTO, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public List<Numeric_valContext> numeric_val() {
			return getRuleContexts(Numeric_valContext.class);
		}
		public Numeric_valContext numeric_val(int i) {
			return getRuleContext(Numeric_valContext.class,i);
		}
		public ProductoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_producto; }
	}

	public final ProductoContext producto() throws RecognitionException {
		ProductoContext _localctx = new ProductoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_producto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(PRODUCTO);
			setState(511);
			match(ESPACIO);
			setState(512);
			numeric_val();
			setState(515); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(513);
				match(ESPACIO);
				setState(514);
				numeric_val();
				}
				}
				setState(517); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESPACIO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PotenciaContext extends ParserRuleContext {
		public TerminalNode POTENCIA() { return getToken(LogoTECParser.POTENCIA, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public List<Numeric_valContext> numeric_val() {
			return getRuleContexts(Numeric_valContext.class);
		}
		public Numeric_valContext numeric_val(int i) {
			return getRuleContext(Numeric_valContext.class,i);
		}
		public PotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potencia; }
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_potencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(POTENCIA);
			setState(520);
			match(ESPACIO);
			setState(521);
			numeric_val();
			setState(522);
			match(ESPACIO);
			setState(523);
			numeric_val();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivisionContext extends ParserRuleContext {
		public TerminalNode DIVISION() { return getToken(LogoTECParser.DIVISION, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public List<Numeric_valContext> numeric_val() {
			return getRuleContexts(Numeric_valContext.class);
		}
		public Numeric_valContext numeric_val(int i) {
			return getRuleContext(Numeric_valContext.class,i);
		}
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(DIVISION);
			setState(526);
			match(ESPACIO);
			setState(527);
			numeric_val();
			setState(528);
			match(ESPACIO);
			setState(529);
			numeric_val();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SumaContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(LogoTECParser.SUMA, 0); }
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public List<Numeric_valContext> numeric_val() {
			return getRuleContexts(Numeric_valContext.class);
		}
		public Numeric_valContext numeric_val(int i) {
			return getRuleContext(Numeric_valContext.class,i);
		}
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_suma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(SUMA);
			setState(532);
			match(ESPACIO);
			setState(533);
			numeric_val();
			setState(536); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(534);
				match(ESPACIO);
				setState(535);
				numeric_val();
				}
				}
				setState(538); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ESPACIO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RumboContext extends ParserRuleContext {
		public TerminalNode RUMBO() { return getToken(LogoTECParser.RUMBO, 0); }
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public RumboContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rumbo; }
	}

	public final RumboContext rumbo() throws RecognitionException {
		RumboContext _localctx = new RumboContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_rumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(RUMBO);
			setState(541);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001?\u0220\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000j\b\u0000\n\u0000"+
		"\f\u0000m\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005"+
		"\u0001s\b\u0001\n\u0001\f\u0001v\t\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001z\b\u0001\n\u0001\f\u0001}\t\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u0081\b\u0001\n\u0001\f\u0001\u0084\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002\u008b\b\u0002\n\u0002"+
		"\f\u0002\u008e\t\u0002\u0001\u0002\u0004\u0002\u0091\b\u0002\u000b\u0002"+
		"\f\u0002\u0092\u0001\u0003\u0005\u0003\u0096\b\u0003\n\u0003\f\u0003\u0099"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u009d\b\u0003\n\u0003\f\u0003"+
		"\u00a0\t\u0003\u0004\u0003\u00a2\b\u0003\u000b\u0003\f\u0003\u00a3\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00b4\b\u0005\n\u0005\f\u0005\u00b7\t\u0005"+
		"\u0003\u0005\u00b9\b\u0005\u0001\u0006\u0005\u0006\u00bc\b\u0006\n\u0006"+
		"\f\u0006\u00bf\t\u0006\u0001\u0006\u0005\u0006\u00c2\b\u0006\n\u0006\f"+
		"\u0006\u00c5\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c9\b\u0006"+
		"\n\u0006\f\u0006\u00cc\t\u0006\u0001\u0006\u0005\u0006\u00cf\b\u0006\n"+
		"\u0006\f\u0006\u00d2\t\u0006\u0004\u0006\u00d4\b\u0006\u000b\u0006\f\u0006"+
		"\u00d5\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00f2\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00f8\b\b\n\b\f\b\u00fb\t\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u0100\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u010e\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0118"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0181\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0003!\u01b3\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u01c7\b$\u0001%\u0001%\u0001%\u0003%\u01cc\b%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01e8\b*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u01f0\b+\u0001,\u0001,\u0001,\u0001,\u0004"+
		",\u01f6\b,\u000b,\f,\u01f7\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0004.\u0204\b.\u000b.\f.\u0205\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"1\u00011\u00011\u00011\u00011\u00041\u0219\b1\u000b1\f1\u021a\u00012\u0001"+
		"2\u00012\u00012\u0000\u00003\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bd\u0000\u0002\u0002\u00000045\u0003\u0000003355\u022e\u0000f"+
		"\u0001\u0000\u0000\u0000\u0002p\u0001\u0000\u0000\u0000\u0004\u0088\u0001"+
		"\u0000\u0000\u0000\u0006\u00a1\u0001\u0000\u0000\u0000\b\u00a5\u0001\u0000"+
		"\u0000\u0000\n\u00b8\u0001\u0000\u0000\u0000\f\u00d3\u0001\u0000\u0000"+
		"\u0000\u000e\u00f1\u0001\u0000\u0000\u0000\u0010\u00f3\u0001\u0000\u0000"+
		"\u0000\u0012\u0103\u0001\u0000\u0000\u0000\u0014\u0111\u0001\u0000\u0000"+
		"\u0000\u0016\u011c\u0001\u0000\u0000\u0000\u0018\u0121\u0001\u0000\u0000"+
		"\u0000\u001a\u0126\u0001\u0000\u0000\u0000\u001c\u012b\u0001\u0000\u0000"+
		"\u0000\u001e\u0130\u0001\u0000\u0000\u0000 \u0133\u0001\u0000\u0000\u0000"+
		"\"\u013b\u0001\u0000\u0000\u0000$\u0142\u0001\u0000\u0000\u0000&\u0147"+
		"\u0001\u0000\u0000\u0000(\u014b\u0001\u0000\u0000\u0000*\u014f\u0001\u0000"+
		"\u0000\u0000,\u0152\u0001\u0000\u0000\u0000.\u0155\u0001\u0000\u0000\u0000"+
		"0\u015a\u0001\u0000\u0000\u00002\u015d\u0001\u0000\u0000\u00004\u0162"+
		"\u0001\u0000\u0000\u00006\u0169\u0001\u0000\u0000\u00008\u0172\u0001\u0000"+
		"\u0000\u0000:\u0184\u0001\u0000\u0000\u0000<\u018f\u0001\u0000\u0000\u0000"+
		">\u019a\u0001\u0000\u0000\u0000@\u01a5\u0001\u0000\u0000\u0000B\u01b2"+
		"\u0001\u0000\u0000\u0000D\u01b4\u0001\u0000\u0000\u0000F\u01bb\u0001\u0000"+
		"\u0000\u0000H\u01c6\u0001\u0000\u0000\u0000J\u01cb\u0001\u0000\u0000\u0000"+
		"L\u01cd\u0001\u0000\u0000\u0000N\u01d3\u0001\u0000\u0000\u0000P\u01d9"+
		"\u0001\u0000\u0000\u0000R\u01df\u0001\u0000\u0000\u0000T\u01e7\u0001\u0000"+
		"\u0000\u0000V\u01ef\u0001\u0000\u0000\u0000X\u01f1\u0001\u0000\u0000\u0000"+
		"Z\u01f9\u0001\u0000\u0000\u0000\\\u01fe\u0001\u0000\u0000\u0000^\u0207"+
		"\u0001\u0000\u0000\u0000`\u020d\u0001\u0000\u0000\u0000b\u0213\u0001\u0000"+
		"\u0000\u0000d\u021c\u0001\u0000\u0000\u0000fk\u0003\u0002\u0001\u0000"+
		"gj\u0003\u0006\u0003\u0000hj\u0003\f\u0006\u0000ig\u0001\u0000\u0000\u0000"+
		"ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000"+
		"\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000no\u0005\u0000\u0000\u0001o\u0001\u0001\u0000\u0000\u0000"+
		"pt\u0005\u0001\u0000\u0000qs\u00055\u0000\u0000rq\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000w{\u00059\u0000"+
		"\u0000xz\u0007\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0082\u0005<\u0000\u0000"+
		"\u007f\u0081\u0007\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0086\u0005:\u0000\u0000\u0086"+
		"\u0087\u00056\u0000\u0000\u0087\u0003\u0001\u0000\u0000\u0000\u0088\u008c"+
		"\u0005\u0001\u0000\u0000\u0089\u008b\u0007\u0001\u0000\u0000\u008a\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0090"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0091"+
		"\u00056\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0005\u0001\u0000\u0000\u0000\u0094\u0096\u0005"+
		"6\u0000\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000"+
		"\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000"+
		"\u0000\u0000\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u009a\u009e\u0003\b\u0004\u0000\u009b\u009d\u00056\u0000"+
		"\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a1\u0097\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u0007\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005)\u0000\u0000"+
		"\u00a6\u00a7\u00055\u0000\u0000\u00a7\u00a8\u00050\u0000\u0000\u00a8\u00a9"+
		"\u00055\u0000\u0000\u00a9\u00aa\u00057\u0000\u0000\u00aa\u00ab\u0003\n"+
		"\u0005\u0000\u00ab\u00ac\u00058\u0000\u0000\u00ac\u00ad\u0003\f\u0006"+
		"\u0000\u00ad\u00ae\u00056\u0000\u0000\u00ae\u00af\u0005*\u0000\u0000\u00af"+
		"\t\u0001\u0000\u0000\u0000\u00b0\u00b5\u00050\u0000\u0000\u00b1\u00b2"+
		"\u00055\u0000\u0000\u00b2\u00b4\u00050\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u000b\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bc\u00056\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c3\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c2\u00055\u0000\u0000"+
		"\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c6\u00ca\u0003\u000e\u0007\u0000\u00c7\u00c9\u00055\u0000\u0000\u00c8"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u00d0\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cf\u00056\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d2"+
		"\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d3\u00bd\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\r\u0001\u0000\u0000\u0000\u00d7\u00f2\u0003"+
		"\u0010\b\u0000\u00d8\u00f2\u0003\u0012\t\u0000\u00d9\u00f2\u0003\u0014"+
		"\n\u0000\u00da\u00f2\u0003\u0016\u000b\u0000\u00db\u00f2\u0003\u0018\f"+
		"\u0000\u00dc\u00f2\u0003\u001a\r\u0000\u00dd\u00f2\u0003\u001c\u000e\u0000"+
		"\u00de\u00f2\u0003\u001e\u000f\u0000\u00df\u00f2\u0003 \u0010\u0000\u00e0"+
		"\u00f2\u0003\"\u0011\u0000\u00e1\u00f2\u0003$\u0012\u0000\u00e2\u00f2"+
		"\u0003&\u0013\u0000\u00e3\u00f2\u0003(\u0014\u0000\u00e4\u00f2\u0003*"+
		"\u0015\u0000\u00e5\u00f2\u0003,\u0016\u0000\u00e6\u00f2\u0003.\u0017\u0000"+
		"\u00e7\u00f2\u00030\u0018\u0000\u00e8\u00f2\u00032\u0019\u0000\u00e9\u00f2"+
		"\u00034\u001a\u0000\u00ea\u00f2\u00036\u001b\u0000\u00eb\u00f2\u00038"+
		"\u001c\u0000\u00ec\u00f2\u0003:\u001d\u0000\u00ed\u00f2\u0003<\u001e\u0000"+
		"\u00ee\u00f2\u0003>\u001f\u0000\u00ef\u00f2\u0003@ \u0000\u00f0\u00f2"+
		"\u0003\u0004\u0002\u0000\u00f1\u00d7\u0001\u0000\u0000\u0000\u00f1\u00d8"+
		"\u0001\u0000\u0000\u0000\u00f1\u00d9\u0001\u0000\u0000\u0000\u00f1\u00da"+
		"\u0001\u0000\u0000\u0000\u00f1\u00db\u0001\u0000\u0000\u0000\u00f1\u00dc"+
		"\u0001\u0000\u0000\u0000\u00f1\u00dd\u0001\u0000\u0000\u0000\u00f1\u00de"+
		"\u0001\u0000\u0000\u0000\u00f1\u00df\u0001\u0000\u0000\u0000\u00f1\u00e0"+
		"\u0001\u0000\u0000\u0000\u00f1\u00e1\u0001\u0000\u0000\u0000\u00f1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00f1\u00e3\u0001\u0000\u0000\u0000\u00f1\u00e4"+
		"\u0001\u0000\u0000\u0000\u00f1\u00e5\u0001\u0000\u0000\u0000\u00f1\u00e6"+
		"\u0001\u0000\u0000\u0000\u00f1\u00e7\u0001\u0000\u0000\u0000\u00f1\u00e8"+
		"\u0001\u0000\u0000\u0000\u00f1\u00e9\u0001\u0000\u0000\u0000\u00f1\u00ea"+
		"\u0001\u0000\u0000\u0000\u00f1\u00eb\u0001\u0000\u0000\u0000\u00f1\u00ec"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ed\u0001\u0000\u0000\u0000\u00f1\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f2\u000f\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0005\u0004\u0000\u0000\u00f4\u00f5\u00055\u0000\u0000\u00f5\u00f9\u0005"+
		"0\u0000\u0000\u00f6\u00f8\u00055\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00ff\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u0100\u0003V+\u0000\u00fd"+
		"\u0100\u0005/\u0000\u0000\u00fe\u0100\u0003H$\u0000\u00ff\u00fc\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0005"+
		".\u0000\u0000\u0102\u0011\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0005"+
		"\u0000\u0000\u0104\u0105\u00055\u0000\u0000\u0105\u0106\u00050\u0000\u0000"+
		"\u0106\u0107\u00055\u0000\u0000\u0107\u0108\u0005-\u0000\u0000\u0108\u010d"+
		"\u00055\u0000\u0000\u0109\u010e\u0003V+\u0000\u010a\u010e\u0005/\u0000"+
		"\u0000\u010b\u010e\u0003H$\u0000\u010c\u010e\u0003R)\u0000\u010d\u0109"+
		"\u0001\u0000\u0000\u0000\u010d\u010a\u0001\u0000\u0000\u0000\u010d\u010b"+
		"\u0001\u0000\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0005.\u0000\u0000\u0110\u0013\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0005\u0006\u0000\u0000\u0112\u0113\u0005"+
		"5\u0000\u0000\u0113\u0114\u00057\u0000\u0000\u0114\u0117\u0003V+\u0000"+
		"\u0115\u0116\u00055\u0000\u0000\u0116\u0118\u0003V+\u0000\u0117\u0115"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u00058\u0000\u0000\u011a\u011b\u0005"+
		".\u0000\u0000\u011b\u0015\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u0007"+
		"\u0000\u0000\u011d\u011e\u00055\u0000\u0000\u011e\u011f\u0003V+\u0000"+
		"\u011f\u0120\u0005.\u0000\u0000\u0120\u0017\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0005\b\u0000\u0000\u0122\u0123\u00055\u0000\u0000\u0123\u0124"+
		"\u0003V+\u0000\u0124\u0125\u0005.\u0000\u0000\u0125\u0019\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0005\t\u0000\u0000\u0127\u0128\u00055\u0000"+
		"\u0000\u0128\u0129\u0003V+\u0000\u0129\u012a\u0005.\u0000\u0000\u012a"+
		"\u001b\u0001\u0000\u0000\u0000\u012b\u012c\u0005\n\u0000\u0000\u012c\u012d"+
		"\u00055\u0000\u0000\u012d\u012e\u0003V+\u0000\u012e\u012f\u0005.\u0000"+
		"\u0000\u012f\u001d\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u000b\u0000"+
		"\u0000\u0131\u0132\u0005.\u0000\u0000\u0132\u001f\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0005\f\u0000\u0000\u0134\u0135\u00057\u0000\u0000\u0135"+
		"\u0136\u0003V+\u0000\u0136\u0137\u00055\u0000\u0000\u0137\u0138\u0003"+
		"V+\u0000\u0138\u0139\u00058\u0000\u0000\u0139\u013a\u0005.\u0000\u0000"+
		"\u013a!\u0001\u0000\u0000\u0000\u013b\u013c\u0005\r\u0000\u0000\u013c"+
		"\u013d\u00055\u0000\u0000\u013d\u013e\u0003V+\u0000\u013e\u013f\u0005"+
		"5\u0000\u0000\u013f\u0140\u0003V+\u0000\u0140\u0141\u0005.\u0000\u0000"+
		"\u0141#\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u000e\u0000\u0000\u0143"+
		"\u0144\u00055\u0000\u0000\u0144\u0145\u0003V+\u0000\u0145\u0146\u0005"+
		".\u0000\u0000\u0146%\u0001\u0000\u0000\u0000\u0147\u0148\u0005\u0010\u0000"+
		"\u0000\u0148\u0149\u0003V+\u0000\u0149\u014a\u0005.\u0000\u0000\u014a"+
		"\'\u0001\u0000\u0000\u0000\u014b\u014c\u0005\u0011\u0000\u0000\u014c\u014d"+
		"\u0003V+\u0000\u014d\u014e\u0005.\u0000\u0000\u014e)\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0005\u0012\u0000\u0000\u0150\u0151\u0005.\u0000\u0000"+
		"\u0151+\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u0013\u0000\u0000\u0153"+
		"\u0154\u0005.\u0000\u0000\u0154-\u0001\u0000\u0000\u0000\u0155\u0156\u0005"+
		"\u0014\u0000\u0000\u0156\u0157\u00055\u0000\u0000\u0157\u0158\u0005\u0002"+
		"\u0000\u0000\u0158\u0159\u0005.\u0000\u0000\u0159/\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0005\u0015\u0000\u0000\u015b\u015c\u0005.\u0000\u0000\u015c"+
		"1\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u0016\u0000\u0000\u015e\u015f"+
		"\u00055\u0000\u0000\u015f\u0160\u0003V+\u0000\u0160\u0161\u0005.\u0000"+
		"\u0000\u01613\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u0017\u0000\u0000"+
		"\u0163\u0164\u00055\u0000\u0000\u0164\u0165\u00057\u0000\u0000\u0165\u0166"+
		"\u0003\f\u0006\u0000\u0166\u0167\u00058\u0000\u0000\u0167\u0168\u0005"+
		".\u0000\u0000\u01685\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u0018\u0000"+
		"\u0000\u016a\u016b\u00055\u0000\u0000\u016b\u016c\u0003V+\u0000\u016c"+
		"\u016d\u00055\u0000\u0000\u016d\u016e\u00057\u0000\u0000\u016e\u016f\u0003"+
		"\f\u0006\u0000\u016f\u0170\u00058\u0000\u0000\u0170\u0171\u0005.\u0000"+
		"\u0000\u01717\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u0019\u0000\u0000"+
		"\u0173\u0174\u00055\u0000\u0000\u0174\u0175\u0005;\u0000\u0000\u0175\u0176"+
		"\u0003H$\u0000\u0176\u0177\u0005=\u0000\u0000\u0177\u0178\u00055\u0000"+
		"\u0000\u0178\u0179\u00057\u0000\u0000\u0179\u017a\u0003\f\u0006\u0000"+
		"\u017a\u0180\u00058\u0000\u0000\u017b\u017c\u00055\u0000\u0000\u017c\u017d"+
		"\u00057\u0000\u0000\u017d\u017e\u0003\f\u0006\u0000\u017e\u017f\u0005"+
		"8\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u017b\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000"+
		"\u0000\u0000\u0182\u0183\u0005.\u0000\u0000\u01839\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u0005\u001a\u0000\u0000\u0185\u0186\u00055\u0000\u0000\u0186"+
		"\u0187\u00057\u0000\u0000\u0187\u0188\u0003\f\u0006\u0000\u0188\u0189"+
		"\u00058\u0000\u0000\u0189\u018a\u00055\u0000\u0000\u018a\u018b\u0005;"+
		"\u0000\u0000\u018b\u018c\u0003H$\u0000\u018c\u018d\u0005=\u0000\u0000"+
		"\u018d\u018e\u0005.\u0000\u0000\u018e;\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0005\u001b\u0000\u0000\u0190\u0191\u00055\u0000\u0000\u0191\u0192\u0005"+
		";\u0000\u0000\u0192\u0193\u0003H$\u0000\u0193\u0194\u0005=\u0000\u0000"+
		"\u0194\u0195\u00055\u0000\u0000\u0195\u0196\u00057\u0000\u0000\u0196\u0197"+
		"\u0003\f\u0006\u0000\u0197\u0198\u00058\u0000\u0000\u0198\u0199\u0005"+
		".\u0000\u0000\u0199=\u0001\u0000\u0000\u0000\u019a\u019b\u0005\u001c\u0000"+
		"\u0000\u019b\u019c\u00055\u0000\u0000\u019c\u019d\u00057\u0000\u0000\u019d"+
		"\u019e\u0003\f\u0006\u0000\u019e\u019f\u00058\u0000\u0000\u019f\u01a0"+
		"\u00055\u0000\u0000\u01a0\u01a1\u0005;\u0000\u0000\u01a1\u01a2\u0003H"+
		"$\u0000\u01a2\u01a3\u0005=\u0000\u0000\u01a3\u01a4\u0005.\u0000\u0000"+
		"\u01a4?\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005\u001d\u0000\u0000\u01a6"+
		"\u01a7\u00055\u0000\u0000\u01a7\u01a8\u0005;\u0000\u0000\u01a8\u01a9\u0003"+
		"H$\u0000\u01a9\u01aa\u0005=\u0000\u0000\u01aa\u01ab\u00055\u0000\u0000"+
		"\u01ab\u01ac\u00057\u0000\u0000\u01ac\u01ad\u0003\f\u0006\u0000\u01ad"+
		"\u01ae\u00058\u0000\u0000\u01ae\u01af\u0005.\u0000\u0000\u01afA\u0001"+
		"\u0000\u0000\u0000\u01b0\u01b3\u0003D\"\u0000\u01b1\u01b3\u0003F#\u0000"+
		"\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b3C\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005\u001f\u0000\u0000\u01b5"+
		"\u01b6\u00055\u0000\u0000\u01b6\u01b7\u0003H$\u0000\u01b7\u01b8\u0005"+
		"5\u0000\u0000\u01b8\u01b9\u0003H$\u0000\u01b9\u01ba\u0005.\u0000\u0000"+
		"\u01baE\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005 \u0000\u0000\u01bc\u01bd"+
		"\u00055\u0000\u0000\u01bd\u01be\u0003H$\u0000\u01be\u01bf\u00055\u0000"+
		"\u0000\u01bf\u01c0\u0003H$\u0000\u01c0\u01c1\u0005.\u0000\u0000\u01c1"+
		"G\u0001\u0000\u0000\u0000\u01c2\u01c7\u00050\u0000\u0000\u01c3\u01c7\u0005"+
		"\u0003\u0000\u0000\u01c4\u01c7\u0003B!\u0000\u01c5\u01c7\u0003J%\u0000"+
		"\u01c6\u01c2\u0001\u0000\u0000\u0000\u01c6\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c7I\u0001\u0000\u0000\u0000\u01c8\u01cc\u0003L&\u0000\u01c9\u01cc"+
		"\u0003N\'\u0000\u01ca\u01cc\u0003P(\u0000\u01cb\u01c8\u0001\u0000\u0000"+
		"\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01ca\u0001\u0000\u0000"+
		"\u0000\u01ccK\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005\u001e\u0000\u0000"+
		"\u01ce\u01cf\u00055\u0000\u0000\u01cf\u01d0\u0003V+\u0000\u01d0\u01d1"+
		"\u00055\u0000\u0000\u01d1\u01d2\u0003V+\u0000\u01d2M\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d4\u0005!\u0000\u0000\u01d4\u01d5\u00055\u0000\u0000\u01d5"+
		"\u01d6\u0003V+\u0000\u01d6\u01d7\u00055\u0000\u0000\u01d7\u01d8\u0003"+
		"V+\u0000\u01d8O\u0001\u0000\u0000\u0000\u01d9\u01da\u0005\"\u0000\u0000"+
		"\u01da\u01db\u00055\u0000\u0000\u01db\u01dc\u0003V+\u0000\u01dc\u01dd"+
		"\u00055\u0000\u0000\u01dd\u01de\u0003V+\u0000\u01deQ\u0001\u0000\u0000"+
		"\u0000\u01df\u01e0\u0003T*\u0000\u01e0S\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e8\u0003X,\u0000\u01e2\u01e8\u0003Z-\u0000\u01e3\u01e8\u0003\\.\u0000"+
		"\u01e4\u01e8\u0003^/\u0000\u01e5\u01e8\u0003`0\u0000\u01e6\u01e8\u0003"+
		"b1\u0000\u01e7\u01e1\u0001\u0000\u0000\u0000\u01e7\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e3\u0001\u0000\u0000\u0000\u01e7\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e8U\u0001\u0000\u0000\u0000\u01e9\u01f0\u00050\u0000\u0000\u01ea"+
		"\u01f0\u00054\u0000\u0000\u01eb\u01ec\u0005;\u0000\u0000\u01ec\u01ed\u0003"+
		"R)\u0000\u01ed\u01ee\u0005=\u0000\u0000\u01ee\u01f0\u0001\u0000\u0000"+
		"\u0000\u01ef\u01e9\u0001\u0000\u0000\u0000\u01ef\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ef\u01eb\u0001\u0000\u0000\u0000\u01f0W\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f2\u0005#\u0000\u0000\u01f2\u01f5\u0003V+\u0000\u01f3\u01f4"+
		"\u00055\u0000\u0000\u01f4\u01f6\u0003V+\u0000\u01f5\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8Y\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u0005$\u0000\u0000\u01fa\u01fb\u00055\u0000\u0000\u01fb"+
		"\u01fc\u0003V+\u0000\u01fc\u01fd\u0005.\u0000\u0000\u01fd[\u0001\u0000"+
		"\u0000\u0000\u01fe\u01ff\u0005%\u0000\u0000\u01ff\u0200\u00055\u0000\u0000"+
		"\u0200\u0203\u0003V+\u0000\u0201\u0202\u00055\u0000\u0000\u0202\u0204"+
		"\u0003V+\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000"+
		"\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000"+
		"\u0000\u0000\u0206]\u0001\u0000\u0000\u0000\u0207\u0208\u0005&\u0000\u0000"+
		"\u0208\u0209\u00055\u0000\u0000\u0209\u020a\u0003V+\u0000\u020a\u020b"+
		"\u00055\u0000\u0000\u020b\u020c\u0003V+\u0000\u020c_\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0005\'\u0000\u0000\u020e\u020f\u00055\u0000\u0000"+
		"\u020f\u0210\u0003V+\u0000\u0210\u0211\u00055\u0000\u0000\u0211\u0212"+
		"\u0003V+\u0000\u0212a\u0001\u0000\u0000\u0000\u0213\u0214\u0005(\u0000"+
		"\u0000\u0214\u0215\u00055\u0000\u0000\u0215\u0218\u0003V+\u0000\u0216"+
		"\u0217\u00055\u0000\u0000\u0217\u0219\u0003V+\u0000\u0218\u0216\u0001"+
		"\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a\u0218\u0001"+
		"\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021bc\u0001\u0000"+
		"\u0000\u0000\u021c\u021d\u0005\u000f\u0000\u0000\u021d\u021e\u0005.\u0000"+
		"\u0000\u021ee\u0001\u0000\u0000\u0000\u001fikt{\u0082\u008c\u0092\u0097"+
		"\u009e\u00a3\u00b5\u00b8\u00bd\u00c3\u00ca\u00d0\u00d5\u00f1\u00f9\u00ff"+
		"\u010d\u0117\u0180\u01b2\u01c6\u01cb\u01e7\u01ef\u01f7\u0205\u021a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}