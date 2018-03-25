package com.awelee;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.Compilable;
import javax.script.Bindings;
import javax.script.CompiledScript;
import javax.script.ScriptException;

/***
 *
 * @描述: ScriptEngine实现.
 * @作者: Awelee.
 * @创建时间: 2018/3/25, 23:41 .
 * @版本: V1.0.
 *
 */
public class ScriptEngineDemo {
    public static void main(String args[]) {

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
        Compilable compilable = (Compilable) engine;
        Bindings bindings = engine.createBindings(); //Local级别的Binding
        String script = "(1+0.1 * (F/100) * T)*P0"; //定义函数并调用
        CompiledScript JSFunction = null; //解析编译脚本函数
        try {
            JSFunction = compilable.compile(script);
            bindings.put("F", 2.5);
            bindings.put("T", 30);
            bindings.put("A", 100);
            bindings.put("P0", 100);
            Object result = JSFunction.eval(bindings);
            System.out.println(result); //调用缓存着的脚本函数对象，Bindings作为参数容器传入
        } catch (ScriptException e) {
            e.printStackTrace();
        }


    }
}
