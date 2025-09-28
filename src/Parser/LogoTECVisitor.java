// Generated from /home/jeremy/Semestre/Compiladores/Proyecto LogoTEC/LogoTEC/LogoTEC.g4 by ANTLR 4.13.2
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogoTECParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogoTECVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LogoTECParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(LogoTECParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LogoTECParser.ExprContext ctx);
}