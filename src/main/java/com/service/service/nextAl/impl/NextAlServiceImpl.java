package com.service.service.nextAl.impl;

import com.service.mapper.NextAlMapper;
import com.service.service.nextAl.NextAlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tantao.dou  on  2018-08-07 13:29
 * @version 1.0
 * @desc
 **/
@Service
public class NextAlServiceImpl implements NextAlService {
    @Autowired
    private NextAlMapper nextAlMapper;
    @Override
    public Integer nextId() {
        return nextAlMapper.nextId();
    }
}