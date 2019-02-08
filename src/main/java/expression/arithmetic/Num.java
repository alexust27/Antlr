package main.java.expression.arithmetic;

public class Num implements ArithmeticExpression {
    private String name;

    public Num(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
