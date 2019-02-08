package main.java.expression;

import main.java.expression.logical.LogicExpression;

import java.util.*;

public class FProgram {
    private List<Function> functions;

    public FProgram(List<Function> f) {
        functions = f;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        boolean[] used = new boolean[functions.size()];
        for (int i = 0; i < functions.size(); i++) {
            used[i] = false;
        }

        try {
            res.append("#include <iostream>").append(System.lineSeparator())
                    .append("#include <string>").append(System.lineSeparator())
                    .append(System.lineSeparator())
                    .append("using namespace std;").append(System.lineSeparator())
                    .append(System.lineSeparator());
            for (int i = 0; i < functions.size(); i++) {
                Function curF = functions.get(i);
                String[] curVars = new String[curF.getTypes().size()];
                if (!used[i]) {
                    used[i] = true;
                    List<Integer> idSameFun = new ArrayList<>();
                    for (int j = i + 1; j < functions.size(); j++) {
                        Function ff = functions.get(j);
                        if (ff.getName().equals(curF.getName())) {
                            idSameFun.add(j);
                            used[j] = true;
                            for (int k = 0; k < ff.getVars().size(); k++) {
                                ff.getVars().get(k).type = curF.getTypes().get(k);
                                if (!ff.getVars().get(k).name.isEmpty())
                                    curVars[k] = ff.getVars().get(k).name;
                            }
                        }
                    }

                    res.append(curF.returnType).append(" ").append(curF.getName());
                    if (curF.getTypes().isEmpty()) {
                        res.append(" = ").append(functions.get(idSameFun.get(idSameFun.size() - 1)).lastAction)
                                .append(";").append(System.lineSeparator()).append(System.lineSeparator());
                        continue;
                        // int x = 12;
                    }

                    res.append("(");
                    for (int j = 0; j < curF.getTypes().size(); j++) {
                        res.append(curF.getTypes().get(j))
                                .append(" ").append(curVars[j]).append(", ");
                    }
                    res.delete(res.length() - 2, res.length());
                    res.append(") {").append(System.lineSeparator());
                    //integer fun(integer a, string s) {

                    String lastStr = "";
                    for (Integer id : idSameFun) {
                        Function same = functions.get(id);
                        StringBuilder ifVars = new StringBuilder();
                        ifVars.append("    if (");
                        for (int v = 0; v < same.getVars().size(); v++) {
                            if (same.getVars().get(v).name.isEmpty()) {
                                ifVars.append(curVars[v]).append(" == ")
                                        .append(same.getVars().get(v).data)
                                        .append(" && ");
                            }
                        }//if (a == 2 && b == 3 &&

                        Set<LogicExpression> logicSet = same.getMap().keySet();
                        for (LogicExpression le : logicSet) {
                            res.append(ifVars.toString()).append(le.toString()).append(") {").append(System.lineSeparator())
                                    .append("       return ").append(same.getMap().get(le).toString())
                                    .append(";").append(System.lineSeparator()).append("    }")
                                    .append(System.lineSeparator());
                        }
                        if (same.lastAction != null) { //logicSet - empty
                            if (ifVars.toString().endsWith("(")) {
                                lastStr = "    return " + same.lastAction.toString() + ";" + System.lineSeparator();
                            } else {
                                ifVars.delete(ifVars.length() - 4, ifVars.length());
                                res.append(ifVars).append(") return ").append(same.lastAction)
                                        .append(";").append(System.lineSeparator());
                            }
                        }
                    }
                    res.append(lastStr).append("}").append(System.lineSeparator()).append(System.lineSeparator());
                }
            }
            res.append("int main(){}");
        } catch (Exception e) {
            return e.getMessage();
        }

        return res.toString();
    }
}
