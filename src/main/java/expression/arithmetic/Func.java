package main.java.expression.arithmetic;


import java.util.List;

public class Func implements ArithmeticExpression {
    private List<ArithmeticExpression> a;
    private String name;

    public Func(String name, List<ArithmeticExpression> v) {
        this.name = name;
        a = v;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(name).append("(");
        for (ArithmeticExpression v : a)
            res.append(v).append(", ");
        res.delete(res.length() - 2, res.length());
        res.append(")");
        return res.toString();
    }
}
