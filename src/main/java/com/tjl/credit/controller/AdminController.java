package com.tjl.credit.controller;

import com.alibaba.fastjson.JSONObject;
import com.tjl.credit.domain.*;
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
     * 查询所有角色
     * @return
     */
    @PostMapping("/queryAllRole")
    public RetResult queryAllRole(){
        try {
            RetResult retResult = adminService.queryAllRole();
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 创建用户
     * @param user
     *
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
     * 修改角色权限
     * @param role
     * @return
     */
    @PostMapping("/createRole")
    public RetResult createRole(@RequestBody  Role role){
        try {
            RetResult retResult = adminService.createRole(role);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }
    /**
     * 修改角色权限
     * @param role
     * @return
     */
    @PostMapping("/deleteRole")
    public RetResult deleteRole(@RequestBody  Role role){
        try {
            RetResult retResult = adminService.deleteRole(role);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }
    /**
     * 添加学院
     * @param college
     * @return
     */
    @PostMapping("/createCollege")
    public RetResult createCollege(@RequestBody College college){
        try {
            RetResult retResult = adminService.createCollege(college);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }
    /**
     * 添加专业
     * @param professional
     * @return
     */
    @PostMapping("/createProfessional")
    public RetResult createProfessional(@RequestBody Professional professional){
        try {
            RetResult retResult = adminService.createProfessional(professional);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }
    /**
     * 添加班级
     * @param tclass
     * @return
     */
    @PostMapping("/createTclass")
    public RetResult createTclass(@RequestBody Tclass tclass){
        try {
            RetResult retResult = adminService.createTclass(tclass);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

}
