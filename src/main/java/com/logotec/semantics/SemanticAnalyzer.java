package com.logotec.semantics;

import com.logotec.parser.LogoTECBaseVisitor;
import com.logotec.parser.LogoTECParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Analizador semántico para el lenguaje LogoTEC.
 *
 * Esta clase recorre el árbol sintáctico generado por ANTLR y verifica que las
 * operaciones, tipos de datos y estructuras del programa sean semánticamente válidas.
 *
 * Extiende la clase base generada por ANTLR (LogoTECBaseVisitor) para visitar los nodos
 * del árbol y realizar comprobaciones de tipos, definiciones de variables y compatibilidad.
 */
public class SemanticAnalyzer extends LogoTECBaseVisitor<Type> {

    // Tabla de símbolos que mantiene las variables y sus tipos por alcance
    private final SymbolTable symbols = new SymbolTable();
    // Manejador de errores semánticos
    private final ErrorReporter errors;

    /**
     * Constructor del analizador semántico.
     * @param errors instancia de ErrorReporter para registrar los errores detectados
     */
    public SemanticAnalyzer(ErrorReporter errors) {
        this.errors = errors;
    }

    // ================================================================
    // MÉTODOS AUXILIARES
    // ================================================================

    /**
     * Verifica si el tipo real de una expresión coincide con el tipo esperado.
     * Si no coincide, reporta un error semántico con su ubicación.
     */
    private void expect(Type actual, Type expected, Token at, String context) {
        if (actual == null) {
            errors.report("Referencia a símbolo no definido en " + context, at.getLine(), at.getCharPositionInLine());
        } else if (expected != Type.UNKNOWN && actual != expected) {
            errors.report("Tipo incompatible: se esperaba " + expected + " pero se obtuvo " + actual + " en " + context,
                    at.getLine(), at.getCharPositionInLine());
        }
    }

    /**
     * Determina el tipo de un literal según su contenido textual.
     * Ejemplo: "verdadero" → BOOLEAN, "5.0" → NUMBER, etc.
     */
    private Type inferLiteral(Token t) {
        String text = t.getText();
        if (text == null) return Type.UNKNOWN;
        if (text.equals("verdadero") || text.equals("falso")) return Type.BOOLEAN;
        if (text.startsWith("\"") && text.endsWith("\"")) return Type.STRING;
        // número o decimal
        if (text.matches("-?\\d+(\\.\\d+)?")) return Type.NUMBER;
        return Type.UNKNOWN;
    }

    // ================================================================
    // VISITAS GENERALES DEL PROGRAMA
    // ================================================================

    @Override
    public Type visitProgram(LogoTECParser.ProgramContext ctx) {
        // Recorre todo el programa
        return super.visitProgram(ctx);
    }

    @Override
    public Type visitProcedimiento(LogoTECParser.ProcedimientoContext ctx) {
        // Nuevo alcance para parámetros y variables locales
        symbols.pushScope();
        // Define los parámetros con tipo UNKNOWN inicialmente
        LogoTECParser.ParametrosContext params = ctx.parametros();
        if (params != null) {
            for (TerminalNode id : params.ID()) {
                symbols.define(id.getText(), Type.UNKNOWN);
            }
        }
        // Visita el contenido del procedimiento
        super.visitProcedimiento(ctx);
        // Cierra el alcance local
        symbols.popScope();
        return null;
    }

    // ================================================================
    // DECLARACIÓN Y ASIGNACIÓN DE VARIABLES
    // ================================================================

    @Override
    public Type visitHaz(LogoTECParser.HazContext ctx) {
        // Asignación de variable existente o definición implícita
        String id = ctx.ID().getText();
        Token at = ctx.ID().getSymbol();
        // Determina el tipo del valor asignado
        Type rhs;
        if (ctx.numeric_val() != null) {
            rhs = visit(ctx.numeric_val());
        } else if (ctx.boolean_val() != null) {
            rhs = visit(ctx.boolean_val());
        } else if (ctx.STRING() != null) {
            rhs = Type.STRING;
        } else {
            rhs = Type.UNKNOWN;
        }

        if (!symbols.isDefined(id)) {
            // Si no está definida, se crea automáticamente
            symbols.define(id, rhs == null ? Type.UNKNOWN : rhs);
        } else {
            // Verifica compatibilidad de tipos
            Type ok = symbols.get(id);
            if (ok == Type.UNKNOWN && rhs != null) {
                symbols.assign(id, rhs);
            } else if (rhs != null && ok != rhs) {
                errors.report("Asignación incompatible a '" + id + "' (" + ok + " := " + rhs + ")",
                        at.getLine(), at.getCharPositionInLine());
            }
        }
        return null;
    }

    @Override
    public Type visitInic(LogoTECParser.InicContext ctx) {
        // Declaración explícita de una nueva variable
        String id = ctx.ID().getText();
        Token at = ctx.ID().getSymbol();
        // Determina el tipo de la expresión inicial
        Type rhs;
        if (ctx.numeric_val() != null) {
            rhs = visit(ctx.numeric_val());
        } else if (ctx.boolean_val() != null) {
            rhs = visit(ctx.boolean_val());
        } else if (ctx.STRING() != null) {
            rhs = Type.STRING;
        } else if (ctx.operacion() != null) {
            rhs = visit(ctx.operacion());
        } else {
            rhs = Type.UNKNOWN;
        }

        // Verifica si ya existe en el mismo alcance
        if (!symbols.define(id, rhs == null ? Type.UNKNOWN : rhs)) {
            errors.report("La variable '" + id + "' ya está definida en este alcance",
                    at.getLine(), at.getCharPositionInLine());
        }
        return null;
    }

    // ================================================================
    // COMANDOS QUE ESPERAN ARGUMENTOS NUMÉRICOS
    // ================================================================
    // (Cada comando valida que sus argumentos sean del tipo correcto)

    @Override public Type visitAvanza(LogoTECParser.AvanzaContext ctx) {
        Type t = visit(ctx.numeric_val());
        expect(t, Type.NUMBER, ctx.getStart(), "avanza");
        return null;
    }

    @Override public Type visitRetrocede(LogoTECParser.RetrocedeContext ctx) {
        Type t = visit(ctx.numeric_val());
        expect(t, Type.NUMBER, ctx.getStart(), "retrocede");
        return null;
    }

    @Override public Type visitGiraderecha(LogoTECParser.GiraderechaContext ctx) {
        Type t = visit(ctx.numeric_val());
        expect(t, Type.NUMBER, ctx.getStart(), "giraderecha");
        return null;
    }

    @Override public Type visitGiraizquierda(LogoTECParser.GiraizquierdaContext ctx) {
        Type t = visit(ctx.numeric_val());
        expect(t, Type.NUMBER, ctx.getStart(), "giraizquierda");
        return null;
    }

    @Override public Type visitPonpos(LogoTECParser.PonposContext ctx) {
        // Requiere dos argumentos numéricos
        for (LogoTECParser.Numeric_valContext nv : ctx.numeric_val()) {
            Type t = visit(nv);
            expect(t, Type.NUMBER, nv.getStart(), "ponpos");
        }
        return null;
    }

    // (Las siguientes funciones son similares: verifican que los argumentos sean numéricos)
    @Override public Type visitPonxy(LogoTECParser.PonxyContext ctx) {
        for (LogoTECParser.Numeric_valContext nv : ctx.numeric_val()) {
            Type t = visit(nv);
            expect(t, Type.NUMBER, nv.getStart(), "ponxy");
        }
        return null;
    }

    @Override public Type visitPonrumbo(LogoTECParser.PonrumboContext ctx) {
        Type t = visit(ctx.numeric_val());
        expect(t, Type.NUMBER, ctx.getStart(), "ponrumbo");
        return null;
    }

    @Override public Type visitPonx(LogoTECParser.PonxContext ctx) {
        Type t = visit(ctx.numeric_val());
        expect(t, Type.NUMBER, ctx.getStart(), "ponx");
        return null;
    }

    @Override public Type visitPony(LogoTECParser.PonyContext ctx) {
        Type t = visit(ctx.numeric_val());
        expect(t, Type.NUMBER, ctx.getStart(), "pony");
        return null;
    }

    @Override public Type visitEspera(LogoTECParser.EsperaContext ctx) {
        Type t = visit(ctx.numeric_val());
        expect(t, Type.NUMBER, ctx.getStart(), "espera");
        return null;
    }

    // ================================================================
    // ESTRUCTURAS DE CONTROL (esperan condiciones booleanas)
    // ================================================================
    @Override public Type visitSi(LogoTECParser.SiContext ctx) {
        Type cond = visit(ctx.boolean_val());
        expect(cond, Type.BOOLEAN, ctx.getStart(), "si");
        return super.visitSi(ctx);
    }

    @Override public Type visitHaz_hasta(LogoTECParser.Haz_hastaContext ctx) {
        Type cond = visit(ctx.boolean_val());
        expect(cond, Type.BOOLEAN, ctx.getStart(), "haz_hasta");
        return super.visitHaz_hasta(ctx);
    }

    @Override public Type visitHasta(LogoTECParser.HastaContext ctx) {
        Type cond = visit(ctx.boolean_val());
        expect(cond, Type.BOOLEAN, ctx.getStart(), "hasta");
        return super.visitHasta(ctx);
    }

    @Override public Type visitHaz_mientras(LogoTECParser.Haz_mientrasContext ctx) {
        Type cond = visit(ctx.boolean_val());
        expect(cond, Type.BOOLEAN, ctx.getStart(), "haz_mientras");
        return super.visitHaz_mientras(ctx);
    }

    @Override public Type visitMientras(LogoTECParser.MientrasContext ctx) {
        Type cond = visit(ctx.boolean_val());
        expect(cond, Type.BOOLEAN, ctx.getStart(), "mientras");
        return super.visitMientras(ctx);
    }

    // (Los demás bloques: haz_mientras, haz_hasta, hasta — siguen la misma lógica)

    // ================================================================
    // EXPRESIONES BOOLEANAS Y ARITMÉTICAS
    // ================================================================
    // A partir de aquí se validan los tipos en operaciones lógicas y matemáticas
    @Override public Type visitBoolean_val(LogoTECParser.Boolean_valContext ctx) {
        if (ctx.BOOLEAN() != null) return Type.BOOLEAN;
        if (ctx.op_logica() != null) return visit(ctx.op_logica());
        if (ctx.op_comparativa() != null) return visit(ctx.op_comparativa());
        // Identificador usado como booleano
        if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            Type t = symbols.get(id);
            if (t == null) {
                errors.report("Variable booleana no definida: '" + id + "'", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
                return Type.UNKNOWN;
            }
            if (t != Type.BOOLEAN && t != Type.UNKNOWN) {
                errors.report("Se esperaba BOOLEAN en '" + id + "' pero es " + t, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
            }
            return t;
        }
        return Type.UNKNOWN;
    }


    @Override public Type visitOp_logica(LogoTECParser.Op_logicaContext ctx) {
        if (ctx.y() != null) return visit(ctx.y());
        if (ctx.o() != null) return visit(ctx.o());
        return Type.UNKNOWN;
    }

    @Override public Type visitY(LogoTECParser.YContext ctx) {
        Type a = visit(ctx.boolean_val(0));
        Type b = visit(ctx.boolean_val(1));
        if (a != Type.BOOLEAN) errors.report("Operando izquierdo de Y no es booleano", ctx.boolean_val(0).getStart().getLine(), ctx.boolean_val(0).getStart().getCharPositionInLine());
        if (b != Type.BOOLEAN) errors.report("Operando derecho de Y no es booleano", ctx.boolean_val(1).getStart().getLine(), ctx.boolean_val(1).getStart().getCharPositionInLine());
        return Type.BOOLEAN;
    }

    @Override public Type visitO(LogoTECParser.OContext ctx) {
        Type a = visit(ctx.boolean_val(0));
        Type b = visit(ctx.boolean_val(1));
        if (a != Type.BOOLEAN) errors.report("Operando izquierdo de O no es booleano", ctx.boolean_val(0).getStart().getLine(), ctx.boolean_val(0).getStart().getCharPositionInLine());
        if (b != Type.BOOLEAN) errors.report("Operando derecho de O no es booleano", ctx.boolean_val(1).getStart().getLine(), ctx.boolean_val(1).getStart().getCharPositionInLine());
        return Type.BOOLEAN;
    }

    @Override public Type visitOp_comparativa(LogoTECParser.Op_comparativaContext ctx) {
        if (ctx.iguales() != null) return visit(ctx.iguales());
        if (ctx.mayorque() != null) return visit(ctx.mayorque());
        if (ctx.menorque() != null) return visit(ctx.menorque());
        return Type.UNKNOWN;
    }

    @Override public Type visitIguales(LogoTECParser.IgualesContext ctx) {
        Type a = visit(ctx.numeric_val(0));
        Type b = visit(ctx.numeric_val(1));
        if (a != Type.NUMBER) errors.report("Operando izquierdo de IGUALES no es numérico", ctx.numeric_val(0).getStart().getLine(), ctx.numeric_val(0).getStart().getCharPositionInLine());
        if (b != Type.NUMBER) errors.report("Operando derecho de IGUALES no es numérico", ctx.numeric_val(1).getStart().getLine(), ctx.numeric_val(1).getStart().getCharPositionInLine());
        return Type.BOOLEAN;
    }

    @Override public Type visitMayorque(LogoTECParser.MayorqueContext ctx) {
        Type a = visit(ctx.numeric_val(0));
        Type b = visit(ctx.numeric_val(1));
        if (a != Type.NUMBER) errors.report("Operando izquierdo de MAYORQUE no es numérico", ctx.numeric_val(0).getStart().getLine(), ctx.numeric_val(0).getStart().getCharPositionInLine());
        if (b != Type.NUMBER) errors.report("Operando derecho de MAYORQUE no es numérico", ctx.numeric_val(1).getStart().getLine(), ctx.numeric_val(1).getStart().getCharPositionInLine());
        return Type.BOOLEAN;
    }

    @Override public Type visitMenorque(LogoTECParser.MenorqueContext ctx) {
        Type a = visit(ctx.numeric_val(0));
        Type b = visit(ctx.numeric_val(1));
        if (a != Type.NUMBER) errors.report("Operando izquierdo de MENORQUE no es numérico", ctx.numeric_val(0).getStart().getLine(), ctx.numeric_val(0).getStart().getCharPositionInLine());
        if (b != Type.NUMBER) errors.report("Operando derecho de MENORQUE no es numérico", ctx.numeric_val(1).getStart().getLine(), ctx.numeric_val(1).getStart().getCharPositionInLine());
        return Type.BOOLEAN;
    }

    @Override public Type visitOperacion(LogoTECParser.OperacionContext ctx) {
        return visit(ctx.op_algebraicas());
    }

    @Override public Type visitOp_algebraicas(LogoTECParser.Op_algebraicasContext ctx) {
        // All algebraic ops are numeric
        if (ctx.diferencia() != null) return visit(ctx.diferencia());
        if (ctx.azar() != null) return visit(ctx.azar());
        if (ctx.producto() != null) return visit(ctx.producto());
        if (ctx.potencia() != null) return visit(ctx.potencia());
        if (ctx.division() != null) return visit(ctx.division());
        if (ctx.suma() != null) return visit(ctx.suma());
        return Type.UNKNOWN;
    }

    @Override public Type visitDiferencia(LogoTECParser.DiferenciaContext ctx) {
        Type a = visit(ctx.numeric_val(0));
        Type b = visit(ctx.numeric_val(1));
        if (a != Type.NUMBER) errors.report("Operando izquierdo de DIFERENCIA no es numérico", ctx.numeric_val(0).getStart().getLine(), ctx.numeric_val(0).getStart().getCharPositionInLine());
        if (b != Type.NUMBER) errors.report("Operando derecho de DIFERENCIA no es numérico", ctx.numeric_val(1).getStart().getLine(), ctx.numeric_val(1).getStart().getCharPositionInLine());
        return Type.NUMBER;
    }

    @Override public Type visitAzar(LogoTECParser.AzarContext ctx) {
        Type a = visit(ctx.numeric_val());
        if (a != Type.NUMBER) errors.report("Operando de AZAR no es numérico", ctx.numeric_val().getStart().getLine(), ctx.numeric_val().getStart().getCharPositionInLine());
        return Type.NUMBER;
    }

    @Override public Type visitProducto(LogoTECParser.ProductoContext ctx) {
        Type a = visit(ctx.numeric_val(0));
        Type b = visit(ctx.numeric_val(1));
        if (a != Type.NUMBER) errors.report("Operando izquierdo de PRODUCTO no es numérico", ctx.numeric_val(0).getStart().getLine(), ctx.numeric_val(0).getStart().getCharPositionInLine());
        if (b != Type.NUMBER) errors.report("Operando derecho de PRODUCTO no es numérico", ctx.numeric_val(1).getStart().getLine(), ctx.numeric_val(1).getStart().getCharPositionInLine());
        return Type.NUMBER;
    }

    @Override public Type visitPotencia(LogoTECParser.PotenciaContext ctx) {
        Type a = visit(ctx.numeric_val(0));
        Type b = visit(ctx.numeric_val(1));
        if (a != Type.NUMBER) errors.report("Operando izquierdo de POTENCIA no es numérico", ctx.numeric_val(0).getStart().getLine(), ctx.numeric_val(0).getStart().getCharPositionInLine());
        if (b != Type.NUMBER) errors.report("Operando derecho de POTENCIA no es numérico", ctx.numeric_val(1).getStart().getLine(), ctx.numeric_val(1).getStart().getCharPositionInLine());
        return Type.NUMBER;
    }

    @Override public Type visitDivision(LogoTECParser.DivisionContext ctx) {
        Type a = visit(ctx.numeric_val(0));
        Type b = visit(ctx.numeric_val(1));
        if (a != Type.NUMBER) errors.report("Operando izquierdo de DIVISION no es numérico", ctx.numeric_val(0).getStart().getLine(), ctx.numeric_val(0).getStart().getCharPositionInLine());
        if (b != Type.NUMBER) errors.report("Operando derecho de DIVISION no es numérico", ctx.numeric_val(1).getStart().getLine(), ctx.numeric_val(1).getStart().getCharPositionInLine());
        return Type.NUMBER;
    }

    @Override public Type visitSuma(LogoTECParser.SumaContext ctx) {
        Type a = visit(ctx.numeric_val(0));
        Type b = visit(ctx.numeric_val(1));
        if (a != Type.NUMBER) errors.report("Operando izquierdo de SUMA no es numérico", ctx.numeric_val(0).getStart().getLine(), ctx.numeric_val(0).getStart().getCharPositionInLine());
        if (b != Type.NUMBER) errors.report("Operando derecho de SUMA no es numérico", ctx.numeric_val(1).getStart().getLine(), ctx.numeric_val(1).getStart().getCharPositionInLine());
        return Type.NUMBER;
    }

    // (Secciones de operaciones lógicas y comparativas — “Y”, “O”, “IGUALES”, “MAYORQUE”, etc.)
    // Cada método valida que los operandos sean del tipo correcto y retorna el tipo resultante.

    // ================================================================
    // EXPRESIONES NUMÉRICAS
    // ================================================================
    @Override public Type visitNumeric_val(LogoTECParser.Numeric_valContext ctx) {
        // Literales numéricos o variables numéricas
        if (ctx.NUMERO() != null || ctx.DIGITO() != null) return Type.NUMBER;
        if (ctx.rumbo() != null) return Type.NUMBER; // rumbo is numeric
        if (ctx.PAR_OPEN() != null) return visit(ctx.operacion());
        // Verificación de variable numérica
        if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            Type t = symbols.get(id);
            if (t == null) {
                errors.report("Variable numérica no definida: '" + id + "'", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
                return Type.UNKNOWN;
            }
            if (t != Type.NUMBER && t != Type.UNKNOWN) {
                errors.report("Se esperaba NUMBER en '" + id + "' pero es " + t, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
            }
            return t;
        }
        return Type.UNKNOWN;
    }
}
