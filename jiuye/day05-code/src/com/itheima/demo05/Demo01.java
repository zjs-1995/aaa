package com.itheima.demo05;

public class Demo01 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-----------"+i);
        }
    }
}
