package com.itheima.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/*1.产生10个1-20之间的随机数要求随机数不能重复
        2.产生10个长度为10的不能重复的字符串(里面只能出现大写字母、小写字母、0-9的数字)，并遍历打印输出*/
public class Demo01 {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int anInt = r.nextInt(20) + 1;
            set.add(anInt);
        }
        System.out.println(set);

        /*ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

        }*/
    }
}
