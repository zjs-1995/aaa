package com.itheima.demo04;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {
    static int ticket = 100;


    @Override
    public void run() {
        while (true) {
          method();
        }
    }

    private static synchronized void method() {
        if (ticket > 0)

        {
            try {
                Thread.sleep(50);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
        ticket--;
    }

}


