package com.itheima.demo8;

import java.util.Arrays;
import java.util.Calendar;


public class Demo1 {
    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1);
        System.out.println(s1+200);

        String s2 = Integer.toString(100);
        System.out.println(s2+200);

        String s3 = String.valueOf(100);
        System.out.println(s3+200);


        int i = Integer.parseInt(s1);
        System.out.println(i);
    }
}