package com.tjl.credit.dao;

import com.tjl.credit.domain.Professional;

import java.util.List;

public interface ProfessionalMapper {
    int insert(Professional record);

    int insertSelective(Professional record);

    List<Professional> queryProfessional(Professional professional) throws Exception;

    void deleteProfessional(Professional professional) throws Exception ;
}