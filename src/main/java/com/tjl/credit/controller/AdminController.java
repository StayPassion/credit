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
     * @param jsonObject
     * @return
     */
    @PostMapping("/queryAllUser")
    public RetResult queryAllUser(@RequestBody JSONObject jsonObject){
        Integer offset = jsonObject.getInteger("offset");
        Integer pageSize = jsonObject.getInteger("pageSize");
        try {
            RetResult retResult = adminService.queryAllUser(offset,pageSize);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 分配权限
     * @param role
     * @return
     */
    @PostMapping("/createRole")
    public RetResult createRole(@RequestBody Role role){

        try {
            RetResult retResult = adminService.createRole(role);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }


}
