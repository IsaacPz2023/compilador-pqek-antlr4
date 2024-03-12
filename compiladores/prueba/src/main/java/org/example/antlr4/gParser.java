package org.example.antlr4;// Generated from C:/Users/isaac/IdeaProjects/compiladores/prueba/src/main/g.g4 by ANTLR 4.13.1

import java.util.HashMap;
import java.util.Map;
import org.example.models.VariableInfo;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

import static org.example.controller.ControllerIDE.leerInput;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, ENTERO=9, 
		REAL=10, TEXTO=11, IGUAL=12, MAS=13, MENOS=14, MULT=15, DIV=16, PUNTO_COMA=17, 
		ABRIR_PAR=18, CERRAR_PAR=19, COMENTARIO=20, COMENTARIO_MULTILINEA=21, 
		WS=22;
	public static final int
		RULE_programa = 0, RULE_sentencias = 1, RULE_declaraciones = 2, RULE_declaracion_asignacion = 3, 
		RULE_asignacion = 4, RULE_tipo = 5, RULE_escritura = 6, RULE_lectura = 7, 
		RULE_llamadaCaptura = 8, RULE_expresion = 9, RULE_factor_exp = 10, RULE_atomica_exp = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencias", "declaraciones", "declaracion_asignacion", 
			"asignacion", "tipo", "escritura", "lectura", "llamadaCaptura", "expresion", 
			"factor_exp", "atomica_exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Entero'", "'Real'", "'Texto'", "'Mensaje.Texto'", "'Captura.Texto()'", 
			"'Captura.Entero()'", "'Captura.Real()'", null, null, null, null, "'='", 
			"'+'", "'-'", "'*'", "'/'", "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ID", "ENTERO", "REAL", 
			"TEXTO", "IGUAL", "MAS", "MENOS", "MULT", "DIV", "PUNTO_COMA", "ABRIR_PAR", 
			"CERRAR_PAR", "COMENTARIO", "COMENTARIO_MULTILINEA", "WS"
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
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, VariableInfo> tabla_simbolos = new HashMap<>();

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public SentenciasContext sentencias() {
			return getRuleContext(SentenciasContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			sentencias();
			}
		}
		catch (RecognitionException re) {
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
	public static class SentenciasContext extends ParserRuleContext {
		public List<DeclaracionesContext> declaraciones() {
			return getRuleContexts(DeclaracionesContext.class);
		}
		public DeclaracionesContext declaraciones(int i) {
			return getRuleContext(DeclaracionesContext.class,i);
		}
		public List<Declaracion_asignacionContext> declaracion_asignacion() {
			return getRuleContexts(Declaracion_asignacionContext.class);
		}
		public Declaracion_asignacionContext declaracion_asignacion(int i) {
			return getRuleContext(Declaracion_asignacionContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<LecturaContext> lectura() {
			return getRuleContexts(LecturaContext.class);
		}
		public LecturaContext lectura(int i) {
			return getRuleContext(LecturaContext.class,i);
		}
		public List<EscrituraContext> escritura() {
			return getRuleContexts(EscrituraContext.class);
		}
		public EscrituraContext escritura(int i) {
			return getRuleContext(EscrituraContext.class,i);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitSentencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitSentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==ID) {
				{
				setState(31);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(26);
					declaraciones();
					}
					break;
				case 2:
					{
					setState(27);
					declaracion_asignacion();
					}
					break;
				case 3:
					{
					setState(28);
					asignacion();
					}
					break;
				case 4:
					{
					setState(29);
					lectura();
					}
					break;
				case 5:
					{
					setState(30);
					escritura();
					}
					break;
				}
				}
				setState(35);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionesContext extends ParserRuleContext {
		public Token ID;
		public TipoContext tipo;
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(gParser.PUNTO_COMA, 0); }
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaraciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(36);
			((DeclaracionesContext)_localctx).ID = match(ID);
			setState(37);
			((DeclaracionesContext)_localctx).tipo = tipo();
			setState(38);
			match(PUNTO_COMA);
			}

			String variableId = (((DeclaracionesContext)_localctx).ID!=null?((DeclaracionesContext)_localctx).ID.getText():null);

			        if (!tabla_simbolos.containsKey(variableId)) {
			            System.out.println("Declarando variable");
			            tabla_simbolos.put(variableId, new VariableInfo((((DeclaracionesContext)_localctx).tipo!=null?_input.getText(((DeclaracionesContext)_localctx).tipo.start,((DeclaracionesContext)_localctx).tipo.stop):null), 0));
			        } else {
			            System.out.println("Error: Variable '" + variableId + "' ya declarada.");
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
	public static class Declaracion_asignacionContext extends ParserRuleContext {
		public Token ID;
		public TipoContext tipo;
		public ExpresionContext expresion;
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(gParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(gParser.PUNTO_COMA, 0); }
		public Declaracion_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterDeclaracion_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitDeclaracion_asignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitDeclaracion_asignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_asignacionContext declaracion_asignacion() throws RecognitionException {
		Declaracion_asignacionContext _localctx = new Declaracion_asignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(42);
			((Declaracion_asignacionContext)_localctx).ID = match(ID);
			setState(43);
			((Declaracion_asignacionContext)_localctx).tipo = tipo();
			setState(44);
			match(IGUAL);
			setState(45);
			((Declaracion_asignacionContext)_localctx).expresion = expresion();
			setState(46);
			match(PUNTO_COMA);
			}


			     String variableId = (((Declaracion_asignacionContext)_localctx).ID!=null?((Declaracion_asignacionContext)_localctx).ID.getText():null);
			     String variableTipo = (((Declaracion_asignacionContext)_localctx).tipo!=null?_input.getText(((Declaracion_asignacionContext)_localctx).tipo.start,((Declaracion_asignacionContext)_localctx).tipo.stop):null);
			         if (!tabla_simbolos.containsKey(variableId)) {
			             Object expresionValue = ((Declaracion_asignacionContext)_localctx).expresion.value;

			             if (expresionValue != null) {
			                  switch (expresionValue.getClass().getSimpleName()) {
			                          case "Integer":
			                              if (variableTipo.equals("Entero")) {
			                                System.out.println("Declarando y asignando variable");
			                                tabla_simbolos.put(variableId, new VariableInfo((((Declaracion_asignacionContext)_localctx).tipo!=null?_input.getText(((Declaracion_asignacionContext)_localctx).tipo.start,((Declaracion_asignacionContext)_localctx).tipo.stop):null), expresionValue));
			                              } else {
			                                  System.out.println("Error: Tipo de variable '" + variableId + "' no coincide con el tipo de la expresión.");
			                              }
			                              break;
			                          case "String":
			                              if (variableTipo.equals("Texto")) {
			                                  System.out.println("Declarando y asignando variable");
			                                  tabla_simbolos.put(variableId, new VariableInfo((((Declaracion_asignacionContext)_localctx).tipo!=null?_input.getText(((Declaracion_asignacionContext)_localctx).tipo.start,((Declaracion_asignacionContext)_localctx).tipo.stop):null), expresionValue));
			                              } else {
			                                  System.out.println("Error: Tipo de variable '" + variableId + "' no coincide con el tipo de la expresión.");
			                              }
			                              break;
			                          case "Double":
			                              if (variableTipo.equals("Real")) {
			                                  System.out.println("Declarando y asignando variable");
			                                  tabla_simbolos.put(variableId, new VariableInfo((((Declaracion_asignacionContext)_localctx).tipo!=null?_input.getText(((Declaracion_asignacionContext)_localctx).tipo.start,((Declaracion_asignacionContext)_localctx).tipo.stop):null), expresionValue));
			                              } else {
			                                  System.out.println("Error: Tipo de variable '" + variableId + "' no coincide con el tipo de la expresión.");
			                              }
			                              break;
			                          default:
			                              System.out.println("Error: Tipo de dato no compatible '" + expresionValue.getClass().getSimpleName() + "'.");
			                  }
			             }
			         } else {
			             System.out.println("Error: Variable '" + variableId + "' ya declarada.");
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
	public static class AsignacionContext extends ParserRuleContext {
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(gParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(gParser.PUNTO_COMA, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			((AsignacionContext)_localctx).ID = match(ID);
			setState(51);
			match(IGUAL);
			setState(52);
			((AsignacionContext)_localctx).expresion = expresion();
			setState(53);
			match(PUNTO_COMA);
			String variableId = (((AsignacionContext)_localctx).ID!=null?((AsignacionContext)_localctx).ID.getText():null);
			     VariableInfo variableInfo = tabla_simbolos.get(variableId);

			     if (variableInfo != null) {
			         Object expresionValue = ((AsignacionContext)_localctx).expresion.value;

			        if (expresionValue != null) {
			             switch (expresionValue.getClass().getSimpleName()) {
			                     case "Integer":
			                         if (variableInfo.getType().equals("Entero")) {
			                             System.out.println("Asignando variable");
			                             variableInfo.setValue(expresionValue);
			                         } else {
			                             System.out.println("Error: Tipo de variable '" + variableId + "' no coincide con el tipo de la expresión.");
			                         }
			                         break;
			                     case "String":
			                         if (variableInfo.getType().equals("Texto")) {
			                             System.out.println("Asignando variable");
			                             variableInfo.setValue(expresionValue);
			                         } else {
			                             System.out.println("Error: Tipo de variable '" + variableId + "' no coincide con el tipo de la expresión.");
			                         }
			                         break;
			                     case "Double":
			                         if (variableInfo.getType().equals("Real")) {
			                             System.out.println("Asignando variable");
			                             variableInfo.setValue(expresionValue);
			                         } else {
			                             System.out.println("Error: Tipo de variable '" + variableId + "' no coincide con el tipo de la expresión.");
			                         }
			                         break;
			                     default:
			                         System.out.println("Error: Tipo de dato no compatible '" + expresionValue.getClass().getSimpleName() + "'.");
			             }
			        }
			     } else {
			         System.out.println("Error: Variable '" + variableId + "' no declarada.");
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
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class EscrituraContext extends ParserRuleContext {
		public ExpresionContext expresion;
		public TerminalNode ABRIR_PAR() { return getToken(gParser.ABRIR_PAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CERRAR_PAR() { return getToken(gParser.CERRAR_PAR, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(gParser.PUNTO_COMA, 0); }
		public EscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterEscritura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitEscritura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitEscritura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscrituraContext escritura() throws RecognitionException {
		EscrituraContext _localctx = new EscrituraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_escritura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__3);
			setState(59);
			match(ABRIR_PAR);
			setState(60);
			((EscrituraContext)_localctx).expresion = expresion();
			setState(61);
			match(CERRAR_PAR);
			setState(62);
			match(PUNTO_COMA);
			System.out.println(((EscrituraContext)_localctx).expresion.value);
			}
		}
		catch (RecognitionException re) {
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
	public static class LecturaContext extends ParserRuleContext {
		public Token ID;
		public LlamadaCapturaContext llamadaCaptura;
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(gParser.IGUAL, 0); }
		public LlamadaCapturaContext llamadaCaptura() {
			return getRuleContext(LlamadaCapturaContext.class,0);
		}
		public TerminalNode PUNTO_COMA() { return getToken(gParser.PUNTO_COMA, 0); }
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLectura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLectura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLectura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(65);
			((LecturaContext)_localctx).ID = match(ID);
			setState(66);
			match(IGUAL);
			setState(67);
			((LecturaContext)_localctx).llamadaCaptura = llamadaCaptura();
			setState(68);
			match(PUNTO_COMA);
			}

			     String variableId = (((LecturaContext)_localctx).ID!=null?((LecturaContext)_localctx).ID.getText():null);
			     VariableInfo variableInfo = tabla_simbolos.get(variableId);

			        if (variableInfo != null) {
			         Object expresionValue = ((LecturaContext)_localctx).llamadaCaptura.value;
			                 System.out.println("Lectura exitosa");
			                 variableInfo.setValue(expresionValue);
			         }else {
			           System.out.println("Error: Variable '" + variableId + "' no declarada.");
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
	public static class LlamadaCapturaContext extends ParserRuleContext {
		public Object value;
		public LlamadaCapturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaCaptura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterLlamadaCaptura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitLlamadaCaptura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitLlamadaCaptura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaCapturaContext llamadaCaptura() throws RecognitionException {
		LlamadaCapturaContext _localctx = new LlamadaCapturaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_llamadaCaptura);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__4);
				 ((LlamadaCapturaContext)_localctx).value =  leerInput(); 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__5);
				 ((LlamadaCapturaContext)_localctx).value =  Integer.parseInt(leerInput()); 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(T__6);
				 ((LlamadaCapturaContext)_localctx).value =  Double.parseDouble(leerInput()); 
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
	public static class ExpresionContext extends ParserRuleContext {
		public Object value;
		public Factor_expContext t1;
		public Factor_expContext t2;
		public List<Factor_expContext> factor_exp() {
			return getRuleContexts(Factor_expContext.class);
		}
		public Factor_expContext factor_exp(int i) {
			return getRuleContext(Factor_expContext.class,i);
		}
		public List<TerminalNode> MAS() { return getTokens(gParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(gParser.MAS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(gParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(gParser.MENOS, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((ExpresionContext)_localctx).t1 = factor_exp();
			((ExpresionContext)_localctx).value =  ((ExpresionContext)_localctx).t1.value;
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAS) {
				{
				{
				setState(82);
				match(MAS);
				setState(83);
				((ExpresionContext)_localctx).t2 = factor_exp();

				            if (_localctx.value instanceof Integer && ((ExpresionContext)_localctx).t2.value instanceof Integer) {
				                ((ExpresionContext)_localctx).value =  (int)_localctx.value + (int)((ExpresionContext)_localctx).t2.value;
				            } else if (_localctx.value instanceof Double && ((ExpresionContext)_localctx).t2.value instanceof Double) {
				                ((ExpresionContext)_localctx).value =  (double)_localctx.value + (double)((ExpresionContext)_localctx).t2.value;
				            } else {
				                System.err.println("Error: soluciona el bug, flojo.\nError(Opcional): no se aceptan tipos mixtos");
				            }
				        
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MENOS) {
				{
				{
				setState(91);
				match(MENOS);
				setState(92);
				((ExpresionContext)_localctx).t2 = factor_exp();

				             if (_localctx.value instanceof Integer && ((ExpresionContext)_localctx).t2.value instanceof Integer) {
				                 ((ExpresionContext)_localctx).value =  (int)_localctx.value - (int)((ExpresionContext)_localctx).t2.value;
				             } else if (_localctx.value instanceof Double && ((ExpresionContext)_localctx).t2.value instanceof Double) {
				                 ((ExpresionContext)_localctx).value =  (double)_localctx.value - (double)((ExpresionContext)_localctx).t2.value;
				             } else {
				                 System.err.println("Error: soluciona el bug, flojo.\nError(Opcional): no se aceptan tipos mixtos");
				             }
				         
				}
				}
				setState(99);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Factor_expContext extends ParserRuleContext {
		public Object value;
		public Atomica_expContext t1;
		public Factor_expContext t2;
		public Atomica_expContext atomica_exp() {
			return getRuleContext(Atomica_expContext.class,0);
		}
		public List<TerminalNode> MULT() { return getTokens(gParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(gParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(gParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(gParser.DIV, i);
		}
		public List<Factor_expContext> factor_exp() {
			return getRuleContexts(Factor_expContext.class);
		}
		public Factor_expContext factor_exp(int i) {
			return getRuleContext(Factor_expContext.class,i);
		}
		public Factor_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFactor_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFactor_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitFactor_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor_expContext factor_exp() throws RecognitionException {
		Factor_expContext _localctx = new Factor_expContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor_exp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((Factor_expContext)_localctx).t1 = atomica_exp();
			((Factor_expContext)_localctx).value =  ((Factor_expContext)_localctx).t1.value;
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					match(MULT);
					setState(103);
					((Factor_expContext)_localctx).t2 = factor_exp();

					                if (_localctx.value instanceof Integer && ((Factor_expContext)_localctx).t2.value instanceof Integer) {
					                    ((Factor_expContext)_localctx).value =  (int)_localctx.value * (int)((Factor_expContext)_localctx).t2.value;
					                } else if (_localctx.value instanceof Double && ((Factor_expContext)_localctx).t2.value instanceof Double) {
					                    ((Factor_expContext)_localctx).value =  (double)_localctx.value * (double)((Factor_expContext)_localctx).t2.value;
					                } else {
					                    System.err.println("Error: soluciona el bug, flojo.\nError(Opcional): no se aceptan tipos mixtos.");
					                }
					            
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					match(DIV);
					setState(112);
					((Factor_expContext)_localctx).t2 = factor_exp();

					             if (_localctx.value instanceof Integer && ((Factor_expContext)_localctx).t2.value instanceof Integer) {
					                 ((Factor_expContext)_localctx).value =  (int)_localctx.value / (int)((Factor_expContext)_localctx).t2.value;
					             } else if (_localctx.value instanceof Double && ((Factor_expContext)_localctx).t2.value instanceof Double) {
					                 ((Factor_expContext)_localctx).value =  (double)_localctx.value / (double)((Factor_expContext)_localctx).t2.value;
					             } else {
					                 System.err.println("Error: soluciona el bug, flojo.\nError(Opcional): no se aceptan tipos mixtos.");
					             }
					         
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class Atomica_expContext extends ParserRuleContext {
		public Object value;
		public Token ID;
		public Token ENTERO;
		public Token REAL;
		public Token TEXTO;
		public ExpresionContext e;
		public TerminalNode ID() { return getToken(gParser.ID, 0); }
		public TerminalNode ENTERO() { return getToken(gParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(gParser.REAL, 0); }
		public TerminalNode TEXTO() { return getToken(gParser.TEXTO, 0); }
		public TerminalNode ABRIR_PAR() { return getToken(gParser.ABRIR_PAR, 0); }
		public TerminalNode CERRAR_PAR() { return getToken(gParser.CERRAR_PAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Atomica_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomica_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterAtomica_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitAtomica_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gVisitor ) return ((gVisitor<? extends T>)visitor).visitAtomica_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atomica_expContext atomica_exp() throws RecognitionException {
		Atomica_expContext _localctx = new Atomica_expContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atomica_exp);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				((Atomica_expContext)_localctx).ID = match(ID);
				((Atomica_expContext)_localctx).value =  tabla_simbolos.get( (((Atomica_expContext)_localctx).ID!=null?((Atomica_expContext)_localctx).ID.getText():null)).getValue();
				}
				break;
			case ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				((Atomica_expContext)_localctx).ENTERO = match(ENTERO);
				((Atomica_expContext)_localctx).value =  Integer.parseInt((((Atomica_expContext)_localctx).ENTERO!=null?((Atomica_expContext)_localctx).ENTERO.getText():null));
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				((Atomica_expContext)_localctx).REAL = match(REAL);
				((Atomica_expContext)_localctx).value =  Double.parseDouble((((Atomica_expContext)_localctx).REAL!=null?((Atomica_expContext)_localctx).REAL.getText():null));
				}
				break;
			case TEXTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				((Atomica_expContext)_localctx).TEXTO = match(TEXTO);
				((Atomica_expContext)_localctx).value =  (((Atomica_expContext)_localctx).TEXTO!=null?((Atomica_expContext)_localctx).TEXTO.getText():null);
				}
				break;
			case ABRIR_PAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				match(ABRIR_PAR);
				setState(129);
				((Atomica_expContext)_localctx).e = expresion();
				setState(130);
				match(CERRAR_PAR);
				((Atomica_expContext)_localctx).value =  ((Atomica_expContext)_localctx).e.value;
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

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u0088\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bO\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\tW\b\t\n\t\f\tZ\t\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t`\b\t\n\t\f\tc\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\nk\b\n\n\n\f\nn\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\nt\b\n\n\n\f\nw\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0086\b\u000b\u0001\u000b\u0000"+
		"\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000"+
		"\u0001\u0001\u0000\u0001\u0003\u008a\u0000\u0018\u0001\u0000\u0000\u0000"+
		"\u0002!\u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006*"+
		"\u0001\u0000\u0000\u0000\b2\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000"+
		"\u0000\f:\u0001\u0000\u0000\u0000\u000eA\u0001\u0000\u0000\u0000\u0010"+
		"N\u0001\u0000\u0000\u0000\u0012P\u0001\u0000\u0000\u0000\u0014d\u0001"+
		"\u0000\u0000\u0000\u0016\u0085\u0001\u0000\u0000\u0000\u0018\u0019\u0003"+
		"\u0002\u0001\u0000\u0019\u0001\u0001\u0000\u0000\u0000\u001a \u0003\u0004"+
		"\u0002\u0000\u001b \u0003\u0006\u0003\u0000\u001c \u0003\b\u0004\u0000"+
		"\u001d \u0003\u000e\u0007\u0000\u001e \u0003\f\u0006\u0000\u001f\u001a"+
		"\u0001\u0000\u0000\u0000\u001f\u001b\u0001\u0000\u0000\u0000\u001f\u001c"+
		"\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f\u001e"+
		"\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0003\u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000$%\u0005\b\u0000\u0000%&\u0003\n\u0005\u0000"+
		"&\'\u0005\u0011\u0000\u0000\'(\u0001\u0000\u0000\u0000()\u0006\u0002\uffff"+
		"\uffff\u0000)\u0005\u0001\u0000\u0000\u0000*+\u0005\b\u0000\u0000+,\u0003"+
		"\n\u0005\u0000,-\u0005\f\u0000\u0000-.\u0003\u0012\t\u0000./\u0005\u0011"+
		"\u0000\u0000/0\u0001\u0000\u0000\u000001\u0006\u0003\uffff\uffff\u0000"+
		"1\u0007\u0001\u0000\u0000\u000023\u0005\b\u0000\u000034\u0005\f\u0000"+
		"\u000045\u0003\u0012\t\u000056\u0005\u0011\u0000\u000067\u0006\u0004\uffff"+
		"\uffff\u00007\t\u0001\u0000\u0000\u000089\u0007\u0000\u0000\u00009\u000b"+
		"\u0001\u0000\u0000\u0000:;\u0005\u0004\u0000\u0000;<\u0005\u0012\u0000"+
		"\u0000<=\u0003\u0012\t\u0000=>\u0005\u0013\u0000\u0000>?\u0005\u0011\u0000"+
		"\u0000?@\u0006\u0006\uffff\uffff\u0000@\r\u0001\u0000\u0000\u0000AB\u0005"+
		"\b\u0000\u0000BC\u0005\f\u0000\u0000CD\u0003\u0010\b\u0000DE\u0005\u0011"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0006\u0007\uffff\uffff\u0000"+
		"G\u000f\u0001\u0000\u0000\u0000HI\u0005\u0005\u0000\u0000IO\u0006\b\uffff"+
		"\uffff\u0000JK\u0005\u0006\u0000\u0000KO\u0006\b\uffff\uffff\u0000LM\u0005"+
		"\u0007\u0000\u0000MO\u0006\b\uffff\uffff\u0000NH\u0001\u0000\u0000\u0000"+
		"NJ\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000O\u0011\u0001\u0000"+
		"\u0000\u0000PQ\u0003\u0014\n\u0000QX\u0006\t\uffff\uffff\u0000RS\u0005"+
		"\r\u0000\u0000ST\u0003\u0014\n\u0000TU\u0006\t\uffff\uffff\u0000UW\u0001"+
		"\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Ya\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005\u000e\u0000\u0000\\]\u0003\u0014"+
		"\n\u0000]^\u0006\t\uffff\uffff\u0000^`\u0001\u0000\u0000\u0000_[\u0001"+
		"\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000b\u0013\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000de\u0003\u0016\u000b\u0000el\u0006\n\uffff\uffff\u0000fg\u0005"+
		"\u000f\u0000\u0000gh\u0003\u0014\n\u0000hi\u0006\n\uffff\uffff\u0000i"+
		"k\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000"+
		"\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mu\u0001\u0000"+
		"\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0005\u0010\u0000\u0000pq\u0003"+
		"\u0014\n\u0000qr\u0006\n\uffff\uffff\u0000rt\u0001\u0000\u0000\u0000s"+
		"o\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000v\u0015\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000xy\u0005\b\u0000\u0000y\u0086\u0006\u000b\uffff\uffff"+
		"\u0000z{\u0005\t\u0000\u0000{\u0086\u0006\u000b\uffff\uffff\u0000|}\u0005"+
		"\n\u0000\u0000}\u0086\u0006\u000b\uffff\uffff\u0000~\u007f\u0005\u000b"+
		"\u0000\u0000\u007f\u0086\u0006\u000b\uffff\uffff\u0000\u0080\u0081\u0005"+
		"\u0012\u0000\u0000\u0081\u0082\u0003\u0012\t\u0000\u0082\u0083\u0005\u0013"+
		"\u0000\u0000\u0083\u0084\u0006\u000b\uffff\uffff\u0000\u0084\u0086\u0001"+
		"\u0000\u0000\u0000\u0085x\u0001\u0000\u0000\u0000\u0085z\u0001\u0000\u0000"+
		"\u0000\u0085|\u0001\u0000\u0000\u0000\u0085~\u0001\u0000\u0000\u0000\u0085"+
		"\u0080\u0001\u0000\u0000\u0000\u0086\u0017\u0001\u0000\u0000\u0000\b\u001f"+
		"!NXalu\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}