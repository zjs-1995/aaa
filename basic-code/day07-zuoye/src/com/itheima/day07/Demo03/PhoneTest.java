package com.itheima.day07.Demo03;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("华为", 1200, 4);
        Phone p2 = new Phone("苹果", 9000, 1);
        Phone p3 = new Phone("锤子", 3000, 3);
        Phone p4 = new Phone("小米", 1800, 2);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        for (int i = 0; i < list.size(); i++) {
            Phone phone = list.get(i);
            int price = phone.getPrice();
            int time = phone.getTime();
            if (time <= 2 && price < 2000) {

                System.out.println(phone.getBrand() + "-" + phone.getPrice() + "-" + phone.getTime());
            }
        }
        for (int i = 0; i < list.size(); i++) {
            Phone phone = list.get(i);
            int price = phone.getPrice();
            if (price > 5000){

            }


        }
    }


}
