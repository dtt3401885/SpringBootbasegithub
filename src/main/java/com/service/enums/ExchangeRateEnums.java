package com.service.enums;

/**
 * @author tantao.dou  on  2018-08-08 13:07
 * @version 1.0
 * @desc 币种代码
 * AppKey1：4e53694b3e67f9bd0e64bc465560bb13
 * AppKey2：914660ffb8f36dc580fb8612971a7961
 **/
public enum  ExchangeRateEnums {
    CNY("人民币","CNY"),USD("美元","USD"),HKD("港币","HKD"),
    /*JPY("日元","JPY"),EUR("欧元","EUR"),GBP("英镑","GBP"),KRW("韩元","KRW"),
    AUD("澳大利亚元","AUD"),INR("印度卢比","INR"),TWD("新台币","TWD"),SGD("新加坡元","SGD"),
    CAD("加拿大元","CAD"),MOP("澳门元","MOP"),FRF("法国法郎","FRF"),RUB("卢布","RUB"),*/
;
    private String name;
    private String code;

    ExchangeRateEnums(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}