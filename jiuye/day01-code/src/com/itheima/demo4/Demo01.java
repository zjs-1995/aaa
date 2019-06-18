package com.itheima.demo4;

import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);
//
//        Date date = new Date(957139431313264L);
//        System.out.println(date);

        Date date = new Date();
       long time = date.getTime();
        System.out.println(time);
    }
}
