package com.tjl.credit.controller;

import com.alibaba.fastjson.JSONObject;
import com.tjl.credit.domain.*;
import com.tjl.credit.service.AdminService;
import com.tjl.credit.utils.RetResponse;
import com.tjl.credit.utils.RetResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

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
     *
     * @param user
     * @return
     */
    @PostMapping("/queryUserByNumber")
    public RetResult queryUserByNumber(@RequestBody User user) {
        try {
            RetResult retResult = adminService.queryUserByNumber(user);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 创建角色
     *
     * @param role
     * @return
     */
    @PostMapping("/insertRole")
    public RetResult insertRole(@RequestBody Role role) {
        try {
            RetResult retResult = adminService.insertRole(role);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 查询所有角色
     *
     * @return
     */
    @PostMapping("/queryAllRole")
    public RetResult queryAllRole() {
        try {
            RetResult retResult = adminService.queryAllRole();
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 创建用户
     *
     * @param user
     * @return
     */
    @PostMapping("/createUser")
    public RetResult createUser(@RequestBody User user) {
        try {
            RetResult retResult = adminService.createUser(user);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 查询所有用户
     *
     * @return
     */
    @PostMapping("/queryAllUser")
    public RetResult queryAllUser() {
        try {
            RetResult retResult = adminService.queryAllUser();
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 修改用户
     *
     * @return
     */
    @PostMapping("/updateUser")
    public RetResult updateUser(@RequestBody User user) {
        try {
            RetResult retResult = adminService.updateUser(user);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 修改用户
     *
     * @return
     */
    @PostMapping("/deleteUser")
    public RetResult deleteUser(@RequestBody User user) {
        try {
            RetResult retResult = adminService.deleteUser(user);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 修改角色权限
     *
     * @param role
     * @return
     */
    @PostMapping("/createRole")
    public RetResult createRole(@RequestBody Role role) {
        try {
            RetResult retResult = adminService.createRole(role);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 修改角色权限
     *
     * @param role
     * @return
     */
    @PostMapping("/deleteRole")
    public RetResult deleteRole(@RequestBody Role role) {
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
    public RetResult createCollege(@RequestBody College college) {
        try {
            RetResult retResult = adminService.createCollege(college);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }
    /**
     * 查询学院
     * @param
     * @return
     */
    @PostMapping("/queryAllCollege")
    public RetResult queryAllCollege() {
        try {
            RetResult retResult = adminService.queryAllCollege();
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }
    /**
     * 删除学院
     * @param
     * @return
     */
    @PostMapping("/deleteCollege")
    public RetResult deleteCollege(@RequestBody College college) {
        try {
            RetResult retResult = adminService.deleteCollege(college);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }


    /**
     * 添加专业
     *
     * @param professional
     * @return
     */
    @PostMapping("/createProfessional")
    public RetResult createProfessional(@RequestBody Professional professional) {
        try {
            RetResult retResult = adminService.createProfessional(professional);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }
    /**
     * 查询专业
     *
     * @param professional
     * @return
     */
    @PostMapping("/queryProfessional")
    public RetResult queryProfessional(@RequestBody Professional professional) {
        try {
            RetResult retResult = adminService.queryProfessional(professional);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 删除专业
     * @param professional
     * @return
     */
    @PostMapping("/deleteProfessional")
    public RetResult deleteProfessional(@RequestBody Professional professional) {
        try {
            RetResult retResult = adminService.deleteProfessional(professional);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 添加班级
     *
     * @param tclass
     * @return
     */
    @PostMapping("/createTclass")
    public RetResult createTclass(@RequestBody Tclass tclass) {
        try {
            RetResult retResult = adminService.createTclass(tclass);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }
    /**
     * 查询班级
     *
     * @param tclass
     * @return
     */
    @PostMapping("/queryTclass")
    public RetResult queryTclass(@RequestBody Tclass tclass) {
        try {
            RetResult retResult = adminService.queryTclass(tclass);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 查询班级学生
     * @param tclass
     * @return
     */
    @PostMapping("/queryUser")
    public RetResult queryUser(@RequestBody Tclass tclass){
        try {
            RetResult retResult = adminService.queryUser(tclass);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }
    /**
     * 删除班级
     * @param tclass
     * @return
     */
    @PostMapping("/deleteTclass")
    public RetResult deleteTclass(@RequestBody Tclass tclass){
        try {
            RetResult retResult = adminService.deleteTclass(tclass);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }


    /**
     * 添加公告
     * @param file
     * @param title
     * @param content
     * @param userNumber
     * @return
     */
    @PostMapping("/uploadFile")
    public RetResult uploadFile(@RequestParam("myfile") MultipartFile file, String title, String content, String userNumber) {
        try {
            RetResult retResult = adminService.uploadFile(file, title, content, userNumber);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 查询所有公告
     *
     * @param
     * @return
     */
    @PostMapping("/lookNotice")
    public RetResult lookNotice() {
        try {
            RetResult retResult = adminService.lookNotice();
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 根据id查询公告
     *
     * @param id
     * @return
     */
    @PostMapping("/queryNoticeById")
    public RetResult queryNoticeById(Integer id) {
        try {
            RetResult retResult = adminService.queryNoticeById(id);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }

    /**
     * 下载文件
     * @param
     * @return
     */
    @PostMapping("/downloadNoticeFile")
    public void lookNoticeFile(String fileName, String userNumber, HttpServletResponse response) {
        try {
            adminService.lookNoticeFile(fileName, userNumber, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据学分状态查询
     * @param creditAndCheck
     * @return
     */
    @PostMapping("/queryCreditState")
    public RetResult queryCreditState(@RequestBody CreditAndCheck creditAndCheck) {
        try {
            RetResult retResult = adminService.queryCreditState(creditAndCheck);
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }
    @PostMapping("/queryCollegeCredit")
    public RetResult queryCollegeCredit(){
        try {
            RetResult retResult = adminService.queryCollegeCredit();
            return retResult;
        } catch (Exception e) {
            return RetResponse.makeInternalServiceErrors("服务器内部错误");
        }
    }
}