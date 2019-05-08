package com.tjl.credit.dao;

import com.tjl.credit.domain.Notice;

public interface NoticeMapper {
    int insert(Notice record);

    int insertSelective(Notice record);
}