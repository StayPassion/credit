package com.tjl.credit.dao;

import com.tjl.credit.domain.Tclass;

public interface TclassMapper {
    int insert(Tclass record);

    int insertSelective(Tclass record);
}