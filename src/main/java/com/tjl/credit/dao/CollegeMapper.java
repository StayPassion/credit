package com.tjl.credit.dao;

import com.tjl.credit.domain.College;
import com.tjl.credit.domain.Professional;

import java.util.List;

public interface CollegeMapper {
    int insert(College record);

    int insertSelective(College record);

    List<College> queryAllCollege() throws Exception;

    List<Professional> queryProfessional(Professional professional)throws Exception;

}