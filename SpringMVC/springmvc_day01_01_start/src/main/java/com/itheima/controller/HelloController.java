package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//控制器类
@Controller
@RequestMapping("/user")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello springmvc");
        return "success";
    }

    @RequestMapping(value = "/saveAccount",params = {"username=heihei","password=12345"})
    public String saveAccount(){
        System.out.println("保存了账户");
        return "success";
    }

}
