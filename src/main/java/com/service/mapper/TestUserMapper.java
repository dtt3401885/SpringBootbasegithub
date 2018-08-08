package com.service.mapper;

import com.service.domain.TestUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author tantao.dou  on  2018-08-07 11:37
 * @version 1.0
 * @desc
 **/
@Mapper
public interface TestUserMapper {
    TestUser getUserById(Integer id);

    public List<TestUser> getUserList();

    public int add(TestUser user);

    public int update(@Param("id") Integer id, @Param("user") TestUser user);

    public int delete(Integer id);
}