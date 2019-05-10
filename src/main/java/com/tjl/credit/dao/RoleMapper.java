package com.tjl.credit.dao;

import com.tjl.credit.domain.Role;
import com.tjl.credit.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    /*int insert(@Param("userId") int record) throws Exception;*/

    Role queryRole(int id)throws Exception;

    int createRole(Role record)throws Exception;

    int insertRole(Role role) throws Exception;

    List<Role> queryAllRole()throws Exception;

    int deleteRole(Role role)throws Exception;
}