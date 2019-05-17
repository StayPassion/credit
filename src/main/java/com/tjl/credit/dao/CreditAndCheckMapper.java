package com.tjl.credit.dao;

import com.tjl.credit.domain.Credit;
import com.tjl.credit.domain.CreditAndCheck;
import com.tjl.credit.domain.User;

import java.util.List;

/**
 * @Author PengBo
 * @CreateTime 2019/5/17 16:24
 * @Version 1.0.0
 */
public interface CreditAndCheckMapper {
    List<CreditAndCheck> queryMyCredit(CreditAndCheck creditAndCheck) throws Exception;

    List<Credit> queryCreditState(CreditAndCheck creditAndCheck);
}
