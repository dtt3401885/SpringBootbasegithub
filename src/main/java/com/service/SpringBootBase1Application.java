package com.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.service.mapper")
public class SpringBootBase1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBase1Application.class, args);
	}
}
