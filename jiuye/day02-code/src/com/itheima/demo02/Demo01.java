package com.itheima.demo02;

import java.util.HashSet;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer next = it.next();
            System.out.println(next);
        }
    }
}
