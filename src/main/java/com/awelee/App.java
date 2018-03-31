package com.awelee;

import com.awelee.formula.FormulaParser;
import com.awelee.formula.Formula;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FormulaParser.getFormulaParserValue(new Formula(),"");
//        demoTest(new BigDecimal(20000),30,0.86/100,0.669/100,0.18/100,0.011/100);
    }

    public static void demoTest(BigDecimal loanAmount,int loanDays,double monthRate,double loanRate,double serviceRate,double afterLoanManageRate){
//        CalculatorDemo calculatorDemo = new CalculatorDemo();
//        Formula formula = new Formula();
//        formula.setLoanAmount(loanAmount);
//        formula.setLoanDays(loanDays);
//        formula.setLoanRate(monthRate);
//        BigDecimal bigDecimal1 = calculatorDemo.getScriptEngine(formula,FormulaEnum.YFJE);
//        formula.setLoanAmount(loanAmount);
//        formula.setLoanDays(loanDays);
//        formula.setLoanRate(loanRate);
//        BigDecimal bigDecimal2 = calculatorDemo.getScriptEngine(formula,FormulaEnum.JKLX);
//        formula.setLoanAmount(loanAmount);
//        formula.setLoanDays(loanDays);
//        formula.setLoanRate(serviceRate);
//        BigDecimal bigDecimal3 = calculatorDemo.getScriptEngine(formula,FormulaEnum.HGFWF);
//        formula.setLoanAmount(loanAmount);
//        formula.setLoanDays(loanDays);
//        formula.setLoanRate(afterLoanManageRate);
//        BigDecimal bigDecimal4 = calculatorDemo.getScriptEngine(formula,FormulaEnum.DHGLF);
//        formula.setHandleAmount(bigDecimal1);
//        formula.setLoanInterest(bigDecimal2);
//        formula.setServiceFee(bigDecimal3);
//        formula.setAfterLoanManageFee(bigDecimal4);
//        BigDecimal bigDecimal5 = calculatorDemo.getScriptEngine(formula,FormulaEnum.QTFY);
//        System.out.println("周期\t\t\t" +
//                "日期\t\t\t\t" +
//                "应付金额\t\t\t" +
//                "借款利息\t\t\t" +
//                "引荐/回购服务费\t\t\t" +
//                "贷后管理费\t\t\t" +
//                "其他费用\t\t\t\t\t\t" +
//                "本金\t\r");
//        System.out.println("第一期\t\t" +
//                "2018-03-27\t\t" +
//                Double.parseDouble(bigDecimal1.toString()) + "\t\t\t" +
//                Double.parseDouble(bigDecimal2.toString()) + "\t\t\t" +
//                Double.parseDouble(bigDecimal3.toString()) + "\t\t\t\t\t" +
//                Double.parseDouble(bigDecimal4.toString()) + "\t\t\t\t\t" +
//                Double.parseDouble(bigDecimal5.toString()) + "\t\t" +
//                Double.parseDouble(loanAmount.toString()) + "\t\r"
//        );
//        System.out.println("空\t\t\t" +
//                "借款到期日\t" +
//                "\t\t\t\t\t\t" +
//                "\t\t\t\t\t\t" +
//                "\t\t\t\t\t\t" +
//                "\t\t\t\t\t\t" +
//                "\t\t\t" +
//                "实际借款金额\t");
    }
}
