package com.service.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author tantao.dou  on  2018-08-07 11:34
 * @version 1.0
 * @desc
 **/
@Entity //自动创建数据库表 慎重使用
public class TestUser {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private int age;
    private Date ctm;

    public TestUser() {
    }

    public TestUser(String username, int age) {
        this.username = username;
        this.age = age;
        this.ctm = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCtm() {
        return ctm;
    }

    public void setCtm(Date ctm) {
        this.ctm = ctm;
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", ctm=" + ctm +
                '}';
    }
}