package com.itheima.demo01;

public class Demo01 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        System.out.println(Thread.currentThread().getName());
    }
}
