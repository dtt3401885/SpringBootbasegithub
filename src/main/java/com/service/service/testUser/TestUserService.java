package com.service.service.testUser;

import com.service.domain.TestUser;

import java.util.List;

/**
 * @author tantao.dou  on  2018-08-07 12:45
 * @version 1.0
 * @desc
 **/
public interface TestUserService {
    TestUser getUserById(Integer id);

    public List<TestUser> getUserList();

    public int add(TestUser user);

    public int update(Integer id, TestUser user);

    public int delete(Integer id);
}