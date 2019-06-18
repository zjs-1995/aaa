package com.itheima.demo2;

public class Demo04Class {
    public static void main(String[] args) {
        Demo04<String> d1 = new Demo04<>();
        d1.setName("小明");
        String name = d1.getName();
        System.out.println(name);

        Demo04<Integer> d2 = new Demo04<>();
        d2.setName(123);
        Integer name1 = d2.getName();
        System.out.println(name1);
    }
}
