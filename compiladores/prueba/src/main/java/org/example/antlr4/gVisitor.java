package org.example.antlr4;// Generated from C:/Users/isaac/IdeaProjects/compiladores/prueba/src/main/g.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(gParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(gParser.SentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(gParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#declaracion_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_asignacion(gParser.Declaracion_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(gParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(gParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#escritura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscritura(gParser.EscrituraContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#lectura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLectura(gParser.LecturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#llamadaCaptura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaCaptura(gParser.LlamadaCapturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(gParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#factor_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_exp(gParser.Factor_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#atomica_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomica_exp(gParser.Atomica_expContext ctx);
}