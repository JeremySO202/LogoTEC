package com.logotec.ir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class IRToLLVMEmitter {

    public void emit(IRProgram program, Path outFile) throws IOException {
        List<IRInstr> instrs = program.getInstrs();

        Set<String> temps = new TreeSet<>();
        Set<String> vars = new TreeSet<>();
        Map<String, Integer> labelPos = new HashMap<>();

        for (int i = 0; i < instrs.size(); ++i) {
            IRInstr instr = instrs.get(i);
            String s = instr.toString();
            int sp = s.indexOf(' ');
            String op = sp > 0 ? s.substring(0, sp) : s;
            String inside = sp > 0 ? s.substring(sp + 1).trim() : "[]";
            String[] parts = parseInside(inside);
            if ("LABEL".equals(op) && parts.length > 0) {
                labelPos.put(stripQuotes(parts[0]), i);
            }
            for (String p : parts) {
                p = p.trim();
                if (p.startsWith("t")) temps.add(p);
                else if (!isNumber(p) && !p.isEmpty() && !p.startsWith("\"")) vars.add(p);
            }
        }

        StringBuilder sb = new StringBuilder();

        // Declaraciones externas runtime
        sb.append("; LLVM IR generado para LLVM 14\n");
        sb.append("declare void @logo_reset()\n");
        sb.append("declare void @logo_avanza(double)\n");
        sb.append("declare void @logo_retrocede(double)\n");
        sb.append("declare void @logo_giraderecha(double)\n");
        sb.append("declare void @logo_giraizquierda(double)\n");
        sb.append("declare void @logo_ponpos(double,double)\n");
        sb.append("declare void @logo_ponxy(double,double)\n");
        sb.append("declare void @logo_ponrumbo(double)\n");
        sb.append("declare void @logo_ponx(double)\n");
        sb.append("declare void @logo_pony(double)\n");
        sb.append("declare void @logo_centro()\n");
        sb.append("declare void @logo_inic(i8*, double)\n");
        sb.append("declare void @logo_haz(i8*, double)\n");
        sb.append("declare void @logo_inc(double, double)\n");
        sb.append("declare double @logo_suma(double,double)\n");
        sb.append("declare double @logo_diferencia(double,double)\n");
        sb.append("declare double @logo_producto(double,double)\n");
        sb.append("declare double @logo_division(double,double)\n");
        sb.append("declare double @logo_potencia(double,double)\n");
        sb.append("declare double @logo_azar(double)\n");
        sb.append("declare i32 @logo_iguales(double,double)\n");
        sb.append("declare i32 @logo_mayorque(double,double)\n");
        sb.append("declare i32 @logo_menorque(double,double)\n\n");

        // Globals para nombres de variables
        Map<String, String> varNameGlobal = new HashMap<>();
        for (String v : vars) {
            String gstr = "_str_" + sanitize(v);
            varNameGlobal.put(v, gstr);
            int len = v.length() + 1; // incluir \00
            sb.append(String.format("@%s = private constant [%d x i8] c\"%s\\00\"\n", gstr, len, escapeCString(v)));
        }
        sb.append("\n");

        // Globals para variables
        for (String v : vars) {
            sb.append(String.format("@var_%s = global double 0.0\n", sanitize(v)));
        }

        // Globals para temps
        for (String t : temps) {
            sb.append(String.format("@temp_%s = global double 0.0\n", t));
        }
        sb.append("\n");

        // Emitir main
        sb.append("define i32 @main() {\n");
        sb.append("entry:\n");
        sb.append("  call void @logo_reset()\n");

        int strId = 0;
        Set<String> assigned = new HashSet<>();
        for (int i = 0; i < instrs.size(); ++i) {
            IRInstr instr = instrs.get(i);
            String s = instr.toString();
            int sp = s.indexOf(' ');
            String op = sp > 0 ? s.substring(0, sp) : s;
            String inside = sp > 0 ? s.substring(sp + 1).trim() : "[]";
            String[] parts = parseInside(inside);

            if ("STORE".equals(op) && parts.length >= 2) {
                String dest = parts[0].trim();
                String src = parts[1].trim();
                String val = loadValueLLVM(src, sb);
                if (dest.startsWith("t")) {
                    sb.append(String.format("  store double %s, double* @temp_%s\n", val, dest));
                } else {
                    String vname = sanitize(dest);
                    sb.append(String.format("  store double %s, double* @var_%s\n", val, vname));

                    String gstr = varNameGlobal.get(dest);
                    if (gstr != null) {
                        sb.append(String.format("  %%ptr%d = getelementptr [%d x i8], [%d x i8]* @%s, i32 0, i32 0\n",
                                strId, dest.length() + 1, dest.length() + 1, gstr));
                        sb.append(String.format("  %%cast%d = bitcast i8* %%ptr%d to i8*\n", strId, strId));

                        if (!assigned.contains(dest)) {
                            sb.append(String.format("  call void @logo_inic(i8* %%cast%d, double %s)\n", strId, val));
                        } else {
                            sb.append(String.format("  call void @logo_haz(i8* %%cast%d, double %s)\n", strId, val));
                        }
                        strId++;
                    }
                    assigned.add(dest);
                }
            } else if ("AVANZA".equals(op) && parts.length >= 1) {
                String v = loadValueLLVM(parts[0].trim(), sb);
                sb.append(String.format("  call void @logo_avanza(double %s)\n", v));
            } else if ("RETROCEDE".equals(op) && parts.length >= 1) {
                String v = loadValueLLVM(parts[0].trim(), sb);
                sb.append(String.format("  call void @logo_retrocede(double %s)\n", v));
            }
            // Más instrucciones se pueden agregar aquí
        }

        sb.append("  ret i32 0\n");
        sb.append("}\n");

        Files.writeString(outFile, sb.toString());
    }

    // helpers
    private static String[] parseInside(String inside) {
        inside = inside.trim();
        if (inside.startsWith("[") && inside.endsWith("]")) {
            String mid = inside.substring(1, inside.length() - 1).trim();
            if (mid.isEmpty()) return new String[0];
            return mid.split("\\, ");
        }
        return new String[0];
    }

    private static boolean isNumber(String s) {
        try { Double.parseDouble(s); return true; } catch (Exception e) { return false; }
    }

    private static String stripQuotes(String s) {
        s = s.trim();
        if (s.startsWith("\"") && s.endsWith("\"")) return s.substring(1, s.length()-1);
        return s;
    }

    private static String sanitize(String name) {
        return name.replaceAll("[^A-Za-z0-9_]", "_");
    }

    private static String escapeCString(String s) {
        return s.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    private String loadValueLLVM(String operand, StringBuilder sb) {
        operand = operand.trim();
        if (operand.startsWith("t")) {
            String tmp = "@temp_" + operand;
            String rname = "%v" + Math.abs(operand.hashCode()) + System.nanoTime();
            sb.append(String.format("  %s = load double, double* %s\n", rname, tmp));
            return rname;
        }
        if (isNumber(operand)) {
            if (!operand.contains(".")) operand = operand + ".0";
            return operand;
        }
        String vname = sanitize(operand);
        String rname = "%v" + Math.abs(operand.hashCode()) + System.nanoTime();
        sb.append(String.format("  %s = load double, double* @var_%s\n", rname, vname));
        return rname;
    }
}
