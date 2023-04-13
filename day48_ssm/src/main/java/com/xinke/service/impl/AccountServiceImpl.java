package com.xinke.service.impl;

import com.xinke.bean.Account;
import com.xinke.dao.AccountDao;
import com.xinke.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    //定义属性
    @Autowired
    private AccountDao dao;

    public List<Account> findAll() {
        System.out.println("调用了AccountServiceImpl的findAll方法~！~");
        return dao.findAll();
    }
}
