package com.service.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author tantao.dou  on  2018-08-07 13:27
 * @version 1.0
 * @desc 获取下一次中数据库id
 **/
@Mapper
public interface NextAlMapper {
    Integer nextId();
}