package com.logotec.ir;

import java.util.ArrayList;
import java.util.List;

public class IROptimizer {

    public IRProgram optimize(IRProgram program) {
        List<IRInstr> original = program.getInstrs();
        List<IRInstr> optimized = new ArrayList<>();

        IRInstr prev = null;
        for (IRInstr instr : original) {
            String op = getOp(instr);

            // -----------------------------------------------------------------------------------------
            // 1️. Fusión de AVANZA para casos en que aparece de manera consecutiva
            // -----------------------------------------------------------------------------------------
            if (prev != null && getOp(prev).equals("AVANZA") && op.equals("AVANZA")) {
                try {
                    double prevVal = extractNumber(prev);
                    double currVal = extractNumber(instr);
                    double total = prevVal + currVal;

                    IRInstr merged = new IRInstr("AVANZA", new IRConst(total));
                    optimized.set(optimized.size() - 1, merged);
                    prev = merged;
                    continue;
                } catch (Exception ignored) {}
            }
            // ----------------------------------------------------------------------------------------
            // 2️. Eliminación de STORE redundantes
            // ----------------------------------------------------------------------------------------
            if (prev != null && getOp(prev).equals("STORE") && op.equals("STORE")) {
                String prevVar = extractVar(prev);
                String currVar = extractVar(instr);
                if (prevVar.equals(currVar)) {
                    optimized.remove(optimized.size() - 1); // elimina el anterior
                }
            }

            // ----------------------------------------------------------------------------------------
            // 3️. Eliminación de código inalcanzable
            // ----------------------------------------------------------------------------------------
            if (op.equals("ENDPROC")) {
                optimized.add(instr);
                break; // nada después de ENDPROC
            }

            optimized.add(instr);
            prev = instr;

        }
        // Aqui se crea un nuevo IRProgram con la version optimizada
        IRProgram result = new IRProgram();
        for (IRInstr i : optimized) result.add(i);
        return result;
    }

    // ---------------------------------------------------
    // Métodos auxiliares para leer datos de IRInstr
    // ---------------------------------------------------

    private String getOp(IRInstr instr) {
        try {
            var field = IRInstr.class.getDeclaredField("op");
            field.setAccessible(true);
            return (String) field.get(instr);
        } catch (Exception e) {
            return "";
        }
    }

    private IROperand[] getOps(IRInstr instr) {
        try {
            var field = IRInstr.class.getDeclaredField("ops");
            field.setAccessible(true);
            return (IROperand[]) field.get(instr);
        } catch (Exception e) {
            return new IROperand[0];
        }
    }

    private double extractNumber(IRInstr instr) {
        IROperand[] ops = getOps(instr);
        if (ops.length > 0) {
            try {
                return Double.parseDouble(ops[0].toString().replaceAll("[^0-9.\\-]+", ""));
            } catch (NumberFormatException ignored) {}
        }
        return 0.0;
    }

    private String extractVar(IRInstr instr) {
        IROperand[] ops = getOps(instr);
        if (ops.length > 0) {
            String text = ops[0].toString();
            return text.replaceAll("[\\[\\],]", "").trim();
        }
        return "";
    }
}