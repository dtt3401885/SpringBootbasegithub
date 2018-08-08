package com.service.scheduling;

import com.service.controller.ExchangeRateController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;

/**
 * @author tantao.dou  on  2018-08-07 14:00
 * @version 1.0
 * @desc 定时任务入口
 **/
@Configuration
@EnableScheduling
public class SchedulingConfig {
    @Autowired
    ExchangeRateController exchangeRateController;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Scheduled(cron = "0 0/10 * * * ?") // 每10分钟执行一次
    public void getToken() {
        logger.info("getToken定时任务启动");
    }

    @Scheduled(cron = "0 0 12 * * ?") // 每10分钟执行一次
    public void getExchangeRate(){
        logger.warn("获取汇率定时任务开始");
        exchangeRateController.findExchangeRate();
    }
}