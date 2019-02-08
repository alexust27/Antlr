package main.java.expression.logical;

public class LogicVar implements LogicExpression {
    private String var;

    public LogicVar(String v) {
        this.var = v;
    }

    @Override
    public String toString() {
        return var;
    }

}
