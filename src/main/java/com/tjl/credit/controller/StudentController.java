package com.tjl.credit.controller;

import com.tjl.credit.domain.Credit;
import com.tjl.credit.domain.CreditAndCheck;
import com.tjl.credit.service.StudentService;
import com.tjl.credit.utils.RetResponse;
import com.tjl.credit.utils.RetResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @Author PengBo
 * @CreateTime 2019/5/14 19:07
 * @Version 1.0.0
 */
@RestController
public class StudentController {
    @Resource
    private StudentService studentService;

    /**
     * 提交学分审核
     * @param file
     * @param userNumber
     * @param ctype
     * @param note
     * @return
     */
    @PostMapping("/insertCredit")
    public RetResult insertCredit(@RequestParam("myfile") MultipartFile file,String userNumber,
                                  String ctype,String note){
        try {
            RetResult retResult = studentService.insertCredit(file,userNumber,ctype,note);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 学生查询自己的申请记录
     * @param creditAndCheck
     * @return
     */
    @PostMapping("/queryMyCredit")
    public RetResult queryMyCredit(@RequestBody CreditAndCheck creditAndCheck){
        try {
            RetResult retResult = studentService.queryMyCredit(creditAndCheck);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

}
