package com.tjl.credit.dao;

import com.tjl.credit.domain.Check;

public interface CheckMapper {
    int insert(Check check);

    int insertSelective(Check record);
}