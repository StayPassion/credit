package com.tjl.credit.dao;

import com.tjl.credit.domain.College;

public interface CollegeMapper {
    int insert(College record);

    int insertSelective(College record);
}