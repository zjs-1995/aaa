package com.itheima.dao;

import com.itheima.domain.Account;
import com.itheima.domain.AccountUser;
import com.itheima.domain.User;

import java.util.List;

public interface AccountDao {


    /**
     * 查询所有账户,并且待遇哦用户名称和地址信息
     * @return
     */
    List<AccountUser> findAllAccount();

    /**
     * 一对一
     * 查询所有用户,同事还要获取到当前账户的所属用户信息
     * @return
     */
    List<Account> findAll();

    List<User> findAllInfo();
}
