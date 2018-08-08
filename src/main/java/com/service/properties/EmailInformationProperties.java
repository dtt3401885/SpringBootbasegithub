package com.service.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author tantao.dou  on  2018-08-07 11:40
 * @version 1.0
 * @desc
 **/
@Component
@ConfigurationProperties(prefix = "emailinformation")
public class EmailInformationProperties {
    private String alitoinventec;
    private String alitofoxconn;
    private String tencenettoasiacom;
    public String getAlitoinventec() {
        return alitoinventec;
    }

    public void setAlitoinventec(String alitoinventec) {
        this.alitoinventec = alitoinventec;
    }

    public String getAlitofoxconn() {
        return alitofoxconn;
    }

    public void setAlitofoxconn(String alitofoxconn) {
        this.alitofoxconn = alitofoxconn;
    }

    public String getTencenettoasiacom() {
        return tencenettoasiacom;
    }

    public void setTencenettoasiacom(String tencenettoasiacom) {
        this.tencenettoasiacom = tencenettoasiacom;
    }
}