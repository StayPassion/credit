package com.tjl.credit.dao;

import com.tjl.credit.domain.College;

import java.util.List;

public interface CollegeMapper {
    int insert(College record);

    int insertSelective(College record);

    List<College> queryAllCollege() throws Exception;
}