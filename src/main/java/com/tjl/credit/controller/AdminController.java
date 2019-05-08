package com.tjl.credit.controller;

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
}
