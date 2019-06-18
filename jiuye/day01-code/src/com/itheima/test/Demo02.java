package com.itheima.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*分析以下需求，并用代码实现
        1.定义集合，存入多个字符串
        2.删除集合中字符串"def"
        3.然后利用迭代器遍历集合元素并输出*/
public class Demo02 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("abc");
        coll.add("def");
        coll.add("def");
        coll.add("ghi");
        coll.add("def");

        while (coll.contains("def")) {
            coll.remove("def");

        }
        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
       /* for (String s: coll){
            System.out.println(s);
        }*/
    }
}
