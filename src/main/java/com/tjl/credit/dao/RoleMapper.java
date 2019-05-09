package com.tjl.credit.dao;

import com.tjl.credit.domain.Role;
import com.tjl.credit.domain.User;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    int insert(@Param("userId") int record) throws Exception;

    Role queryRole(int id)throws Exception;

    int createRole(Role record)throws Exception;
}