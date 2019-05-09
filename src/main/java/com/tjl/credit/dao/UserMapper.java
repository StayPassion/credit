package com.tjl.credit.dao;

import com.tjl.credit.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    User userLogin(User user) throws Exception;

    int queryId(User user) throws Exception;

    int queryNum(User user) throws Exception;

    List<User> queryAllUser(@Param("offset") Integer offset, @Param("pageSize") Integer pageSize) throws Exception;

    int queryUserByNumber(User user);

    int queryCount()throws Exception;
}