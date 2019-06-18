package com.itheima.demo03;

public class RunnableImpl implements Runnable {
    private static int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {

            methos();
        }
    }

    private  synchronized static void methos() {
        if (ticket > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
            ticket--;
        }
    }
}
