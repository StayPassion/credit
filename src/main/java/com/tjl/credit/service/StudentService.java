package com.tjl.credit.service;

import com.tjl.credit.dao.CreditMapper;
import com.tjl.credit.dao.UserMapper;
import com.tjl.credit.domain.Credit;
import com.tjl.credit.utils.FileUtils;
import com.tjl.credit.utils.RetResponse;
import com.tjl.credit.utils.RetResult;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @Author PengBo
 * @CreateTime 2019/5/14 19:07
 * @Version 1.0.0
 */
@Service
public class StudentService {
    @Resource
    private CreditMapper creditMapper;
    @Resource
    private UserMapper userMapper;

    public RetResult insertCredit(MultipartFile file, String userNumber,
                                  String ctype, String note) throws Exception {
        String fileName = FileUtils.getFileName(file);
        String tempCollege = userMapper.queryCollege(userNumber);
        Credit credit = new Credit();
        credit.setAtime(new Date(System.currentTimeMillis()));
        credit.setCtype(ctype);
        credit.setFile(fileName);
        credit.setNote(note);
        credit.setUsername(userNumber);
        credit.setTempcollege(tempCollege);
        credit.setState("未审核");

        int flag = creditMapper.insertCredit(credit);
        String url = FileUtils.makeDir(userNumber);
        if (FileUtils.uploadFile(file, fileName, url) && flag == 1) {
            return RetResponse.makeOKRsp("提交成功");
        } else {
            return RetResponse.makeErrRsp("提交失败");
        }

    }
}
