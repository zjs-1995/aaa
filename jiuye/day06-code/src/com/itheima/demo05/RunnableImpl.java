package com.itheima.demo05;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {
     static int ticket = 100;
   static Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            l.lock();

            if (ticket > 0)

            {
                try {
                    Thread.sleep(50);
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    l.unlock();
                }

            }

        }
    }
}
