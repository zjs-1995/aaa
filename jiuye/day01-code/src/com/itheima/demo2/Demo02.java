package com.itheima.demo2;

import java.util.ArrayList;
import java.util.Collection;


public class Demo02 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        boolean b = coll.add("王五");
        System.out.println(b);
//        System.out.println(coll);

        boolean b1 = coll.remove("张三");
        System.out.println(b1);

        boolean b2 = coll.contains("张三");
        System.out.println(b2);

        System.out.println(coll);

        coll.clear();
        System.out.println(coll);

        boolean b3 = coll.isEmpty();
        System.out.println(b3);
    }
}
