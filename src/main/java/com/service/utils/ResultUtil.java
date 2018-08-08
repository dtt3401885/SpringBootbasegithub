package com.service.utils;

import com.service.domain.Result;

/**
 * @author tantao.dou  on  2018-08-07 12:37
 * @version 1.0
 * @desc
 **/
public class ResultUtil {
    public static Result success(Object object){
        Result result=new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
    public static Result success(){
        return success(null);
    }
    public static Result error(Integer code,String msg){
        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}