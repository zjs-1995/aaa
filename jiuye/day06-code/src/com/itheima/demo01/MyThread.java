package com.itheima.demo01;

public class MyThread extends Thread{
    @Override
    public void run() {
        String name = getName();
        System.out.println(name);
    }
}
