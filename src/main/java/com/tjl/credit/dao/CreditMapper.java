package com.tjl.credit.dao;

import com.tjl.credit.domain.Credit;

public interface CreditMapper {
    int insert(Credit record);

    int insertSelective(Credit record);
}