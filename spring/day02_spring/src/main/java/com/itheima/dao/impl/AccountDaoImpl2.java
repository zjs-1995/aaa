package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao2")
public class AccountDaoImpl2 implements AccountDao {
    @Override
    public void saveAccount() {
        System.out.println("保存了账户2222");
    }
}
