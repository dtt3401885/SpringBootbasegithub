package com.service.controller;

import com.service.properties.EmailInformationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tantao.dou  on  2018-08-07 18:10
 * @version 1.0
 * @desc
 **/
@RestController
public class Test1Controller {
    @Autowired
    private EmailInformationProperties emailInformationProperties;

    public String test1(){
        System.out.println(emailInformationProperties.getAlitofoxconn());
        return "";
    }
}