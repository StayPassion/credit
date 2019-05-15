package com.tjl.credit.dao;

import com.tjl.credit.domain.Tclass;

import java.util.List;

public interface TclassMapper {
     List<Tclass> queryTclass(Tclass tclass)throws Exception ;

    int insert(Tclass record);

    int insertSelective(Tclass record);

    Tclass queryOnlyTclass(Tclass tclass) throws Exception;

    void deleteTclass(Tclass tclass)throws Exception;
}