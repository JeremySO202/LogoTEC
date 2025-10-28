package com.logotec.ir;

import java.util.Arrays;

public class IRInstr {
    private final String op;
    private final IROperand[] ops;

    public IRInstr(String op, IROperand... ops) { this.op = op; this.ops = ops; }

    @Override public String toString() { return op + " " + Arrays.toString(ops); }
}
