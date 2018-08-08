package com.service.domain;

import net.sf.json.JSONObject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author tantao.dou  on  2018-08-08 11:42
 * @version 1.0
 * @desc 汇率
 **/
@Entity
public class ExchangeRate {
    @Id
    @GeneratedValue
    private int id;
    /*	转换汇率前的货币代码*/
    private String currencyF;
    /*转换汇率前的货币代码名词*/
    private String  currencyF_Name;
    /*转换汇率成的货币代码*/
    private String currencyT;
    /*转换汇率成的货币代码名词*/
    private String currencyT_Name;
    /*转换汇率前的货币代码数量*/
    private Double currencyFD;
    /*转换汇率前的货币数量*/
    private Double exchange;
    /*转换汇率前的货币最终数量*/
    private Double result;
    /*日期*/
    private Date updateTime;

    public ExchangeRate() {
    }

    public ExchangeRate(String currencyF, String currencyF_Name, String currencyT, String currencyT_Name, Double currencyFD, Double exchange, Double result, Date updateTime) {
        this.currencyF = currencyF;
        this.currencyF_Name = currencyF_Name;
        this.currencyT = currencyT;
        this.currencyT_Name = currencyT_Name;
        this.currencyFD = currencyFD;
        this.exchange = exchange;
        this.result = result;
        this.updateTime = updateTime;
    }
    public ExchangeRate(JSONObject o) {
        this.currencyF = o.getString("currencyF");
        this.currencyF_Name = o.getString("currencyF_Name");
        this.currencyT = o.getString("currencyT");
        this.currencyT_Name = o.getString("currencyT_Name");
        this.currencyFD = Double.valueOf(o.getString("currencyFD"));
        this.exchange = Double.valueOf(o.getString("exchange"));
        this.result = Double.valueOf(o.getString("result"));
        this.updateTime = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrencyF() {
        return currencyF;
    }

    public void setCurrencyF(String currencyF) {
        this.currencyF = currencyF;
    }

    public String getCurrencyF_Name() {
        return currencyF_Name;
    }

    public void setCurrencyF_Name(String currencyF_Name) {
        this.currencyF_Name = currencyF_Name;
    }

    public String getCurrencyT() {
        return currencyT;
    }

    public void setCurrencyT(String currencyT) {
        this.currencyT = currencyT;
    }

    public String getCurrencyT_Name() {
        return currencyT_Name;
    }

    public void setCurrencyT_Name(String currencyT_Name) {
        this.currencyT_Name = currencyT_Name;
    }

    public Double getCurrencyFD() {
        return currencyFD;
    }

    public void setCurrencyFD(Double currencyFD) {
        this.currencyFD = currencyFD;
    }

    public Double getExchange() {
        return exchange;
    }

    public void setExchange(Double exchange) {
        this.exchange = exchange;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ExchangeRate{" +
                "id=" + id +
                ", currencyF='" + currencyF + '\'' +
                ", currencyF_Name='" + currencyF_Name + '\'' +
                ", currencyT='" + currencyT + '\'' +
                ", currencyT_Name='" + currencyT_Name + '\'' +
                ", currencyFD=" + currencyFD +
                ", exchange=" + exchange +
                ", result=" + result +
                ", updateTime=" + updateTime +
                '}';
    }
}