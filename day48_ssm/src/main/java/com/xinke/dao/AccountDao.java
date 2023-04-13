package com.xinke.dao;

import com.xinke.bean.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    @Select("select * from account")
    List<Account> findAll();
}
