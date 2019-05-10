package com.tjl.credit.controller;

import com.alibaba.fastjson.JSONObject;
import com.tjl.credit.domain.Role;
import com.tjl.credit.domain.User;
import com.tjl.credit.service.AdminService;
import com.tjl.credit.utils.RetResponse;
import com.tjl.credit.utils.RetResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author PengBo
 * @CreateTime 2019/5/7 22:53
 * @Version 1.0.0
 */
@RestController
public class AdminController {
    @Resource
    private AdminService adminService;

    /**
     * 判断用户学号是否存在
     * @param user
     * @return
     */
    @PostMapping("/queryUserByNumber")
    public RetResult queryUserByNumber(@RequestBody User user){
        try {
            RetResult retResult = adminService.queryUserByNumber(user);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }
    /**
     * 创建角色
     * @param role
     * @return
     */
    @PostMapping("/insertRole")
    public RetResult insertRole(@RequestBody Role role){
        try {
            RetResult retResult = adminService.insertRole(role);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 创建用户
     * @param user
     * @return
     */
    @PostMapping("/creatUser")
    public RetResult createUser(@RequestBody User user){
        try {
            RetResult retResult = adminService.createUser(user);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 查询所有用户
     * @return
     */
    @PostMapping("/queryAllUser")
    public RetResult queryAllUser(){

        try {
            RetResult retResult = adminService.queryAllUser();
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 分配权限
     * @param jsonObject
     * @return
     */
    @PostMapping("/createRole")
    public RetResult createRole(@RequestBody JSONObject jsonObject){
        Role role = new Role();
        role.setApplymanage(jsonObject.getInteger("applymanage"));
        role.setAuditmanage(jsonObject.getInteger("auditmanage"));
        role.setCreditsmanage(jsonObject.getInteger("creditsmanage"));
        role.setNoticemanage(jsonObject.getInteger("noticemanage"));
        role.setPersonmanage(jsonObject.getInteger("personmanage"));
        role.setRolemmanage(jsonObject.getInteger("rolemmanage"));
        role.setUsermanage(jsonObject.getInteger("usermanage"));
        Integer userNum = jsonObject.getInteger("username");
        try {
            RetResult retResult = adminService.createRole(userNum,role);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }


}
