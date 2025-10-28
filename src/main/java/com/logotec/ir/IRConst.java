package com.logotec.ir;

public class IRConst implements IROperand {
    private final Object value;
    public IRConst(Object value) { this.value = value; }
    @Override public String repr() { return value == null ? "null" : value.toString(); }
    @Override public String toString() { return repr(); }
}
