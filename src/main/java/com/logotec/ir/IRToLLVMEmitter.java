package com.logotec.ir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class IRToLLVMEmitter {

    private int tempCounter = 0;
    private int nextLabelId = 0;

    public void emit(IRProgram program, Path outFile) throws IOException {
        List<IRInstr> instrs = program.getInstrs();

        // Recolectar variables
        Set<String> vars = new TreeSet<>();
        for (IRInstr instr : instrs) {
            String s = instr.toString();
            int sp = s.indexOf(' ');
            String inside = sp > 0 ? s.substring(sp + 1).trim() : "[]";
            String[] parts = parseInside(inside);

            for (String p : parts) {
                p = p.trim();
                if (!isNumber(p) && !p.isEmpty() && !p.startsWith("\"") && !p.startsWith("L") && !p.startsWith("<")) {
                    vars.add(p);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        // Emitir declaraciones del runtime
        emitRuntimeDeclarations(sb);

        // Emitir variables globales
        for (String v : vars) {
            sb.append(String.format("@var_%s = global double 0.0\n", sanitize(v)));
        }
        sb.append("\n");

        // Emitir función main
        sb.append("define i32 @main() {\n");
        sb.append("entry:\n");
        sb.append("  call void @logo_reset()\n");

        // Buscar el primer LABEL para saltar ahí
        String firstLabel = "start";
        for (IRInstr instr : instrs) {
            if (instr.toString().startsWith("LABEL")) {
                String s = instr.toString();
                int sp = s.indexOf(' ');
                String inside = sp > 0 ? s.substring(sp + 1).trim() : "[]";
                String[] parts = parseInside(inside);
                if (parts.length > 0) {
                    firstLabel = sanitize(stripQuotes(parts[0].trim()));
                    break;
                }
            }
        }
        sb.append(String.format("  br label %%%s\n\n", firstLabel));

        // Traducir instrucciones IR a LLVM
        for (int i = 0; i < instrs.size(); i++) {
            IRInstr instr = instrs.get(i);
            String op = instr.toString().split(" ")[0];

            // Si encontramos una LABEL y la instrucción anterior no fue JMP/CJMP/LABEL,
            // agregamos un br automático al siguiente label
            if (i > 0 && op.equals("LABEL")) {
                String prevOp = instrs.get(i-1).toString().split(" ")[0];
                if (!prevOp.equals("JMP") && !prevOp.equals("CJMP") && !prevOp.equals("LABEL") && !prevOp.equals("ENDPROC")) {
                    String s = instr.toString();
                    int sp = s.indexOf(' ');
                    String inside = sp > 0 ? s.substring(sp + 1).trim() : "[]";
                    String[] parts = parseInside(inside);
                    if (parts.length > 0) {
                        String labelName = sanitize(stripQuotes(parts[0].trim()));
                        sb.append(String.format("  br label %%%s\n\n", labelName));
                    }
                }
            }

            emitInstruction(instr, sb);
        }

        // Verificar si la última instrucción es un terminador
        if (!instrs.isEmpty()) {
            String lastOp = instrs.get(instrs.size() - 1).toString().split(" ")[0];
            if (!lastOp.equals("JMP") && !lastOp.equals("CJMP") && !lastOp.equals("ENDPROC")) {
                sb.append("  ret i32 0\n");
            }
        }

        sb.append("}\n");

        Files.writeString(outFile, sb.toString());
    }

    // Declaraciones de funciones del runtime
    private void emitRuntimeDeclarations(StringBuilder sb) {
        sb.append("; Runtime Logo functions\n");
        sb.append("declare void @logo_reset()\n");
        sb.append("declare void @logo_avanza(double)\n");
        sb.append("declare void @logo_retrocede(double)\n");
        sb.append("declare void @logo_giraderecha(double)\n");
        sb.append("declare void @logo_giraizquierda(double)\n");
        sb.append("declare void @logo_centro()\n");
        sb.append("declare void @logo_ponpos(double, double)\n");
        sb.append("declare void @logo_ponxy(double, double)\n");
        sb.append("declare void @logo_ponx(double)\n");
        sb.append("declare void @logo_pony(double)\n");
        sb.append("declare void @logo_ponrumbo(double)\n");
        sb.append("declare void @logo_bajalapiz()\n");
        sb.append("declare void @logo_subelapiz()\n");
        sb.append("declare void @logo_poncolor(i32)\n");
        sb.append("declare void @logo_ocultatortuga()\n");
        sb.append("declare void @logo_espera(double)\n");
        sb.append("declare void @logo_show()\n");
        sb.append("\n");
    }

    // Traducir una instrucción IR a LLVM
    private void emitInstruction(IRInstr instr, StringBuilder sb) {
        String s = instr.toString();
        int sp = s.indexOf(' ');
        String op = sp > 0 ? s.substring(0, sp) : s;
        String inside = sp > 0 ? s.substring(sp + 1).trim() : "[]";
        String[] parts = parseInside(inside);

        switch (op) {
            case "STORE": emitStore(parts, sb); break;
            case "ADD": emitAdd(parts, sb); break;
            case "SUB": emitSub(parts, sb); break;
            case "MUL": emitMul(parts, sb); break;
            case "DIV": emitDiv(parts, sb); break;
            case "EQ": emitEq(parts, sb); break;
            case "NEQ": emitNeq(parts, sb); break;
            case "LT": emitLt(parts, sb); break;
            case "GT": emitGt(parts, sb); break;
            case "LTE": emitLte(parts, sb); break;
            case "GTE": emitGte(parts, sb); break;
            case "LABEL": emitLabel(parts, sb); break;
            case "JMP": emitJmp(parts, sb); break;
            case "CJMP": emitCjmp(parts, sb); break;
            case "AVANZA": emitAvanza(parts, sb); break;
            case "RETROCEDE": emitRetrocede(parts, sb); break;
            case "GIRADERECHA": emitGiraDerecha(parts, sb); break;
            case "GIRAIZQUIERDA": emitGiraIzquierda(parts, sb); break;
            case "CENTRO": emitCentro(sb); break;
            case "PONPOS": emitPonPos(parts, sb); break;
            case "PONXY": emitPonXY(parts, sb); break;
            case "PONX": emitPonX(parts, sb); break;
            case "PONY": emitPonY(parts, sb); break;
            case "PONRUMBO": emitPonRumbo(parts, sb); break;
            case "BAJALAPIZ": emitBajaLapiz(sb); break;
            case "SUBELAPIZ": emitSubeLapiz(sb); break;
            case "PONCOLORLAPIZ": emitPonColorLapiz(parts, sb); break;
            case "OCULTATORTUGA": emitOcultaTortuga(sb); break;
            case "ESPERA": emitEspera(parts, sb); break;
            case "INC": emitInc(parts, sb); break;
            case "DEC": emitDec(parts, sb); break;
            case "ENDPROC":
                // ENDPROC significa que el procedimiento termina, agregar ret
                sb.append("  ret i32 0\n");
                break;
            default: sb.append(String.format("  ; Instrucción no implementada: %s\n", op));
        }
    }

    // ========== INSTRUCCIONES DE ALMACENAMIENTO ==========

    private void emitStore(String[] parts, StringBuilder sb) {
        if (parts.length < 2) return;
        String dest = parts[0].trim();
        String src = parts[1].trim();
        String val = loadValueLLVM(src, sb);
        sb.append(String.format("  store double %s, double* @var_%s\n", val, sanitize(dest)));
    }

    // ========== OPERACIONES ARITMÉTICAS ==========

    private void emitAdd(String[] parts, StringBuilder sb) {
        if (parts.length < 3) return;
        String v1 = loadValueLLVM(parts[1].trim(), sb);
        String v2 = loadValueLLVM(parts[2].trim(), sb);
        String temp = newTemp();
        sb.append(String.format("  %s = fadd double %s, %s\n", temp, v1, v2));
        sb.append(String.format("  store double %s, double* @var_%s\n", temp, sanitize(parts[0].trim())));
    }

    private void emitSub(String[] parts, StringBuilder sb) {
        if (parts.length < 3) return;
        String v1 = loadValueLLVM(parts[1].trim(), sb);
        String v2 = loadValueLLVM(parts[2].trim(), sb);
        String temp = newTemp();
        sb.append(String.format("  %s = fsub double %s, %s\n", temp, v1, v2));
        sb.append(String.format("  store double %s, double* @var_%s\n", temp, sanitize(parts[0].trim())));
    }

    private void emitMul(String[] parts, StringBuilder sb) {
        if (parts.length < 3) return;
        String v1 = loadValueLLVM(parts[1].trim(), sb);
        String v2 = loadValueLLVM(parts[2].trim(), sb);
        String temp = newTemp();
        sb.append(String.format("  %s = fmul double %s, %s\n", temp, v1, v2));
        sb.append(String.format("  store double %s, double* @var_%s\n", temp, sanitize(parts[0].trim())));
    }

    private void emitDiv(String[] parts, StringBuilder sb) {
        if (parts.length < 3) return;
        String v1 = loadValueLLVM(parts[1].trim(), sb);
        String v2 = loadValueLLVM(parts[2].trim(), sb);
        String temp = newTemp();
        sb.append(String.format("  %s = fdiv double %s, %s\n", temp, v1, v2));
        sb.append(String.format("  store double %s, double* @var_%s\n", temp, sanitize(parts[0].trim())));
    }

    // ========== OPERACIONES DE COMPARACIÓN ==========

    private void emitEq(String[] parts, StringBuilder sb) {
        if (parts.length < 3) return;
        String v1 = loadValueLLVM(parts[1].trim(), sb);
        String v2 = loadValueLLVM(parts[2].trim(), sb);
        String tempCmp = newTemp();
        String tempExt = newTemp();
        sb.append(String.format("  %s = fcmp oeq double %s, %s\n", tempCmp, v1, v2));
        sb.append(String.format("  %s = uitofp i1 %s to double\n", tempExt, tempCmp));
        sb.append(String.format("  store double %s, double* @var_%s\n", tempExt, sanitize(parts[0].trim())));
    }

    private void emitNeq(String[] parts, StringBuilder sb) {
        if (parts.length < 3) return;
        String v1 = loadValueLLVM(parts[1].trim(), sb);
        String v2 = loadValueLLVM(parts[2].trim(), sb);
        String tempCmp = newTemp();
        String tempExt = newTemp();
        sb.append(String.format("  %s = fcmp one double %s, %s\n", tempCmp, v1, v2));
        sb.append(String.format("  %s = uitofp i1 %s to double\n", tempExt, tempCmp));
        sb.append(String.format("  store double %s, double* @var_%s\n", tempExt, sanitize(parts[0].trim())));
    }

    private void emitLt(String[] parts, StringBuilder sb) {
        if (parts.length < 3) return;
        String v1 = loadValueLLVM(parts[1].trim(), sb);
        String v2 = loadValueLLVM(parts[2].trim(), sb);
        String tempCmp = newTemp();
        String tempExt = newTemp();
        sb.append(String.format("  %s = fcmp olt double %s, %s\n", tempCmp, v1, v2));
        sb.append(String.format("  %s = uitofp i1 %s to double\n", tempExt, tempCmp));
        sb.append(String.format("  store double %s, double* @var_%s\n", tempExt, sanitize(parts[0].trim())));
    }

    private void emitGt(String[] parts, StringBuilder sb) {
        if (parts.length < 3) return;
        String v1 = loadValueLLVM(parts[1].trim(), sb);
        String v2 = loadValueLLVM(parts[2].trim(), sb);
        String tempCmp = newTemp();
        String tempExt = newTemp();
        sb.append(String.format("  %s = fcmp ogt double %s, %s\n", tempCmp, v1, v2));
        sb.append(String.format("  %s = uitofp i1 %s to double\n", tempExt, tempCmp));
        sb.append(String.format("  store double %s, double* @var_%s\n", tempExt, sanitize(parts[0].trim())));
    }

    private void emitLte(String[] parts, StringBuilder sb) {
        if (parts.length < 3) return;
        String v1 = loadValueLLVM(parts[1].trim(), sb);
        String v2 = loadValueLLVM(parts[2].trim(), sb);
        String tempCmp = newTemp();
        String tempExt = newTemp();
        sb.append(String.format("  %s = fcmp ole double %s, %s\n", tempCmp, v1, v2));
        sb.append(String.format("  %s = uitofp i1 %s to double\n", tempExt, tempCmp));
        sb.append(String.format("  store double %s, double* @var_%s\n", tempExt, sanitize(parts[0].trim())));
    }

    private void emitGte(String[] parts, StringBuilder sb) {
        if (parts.length < 3) return;
        String v1 = loadValueLLVM(parts[1].trim(), sb);
        String v2 = loadValueLLVM(parts[2].trim(), sb);
        String tempCmp = newTemp();
        String tempExt = newTemp();
        sb.append(String.format("  %s = fcmp oge double %s, %s\n", tempCmp, v1, v2));
        sb.append(String.format("  %s = uitofp i1 %s to double\n", tempExt, tempCmp));
        sb.append(String.format("  store double %s, double* @var_%s\n", tempExt, sanitize(parts[0].trim())));
    }

    // ========== CONTROL DE FLUJO ==========

    private void emitLabel(String[] parts, StringBuilder sb) {
        if (parts.length < 1) return;
        String labelName = sanitize(stripQuotes(parts[0].trim()));

        // Verificar si la última línea es una etiqueta (termina con ":\n")
        String current = sb.toString();
        int lastNewline = current.lastIndexOf('\n');
        if (lastNewline > 0) {
            int prevNewline = current.lastIndexOf('\n', lastNewline - 1);
            if (prevNewline >= 0) {
                String lastLine = current.substring(prevNewline + 1, lastNewline).trim();
                // Si la línea anterior es una etiqueta, agregar un branch
                if (lastLine.endsWith(":")) {
                    sb.append(String.format("  br label %%%s\n\n", labelName));
                }
            }
        }

        sb.append(String.format("%s:\n", labelName));
    }

    private void emitJmp(String[] parts, StringBuilder sb) {
        if (parts.length < 1) return;
        String labelName = sanitize(stripQuotes(parts[0].trim()));
        sb.append(String.format("  br label %%%s\n\n", labelName));
    }

    private void emitCjmp(String[] parts, StringBuilder sb) {
        if (parts.length < 2) return;
        String v = loadValueLLVM(parts[0].trim(), sb);
        String labelTrue = sanitize(stripQuotes(parts[1].trim()));

        // CJMP solo genera el salto condicional
        // La siguiente instrucción en el IR debe ser un JMP o LABEL que maneje el caso falso
        String tempCond = newTemp();
        sb.append(String.format("  %s = fcmp one double %s, 0.0\n", tempCond, v));

        // Generar una etiqueta para el caso falso (la siguiente instrucción)
        String labelFalse = "cjmp_false_" + (nextLabelId++);

        sb.append(String.format("  br i1 %s, label %%%s, label %%%s\n\n", tempCond, labelTrue, labelFalse));
        sb.append(String.format("%s:\n", labelFalse));
    }

    // ========== FUNCIONES LOGO ==========

    private void emitAvanza(String[] parts, StringBuilder sb) {
        if (parts.length < 1) return;
        String v = loadValueLLVM(parts[0].trim(), sb);
        sb.append(String.format("  call void @logo_avanza(double %s)\n", v));
    }

    private void emitRetrocede(String[] parts, StringBuilder sb) {
        if (parts.length < 1) return;
        String v = loadValueLLVM(parts[0].trim(), sb);
        sb.append(String.format("  call void @logo_retrocede(double %s)\n", v));
    }

    private void emitGiraDerecha(String[] parts, StringBuilder sb) {
        if (parts.length < 1) return;
        String v = loadValueLLVM(parts[0].trim(), sb);
        sb.append(String.format("  call void @logo_giraderecha(double %s)\n", v));
    }

    private void emitGiraIzquierda(String[] parts, StringBuilder sb) {
        if (parts.length < 1) return;
        String v = loadValueLLVM(parts[0].trim(), sb);
        sb.append(String.format("  call void @logo_giraizquierda(double %s)\n", v));
    }

    private void emitCentro(StringBuilder sb) {
        sb.append("  call void @logo_centro()\n");
    }

    private void emitPonPos(String[] parts, StringBuilder sb) {
        if (parts.length < 2) return;
        String x = loadValueLLVM(parts[0].trim(), sb);
        String y = loadValueLLVM(parts[1].trim(), sb);
        sb.append(String.format("  call void @logo_ponpos(double %s, double %s)\n", x, y));
    }

    private void emitPonXY(String[] parts, StringBuilder sb) {
        if (parts.length < 2) return;
        String x = loadValueLLVM(parts[0].trim(), sb);
        String y = loadValueLLVM(parts[1].trim(), sb);
        sb.append(String.format("  call void @logo_ponxy(double %s, double %s)\n", x, y));
    }

    private void emitPonX(String[] parts, StringBuilder sb) {
        if (parts.length < 1) return;
        String x = loadValueLLVM(parts[0].trim(), sb);
        sb.append(String.format("  call void @logo_ponx(double %s)\n", x));
    }

    private void emitPonY(String[] parts, StringBuilder sb) {
        if (parts.length < 1) return;
        String y = loadValueLLVM(parts[0].trim(), sb);
        sb.append(String.format("  call void @logo_pony(double %s)\n", y));
    }

    private void emitPonRumbo(String[] parts, StringBuilder sb) {
        if (parts.length < 1) return;
        String r = loadValueLLVM(parts[0].trim(), sb);
        sb.append(String.format("  call void @logo_ponrumbo(double %s)\n", r));
    }

    private void emitBajaLapiz(StringBuilder sb) {
        sb.append("  call void @logo_bajalapiz()\n");
    }

    private void emitSubeLapiz(StringBuilder sb) {
        sb.append("  call void @logo_subelapiz()\n");
    }

    private void emitPonColorLapiz(String[] parts, StringBuilder sb) {
        if (parts.length < 1) return;
        String v = loadValueLLVM(parts[0].trim(), sb);
        String tempInt = newTemp();
        sb.append(String.format("  %s = fptoui double %s to i32\n", tempInt, v));
        sb.append(String.format("  call void @logo_poncolor(i32 %s)\n", tempInt));
    }

    private void emitOcultaTortuga(StringBuilder sb) {
        sb.append("  call void @logo_ocultatortuga()\n");
    }

    private void emitEspera(String[] parts, StringBuilder sb) {
        if (parts.length < 1) return;
        String v = loadValueLLVM(parts[0].trim(), sb);
        sb.append(String.format("  call void @logo_espera(double %s)\n", v));
    }

    private void emitInc(String[] parts, StringBuilder sb) {
        if (parts.length < 2) return;
        String var = parts[0].trim();
        String amount = parts[1].trim();
        String v1 = loadValueLLVM(var, sb);
        String v2 = loadValueLLVM(amount, sb);
        String temp = newTemp();
        sb.append(String.format("  %s = fadd double %s, %s\n", temp, v1, v2));
        sb.append(String.format("  store double %s, double* @var_%s\n", temp, sanitize(var)));
    }

    private void emitDec(String[] parts, StringBuilder sb) {
        if (parts.length < 2) return;
        String var = parts[0].trim();
        String amount = parts[1].trim();
        String v1 = loadValueLLVM(var, sb);
        String v2 = loadValueLLVM(amount, sb);
        String temp = newTemp();
        sb.append(String.format("  %s = fsub double %s, %s\n", temp, v1, v2));
        sb.append(String.format("  store double %s, double* @var_%s\n", temp, sanitize(var)));
    }

    // ========== HELPERS ==========

    private String loadValueLLVM(String operand, StringBuilder sb) {
        operand = operand.trim();
        if (isNumber(operand)) {
            if (!operand.contains(".")) operand = operand + ".0";
            return operand;
        }
        String rname = newTemp();
        sb.append(String.format("  %s = load double, double* @var_%s\n", rname, sanitize(operand)));
        return rname;
    }

    private String newTemp() {
        return "%t" + (tempCounter++);
    }

    private static String[] parseInside(String inside) {
        inside = inside.trim();
        if (inside.startsWith("[") && inside.endsWith("]")) {
            String mid = inside.substring(1, inside.length() - 1).trim();
            if (mid.isEmpty()) return new String[0];
            return mid.split("\\s*,\\s*");
        }
        return new String[0];
    }

    private static boolean isNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static String stripQuotes(String s) {
        s = s.trim();
        if (s.startsWith("\"") && s.endsWith("\""))
            return s.substring(1, s.length() - 1);
        return s;
    }

    private static String sanitize(String name) {
        return name.replaceAll("[^A-Za-z0-9_]", "_");
    }
}