package com.itheima.demo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo03 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
