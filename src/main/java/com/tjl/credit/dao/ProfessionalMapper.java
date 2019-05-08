package com.tjl.credit.dao;

import com.tjl.credit.domain.Professional;

public interface ProfessionalMapper {
    int insert(Professional record);

    int insertSelective(Professional record);
}