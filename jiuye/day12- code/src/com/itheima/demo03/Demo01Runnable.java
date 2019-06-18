package com.itheima.demo03;

public class Demo01Runnable {
    public static void startThred(Runnable run){
        new Thread().start();
    }

    public static void main(String[] args) {
        startThred(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-----"+"线程启动了");
            }
        });

        startThred(()->{
            System.out.println(Thread.currentThread().getName()+"+++++"+"线程启动了");
        });
    }
}
