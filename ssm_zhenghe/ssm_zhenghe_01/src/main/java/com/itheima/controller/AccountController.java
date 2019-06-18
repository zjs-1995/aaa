package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 查询所有数据
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("表现层：查询所有账户...");
        accountService.findAll();
       /* List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account);
        }*/
        return "list";
    }
}
