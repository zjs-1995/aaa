package com.itheima.day07.Demo01;

import java.util.ArrayList;
import java.util.Random;

//ArrayList练习之存储随机数字
public class Test01 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(5);//0-4的数列出来
            list.add(num);//把数放到集合里
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
