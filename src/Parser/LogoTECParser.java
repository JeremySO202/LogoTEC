// Generated from C:/Users/aliss/OneDrive/Documentos/GitHub/LogoTEC/LogoTEC.g4 by ANTLR 4.13.2
package Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LogoTECParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, HAZ=2, INIC=3, INC=4, AVANZA=5, RETROCEDE=6, GIRADERECHA=7, GIRAIZQUIERDA=8, 
		PONPOS=9, PONXY=10, PONRUMBO=11, RUMBO=12, PONX=13, PONY=14, CENTRO=15, 
		BAJALAPIZ=16, SUBELAPIZ=17, PONCOLORLAPIZ=18, OCULTATORTUGA=19, ESPERA=20, 
		EJECUTA=21, REPITE=22, SI=23, HAZ_HASTA=24, HASTA=25, HAZ_MIENTRAS=26, 
		MIENTRAS=27, Y=28, O=29, IGUALES=30, MAYORQUE=31, MENORQUE=32, DIFERENCIA=33, 
		AZAR=34, PRODUCTO=35, POTENCIA=36, DIVISION=37, SUMA=38, PARA=39, FIN=40, 
		BOOLEAN=41, COLOR=42, IGUAL=43, SEMICOLON=44, SQUARE_OPEN=45, SQUARE_CLOSE=46, 
		BRACKET_OPEN=47, BRACKET_CLOSE=48, PAR_OPEN=49, PAR_CLOSE=50, GUION=51, 
		COMILLA=52, STRING=53, ID=54, NUMERO=55, LETRAS=56, GUION_BAJO=57, DIGITO=58, 
		ESPACIO=59, SALTO_LINEA=60, WS=61;
	public static final int
		RULE_program = 0, RULE_estructura_comentario = 1, RULE_comentario = 2, 
		RULE_procedimientos = 3, RULE_procedimiento = 4, RULE_parametros = 5, 
		RULE_ordenes = 6, RULE_orden = 7, RULE_instruccion = 8, RULE_haz = 9, 
		RULE_inic = 10, RULE_inc = 11, RULE_avanza = 12, RULE_retrocede = 13, 
		RULE_giraderecha = 14, RULE_giraizquierda = 15, RULE_ponpos = 16, RULE_ponxy = 17, 
		RULE_ponrumbo = 18, RULE_ponx = 19, RULE_pony = 20, RULE_centro = 21, 
		RULE_bajalapiz = 22, RULE_subelapiz = 23, RULE_poncolor = 24, RULE_ocultatortuga = 25, 
		RULE_espera = 26, RULE_ejecuta = 27, RULE_repite = 28, RULE_si = 29, RULE_haz_hasta = 30, 
		RULE_hasta = 31, RULE_haz_mientras = 32, RULE_mientras = 33, RULE_op_logica = 34, 
		RULE_y = 35, RULE_o = 36, RULE_boolean_val = 37, RULE_op_comparativa = 38, 
		RULE_iguales = 39, RULE_mayorque = 40, RULE_menorque = 41, RULE_operacion = 42, 
		RULE_op_algebraicas = 43, RULE_numeric_val = 44, RULE_diferencia = 45, 
		RULE_azar = 46, RULE_producto = 47, RULE_potencia = 48, RULE_division = 49, 
		RULE_suma = 50, RULE_rumbo = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "estructura_comentario", "comentario", "procedimientos", "procedimiento", 
			"parametros", "ordenes", "orden", "instruccion", "haz", "inic", "inc", 
			"avanza", "retrocede", "giraderecha", "giraizquierda", "ponpos", "ponxy", 
			"ponrumbo", "ponx", "pony", "centro", "bajalapiz", "subelapiz", "poncolor", 
			"ocultatortuga", "espera", "ejecuta", "repite", "si", "haz_hasta", "hasta", 
			"haz_mientras", "mientras", "op_logica", "y", "o", "boolean_val", "op_comparativa", 
			"iguales", "mayorque", "menorque", "operacion", "op_algebraicas", "numeric_val", 
			"diferencia", "azar", "producto", "potencia", "division", "suma", "rumbo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'//'", "'HAZ'", "'INIC'", "'INC'", null, null, null, null, "'PONPOS'", 
			"'PONXY'", "'PONRUMBO'", "'RUMBO'", "'PONX'", "'PONY'", "'CENTRO'", null, 
			null, null, null, "'ESPERA'", "'EJECUTA'", "'REPITE'", "'SI'", "'HAZ.HASTA'", 
			"'HASTA'", "'HAZ.MIENTRAS'", "'MIENTRAS'", "'Y'", "'O'", "'IGUALES?'", 
			"'MAYORQUE?'", "'MENORQUE?'", "'DIFERENCIA'", "'AZAR'", "'PRODUCTO'", 
			"'POTENCIA'", "'DIVISION'", "'SUMA'", "'PARA'", "'FIN'", null, null, 
			"'='", "';'", "'['", "']'", "'{'", "'}'", "'('", "')'", "'-'", "'\"'", 
			null, null, null, null, "'_'", null, "' '", "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "HAZ", "INIC", "INC", "AVANZA", "RETROCEDE", "GIRADERECHA", 
			"GIRAIZQUIERDA", "PONPOS", "PONXY", "PONRUMBO", "RUMBO", "PONX", "PONY", 
			"CENTRO", "BAJALAPIZ", "SUBELAPIZ", "PONCOLORLAPIZ", "OCULTATORTUGA", 
			"ESPERA", "EJECUTA", "REPITE", "SI", "HAZ_HASTA", "HASTA", "HAZ_MIENTRAS", 
			"MIENTRAS", "Y", "O", "IGUALES", "MAYORQUE", "MENORQUE", "DIFERENCIA", 
			"AZAR", "PRODUCTO", "POTENCIA", "DIVISION", "SUMA", "PARA", "FIN", "BOOLEAN", 
			"COLOR", "IGUAL", "SEMICOLON", "SQUARE_OPEN", "SQUARE_CLOSE", "BRACKET_OPEN", 
			"BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "GUION", "COMILLA", "STRING", 
			"ID", "NUMERO", "LETRAS", "GUION_BAJO", "DIGITO", "ESPACIO", "SALTO_LINEA", 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(104);
				estructura_comentario();
				}
				break;
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1729382806934515710L) != 0)) {
				{
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(107);
					procedimientos();
					}
					break;
				case 2:
					{
					setState(108);
					ordenes();
					}
					break;
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterEstructura_comentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitEstructura_comentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitEstructura_comentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Estructura_comentarioContext estructura_comentario() throws RecognitionException {
		Estructura_comentarioContext _localctx = new Estructura_comentarioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_estructura_comentario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__0);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESPACIO) {
				{
				{
				setState(117);
				match(ESPACIO);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(BRACKET_OPEN);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 630503947831869440L) != 0)) {
				{
				{
				setState(124);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 630503947831869440L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(GUION);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 630503947831869440L) != 0)) {
				{
				{
				setState(131);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 630503947831869440L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(BRACKET_CLOSE);
			setState(138);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comentario);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__0);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 882705526964617216L) != 0)) {
				{
				{
				setState(141);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 882705526964617216L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(147);
					match(SALTO_LINEA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterProcedimientos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitProcedimientos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitProcedimientos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedimientosContext procedimientos() throws RecognitionException {
		ProcedimientosContext _localctx = new ProcedimientosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedimientos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SALTO_LINEA) {
						{
						{
						setState(152);
						match(SALTO_LINEA);
						}
						}
						setState(157);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(158);
					procedimiento();
					setState(162);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(159);
							match(SALTO_LINEA);
							}
							} 
						}
						setState(164);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(167); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public TerminalNode FIN() { return getToken(LogoTECParser.FIN, 0); }
		public List<TerminalNode> SALTO_LINEA() { return getTokens(LogoTECParser.SALTO_LINEA); }
		public TerminalNode SALTO_LINEA(int i) {
			return getToken(LogoTECParser.SALTO_LINEA, i);
		}
		public ProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimiento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterProcedimiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitProcedimiento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitProcedimiento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedimientoContext procedimiento() throws RecognitionException {
		ProcedimientoContext _localctx = new ProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procedimiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(PARA);
			setState(170);
			match(ESPACIO);
			setState(171);
			match(ID);
			setState(172);
			match(ESPACIO);
			setState(173);
			match(SQUARE_OPEN);
			setState(174);
			parametros();
			setState(175);
			match(SQUARE_CLOSE);
			setState(176);
			ordenes();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTO_LINEA) {
				{
				{
				setState(177);
				match(SALTO_LINEA);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametros);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==ESPACIO) {
				{
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ESPACIO) {
					{
					{
					setState(185);
					match(ESPACIO);
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				match(ID);
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(192);
						match(ESPACIO);
						setState(193);
						match(ID);
						}
						} 
					}
					setState(198);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ESPACIO) {
					{
					{
					setState(199);
					match(ESPACIO);
					}
					}
					setState(204);
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
		public List<OrdenContext> orden() {
			return getRuleContexts(OrdenContext.class);
		}
		public OrdenContext orden(int i) {
			return getRuleContext(OrdenContext.class,i);
		}
		public OrdenesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordenes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterOrdenes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitOrdenes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOrdenes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdenesContext ordenes() throws RecognitionException {
		OrdenesContext _localctx = new OrdenesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ordenes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(207);
					orden();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(210); 
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
	public static class OrdenContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public List<TerminalNode> SALTO_LINEA() { return getTokens(LogoTECParser.SALTO_LINEA); }
		public TerminalNode SALTO_LINEA(int i) {
			return getToken(LogoTECParser.SALTO_LINEA, i);
		}
		public List<TerminalNode> ESPACIO() { return getTokens(LogoTECParser.ESPACIO); }
		public TerminalNode ESPACIO(int i) {
			return getToken(LogoTECParser.ESPACIO, i);
		}
		public OrdenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orden; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterOrden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitOrden(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOrden(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdenContext orden() throws RecognitionException {
		OrdenContext _localctx = new OrdenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_orden);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SALTO_LINEA) {
				{
				{
				setState(212);
				match(SALTO_LINEA);
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESPACIO) {
				{
				{
				setState(218);
				match(ESPACIO);
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			instruccion();
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					match(SALTO_LINEA);
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(ESPACIO);
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instruccion);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HAZ:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				haz();
				}
				break;
			case INIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				inic();
				}
				break;
			case INC:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				inc();
				}
				break;
			case AVANZA:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				avanza();
				}
				break;
			case RETROCEDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				retrocede();
				}
				break;
			case GIRADERECHA:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				giraderecha();
				}
				break;
			case GIRAIZQUIERDA:
				enterOuterAlt(_localctx, 7);
				{
				setState(243);
				giraizquierda();
				}
				break;
			case OCULTATORTUGA:
				enterOuterAlt(_localctx, 8);
				{
				setState(244);
				ocultatortuga();
				}
				break;
			case PONPOS:
				enterOuterAlt(_localctx, 9);
				{
				setState(245);
				ponpos();
				}
				break;
			case PONXY:
				enterOuterAlt(_localctx, 10);
				{
				setState(246);
				ponxy();
				}
				break;
			case PONRUMBO:
				enterOuterAlt(_localctx, 11);
				{
				setState(247);
				ponrumbo();
				}
				break;
			case PONX:
				enterOuterAlt(_localctx, 12);
				{
				setState(248);
				ponx();
				}
				break;
			case PONY:
				enterOuterAlt(_localctx, 13);
				{
				setState(249);
				pony();
				}
				break;
			case BAJALAPIZ:
				enterOuterAlt(_localctx, 14);
				{
				setState(250);
				bajalapiz();
				}
				break;
			case SUBELAPIZ:
				enterOuterAlt(_localctx, 15);
				{
				setState(251);
				subelapiz();
				}
				break;
			case PONCOLORLAPIZ:
				enterOuterAlt(_localctx, 16);
				{
				setState(252);
				poncolor();
				}
				break;
			case CENTRO:
				enterOuterAlt(_localctx, 17);
				{
				setState(253);
				centro();
				}
				break;
			case ESPERA:
				enterOuterAlt(_localctx, 18);
				{
				setState(254);
				espera();
				}
				break;
			case EJECUTA:
				enterOuterAlt(_localctx, 19);
				{
				setState(255);
				ejecuta();
				}
				break;
			case REPITE:
				enterOuterAlt(_localctx, 20);
				{
				setState(256);
				repite();
				}
				break;
			case SI:
				enterOuterAlt(_localctx, 21);
				{
				setState(257);
				si();
				}
				break;
			case HAZ_HASTA:
				enterOuterAlt(_localctx, 22);
				{
				setState(258);
				haz_hasta();
				}
				break;
			case HASTA:
				enterOuterAlt(_localctx, 23);
				{
				setState(259);
				hasta();
				}
				break;
			case HAZ_MIENTRAS:
				enterOuterAlt(_localctx, 24);
				{
				setState(260);
				haz_mientras();
				}
				break;
			case MIENTRAS:
				enterOuterAlt(_localctx, 25);
				{
				setState(261);
				mientras();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 26);
				{
				setState(262);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterHaz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitHaz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitHaz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HazContext haz() throws RecognitionException {
		HazContext _localctx = new HazContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_haz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(HAZ);
			setState(266);
			match(ESPACIO);
			setState(267);
			match(ID);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ESPACIO) {
				{
				{
				setState(268);
				match(ESPACIO);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(274);
				numeric_val();
				}
				break;
			case 2:
				{
				setState(275);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(276);
				boolean_val();
				}
				break;
			}
			setState(279);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterInic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitInic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitInic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicContext inic() throws RecognitionException {
		InicContext _localctx = new InicContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(INIC);
			setState(282);
			match(ESPACIO);
			setState(283);
			match(ID);
			setState(284);
			match(ESPACIO);
			setState(285);
			match(IGUAL);
			setState(286);
			match(ESPACIO);
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(287);
				numeric_val();
				}
				break;
			case 2:
				{
				setState(288);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(289);
				boolean_val();
				}
				break;
			case 4:
				{
				setState(290);
				operacion();
				}
				break;
			}
			setState(293);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(INC);
			setState(296);
			match(ESPACIO);
			setState(297);
			match(SQUARE_OPEN);
			setState(298);
			numeric_val();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESPACIO) {
				{
				setState(299);
				match(ESPACIO);
				setState(300);
				numeric_val();
				}
			}

			setState(303);
			match(SQUARE_CLOSE);
			setState(304);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterAvanza(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitAvanza(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitAvanza(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvanzaContext avanza() throws RecognitionException {
		AvanzaContext _localctx = new AvanzaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_avanza);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(AVANZA);
			setState(307);
			match(ESPACIO);
			setState(308);
			numeric_val();
			setState(309);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterRetrocede(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitRetrocede(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitRetrocede(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetrocedeContext retrocede() throws RecognitionException {
		RetrocedeContext _localctx = new RetrocedeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_retrocede);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(RETROCEDE);
			setState(312);
			match(ESPACIO);
			setState(313);
			numeric_val();
			setState(314);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterGiraderecha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitGiraderecha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitGiraderecha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GiraderechaContext giraderecha() throws RecognitionException {
		GiraderechaContext _localctx = new GiraderechaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_giraderecha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(GIRADERECHA);
			setState(317);
			match(ESPACIO);
			setState(318);
			numeric_val();
			setState(319);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterGiraizquierda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitGiraizquierda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitGiraizquierda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GiraizquierdaContext giraizquierda() throws RecognitionException {
		GiraizquierdaContext _localctx = new GiraizquierdaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_giraizquierda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(GIRAIZQUIERDA);
			setState(322);
			match(ESPACIO);
			setState(323);
			numeric_val();
			setState(324);
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
		public PonposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponpos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterPonpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitPonpos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitPonpos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PonposContext ponpos() throws RecognitionException {
		PonposContext _localctx = new PonposContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ponpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(PONPOS);
			setState(327);
			match(ESPACIO);
			setState(328);
			match(SQUARE_OPEN);
			setState(329);
			numeric_val();
			setState(330);
			match(ESPACIO);
			setState(331);
			numeric_val();
			setState(332);
			match(SQUARE_CLOSE);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterPonxy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitPonxy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitPonxy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PonxyContext ponxy() throws RecognitionException {
		PonxyContext _localctx = new PonxyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ponxy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(PONXY);
			setState(336);
			match(ESPACIO);
			setState(337);
			numeric_val();
			setState(338);
			match(ESPACIO);
			setState(339);
			numeric_val();
			setState(340);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterPonrumbo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitPonrumbo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitPonrumbo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PonrumboContext ponrumbo() throws RecognitionException {
		PonrumboContext _localctx = new PonrumboContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ponrumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(PONRUMBO);
			setState(343);
			match(ESPACIO);
			setState(344);
			numeric_val();
			setState(345);
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
		public TerminalNode ESPACIO() { return getToken(LogoTECParser.ESPACIO, 0); }
		public Numeric_valContext numeric_val() {
			return getRuleContext(Numeric_valContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public PonxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterPonx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitPonx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitPonx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PonxContext ponx() throws RecognitionException {
		PonxContext _localctx = new PonxContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ponx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(PONX);
			setState(348);
			match(ESPACIO);
			setState(349);
			numeric_val();
			setState(350);
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
		public TerminalNode ESPACIO() { return getToken(LogoTECParser.ESPACIO, 0); }
		public Numeric_valContext numeric_val() {
			return getRuleContext(Numeric_valContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LogoTECParser.SEMICOLON, 0); }
		public PonyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pony; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterPony(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitPony(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitPony(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PonyContext pony() throws RecognitionException {
		PonyContext _localctx = new PonyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pony);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(PONY);
			setState(353);
			match(ESPACIO);
			setState(354);
			numeric_val();
			setState(355);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterCentro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitCentro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitCentro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CentroContext centro() throws RecognitionException {
		CentroContext _localctx = new CentroContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_centro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(CENTRO);
			setState(358);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterBajalapiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitBajalapiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitBajalapiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BajalapizContext bajalapiz() throws RecognitionException {
		BajalapizContext _localctx = new BajalapizContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bajalapiz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(BAJALAPIZ);
			setState(361);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterSubelapiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitSubelapiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitSubelapiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubelapizContext subelapiz() throws RecognitionException {
		SubelapizContext _localctx = new SubelapizContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_subelapiz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(SUBELAPIZ);
			setState(364);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterPoncolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitPoncolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitPoncolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PoncolorContext poncolor() throws RecognitionException {
		PoncolorContext _localctx = new PoncolorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_poncolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(PONCOLORLAPIZ);
			setState(367);
			match(ESPACIO);
			setState(368);
			match(COLOR);
			setState(369);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterOcultatortuga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitOcultatortuga(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOcultatortuga(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OcultatortugaContext ocultatortuga() throws RecognitionException {
		OcultatortugaContext _localctx = new OcultatortugaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ocultatortuga);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(OCULTATORTUGA);
			setState(372);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterEspera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitEspera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitEspera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EsperaContext espera() throws RecognitionException {
		EsperaContext _localctx = new EsperaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_espera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(ESPERA);
			setState(375);
			match(ESPACIO);
			setState(376);
			numeric_val();
			setState(377);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterEjecuta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitEjecuta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitEjecuta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EjecutaContext ejecuta() throws RecognitionException {
		EjecutaContext _localctx = new EjecutaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ejecuta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(EJECUTA);
			setState(380);
			match(ESPACIO);
			setState(381);
			match(SQUARE_OPEN);
			setState(382);
			ordenes();
			setState(383);
			match(SQUARE_CLOSE);
			setState(384);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterRepite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitRepite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitRepite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepiteContext repite() throws RecognitionException {
		RepiteContext _localctx = new RepiteContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_repite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(REPITE);
			setState(387);
			match(ESPACIO);
			setState(388);
			numeric_val();
			setState(389);
			match(ESPACIO);
			setState(390);
			match(SQUARE_OPEN);
			setState(391);
			ordenes();
			setState(392);
			match(SQUARE_CLOSE);
			setState(393);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(SI);
			setState(396);
			match(ESPACIO);
			setState(397);
			match(PAR_OPEN);
			setState(398);
			boolean_val();
			setState(399);
			match(PAR_CLOSE);
			setState(400);
			match(ESPACIO);
			setState(401);
			match(SQUARE_OPEN);
			setState(402);
			ordenes();
			setState(403);
			match(SQUARE_CLOSE);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESPACIO) {
				{
				setState(404);
				match(ESPACIO);
				setState(405);
				match(SQUARE_OPEN);
				setState(406);
				ordenes();
				setState(407);
				match(SQUARE_CLOSE);
				}
			}

			setState(411);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterHaz_hasta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitHaz_hasta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitHaz_hasta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Haz_hastaContext haz_hasta() throws RecognitionException {
		Haz_hastaContext _localctx = new Haz_hastaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_haz_hasta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(HAZ_HASTA);
			setState(414);
			match(ESPACIO);
			setState(415);
			match(SQUARE_OPEN);
			setState(416);
			ordenes();
			setState(417);
			match(SQUARE_CLOSE);
			setState(418);
			match(ESPACIO);
			setState(419);
			match(PAR_OPEN);
			setState(420);
			boolean_val();
			setState(421);
			match(PAR_CLOSE);
			setState(422);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterHasta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitHasta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitHasta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HastaContext hasta() throws RecognitionException {
		HastaContext _localctx = new HastaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_hasta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(HASTA);
			setState(425);
			match(ESPACIO);
			setState(426);
			match(PAR_OPEN);
			setState(427);
			boolean_val();
			setState(428);
			match(PAR_CLOSE);
			setState(429);
			match(ESPACIO);
			setState(430);
			match(SQUARE_OPEN);
			setState(431);
			ordenes();
			setState(432);
			match(SQUARE_CLOSE);
			setState(433);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterHaz_mientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitHaz_mientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitHaz_mientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Haz_mientrasContext haz_mientras() throws RecognitionException {
		Haz_mientrasContext _localctx = new Haz_mientrasContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_haz_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(HAZ_MIENTRAS);
			setState(436);
			match(ESPACIO);
			setState(437);
			match(SQUARE_OPEN);
			setState(438);
			ordenes();
			setState(439);
			match(SQUARE_CLOSE);
			setState(440);
			match(ESPACIO);
			setState(441);
			match(PAR_OPEN);
			setState(442);
			boolean_val();
			setState(443);
			match(PAR_CLOSE);
			setState(444);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(MIENTRAS);
			setState(447);
			match(ESPACIO);
			setState(448);
			match(PAR_OPEN);
			setState(449);
			boolean_val();
			setState(450);
			match(PAR_CLOSE);
			setState(451);
			match(ESPACIO);
			setState(452);
			match(SQUARE_OPEN);
			setState(453);
			ordenes();
			setState(454);
			match(SQUARE_CLOSE);
			setState(455);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterOp_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitOp_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOp_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logicaContext op_logica() throws RecognitionException {
		Op_logicaContext _localctx = new Op_logicaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_op_logica);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Y:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				y();
				}
				break;
			case O:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
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
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(Y);
			setState(462);
			match(ESPACIO);
			setState(463);
			boolean_val();
			setState(464);
			match(ESPACIO);
			setState(465);
			boolean_val();
			}
		}
		catch (RecognitionException re) {
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
		public OContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterO(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitO(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitO(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OContext o() throws RecognitionException {
		OContext _localctx = new OContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_o);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(O);
			setState(468);
			match(ESPACIO);
			setState(469);
			boolean_val();
			setState(470);
			match(ESPACIO);
			setState(471);
			boolean_val();
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterBoolean_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitBoolean_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitBoolean_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_valContext boolean_val() throws RecognitionException {
		Boolean_valContext _localctx = new Boolean_valContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_boolean_val);
		try {
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				match(ID);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(BOOLEAN);
				}
				break;
			case Y:
			case O:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				op_logica();
				}
				break;
			case IGUALES:
			case MAYORQUE:
			case MENORQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterOp_comparativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitOp_comparativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOp_comparativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_comparativaContext op_comparativa() throws RecognitionException {
		Op_comparativaContext _localctx = new Op_comparativaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_op_comparativa);
		try {
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGUALES:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				iguales();
				}
				break;
			case MAYORQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				mayorque();
				}
				break;
			case MENORQUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterIguales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitIguales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitIguales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualesContext iguales() throws RecognitionException {
		IgualesContext _localctx = new IgualesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_iguales);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(IGUALES);
			setState(485);
			match(ESPACIO);
			setState(486);
			numeric_val();
			setState(487);
			match(ESPACIO);
			setState(488);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterMayorque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitMayorque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitMayorque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MayorqueContext mayorque() throws RecognitionException {
		MayorqueContext _localctx = new MayorqueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_mayorque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(MAYORQUE);
			setState(491);
			match(ESPACIO);
			setState(492);
			numeric_val();
			setState(493);
			match(ESPACIO);
			setState(494);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterMenorque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitMenorque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitMenorque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MenorqueContext menorque() throws RecognitionException {
		MenorqueContext _localctx = new MenorqueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_menorque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(MENORQUE);
			setState(497);
			match(ESPACIO);
			setState(498);
			numeric_val();
			setState(499);
			match(ESPACIO);
			setState(500);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_operacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterOp_algebraicas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitOp_algebraicas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitOp_algebraicas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_algebraicasContext op_algebraicas() throws RecognitionException {
		Op_algebraicasContext _localctx = new Op_algebraicasContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_op_algebraicas);
		try {
			setState(510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIFERENCIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				diferencia();
				}
				break;
			case AZAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				azar();
				}
				break;
			case PRODUCTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				producto();
				}
				break;
			case POTENCIA:
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
				potencia();
				}
				break;
			case DIVISION:
				enterOuterAlt(_localctx, 5);
				{
				setState(508);
				division();
				}
				break;
			case SUMA:
				enterOuterAlt(_localctx, 6);
				{
				setState(509);
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
		public TerminalNode DIGITO() { return getToken(LogoTECParser.DIGITO, 0); }
		public RumboContext rumbo() {
			return getRuleContext(RumboContext.class,0);
		}
		public TerminalNode PAR_OPEN() { return getToken(LogoTECParser.PAR_OPEN, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(LogoTECParser.PAR_CLOSE, 0); }
		public Numeric_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterNumeric_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitNumeric_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitNumeric_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_valContext numeric_val() throws RecognitionException {
		Numeric_valContext _localctx = new Numeric_valContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_numeric_val);
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(ID);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				match(NUMERO);
				}
				break;
			case DIGITO:
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				match(DIGITO);
				}
				break;
			case RUMBO:
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
				rumbo();
				}
				break;
			case PAR_OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(516);
				match(PAR_OPEN);
				setState(517);
				operacion();
				setState(518);
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
		public DiferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diferencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterDiferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitDiferencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitDiferencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiferenciaContext diferencia() throws RecognitionException {
		DiferenciaContext _localctx = new DiferenciaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_diferencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(DIFERENCIA);
			setState(523);
			match(ESPACIO);
			setState(524);
			numeric_val();
			setState(527); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(525);
				match(ESPACIO);
				setState(526);
				numeric_val();
				}
				}
				setState(529); 
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
		public AzarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_azar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterAzar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitAzar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitAzar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AzarContext azar() throws RecognitionException {
		AzarContext _localctx = new AzarContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_azar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(AZAR);
			setState(532);
			match(ESPACIO);
			setState(533);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterProducto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitProducto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitProducto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductoContext producto() throws RecognitionException {
		ProductoContext _localctx = new ProductoContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_producto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(PRODUCTO);
			setState(536);
			match(ESPACIO);
			setState(537);
			numeric_val();
			setState(540); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(538);
				match(ESPACIO);
				setState(539);
				numeric_val();
				}
				}
				setState(542); 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterPotencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitPotencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitPotencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_potencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(POTENCIA);
			setState(545);
			match(ESPACIO);
			setState(546);
			numeric_val();
			setState(547);
			match(ESPACIO);
			setState(548);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(DIVISION);
			setState(551);
			match(ESPACIO);
			setState(552);
			numeric_val();
			setState(553);
			match(ESPACIO);
			setState(554);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitSuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_suma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(SUMA);
			setState(557);
			match(ESPACIO);
			setState(558);
			numeric_val();
			setState(561); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(559);
				match(ESPACIO);
				setState(560);
				numeric_val();
				}
				}
				setState(563); 
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
		public RumboContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rumbo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).enterRumbo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LogoTECListener ) ((LogoTECListener)listener).exitRumbo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LogoTECVisitor ) return ((LogoTECVisitor<? extends T>)visitor).visitRumbo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RumboContext rumbo() throws RecognitionException {
		RumboContext _localctx = new RumboContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_rumbo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(RUMBO);
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001=\u0238\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u0001\u0000\u0003\u0000j\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000n\b\u0000\n\u0000\f\u0000q\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0005\u0001w\b\u0001\n\u0001\f\u0001z\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001~\b\u0001\n\u0001\f\u0001\u0081"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0085\b\u0001\n\u0001\f\u0001"+
		"\u0088\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u008f\b\u0002\n\u0002\f\u0002\u0092\t\u0002\u0001\u0002\u0004"+
		"\u0002\u0095\b\u0002\u000b\u0002\f\u0002\u0096\u0001\u0003\u0005\u0003"+
		"\u009a\b\u0003\n\u0003\f\u0003\u009d\t\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u00a1\b\u0003\n\u0003\f\u0003\u00a4\t\u0003\u0004\u0003\u00a6\b"+
		"\u0003\u000b\u0003\f\u0003\u00a7\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00b3\b\u0004\n\u0004\f\u0004\u00b6\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0005\u0005\u00bb\b\u0005\n\u0005\f\u0005\u00be\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00c3\b\u0005\n\u0005\f\u0005"+
		"\u00c6\t\u0005\u0001\u0005\u0005\u0005\u00c9\b\u0005\n\u0005\f\u0005\u00cc"+
		"\t\u0005\u0003\u0005\u00ce\b\u0005\u0001\u0006\u0004\u0006\u00d1\b\u0006"+
		"\u000b\u0006\f\u0006\u00d2\u0001\u0007\u0005\u0007\u00d6\b\u0007\n\u0007"+
		"\f\u0007\u00d9\t\u0007\u0001\u0007\u0005\u0007\u00dc\b\u0007\n\u0007\f"+
		"\u0007\u00df\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00e3\b\u0007"+
		"\n\u0007\f\u0007\u00e6\t\u0007\u0001\u0007\u0005\u0007\u00e9\b\u0007\n"+
		"\u0007\f\u0007\u00ec\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0108\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u010e\b\t\n\t\f\t\u0111\t\t\u0001\t\u0001\t\u0001\t\u0003\t\u0116\b"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u0124\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u012e\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u019a\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0003\"\u01cc\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u01de\b%\u0001&\u0001&\u0001&\u0003&\u01e3\b&\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u01ff\b+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0003,\u0209\b,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0004-\u0210\b-\u000b-\f-\u0211\u0001.\u0001.\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0004/\u021d\b/\u000b/\f/\u021e\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00012\u00042\u0232\b2\u000b2\f2\u0233\u0001"+
		"3\u00013\u00013\u0000\u00004\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdf\u0000\u0002\u0002\u000067;;\u0002\u000066:;\u024b\u0000i\u0001"+
		"\u0000\u0000\u0000\u0002t\u0001\u0000\u0000\u0000\u0004\u008c\u0001\u0000"+
		"\u0000\u0000\u0006\u00a5\u0001\u0000\u0000\u0000\b\u00a9\u0001\u0000\u0000"+
		"\u0000\n\u00cd\u0001\u0000\u0000\u0000\f\u00d0\u0001\u0000\u0000\u0000"+
		"\u000e\u00d7\u0001\u0000\u0000\u0000\u0010\u0107\u0001\u0000\u0000\u0000"+
		"\u0012\u0109\u0001\u0000\u0000\u0000\u0014\u0119\u0001\u0000\u0000\u0000"+
		"\u0016\u0127\u0001\u0000\u0000\u0000\u0018\u0132\u0001\u0000\u0000\u0000"+
		"\u001a\u0137\u0001\u0000\u0000\u0000\u001c\u013c\u0001\u0000\u0000\u0000"+
		"\u001e\u0141\u0001\u0000\u0000\u0000 \u0146\u0001\u0000\u0000\u0000\""+
		"\u014f\u0001\u0000\u0000\u0000$\u0156\u0001\u0000\u0000\u0000&\u015b\u0001"+
		"\u0000\u0000\u0000(\u0160\u0001\u0000\u0000\u0000*\u0165\u0001\u0000\u0000"+
		"\u0000,\u0168\u0001\u0000\u0000\u0000.\u016b\u0001\u0000\u0000\u00000"+
		"\u016e\u0001\u0000\u0000\u00002\u0173\u0001\u0000\u0000\u00004\u0176\u0001"+
		"\u0000\u0000\u00006\u017b\u0001\u0000\u0000\u00008\u0182\u0001\u0000\u0000"+
		"\u0000:\u018b\u0001\u0000\u0000\u0000<\u019d\u0001\u0000\u0000\u0000>"+
		"\u01a8\u0001\u0000\u0000\u0000@\u01b3\u0001\u0000\u0000\u0000B\u01be\u0001"+
		"\u0000\u0000\u0000D\u01cb\u0001\u0000\u0000\u0000F\u01cd\u0001\u0000\u0000"+
		"\u0000H\u01d3\u0001\u0000\u0000\u0000J\u01dd\u0001\u0000\u0000\u0000L"+
		"\u01e2\u0001\u0000\u0000\u0000N\u01e4\u0001\u0000\u0000\u0000P\u01ea\u0001"+
		"\u0000\u0000\u0000R\u01f0\u0001\u0000\u0000\u0000T\u01f6\u0001\u0000\u0000"+
		"\u0000V\u01fe\u0001\u0000\u0000\u0000X\u0208\u0001\u0000\u0000\u0000Z"+
		"\u020a\u0001\u0000\u0000\u0000\\\u0213\u0001\u0000\u0000\u0000^\u0217"+
		"\u0001\u0000\u0000\u0000`\u0220\u0001\u0000\u0000\u0000b\u0226\u0001\u0000"+
		"\u0000\u0000d\u022c\u0001\u0000\u0000\u0000f\u0235\u0001\u0000\u0000\u0000"+
		"hj\u0003\u0002\u0001\u0000ih\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jo\u0001\u0000\u0000\u0000kn\u0003\u0006\u0003\u0000ln\u0003\f\u0006"+
		"\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0005\u0000\u0000\u0001"+
		"s\u0001\u0001\u0000\u0000\u0000tx\u0005\u0001\u0000\u0000uw\u0005;\u0000"+
		"\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000{\u007f\u0005/\u0000\u0000|~\u0007\u0000\u0000\u0000"+
		"}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0086\u0005"+
		"3\u0000\u0000\u0083\u0085\u0007\u0000\u0000\u0000\u0084\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u00050\u0000"+
		"\u0000\u008a\u008b\u0005<\u0000\u0000\u008b\u0003\u0001\u0000\u0000\u0000"+
		"\u008c\u0090\u0005\u0001\u0000\u0000\u008d\u008f\u0007\u0001\u0000\u0000"+
		"\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0093\u0095\u0005<\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u0005\u0001\u0000\u0000\u0000\u0098"+
		"\u009a\u0005<\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u00a2\u0003\b\u0004\u0000\u009f\u00a1\u0005"+
		"<\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u009b\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u0007\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\'\u0000"+
		"\u0000\u00aa\u00ab\u0005;\u0000\u0000\u00ab\u00ac\u00056\u0000\u0000\u00ac"+
		"\u00ad\u0005;\u0000\u0000\u00ad\u00ae\u0005-\u0000\u0000\u00ae\u00af\u0003"+
		"\n\u0005\u0000\u00af\u00b0\u0005.\u0000\u0000\u00b0\u00b4\u0003\f\u0006"+
		"\u0000\u00b1\u00b3\u0005<\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005(\u0000\u0000\u00b8"+
		"\t\u0001\u0000\u0000\u0000\u00b9\u00bb\u0005;\u0000\u0000\u00ba\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf"+
		"\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c4"+
		"\u00056\u0000\u0000\u00c0\u00c1\u0005;\u0000\u0000\u00c1\u00c3\u00056"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00ca\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c9\u0005;\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00bc\u0001\u0000\u0000"+
		"\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u000b\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d1\u0003\u000e\u0007\u0000\u00d0\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\r\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d6\u0005<\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u00dd\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00da\u00dc\u0005;\u0000\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e4"+
		"\u0003\u0010\b\u0000\u00e1\u00e3\u0005<\u0000\u0000\u00e2\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e9\u0005"+
		";\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000"+
		"\u0000\u0000\u00eb\u000f\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ed\u0108\u0003\u0012\t\u0000\u00ee\u0108\u0003\u0014\n"+
		"\u0000\u00ef\u0108\u0003\u0016\u000b\u0000\u00f0\u0108\u0003\u0018\f\u0000"+
		"\u00f1\u0108\u0003\u001a\r\u0000\u00f2\u0108\u0003\u001c\u000e\u0000\u00f3"+
		"\u0108\u0003\u001e\u000f\u0000\u00f4\u0108\u00032\u0019\u0000\u00f5\u0108"+
		"\u0003 \u0010\u0000\u00f6\u0108\u0003\"\u0011\u0000\u00f7\u0108\u0003"+
		"$\u0012\u0000\u00f8\u0108\u0003&\u0013\u0000\u00f9\u0108\u0003(\u0014"+
		"\u0000\u00fa\u0108\u0003,\u0016\u0000\u00fb\u0108\u0003.\u0017\u0000\u00fc"+
		"\u0108\u00030\u0018\u0000\u00fd\u0108\u0003*\u0015\u0000\u00fe\u0108\u0003"+
		"4\u001a\u0000\u00ff\u0108\u00036\u001b\u0000\u0100\u0108\u00038\u001c"+
		"\u0000\u0101\u0108\u0003:\u001d\u0000\u0102\u0108\u0003<\u001e\u0000\u0103"+
		"\u0108\u0003>\u001f\u0000\u0104\u0108\u0003@ \u0000\u0105\u0108\u0003"+
		"B!\u0000\u0106\u0108\u0003\u0004\u0002\u0000\u0107\u00ed\u0001\u0000\u0000"+
		"\u0000\u0107\u00ee\u0001\u0000\u0000\u0000\u0107\u00ef\u0001\u0000\u0000"+
		"\u0000\u0107\u00f0\u0001\u0000\u0000\u0000\u0107\u00f1\u0001\u0000\u0000"+
		"\u0000\u0107\u00f2\u0001\u0000\u0000\u0000\u0107\u00f3\u0001\u0000\u0000"+
		"\u0000\u0107\u00f4\u0001\u0000\u0000\u0000\u0107\u00f5\u0001\u0000\u0000"+
		"\u0000\u0107\u00f6\u0001\u0000\u0000\u0000\u0107\u00f7\u0001\u0000\u0000"+
		"\u0000\u0107\u00f8\u0001\u0000\u0000\u0000\u0107\u00f9\u0001\u0000\u0000"+
		"\u0000\u0107\u00fa\u0001\u0000\u0000\u0000\u0107\u00fb\u0001\u0000\u0000"+
		"\u0000\u0107\u00fc\u0001\u0000\u0000\u0000\u0107\u00fd\u0001\u0000\u0000"+
		"\u0000\u0107\u00fe\u0001\u0000\u0000\u0000\u0107\u00ff\u0001\u0000\u0000"+
		"\u0000\u0107\u0100\u0001\u0000\u0000\u0000\u0107\u0101\u0001\u0000\u0000"+
		"\u0000\u0107\u0102\u0001\u0000\u0000\u0000\u0107\u0103\u0001\u0000\u0000"+
		"\u0000\u0107\u0104\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u0011\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0005\u0002\u0000\u0000\u010a\u010b\u0005;\u0000\u0000"+
		"\u010b\u010f\u00056\u0000\u0000\u010c\u010e\u0005;\u0000\u0000\u010d\u010c"+
		"\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0115"+
		"\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0116"+
		"\u0003X,\u0000\u0113\u0116\u00055\u0000\u0000\u0114\u0116\u0003J%\u0000"+
		"\u0115\u0112\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000"+
		"\u0117\u0118\u0005,\u0000\u0000\u0118\u0013\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0005\u0003\u0000\u0000\u011a\u011b\u0005;\u0000\u0000\u011b\u011c"+
		"\u00056\u0000\u0000\u011c\u011d\u0005;\u0000\u0000\u011d\u011e\u0005+"+
		"\u0000\u0000\u011e\u0123\u0005;\u0000\u0000\u011f\u0124\u0003X,\u0000"+
		"\u0120\u0124\u00055\u0000\u0000\u0121\u0124\u0003J%\u0000\u0122\u0124"+
		"\u0003T*\u0000\u0123\u011f\u0001\u0000\u0000\u0000\u0123\u0120\u0001\u0000"+
		"\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0122\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0005,\u0000"+
		"\u0000\u0126\u0015\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0004\u0000"+
		"\u0000\u0128\u0129\u0005;\u0000\u0000\u0129\u012a\u0005-\u0000\u0000\u012a"+
		"\u012d\u0003X,\u0000\u012b\u012c\u0005;\u0000\u0000\u012c\u012e\u0003"+
		"X,\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0130\u0005.\u0000\u0000"+
		"\u0130\u0131\u0005,\u0000\u0000\u0131\u0017\u0001\u0000\u0000\u0000\u0132"+
		"\u0133\u0005\u0005\u0000\u0000\u0133\u0134\u0005;\u0000\u0000\u0134\u0135"+
		"\u0003X,\u0000\u0135\u0136\u0005,\u0000\u0000\u0136\u0019\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0005\u0006\u0000\u0000\u0138\u0139\u0005;\u0000"+
		"\u0000\u0139\u013a\u0003X,\u0000\u013a\u013b\u0005,\u0000\u0000\u013b"+
		"\u001b\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0007\u0000\u0000\u013d"+
		"\u013e\u0005;\u0000\u0000\u013e\u013f\u0003X,\u0000\u013f\u0140\u0005"+
		",\u0000\u0000\u0140\u001d\u0001\u0000\u0000\u0000\u0141\u0142\u0005\b"+
		"\u0000\u0000\u0142\u0143\u0005;\u0000\u0000\u0143\u0144\u0003X,\u0000"+
		"\u0144\u0145\u0005,\u0000\u0000\u0145\u001f\u0001\u0000\u0000\u0000\u0146"+
		"\u0147\u0005\t\u0000\u0000\u0147\u0148\u0005;\u0000\u0000\u0148\u0149"+
		"\u0005-\u0000\u0000\u0149\u014a\u0003X,\u0000\u014a\u014b\u0005;\u0000"+
		"\u0000\u014b\u014c\u0003X,\u0000\u014c\u014d\u0005.\u0000\u0000\u014d"+
		"\u014e\u0005,\u0000\u0000\u014e!\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"\n\u0000\u0000\u0150\u0151\u0005;\u0000\u0000\u0151\u0152\u0003X,\u0000"+
		"\u0152\u0153\u0005;\u0000\u0000\u0153\u0154\u0003X,\u0000\u0154\u0155"+
		"\u0005,\u0000\u0000\u0155#\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u000b"+
		"\u0000\u0000\u0157\u0158\u0005;\u0000\u0000\u0158\u0159\u0003X,\u0000"+
		"\u0159\u015a\u0005,\u0000\u0000\u015a%\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0005\r\u0000\u0000\u015c\u015d\u0005;\u0000\u0000\u015d\u015e\u0003"+
		"X,\u0000\u015e\u015f\u0005,\u0000\u0000\u015f\'\u0001\u0000\u0000\u0000"+
		"\u0160\u0161\u0005\u000e\u0000\u0000\u0161\u0162\u0005;\u0000\u0000\u0162"+
		"\u0163\u0003X,\u0000\u0163\u0164\u0005,\u0000\u0000\u0164)\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0005\u000f\u0000\u0000\u0166\u0167\u0005,\u0000"+
		"\u0000\u0167+\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u0010\u0000\u0000"+
		"\u0169\u016a\u0005,\u0000\u0000\u016a-\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0005\u0011\u0000\u0000\u016c\u016d\u0005,\u0000\u0000\u016d/\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0005\u0012\u0000\u0000\u016f\u0170\u0005;\u0000"+
		"\u0000\u0170\u0171\u0005*\u0000\u0000\u0171\u0172\u0005,\u0000\u0000\u0172"+
		"1\u0001\u0000\u0000\u0000\u0173\u0174\u0005\u0013\u0000\u0000\u0174\u0175"+
		"\u0005,\u0000\u0000\u01753\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u0014"+
		"\u0000\u0000\u0177\u0178\u0005;\u0000\u0000\u0178\u0179\u0003X,\u0000"+
		"\u0179\u017a\u0005,\u0000\u0000\u017a5\u0001\u0000\u0000\u0000\u017b\u017c"+
		"\u0005\u0015\u0000\u0000\u017c\u017d\u0005;\u0000\u0000\u017d\u017e\u0005"+
		"-\u0000\u0000\u017e\u017f\u0003\f\u0006\u0000\u017f\u0180\u0005.\u0000"+
		"\u0000\u0180\u0181\u0005,\u0000\u0000\u01817\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0005\u0016\u0000\u0000\u0183\u0184\u0005;\u0000\u0000\u0184\u0185"+
		"\u0003X,\u0000\u0185\u0186\u0005;\u0000\u0000\u0186\u0187\u0005-\u0000"+
		"\u0000\u0187\u0188\u0003\f\u0006\u0000\u0188\u0189\u0005.\u0000\u0000"+
		"\u0189\u018a\u0005,\u0000\u0000\u018a9\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0005\u0017\u0000\u0000\u018c\u018d\u0005;\u0000\u0000\u018d\u018e\u0005"+
		"1\u0000\u0000\u018e\u018f\u0003J%\u0000\u018f\u0190\u00052\u0000\u0000"+
		"\u0190\u0191\u0005;\u0000\u0000\u0191\u0192\u0005-\u0000\u0000\u0192\u0193"+
		"\u0003\f\u0006\u0000\u0193\u0199\u0005.\u0000\u0000\u0194\u0195\u0005"+
		";\u0000\u0000\u0195\u0196\u0005-\u0000\u0000\u0196\u0197\u0003\f\u0006"+
		"\u0000\u0197\u0198\u0005.\u0000\u0000\u0198\u019a\u0001\u0000\u0000\u0000"+
		"\u0199\u0194\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0005,\u0000\u0000\u019c"+
		";\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u0018\u0000\u0000\u019e\u019f"+
		"\u0005;\u0000\u0000\u019f\u01a0\u0005-\u0000\u0000\u01a0\u01a1\u0003\f"+
		"\u0006\u0000\u01a1\u01a2\u0005.\u0000\u0000\u01a2\u01a3\u0005;\u0000\u0000"+
		"\u01a3\u01a4\u00051\u0000\u0000\u01a4\u01a5\u0003J%\u0000\u01a5\u01a6"+
		"\u00052\u0000\u0000\u01a6\u01a7\u0005,\u0000\u0000\u01a7=\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0005\u0019\u0000\u0000\u01a9\u01aa\u0005;\u0000"+
		"\u0000\u01aa\u01ab\u00051\u0000\u0000\u01ab\u01ac\u0003J%\u0000\u01ac"+
		"\u01ad\u00052\u0000\u0000\u01ad\u01ae\u0005;\u0000\u0000\u01ae\u01af\u0005"+
		"-\u0000\u0000\u01af\u01b0\u0003\f\u0006\u0000\u01b0\u01b1\u0005.\u0000"+
		"\u0000\u01b1\u01b2\u0005,\u0000\u0000\u01b2?\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b4\u0005\u001a\u0000\u0000\u01b4\u01b5\u0005;\u0000\u0000\u01b5\u01b6"+
		"\u0005-\u0000\u0000\u01b6\u01b7\u0003\f\u0006\u0000\u01b7\u01b8\u0005"+
		".\u0000\u0000\u01b8\u01b9\u0005;\u0000\u0000\u01b9\u01ba\u00051\u0000"+
		"\u0000\u01ba\u01bb\u0003J%\u0000\u01bb\u01bc\u00052\u0000\u0000\u01bc"+
		"\u01bd\u0005,\u0000\u0000\u01bdA\u0001\u0000\u0000\u0000\u01be\u01bf\u0005"+
		"\u001b\u0000\u0000\u01bf\u01c0\u0005;\u0000\u0000\u01c0\u01c1\u00051\u0000"+
		"\u0000\u01c1\u01c2\u0003J%\u0000\u01c2\u01c3\u00052\u0000\u0000\u01c3"+
		"\u01c4\u0005;\u0000\u0000\u01c4\u01c5\u0005-\u0000\u0000\u01c5\u01c6\u0003"+
		"\f\u0006\u0000\u01c6\u01c7\u0005.\u0000\u0000\u01c7\u01c8\u0005,\u0000"+
		"\u0000\u01c8C\u0001\u0000\u0000\u0000\u01c9\u01cc\u0003F#\u0000\u01ca"+
		"\u01cc\u0003H$\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01ca\u0001"+
		"\u0000\u0000\u0000\u01ccE\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005\u001c"+
		"\u0000\u0000\u01ce\u01cf\u0005;\u0000\u0000\u01cf\u01d0\u0003J%\u0000"+
		"\u01d0\u01d1\u0005;\u0000\u0000\u01d1\u01d2\u0003J%\u0000\u01d2G\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d4\u0005\u001d\u0000\u0000\u01d4\u01d5\u0005"+
		";\u0000\u0000\u01d5\u01d6\u0003J%\u0000\u01d6\u01d7\u0005;\u0000\u0000"+
		"\u01d7\u01d8\u0003J%\u0000\u01d8I\u0001\u0000\u0000\u0000\u01d9\u01de"+
		"\u00056\u0000\u0000\u01da\u01de\u0005)\u0000\u0000\u01db\u01de\u0003D"+
		"\"\u0000\u01dc\u01de\u0003L&\u0000\u01dd\u01d9\u0001\u0000\u0000\u0000"+
		"\u01dd\u01da\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000"+
		"\u01dd\u01dc\u0001\u0000\u0000\u0000\u01deK\u0001\u0000\u0000\u0000\u01df"+
		"\u01e3\u0003N\'\u0000\u01e0\u01e3\u0003P(\u0000\u01e1\u01e3\u0003R)\u0000"+
		"\u01e2\u01df\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e3M\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e5\u0005\u001e\u0000\u0000\u01e5\u01e6\u0005;\u0000\u0000\u01e6\u01e7"+
		"\u0003X,\u0000\u01e7\u01e8\u0005;\u0000\u0000\u01e8\u01e9\u0003X,\u0000"+
		"\u01e9O\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005\u001f\u0000\u0000\u01eb"+
		"\u01ec\u0005;\u0000\u0000\u01ec\u01ed\u0003X,\u0000\u01ed\u01ee\u0005"+
		";\u0000\u0000\u01ee\u01ef\u0003X,\u0000\u01efQ\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f1\u0005 \u0000\u0000\u01f1\u01f2\u0005;\u0000\u0000\u01f2\u01f3"+
		"\u0003X,\u0000\u01f3\u01f4\u0005;\u0000\u0000\u01f4\u01f5\u0003X,\u0000"+
		"\u01f5S\u0001\u0000\u0000\u0000\u01f6\u01f7\u0003V+\u0000\u01f7U\u0001"+
		"\u0000\u0000\u0000\u01f8\u01ff\u0003Z-\u0000\u01f9\u01ff\u0003\\.\u0000"+
		"\u01fa\u01ff\u0003^/\u0000\u01fb\u01ff\u0003`0\u0000\u01fc\u01ff\u0003"+
		"b1\u0000\u01fd\u01ff\u0003d2\u0000\u01fe\u01f8\u0001\u0000\u0000\u0000"+
		"\u01fe\u01f9\u0001\u0000\u0000\u0000\u01fe\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fe\u01fb\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fe\u01fd\u0001\u0000\u0000\u0000\u01ffW\u0001\u0000\u0000\u0000\u0200"+
		"\u0209\u00056\u0000\u0000\u0201\u0209\u00057\u0000\u0000\u0202\u0209\u0005"+
		":\u0000\u0000\u0203\u0209\u0003f3\u0000\u0204\u0205\u00051\u0000\u0000"+
		"\u0205\u0206\u0003T*\u0000\u0206\u0207\u00052\u0000\u0000\u0207\u0209"+
		"\u0001\u0000\u0000\u0000\u0208\u0200\u0001\u0000\u0000\u0000\u0208\u0201"+
		"\u0001\u0000\u0000\u0000\u0208\u0202\u0001\u0000\u0000\u0000\u0208\u0203"+
		"\u0001\u0000\u0000\u0000\u0208\u0204\u0001\u0000\u0000\u0000\u0209Y\u0001"+
		"\u0000\u0000\u0000\u020a\u020b\u0005!\u0000\u0000\u020b\u020c\u0005;\u0000"+
		"\u0000\u020c\u020f\u0003X,\u0000\u020d\u020e\u0005;\u0000\u0000\u020e"+
		"\u0210\u0003X,\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u0210\u0211\u0001"+
		"\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001"+
		"\u0000\u0000\u0000\u0212[\u0001\u0000\u0000\u0000\u0213\u0214\u0005\""+
		"\u0000\u0000\u0214\u0215\u0005;\u0000\u0000\u0215\u0216\u0003X,\u0000"+
		"\u0216]\u0001\u0000\u0000\u0000\u0217\u0218\u0005#\u0000\u0000\u0218\u0219"+
		"\u0005;\u0000\u0000\u0219\u021c\u0003X,\u0000\u021a\u021b\u0005;\u0000"+
		"\u0000\u021b\u021d\u0003X,\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021d"+
		"\u021e\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e"+
		"\u021f\u0001\u0000\u0000\u0000\u021f_\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u0005$\u0000\u0000\u0221\u0222\u0005;\u0000\u0000\u0222\u0223\u0003X"+
		",\u0000\u0223\u0224\u0005;\u0000\u0000\u0224\u0225\u0003X,\u0000\u0225"+
		"a\u0001\u0000\u0000\u0000\u0226\u0227\u0005%\u0000\u0000\u0227\u0228\u0005"+
		";\u0000\u0000\u0228\u0229\u0003X,\u0000\u0229\u022a\u0005;\u0000\u0000"+
		"\u022a\u022b\u0003X,\u0000\u022bc\u0001\u0000\u0000\u0000\u022c\u022d"+
		"\u0005&\u0000\u0000\u022d\u022e\u0005;\u0000\u0000\u022e\u0231\u0003X"+
		",\u0000\u022f\u0230\u0005;\u0000\u0000\u0230\u0232\u0003X,\u0000\u0231"+
		"\u022f\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233"+
		"\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234"+
		"e\u0001\u0000\u0000\u0000\u0235\u0236\u0005\f\u0000\u0000\u0236g\u0001"+
		"\u0000\u0000\u0000#imox\u007f\u0086\u0090\u0096\u009b\u00a2\u00a7\u00b4"+
		"\u00bc\u00c4\u00ca\u00cd\u00d2\u00d7\u00dd\u00e4\u00ea\u0107\u010f\u0115"+
		"\u0123\u012d\u0199\u01cb\u01dd\u01e2\u01fe\u0208\u0211\u021e\u0233";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}