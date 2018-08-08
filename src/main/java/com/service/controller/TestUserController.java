package com.service.controller;

import com.service.domain.Result;
import com.service.domain.TestUser;
import com.service.properties.EmailInformationProperties;
import com.service.repository.TestUserRepository;
import com.service.service.nextAl.NextAlService;
import com.service.service.testUser.TestUserService;
import com.service.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author tantao.dou  on  2018-08-07 12:43
 * @version 1.0
 * @desc
 **/
@RestController
public class TestUserController {
    @Autowired
    private TestUserRepository testUserRepository;
    @Autowired
    private TestUserService testUserService;
    @Autowired
    private NextAlService nextAlService;
    @Autowired
    private EmailInformationProperties emailInformationProperties;
    @Autowired
    Test1Controller test1Controller;

    @GetMapping(value = "/getUser/{id}")
    public Result<TestUser> getUserById(@PathVariable("id") Integer id){
        System.out.println(emailInformationProperties.getAlitofoxconn());
        TestUser testUser=new TestUser();
        testUser.setId(nextAlService.nextId());
        testUser.setAge(18);
        testUser.setCtm(new Date());
        testUser.setUsername("asiacom");
        testUserService.add(testUser);

        test1Controller.test1();
        return ResultUtil.success(testUserService.getUserById(id));

    }
    @PostMapping(value = "getUserByValue")
    public Result<TestUser> getUserByValue(@RequestParam("username") String username,
                                           @RequestParam("id") Integer id,
                                           @RequestParam("age") Integer age){
        TestUser testUser = testUserRepository.getOne(id);
        System.out.println("1111:"+testUser);
        List<TestUser> testUser1=testUserRepository.findByAge(age);
        System.out.println("2222:"+testUser1);
        List<TestUser> testUserList=testUserRepository.findAllByUsername(username);
        System.out.println("4444:"+testUserList);
        TestUser testUser3=testUserRepository.findByUsernameAndAge(username, age);
        System.out.println("5555:"+testUser3);
        return ResultUtil.success(testUser);

    }
}