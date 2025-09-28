// Generated from /home/jeremy/Semestre/Compiladores/Proyecto LogoTEC/LogoTEC/LogoTEC.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoTECParser}.
 */
public interface LogoTECListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LogoTECParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LogoTECParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(LogoTECParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(LogoTECParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LogoTECParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LogoTECParser.ExprContext ctx);
}