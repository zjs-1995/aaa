package com.itheima.demo01;

import java.util.LinkedList;

public class Deno02 {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("aaa");
        linked.add("bbb");
        linked.add("ccc");
        System.out.println(linked);

        linked.addFirst("www");
        System.out.println(linked);
        linked.addLast("mmm");
        System.out.println(linked);
        linked.push("qqq");
        System.out.println(linked);

        String first = linked.getFirst();
        System.out.println(first);
        String last = linked.getLast();
        System.out.println(last);


    }


}
