package com.itheima.demo01;

public class BaoZiPu extends Thread{
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;

       while (true){
           synchronized (bz){
               if (bz.flag = true){
                   try {
                       bz.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
               bz.pi = "薄皮";
               bz.xian = "韭菜鸡蛋";
               count++;
               System.out.println("包子铺正在生产"+bz.pi+bz.xian+"的包子");

               try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               //包子铺生产好了包子
               //修改包子的状态为true有
               bz.flag = true;
               //唤醒吃货线程,让吃货线程吃包子
               bz.notify();
               System.out.println("包子铺已经生产好了:"+bz.pi+bz.xian+"包子,吃货可以开始吃了");
           }
       }
    }
}
