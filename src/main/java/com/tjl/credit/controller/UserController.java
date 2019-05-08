package com.tjl.credit.controller;

import com.tjl.credit.domain.User;
import com.tjl.credit.service.UserService;
import com.tjl.credit.utils.RetResponse;
import com.tjl.credit.utils.RetResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author PengBo
 * @CreateTime 2019/5/7 20:14
 * @Version 1.0.0
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 用户登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    public RetResult userLogin(@RequestBody User user){
        try {
            RetResult retResult = userService.userLogin(user);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

}
