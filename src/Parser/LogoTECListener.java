// Generated from C:/Users/menei/Documents/GitHub/LogoTEC/LogoTEC.g4 by ANTLR 4.13.2
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoTECParser}.
 */
public interface LogoTECListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LogoTECParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LogoTECParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#estructura_comentario}.
	 * @param ctx the parse tree
	 */
	void enterEstructura_comentario(LogoTECParser.Estructura_comentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#estructura_comentario}.
	 * @param ctx the parse tree
	 */
	void exitEstructura_comentario(LogoTECParser.Estructura_comentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(LogoTECParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(LogoTECParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#procedimientos}.
	 * @param ctx the parse tree
	 */
	void enterProcedimientos(LogoTECParser.ProcedimientosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#procedimientos}.
	 * @param ctx the parse tree
	 */
	void exitProcedimientos(LogoTECParser.ProcedimientosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#procedimiento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimiento(LogoTECParser.ProcedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#procedimiento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimiento(LogoTECParser.ProcedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(LogoTECParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(LogoTECParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ordenes}.
	 * @param ctx the parse tree
	 */
	void enterOrdenes(LogoTECParser.OrdenesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ordenes}.
	 * @param ctx the parse tree
	 */
	void exitOrdenes(LogoTECParser.OrdenesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#orden}.
	 * @param ctx the parse tree
	 */
	void enterOrden(LogoTECParser.OrdenContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#orden}.
	 * @param ctx the parse tree
	 */
	void exitOrden(LogoTECParser.OrdenContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(LogoTECParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(LogoTECParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#haz}.
	 * @param ctx the parse tree
	 */
	void enterHaz(LogoTECParser.HazContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#haz}.
	 * @param ctx the parse tree
	 */
	void exitHaz(LogoTECParser.HazContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#inic}.
	 * @param ctx the parse tree
	 */
	void enterInic(LogoTECParser.InicContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#inic}.
	 * @param ctx the parse tree
	 */
	void exitInic(LogoTECParser.InicContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(LogoTECParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(LogoTECParser.IncContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#avanza}.
	 * @param ctx the parse tree
	 */
	void enterAvanza(LogoTECParser.AvanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#avanza}.
	 * @param ctx the parse tree
	 */
	void exitAvanza(LogoTECParser.AvanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#retrocede}.
	 * @param ctx the parse tree
	 */
	void enterRetrocede(LogoTECParser.RetrocedeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#retrocede}.
	 * @param ctx the parse tree
	 */
	void exitRetrocede(LogoTECParser.RetrocedeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#giraderecha}.
	 * @param ctx the parse tree
	 */
	void enterGiraderecha(LogoTECParser.GiraderechaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#giraderecha}.
	 * @param ctx the parse tree
	 */
	void exitGiraderecha(LogoTECParser.GiraderechaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#giraizquierda}.
	 * @param ctx the parse tree
	 */
	void enterGiraizquierda(LogoTECParser.GiraizquierdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#giraizquierda}.
	 * @param ctx the parse tree
	 */
	void exitGiraizquierda(LogoTECParser.GiraizquierdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ponpos}.
	 * @param ctx the parse tree
	 */
	void enterPonpos(LogoTECParser.PonposContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ponpos}.
	 * @param ctx the parse tree
	 */
	void exitPonpos(LogoTECParser.PonposContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ponxy}.
	 * @param ctx the parse tree
	 */
	void enterPonxy(LogoTECParser.PonxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ponxy}.
	 * @param ctx the parse tree
	 */
	void exitPonxy(LogoTECParser.PonxyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ponrumbo}.
	 * @param ctx the parse tree
	 */
	void enterPonrumbo(LogoTECParser.PonrumboContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ponrumbo}.
	 * @param ctx the parse tree
	 */
	void exitPonrumbo(LogoTECParser.PonrumboContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ponx}.
	 * @param ctx the parse tree
	 */
	void enterPonx(LogoTECParser.PonxContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ponx}.
	 * @param ctx the parse tree
	 */
	void exitPonx(LogoTECParser.PonxContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#pony}.
	 * @param ctx the parse tree
	 */
	void enterPony(LogoTECParser.PonyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#pony}.
	 * @param ctx the parse tree
	 */
	void exitPony(LogoTECParser.PonyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#centro}.
	 * @param ctx the parse tree
	 */
	void enterCentro(LogoTECParser.CentroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#centro}.
	 * @param ctx the parse tree
	 */
	void exitCentro(LogoTECParser.CentroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#bajalapiz}.
	 * @param ctx the parse tree
	 */
	void enterBajalapiz(LogoTECParser.BajalapizContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#bajalapiz}.
	 * @param ctx the parse tree
	 */
	void exitBajalapiz(LogoTECParser.BajalapizContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#subelapiz}.
	 * @param ctx the parse tree
	 */
	void enterSubelapiz(LogoTECParser.SubelapizContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#subelapiz}.
	 * @param ctx the parse tree
	 */
	void exitSubelapiz(LogoTECParser.SubelapizContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#poncolor}.
	 * @param ctx the parse tree
	 */
	void enterPoncolor(LogoTECParser.PoncolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#poncolor}.
	 * @param ctx the parse tree
	 */
	void exitPoncolor(LogoTECParser.PoncolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ocultatortuga}.
	 * @param ctx the parse tree
	 */
	void enterOcultatortuga(LogoTECParser.OcultatortugaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ocultatortuga}.
	 * @param ctx the parse tree
	 */
	void exitOcultatortuga(LogoTECParser.OcultatortugaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#espera}.
	 * @param ctx the parse tree
	 */
	void enterEspera(LogoTECParser.EsperaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#espera}.
	 * @param ctx the parse tree
	 */
	void exitEspera(LogoTECParser.EsperaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#ejecuta}.
	 * @param ctx the parse tree
	 */
	void enterEjecuta(LogoTECParser.EjecutaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#ejecuta}.
	 * @param ctx the parse tree
	 */
	void exitEjecuta(LogoTECParser.EjecutaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#repite}.
	 * @param ctx the parse tree
	 */
	void enterRepite(LogoTECParser.RepiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#repite}.
	 * @param ctx the parse tree
	 */
	void exitRepite(LogoTECParser.RepiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(LogoTECParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(LogoTECParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#haz_hasta}.
	 * @param ctx the parse tree
	 */
	void enterHaz_hasta(LogoTECParser.Haz_hastaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#haz_hasta}.
	 * @param ctx the parse tree
	 */
	void exitHaz_hasta(LogoTECParser.Haz_hastaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#hasta}.
	 * @param ctx the parse tree
	 */
	void enterHasta(LogoTECParser.HastaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#hasta}.
	 * @param ctx the parse tree
	 */
	void exitHasta(LogoTECParser.HastaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#haz_mientras}.
	 * @param ctx the parse tree
	 */
	void enterHaz_mientras(LogoTECParser.Haz_mientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#haz_mientras}.
	 * @param ctx the parse tree
	 */
	void exitHaz_mientras(LogoTECParser.Haz_mientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(LogoTECParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(LogoTECParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#op_logica}.
	 * @param ctx the parse tree
	 */
	void enterOp_logica(LogoTECParser.Op_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#op_logica}.
	 * @param ctx the parse tree
	 */
	void exitOp_logica(LogoTECParser.Op_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#y}.
	 * @param ctx the parse tree
	 */
	void enterY(LogoTECParser.YContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#y}.
	 * @param ctx the parse tree
	 */
	void exitY(LogoTECParser.YContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#o}.
	 * @param ctx the parse tree
	 */
	void enterO(LogoTECParser.OContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#o}.
	 * @param ctx the parse tree
	 */
	void exitO(LogoTECParser.OContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#boolean_val}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_val(LogoTECParser.Boolean_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#boolean_val}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_val(LogoTECParser.Boolean_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#op_comparativa}.
	 * @param ctx the parse tree
	 */
	void enterOp_comparativa(LogoTECParser.Op_comparativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#op_comparativa}.
	 * @param ctx the parse tree
	 */
	void exitOp_comparativa(LogoTECParser.Op_comparativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#iguales}.
	 * @param ctx the parse tree
	 */
	void enterIguales(LogoTECParser.IgualesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#iguales}.
	 * @param ctx the parse tree
	 */
	void exitIguales(LogoTECParser.IgualesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#mayorque}.
	 * @param ctx the parse tree
	 */
	void enterMayorque(LogoTECParser.MayorqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#mayorque}.
	 * @param ctx the parse tree
	 */
	void exitMayorque(LogoTECParser.MayorqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#menorque}.
	 * @param ctx the parse tree
	 */
	void enterMenorque(LogoTECParser.MenorqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#menorque}.
	 * @param ctx the parse tree
	 */
	void exitMenorque(LogoTECParser.MenorqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(LogoTECParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(LogoTECParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#op_algebraicas}.
	 * @param ctx the parse tree
	 */
	void enterOp_algebraicas(LogoTECParser.Op_algebraicasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#op_algebraicas}.
	 * @param ctx the parse tree
	 */
	void exitOp_algebraicas(LogoTECParser.Op_algebraicasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#numeric_val}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_val(LogoTECParser.Numeric_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#numeric_val}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_val(LogoTECParser.Numeric_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#diferencia}.
	 * @param ctx the parse tree
	 */
	void enterDiferencia(LogoTECParser.DiferenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#diferencia}.
	 * @param ctx the parse tree
	 */
	void exitDiferencia(LogoTECParser.DiferenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#azar}.
	 * @param ctx the parse tree
	 */
	void enterAzar(LogoTECParser.AzarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#azar}.
	 * @param ctx the parse tree
	 */
	void exitAzar(LogoTECParser.AzarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#producto}.
	 * @param ctx the parse tree
	 */
	void enterProducto(LogoTECParser.ProductoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#producto}.
	 * @param ctx the parse tree
	 */
	void exitProducto(LogoTECParser.ProductoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#potencia}.
	 * @param ctx the parse tree
	 */
	void enterPotencia(LogoTECParser.PotenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#potencia}.
	 * @param ctx the parse tree
	 */
	void exitPotencia(LogoTECParser.PotenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#division}.
	 * @param ctx the parse tree
	 */
	void enterDivision(LogoTECParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#division}.
	 * @param ctx the parse tree
	 */
	void exitDivision(LogoTECParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#suma}.
	 * @param ctx the parse tree
	 */
	void enterSuma(LogoTECParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#suma}.
	 * @param ctx the parse tree
	 */
	void exitSuma(LogoTECParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoTECParser#rumbo}.
	 * @param ctx the parse tree
	 */
	void enterRumbo(LogoTECParser.RumboContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoTECParser#rumbo}.
	 * @param ctx the parse tree
	 */
	void exitRumbo(LogoTECParser.RumboContext ctx);
}