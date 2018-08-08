package com.service.service.testUser.impl;

import com.service.domain.TestUser;
import com.service.mapper.TestUserMapper;
import com.service.service.testUser.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tantao.dou  on  2018-08-07 12:46
 * @version 1.0
 * @desc
 **/
@Service
public class TestUserServiceImpl implements TestUserService {
    @Autowired
    private TestUserMapper testUserMapper;
    @Override
    public TestUser getUserById(Integer id) {
        return testUserMapper.getUserById(id);
    }

    @Override
    public List<TestUser> getUserList() {
        return testUserMapper.getUserList();
    }

    @Override
    public int add(TestUser user) {
        return testUserMapper.add(user);
    }

    @Override
    public int update(Integer id, TestUser user) {
        return testUserMapper.update(id,user);
    }

    @Override
    public int delete(Integer id) {
        return testUserMapper.delete(id);

    }
}