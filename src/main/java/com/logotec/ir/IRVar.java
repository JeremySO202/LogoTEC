package com.logotec.ir;

public class IRVar implements IROperand {
    private final String name;
    public IRVar(String name) { this.name = name; }
    @Override public String repr() { return name; }
    @Override public String toString() { return repr(); }
}
