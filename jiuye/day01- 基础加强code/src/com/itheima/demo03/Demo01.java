package com.itheima.demo03;

public class Demo01 {
    static class MyThread extends Thread {
        public void start() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Value = " + i);
            }
        }
    }
}

