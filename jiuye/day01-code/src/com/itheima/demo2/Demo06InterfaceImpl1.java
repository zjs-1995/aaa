package com.itheima.demo2;

public class Demo06InterfaceImpl1 implements Demo06<String>{
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
