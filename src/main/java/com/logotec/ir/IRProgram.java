package com.logotec.ir;

import java.util.ArrayList;
import java.util.List;

public class IRProgram {
    private final List<IRInstr> instrs = new ArrayList<>();

    public void add(IRInstr i) { instrs.add(i); }
    public List<IRInstr> getInstrs() { return instrs; }

    @Override public String toString() {
        StringBuilder sb = new StringBuilder();
        for (IRInstr i : instrs) sb.append(i).append("\n");
        return sb.toString();
    }
}
