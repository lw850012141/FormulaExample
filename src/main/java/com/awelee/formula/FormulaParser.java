package com.awelee.formula;

import javax.script.*;
import java.math.BigDecimal;

/***
 *
 * @描述: 公式解析器.
 * @作者: Awelee.
 * @创建时间: 2018/3/31, 11:55 .
 * @版本: V1.0.
 *
 */
public class FormulaParser {

    public static BigDecimal getFormulaParserValue(Formula formula,String jsFunction) {
        BigDecimal res = new BigDecimal(0);
        try {
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
            Compilable compilable = (Compilable) engine;
            Bindings bindings = engine.createBindings(); //Local级别的Binding
            CompiledScript JSFunction = compilable.compile(jsFunction); //解析编译脚本函数
            bindings.put("A", formula.getA());
            bindings.put("B", formula.getB());
            bindings.put("C", formula.getC());
            bindings.put("D", formula.getD());
            bindings.put("E", formula.getE());
            bindings.put("F", formula.getF());
            bindings.put("G", formula.getG());
            bindings.put("H", formula.getH());
            bindings.put("I", formula.getI());
            bindings.put("J", formula.getJ());
            bindings.put("K", formula.getK());
            bindings.put("L", formula.getL());
            bindings.put("M", formula.getM());
            bindings.put("N", formula.getN());
            bindings.put("O", formula.getO());
            bindings.put("P", formula.getP());
            bindings.put("Q", formula.getQ());
            bindings.put("R", formula.getR());
            bindings.put("S", formula.getS());
            bindings.put("T", formula.getT());
            bindings.put("U", formula.getU());
            bindings.put("V", formula.getV());
            bindings.put("W", formula.getW());
            bindings.put("X", formula.getX());
            bindings.put("Y", formula.getY());
            bindings.put("Z", formula.getZ());
            Object result = JSFunction.eval(bindings);
            res = new BigDecimal(((Number)result).doubleValue());
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return res;
    }
}
