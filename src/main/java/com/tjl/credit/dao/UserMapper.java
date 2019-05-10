package com.tjl.credit.dao;

import com.tjl.credit.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    User userLogin(User user) throws Exception;

    int queryId(User user) throws Exception;

    /*int queryNum(User user) throws Exception;*/

    List<User> queryAllUser() throws Exception;

    int queryUserByNumber(User user)throws Exception;

    int queryCount()throws Exception;

    int updateUser(User record)throws Exception;
    int deleteUser(User user)throws Exception;
}