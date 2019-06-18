package com.itheima.dao;

import com.itheima.domain.Account;
import java.util.List;

public interface AccountDao {


    /**
     * 查询所有账户,并且待遇哦用户名称和地址信息
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 根据用户名id查询账户信息
     * @param id
     * @return
     */
    List<Account> findAccountByUid(Integer id);


}
