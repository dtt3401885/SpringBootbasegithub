package com.service.repository;

import com.service.domain.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author tantao.dou  on  2018-08-08 10:39
 * @version 1.0
 * @desc hibernate
 **/
public interface TestUserRepository extends JpaRepository<TestUser,Integer> {

    public List<TestUser> findByAge(Integer age);


    public List<TestUser> findAllByUsername(String username);

    public TestUser findByUsernameAndAge(String username,Integer age);

}