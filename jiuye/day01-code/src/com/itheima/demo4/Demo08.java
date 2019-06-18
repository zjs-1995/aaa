package com.itheima.demo4;

public class Demo08 {
    public static void main(String[] args) {
        //基本类型转字符串
        String s = "100";
        String s1 = s+"";
        System.out.println(s1+200);
        System.out.println("====================");
        //字符串转基本类型
        int i = Integer.parseInt("100");
        System.out.println(i+200);
        double i1 = Double.parseDouble("3.14");
        System.out.println(i1);
        long i3 = Long.parseLong("5");
        System.out.println(i3);
        Float.parseFloat("3..18F");

    }
}
