package com.tjl.credit.service;

import com.tjl.credit.dao.*;
import com.tjl.credit.domain.*;
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
    @Resource
    private CollegeMapper collegeMapper;
    @Resource
    private ProfessionalMapper professionalMapper;
    @Resource
    private TclassMapper tclassMapper;

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
            return RetResponse.makeOKRsp("添加成功");
        }
        return RetResponse.makeErrRsp("添加失败");
    }

    public RetResult queryAllUser() throws Exception {

        List<User> userList = userMapper.queryAllUser();
        if (userList.size() >= 0) {
            return RetResponse.makeOKRsp("查询成功", userList);
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

    public RetResult insertRole(Role role) throws Exception {
       int flag = roleMapper.insertRole(role);
        if (flag == 1) {
            return RetResponse.makeOKRsp("角色插入成功");
        } else{
            return RetResponse.makeErrRsp("角色插入失败");

        }
    }

    public RetResult queryAllRole() throws Exception {
        List<Role> roleList = roleMapper.queryAllRole();
        if (roleList.size()>0){
            return RetResponse.makeOKRsp("查询成功",roleList);
        }else {
            return RetResponse.makeErrRsp("查询失败");
        }
    }

    public RetResult deleteRole(Role role) throws Exception {
        int flag = roleMapper.deleteRole(role);
        if (flag == 1) {
            return RetResponse.makeOKRsp("删除成功");
        } else{
            return RetResponse.makeErrRsp("删除失败");

        }
    }

    public RetResult createCollege(College college) {
        int flag = collegeMapper.insert(college);
        if (flag == 1) {
            return RetResponse.makeOKRsp("添加成功");
        } else{
            return RetResponse.makeErrRsp("添加失败");
        }
    }

    public RetResult createProfessional(Professional professional) {
        int flag = professionalMapper.insert(professional);
        if (flag == 1) {
            return RetResponse.makeOKRsp("添加成功");
        } else{
            return RetResponse.makeErrRsp("添加失败");
        }
    }

    public RetResult createTclass(Tclass tclass) {
        int flag = tclassMapper.insert(tclass);
        if (flag == 1) {
            return RetResponse.makeOKRsp("添加成功");
        } else{
            return RetResponse.makeErrRsp("添加失败");
        }
    }
}
