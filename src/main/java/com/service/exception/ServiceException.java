package com.service.exception;

import com.service.enums.ResultEnums;

/**
 * @author tantao.dou  on  2018-08-07 12:38
 * @version 1.0
 * @desc自定义异常
 **/
public class ServiceException extends RuntimeException {
    private Integer code;
    public Integer getCode() {
        return code;
    }
    /**
     * Constructs a new runtime exception with {@code null} as its
     * detail message.  The cause is not initialized, and may subsequently be
     * initialized by a call to {@link #initCause}.
     */
    public ServiceException(ResultEnums resultEnums) {
        super(resultEnums.getMsg());
        this.code = resultEnums.getCode();
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}