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
	 * Visit a parse tree produced by {@link LogoTECParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LogoTECParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#estructura_comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructura_comentario(LogoTECParser.Estructura_comentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(LogoTECParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#procedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedimiento(LogoTECParser.ProcedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(LogoTECParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ordenes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdenes(LogoTECParser.OrdenesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(LogoTECParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#haz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaz(LogoTECParser.HazContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#inic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInic(LogoTECParser.InicContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#inc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(LogoTECParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#avanza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvanza(LogoTECParser.AvanzaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#retrocede}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetrocede(LogoTECParser.RetrocedeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#giraderecha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGiraderecha(LogoTECParser.GiraderechaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#giraizquierda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGiraizquierda(LogoTECParser.GiraizquierdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ocultatortuga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOcultatortuga(LogoTECParser.OcultatortugaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ponpos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPonpos(LogoTECParser.PonposContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ponxy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPonxy(LogoTECParser.PonxyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ponrumbo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPonrumbo(LogoTECParser.PonrumboContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ponx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPonx(LogoTECParser.PonxContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#pony}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPony(LogoTECParser.PonyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#bajalapiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBajalapiz(LogoTECParser.BajalapizContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#subelapiz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubelapiz(LogoTECParser.SubelapizContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#poncolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoncolor(LogoTECParser.PoncolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#centro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCentro(LogoTECParser.CentroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#espera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspera(LogoTECParser.EsperaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#ejecuta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEjecuta(LogoTECParser.EjecutaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#repite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepite(LogoTECParser.RepiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(LogoTECParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#haz_hasta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaz_hasta(LogoTECParser.Haz_hastaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#hasta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasta(LogoTECParser.HastaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#haz_mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaz_mientras(LogoTECParser.Haz_mientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(LogoTECParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#op_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logica(LogoTECParser.Op_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitY(LogoTECParser.YContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#o}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitO(LogoTECParser.OContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#boolean_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_val(LogoTECParser.Boolean_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#op_comparativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_comparativa(LogoTECParser.Op_comparativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#iguales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIguales(LogoTECParser.IgualesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#mayorque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorque(LogoTECParser.MayorqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#menorque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorque(LogoTECParser.MenorqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(LogoTECParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#op_algebraicas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_algebraicas(LogoTECParser.Op_algebraicasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#numeric_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_val(LogoTECParser.Numeric_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#diferencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiferencia(LogoTECParser.DiferenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#azar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAzar(LogoTECParser.AzarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#producto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProducto(LogoTECParser.ProductoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#potencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencia(LogoTECParser.PotenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#division}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(LogoTECParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#suma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(LogoTECParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoTECParser#rumbo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRumbo(LogoTECParser.RumboContext ctx);
}