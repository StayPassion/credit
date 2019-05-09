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
import java.util.List;
import java.util.Map;

/**
 * @Author PengBo
 * @CreateTime 2019/5/7 22:54
 * @Version 1.0.0
 */
@Service
public class AdminService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private RoleMapper roleMapper;

    public RetResult queryUserByNumber(User user) throws Exception {
        int flag = userMapper.queryUserByNumber(user);
        if (flag == 1) {
            return RetResponse.makeOKRsp("学号已经存在");
        } else if (flag == 0) {
            return RetResponse.makeOKRsp("学号可用");
        }
        return RetResponse.makeErrRsp("出现错误");
    }

    public RetResult createUser(User user) throws Exception {
        int flag = userMapper.insertSelective(user);
        if (flag == 1) {
            int userNum = userMapper.queryNum(user);
            roleMapper.insert(userNum);
            return RetResponse.makeOKRsp("添加成功");
        }
        return RetResponse.makeErrRsp("添加失败");
    }

    public RetResult queryAllUser(Integer offset, Integer pageSize) throws Exception {
        Map<String, Object> map = new HashMap<>();
        List<User> userList = userMapper.queryAllUser(offset, pageSize);
        map.put("userList", userList);
        int count = userMapper.queryCount();
        map.put("count", count);
        if (count >= 0) {
            return RetResponse.makeOKRsp("查询成功", map);
        } else {
            return RetResponse.makeErrRsp("查询失败");
        }
    }

    public RetResult createRole(Role role) throws Exception {
        int flag = roleMapper.createRole(role);
        if (flag > 0) {
            return RetResponse.makeOKRsp("权限修改成功");
        } else if (flag == 0){
            return RetResponse.makeOKRsp("权限没有任何修改");
        }
        return RetResponse.makeErrRsp("权限修改失败");
    }
}
