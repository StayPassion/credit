package com.tjl.credit.dao;

import com.tjl.credit.domain.Notice;

import java.util.List;

public interface NoticeMapper {
    int insert(Notice record);

    int insertSelective(Notice record);

    List<Notice> lookNotice()throws Exception;

    Notice queryById(Integer id)throws Exception;
}