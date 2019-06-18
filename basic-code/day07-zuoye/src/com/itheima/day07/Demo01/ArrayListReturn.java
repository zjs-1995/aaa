package com.itheima.day07.Demo01;

import java.util.ArrayList;
import java.util.Random;

//ArrayList练习之筛选集合中的随机数
public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random r = new Random();


        for (int i = 0; i < 5; i++) {//循环5遍
            int num = r.nextInt(10);//0-9范围内的随机数字
            biglist.add(num);
            System.out.println(num);

            ArrayList<Integer> smLsit = SmallList(biglist);
            for (int i1 = 0; i1 < smLsit.size(); i1++) {
                System.out.println(smLsit.get(i));
            }
        }
    }
    public static ArrayList<Integer> SmallList(ArrayList<Integer> bigList){
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = smallList.get(i);
            if (i % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
