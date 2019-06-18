package com.itheima.ui;


import com.itheima.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {


    public static void main(String[] args) {
        //1.获取核心容器对象
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\Users\\zhy\\Desktop\\bean.xml");
        //2.根据id获取Bean对象
       /* IAccountService as  = (IAccountService)ac.getBean("accountService");
        //System.out.println(as);
        as.saveAccount();
*/

      /*  IAccountService as  = (IAccountService)ac.getBean("accountService2");
        //System.out.println(as);
        as.saveAccount();*/

        IAccountService as  = (IAccountService)ac.getBean("accountService3");
        //System.out.println(as);
        as.saveAccount();


    }
}
