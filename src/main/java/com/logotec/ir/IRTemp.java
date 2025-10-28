package com.logotec.ir;

public class IRTemp implements IROperand {
    private final int id;
    public IRTemp(int id) { this.id = id; }
    @Override public String repr() { return "t" + id; }
    @Override public String toString() { return repr(); }
}
