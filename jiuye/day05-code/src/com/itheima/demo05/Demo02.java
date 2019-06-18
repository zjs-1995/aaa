package com.itheima.demo05;

public class Demo02 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"---------"+i);
                }
            }
        }.start();

     new Thread(new Runnable() {
         @Override
         public void run() {
             for (int i = 0; i < 20; i++) {
                 System.out.println(Thread.currentThread().getName()+"--+++++++-"+i);
             }
         }
     }).start();
    }
}
