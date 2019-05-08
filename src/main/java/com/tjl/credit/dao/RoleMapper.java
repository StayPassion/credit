package com.tjl.credit.dao;

import com.tjl.credit.domain.Role;
import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    int insert(@Param("userId") int record);

    Role queryRole(@Param("userId") int id)throws Exception;
}