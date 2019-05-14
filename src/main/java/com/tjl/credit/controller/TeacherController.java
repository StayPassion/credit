package com.tjl.credit.controller;

import com.tjl.credit.service.TeacherService;
import com.tjl.credit.utils.RetResponse;
import com.tjl.credit.utils.RetResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author PengBo
 * @CreateTime 2019/5/14 19:07
 * @Version 1.0.0
 */
@RestController
public class TeacherController {
    @Resource
    private TeacherService teacherService;

    /**
     * 查询当前老师学院的所有学分提交
     * @return
     */
    @PostMapping("/queryCredit")
    public RetResult insertCredit(String college){
        try {
            RetResult retResult = teacherService.queryCredit(college);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    @PostMapping("/checkCredit")
    public RetResult checkCredit(String username, String fileName,Integer id,String result,String opinion,
                                 String teacherNumber, HttpServletResponse response){
        try {
            RetResult retResult = teacherService.checkCredit(username,fileName,id,result,opinion,teacherNumber,response);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

}
