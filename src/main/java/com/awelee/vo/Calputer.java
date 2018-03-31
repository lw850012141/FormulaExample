package com.awelee.vo;

import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
import java.util.Date;

/***
 *
 * @描述: 计算器.
 * @作者: Awelee.
 * @创建时间: 2018/3/31, 11:26 .
 * @版本: V1.0.
 *
 */
public class Calputer implements Serializable {

    //===================计算器传入参数===========================
    //公司名称
    private String compId;
    private String compName;
    //业务名称
    private String productCode;
    //缴费方式
    private String paytypeCode;
    //还款日计算规则
    private String repaymentDaysCalculationRules;
    //借款金额
    private String amount;
    //借款期限
    private int loanDays;
    //起息日
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date valueDate;
    //月利率
    private String monthRate;
    //借款利率
    private String loanRate;
    //回购服务费率（天津、上海）
    private String buyBackRate;
    //引荐服务费率（北京）
    private String recommendRate;
    //贷后管理费率（北京）
    private String postLoanRate;
    //其它费率（北京）
    private String otherRate;
    //咨询服务费率（天津）
    private String advisoryServiceRate;
    //服务费率（上海）
    private String serviceRate;
    //归算规则-借款（北京、天津、上海）
    private String calculationRulesJK;
    //归算规则-回购（北京、天津、上海）
    private String calculationRulesHG;
    //归算规则-贷后（北京）
    private String calculationRulesDH;
    //归算规则-其它（北京）
    private String calculationRulesQT;
    //一次性收取-借款（北京、天津、上海）
    private String oneTimeChargeJK;
    //一次性收取-回购（北京、天津、上海）
    private String oneTimeChargeHG;
    //一次性收取-贷后（北京）
    private String oneTimeChargeDH;
    //一次性收取-其它（北京）
    private String oneTimeChargeQT;
    //===================计算器计算结果===========================
    //到期日
    private  String dueDate;
    //还款总额
    private String repaymentAmount;
    //归还本金
    private String principal;
    //收费总额
    private String chargeAmount;
    //借款利息
    private String loanAmount;
    //回购服务费（天津、上海）
    private String buyBackAmount;
    //引荐服务费（北京）
    private String recommendAmount;
    //贷后管理费（北京）
    private String postLoanAmount;
    //其他费用（北京）
    private String otherAmount;
    //期数
    private int period;

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getPaytypeCode() {
        return paytypeCode;
    }

    public void setPaytypeCode(String paytypeCode) {
        this.paytypeCode = paytypeCode;
    }

    public String getRepaymentDaysCalculationRules() {
        return repaymentDaysCalculationRules;
    }

    public void setRepaymentDaysCalculationRules(String repaymentDaysCalculationRules) {
        this.repaymentDaysCalculationRules = repaymentDaysCalculationRules;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getLoanDays() {
        return loanDays;
    }

    public void setLoanDays(int loanDays) {
        this.loanDays = loanDays;
    }

    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    public String getMonthRate() {
        return monthRate;
    }

    public void setMonthRate(String monthRate) {
        this.monthRate = monthRate;
    }

    public String getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(String loanRate) {
        this.loanRate = loanRate;
    }

    public String getBuyBackRate() {
        return buyBackRate;
    }

    public void setBuyBackRate(String buyBackRate) {
        this.buyBackRate = buyBackRate;
    }

    public String getRecommendRate() {
        return recommendRate;
    }

    public void setRecommendRate(String recommendRate) {
        this.recommendRate = recommendRate;
    }

    public String getPostLoanRate() {
        return postLoanRate;
    }

    public void setPostLoanRate(String postLoanRate) {
        this.postLoanRate = postLoanRate;
    }

    public String getOtherRate() {
        return otherRate;
    }

    public void setOtherRate(String otherRate) {
        this.otherRate = otherRate;
    }

    public String getAdvisoryServiceRate() {
        return advisoryServiceRate;
    }

    public void setAdvisoryServiceRate(String advisoryServiceRate) {
        this.advisoryServiceRate = advisoryServiceRate;
    }

    public String getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(String serviceRate) {
        this.serviceRate = serviceRate;
    }

    public String getCalculationRulesJK() {
        return calculationRulesJK;
    }

    public void setCalculationRulesJK(String calculationRulesJK) {
        this.calculationRulesJK = calculationRulesJK;
    }

    public String getCalculationRulesHG() {
        return calculationRulesHG;
    }

    public void setCalculationRulesHG(String calculationRulesHG) {
        this.calculationRulesHG = calculationRulesHG;
    }

    public String getCalculationRulesDH() {
        return calculationRulesDH;
    }

    public void setCalculationRulesDH(String calculationRulesDH) {
        this.calculationRulesDH = calculationRulesDH;
    }

    public String getCalculationRulesQT() {
        return calculationRulesQT;
    }

    public void setCalculationRulesQT(String calculationRulesQT) {
        this.calculationRulesQT = calculationRulesQT;
    }

    public String getOneTimeChargeJK() {
        return oneTimeChargeJK;
    }

    public void setOneTimeChargeJK(String oneTimeChargeJK) {
        this.oneTimeChargeJK = oneTimeChargeJK;
    }

    public String getOneTimeChargeHG() {
        return oneTimeChargeHG;
    }

    public void setOneTimeChargeHG(String oneTimeChargeHG) {
        this.oneTimeChargeHG = oneTimeChargeHG;
    }

    public String getOneTimeChargeDH() {
        return oneTimeChargeDH;
    }

    public void setOneTimeChargeDH(String oneTimeChargeDH) {
        this.oneTimeChargeDH = oneTimeChargeDH;
    }

    public String getOneTimeChargeQT() {
        return oneTimeChargeQT;
    }

    public void setOneTimeChargeQT(String oneTimeChargeQT) {
        this.oneTimeChargeQT = oneTimeChargeQT;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getRepaymentAmount() {
        return repaymentAmount;
    }

    public void setRepaymentAmount(String repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(String chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getBuyBackAmount() {
        return buyBackAmount;
    }

    public void setBuyBackAmount(String buyBackAmount) {
        this.buyBackAmount = buyBackAmount;
    }

    public String getRecommendAmount() {
        return recommendAmount;
    }

    public void setRecommendAmount(String recommendAmount) {
        this.recommendAmount = recommendAmount;
    }

    public String getPostLoanAmount() {
        return postLoanAmount;
    }

    public void setPostLoanAmount(String postLoanAmount) {
        this.postLoanAmount = postLoanAmount;
    }

    public String getOtherAmount() {
        return otherAmount;
    }

    public void setOtherAmount(String otherAmount) {
        this.otherAmount = otherAmount;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
