package com.itheima.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*分析以下需求，并用代码实现
        1.生成10个1至100之间的随机整数(不能重复)，存入一个集合
        2.然后利用迭代器和增强for循环分别遍历集合元素并输出
        3.如：15 18 20 40 46 60 65 70 75 91*/
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int j = 0; j < 10; j++) {
            int a = r.nextInt(100) + 1;
            if (list.contains(a)) {
                j--;
            } else {
                list.add(a);
            }

        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            System.out.println(next);
        }
        System.out.println("======================");
        for (Integer it2 : list) {
            System.out.println(it2);
        }
    }
}
