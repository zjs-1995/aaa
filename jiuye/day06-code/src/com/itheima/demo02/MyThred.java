package com.itheima.demo02;

public class MyThred implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-------"+i);
        }
    }

   /* @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--------"+i);
        }
    }*/

}

