package main.java.expression;

import main.java.expression.arithmetic.ArithmeticExpression;
import main.java.expression.logical.LogicExpression;

import java.util.*;


public class Function {
    private String name;
    private Map<LogicExpression, ArithmeticExpression> conds = new HashMap<>();
    private List<Var> vars = new ArrayList<>();
    private List<String> types = new ArrayList<>();

    private void remakeTypes() {
        for (int i = 0; i < types.size(); ++i) {
            switch (types.get(i)) {
                case "Integer":
                    types.set(i, "int");
                    break;
                case "Boolean":
                    types.set(i, "bool");
                    break;
                case "Char":
                    types.set(i, "char");
                    break;
                case "String":
                    types.set(i, "string");
                    break;
            }
        }
    }

    class Var {

        public String name;
        public String type;
        public String data;

        Var(String n, String t, String d) {
            name = n;
            type = t;
            data = d;
        }

    }

    public String returnType;
    public ArithmeticExpression lastAction = null;

    public Map<LogicExpression, ArithmeticExpression> getMap() {
        return conds;
    }

    public Function(String name) {
        this.name = name;
        returnType = "val";
    }

    public Function(String name, List<String> tp) {
        this.name = name;
        types.addAll(tp);
        returnType = types.get(types.size() - 1);
        types.remove(types.size() - 1);
    }

    public void addVars(List<String> vars) {
        for (String var : vars) {
            Var v;
            if (Character.isDigit(var.charAt(0)) || var.charAt(0) == '-') {
                v = new Var("", "int", var);
            } else if (var.equals("true") || var.equals("false")) {
                v = new Var("", "boolean", var);
            } else {
                v = new Var(var, "", "");
            }
            this.vars.add(v);
        }
    }

    public void addTypes(List<String> tp) {
        types.addAll(tp);
        remakeTypes();
        returnType = types.get(types.size() - 1);
        types.remove(types.size() - 1);
    }

    public String getName() {
        return name;
    }

    public List<String> getTypes() {
        return types;
    }

    public List<Var> getVars() {
        return vars;
    }

    public void addFunc(LogicExpression le, ArithmeticExpression a) {
        if (le == null) {
            lastAction = a;
//            System.out.println(name);
        } else {
            conds.put(le, a);
        }
    }

}
