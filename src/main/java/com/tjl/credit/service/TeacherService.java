package com.tjl.credit.service;

import com.tjl.credit.dao.CheckMapper;
import com.tjl.credit.dao.CreditMapper;
import com.tjl.credit.domain.Check;
import com.tjl.credit.domain.Credit;
import com.tjl.credit.utils.FileUtils;
import com.tjl.credit.utils.RetResponse;
import com.tjl.credit.utils.RetResult;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Date;
import java.util.List;

/**
 * @Author PengBo
 * @CreateTime 2019/5/14 19:07
 * @Version 1.0.0
 */
@Service
public class TeacherService {
    @Resource
    private CreditMapper creditMapper;
    @Resource
    private CheckMapper checkMapper;

    public RetResult queryCredit(String college) throws Exception {
        List<Credit> creditList = creditMapper.queryCredit(college);
        if (creditList.size()>0){
            return RetResponse.makeOKRsp("查询成功",creditList);
        }else if (creditList.size()==0){
            return RetResponse.makeOKRsp("没有数据");
        }
        return RetResponse.makeErrRsp("查询失败");
    }

    public RetResult checkCredit(String username, String fileName, Integer id,String result,String opinion,
                                 String teacherNumber, HttpServletResponse response) throws Exception {
        String url = FileUtils.makeDir(username);
        File file = new File(url+"\\"+fileName);
        FileUtils.downloadFile(fileName,response,file);
        Check check = new Check();
        check.setCreditId(id);
        check.setCheckUserId(teacherNumber);
        check.setResult(result);
        check.setOpinion(opinion);
        Credit credit = new Credit();
        credit.setState("已审核");
        credit.setId(id);
        System.out.println(credit.getId()+"******"+credit.getState());
        int flag = checkMapper.insert(check);
        creditMapper.updateStatus(credit);
            if(flag ==1){
                return RetResponse.makeOKRsp("提交成功");
            }else {
                return RetResponse.makeErrRsp("提交失败");
            }
    }
}
