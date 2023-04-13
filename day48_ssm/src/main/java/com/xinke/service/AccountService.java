package com.xinke.service;

import com.xinke.bean.Account;

import java.util.List;

public interface AccountService {
    /*
查询所有账户
 */
    List<Account> findAll();
}
