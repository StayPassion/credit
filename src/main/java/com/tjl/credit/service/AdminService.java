package com.tjl.credit.service;

import com.tjl.credit.dao.RoleMapper;
import com.tjl.credit.dao.UserMapper;
import com.tjl.credit.domain.User;
import com.tjl.credit.utils.RetResponse;
import com.tjl.credit.utils.RetResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

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

    public RetResult createUser(User user) throws Exception {
        int flag = userMapper.insertSelective(user);
        if (flag == 1) {
            int userNum = userMapper.queryNum(user);
            roleMapper.insert(userNum);
            return RetResponse.makeOKRsp("添加成功");
        }
        return RetResponse.makeErrRsp("添加失败");
    }

    public RetResult queryAllUser() throws Exception {
        List<User> userList = userMapper.queryAllUser();
        if (userList.size() > 0){
            return RetResponse.makeOKRsp("查询成功",userList);
        }else {
            return RetResponse.makeErrRsp("查询失败");
        }
    }
}