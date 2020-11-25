package Interpreter;

import java.util.HashMap;

public class VarExpression extends Expression {

    // key=a,key=b,key=c
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    // var 就是{a=10, b=20}
    // interpreter 根据 变量名称，返回对应值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
