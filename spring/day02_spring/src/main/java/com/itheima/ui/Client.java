package com.itheima.ui;


import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
  //      AccountService as2 = (AccountService) ac.getBean("accountService");
//        System.out.println(as);
//
//        AccountDao adao = ac.getBean("accountDao", AccountDao.class);
//        System.out.println(adao);

 //       System.out.println(as==as2);
           as.saveAccount();
           ac.close();
    }
}
