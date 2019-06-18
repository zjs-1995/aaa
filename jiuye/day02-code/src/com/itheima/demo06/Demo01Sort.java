package com.itheima.demo06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo01Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);


        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
             //   return o1 - o2;//升序
                return o2 - o1;//降序
            }
        });
        System.out.println(list1);
    }
}
