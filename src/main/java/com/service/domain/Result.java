package com.service.domain;

/**
 * @author tantao.dou  on  2018-08-07 12:36
 * @version 1.0
 * @desc
 **/
public class Result<T> {
    /** 返回标识码 **/
    private Integer code;
    /**返回信息。 **/
    private String msg;
    /**具体内容。 **/
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}