package com.itheima.demo02;

public class Demo01 {
    public static void main(String[] args) {
        /*MyThred mt = new MyThred();
        Thread t = new Thread(mt);
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"+++++++"+i);
        }*/
        MyThred mt = new MyThred();
        Thread t = new Thread(mt);
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"++++++++++"+i);
        }
    }
}