package com.tjl.credit.service;

import com.tjl.credit.dao.RoleMapper;
import com.tjl.credit.dao.UserMapper;
import com.tjl.credit.domain.Role;
import com.tjl.credit.domain.User;
import com.tjl.credit.utils.RetResponse;
import com.tjl.credit.utils.RetResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author PengBo
 * @CreateTime 2019/5/7 21:10
 * @Version 1.0.0
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;

    public RetResult userLogin(User user) throws Exception {
        Map<String, Object> map = new HashMap<>();
        User userInfo = userMapper.userLogin(user);
        map.put("userInfo", userInfo);

        if (userInfo != null) {
            Role role = roleMapper.queryRole(userInfo.getPermission());
            map.put("userRole", role);
            return RetResponse.makeOKRsp("登录成功", map);
        }
        return RetResponse.makeOKRsp("用户名或密码错误");
    }
}
