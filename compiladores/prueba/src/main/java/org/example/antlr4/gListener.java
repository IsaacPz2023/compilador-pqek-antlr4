package org.example.antlr4;// Generated from C:/Users/isaac/IdeaProjects/compiladores/prueba/src/main/g.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(gParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(gParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(gParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(gParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(gParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(gParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#declaracion_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_asignacion(gParser.Declaracion_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#declaracion_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_asignacion(gParser.Declaracion_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(gParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(gParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(gParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(gParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#escritura}.
	 * @param ctx the parse tree
	 */
	void enterEscritura(gParser.EscrituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#escritura}.
	 * @param ctx the parse tree
	 */
	void exitEscritura(gParser.EscrituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#lectura}.
	 * @param ctx the parse tree
	 */
	void enterLectura(gParser.LecturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#lectura}.
	 * @param ctx the parse tree
	 */
	void exitLectura(gParser.LecturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#llamadaCaptura}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaCaptura(gParser.LlamadaCapturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#llamadaCaptura}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaCaptura(gParser.LlamadaCapturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(gParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(gParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#factor_exp}.
	 * @param ctx the parse tree
	 */
	void enterFactor_exp(gParser.Factor_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#factor_exp}.
	 * @param ctx the parse tree
	 */
	void exitFactor_exp(gParser.Factor_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#atomica_exp}.
	 * @param ctx the parse tree
	 */
	void enterAtomica_exp(gParser.Atomica_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#atomica_exp}.
	 * @param ctx the parse tree
	 */
	void exitAtomica_exp(gParser.Atomica_expContext ctx);
}