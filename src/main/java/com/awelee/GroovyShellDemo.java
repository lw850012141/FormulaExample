package com.awelee;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

/***
 *
 * @描述: GroovyShell实现.
 * @作者: Awelee.
 * @创建时间: 2018/3/25, 23:40 .
 * @版本: V1.0.
 *
 */
public class GroovyShellDemo {
    public static void main(String args[]) {

        Binding binding = new Binding();

        binding.setVariable("F",2.5);
        binding.setVariable("T",30);
        binding.setVariable("A",100);
        binding.setVariable("P0",100);

        binding.setVariable("language", "Groovy");

        GroovyShell shell = new GroovyShell(binding);

        Object F1 =shell.evaluate("P1=(1+0.1 * (F/100) * T)*P0; return P1 ");

        Object F2 =shell.evaluate("P1=P0*(0.055*0.20+1.0011)+A; return P1 ");

        System.out.println(F1);
        System.out.println(F2);

    }
}
