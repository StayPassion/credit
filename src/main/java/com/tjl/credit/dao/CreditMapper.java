package com.tjl.credit.dao;

import com.tjl.credit.domain.Credit;

import java.util.List;

public interface CreditMapper {


    int insertCredit(Credit credit) throws Exception;

    List<Credit> queryCredit(String college) throws Exception;
}