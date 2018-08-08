package com.service.enums;

/**
 * @author tantao.dou  on  2018-08-07 12:40
 * @version 1.0
 * @desc
 **/
public enum  ResultEnums {
    UNKNOW_ERROR(-1,"未知错误"),
    SUCCES(0,"成功"),
    ;
    private Integer code;
    private String msg;

    ResultEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}