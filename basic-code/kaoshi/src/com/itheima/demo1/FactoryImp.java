package com.itheima.demo1;

import java.util.ArrayList;
import java.util.Random;

public class FactoryImp implements Factory {//生产帽子类的实现类


    @Override
    public void describe(Hat hat) {
        if (hat.getColor() % 2 == 0) {
            System.out.println("颜色为黄色，价格为：" + hat.getPrice() + "的太阳帽");
        } else {
            System.out.println("颜色为红色，价格为：" + hat.getPrice() + "的太阳帽");
        }
    }

    @Override
    public ArrayList<Hat> piliang(int num) {
        ArrayList<Hat> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < num; i++) {
            Hat hat = new Hat();

            //int anInt1 = r.nextInt();
            hat.setColor(r.nextInt(100));
            hat.setPrice(r.nextInt(81) + 20);
            hat.setType("太阳帽");

            list.add(hat);


        }
        return list;
    }
}
