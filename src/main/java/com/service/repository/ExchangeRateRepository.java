package com.service.repository;

import com.service.domain.ExchangeRate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author tantao.dou  on  2018-08-08 10:39
 * @version 1.0
 * @desc hibernate
 **/
public interface ExchangeRateRepository extends JpaRepository<ExchangeRate,Integer> {



}