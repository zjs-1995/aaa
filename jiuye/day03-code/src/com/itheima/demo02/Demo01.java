package com.itheima.demo02;

import java.util.HashMap;
import java.util.Hashtable;

public class Demo01 {
    public static void main(String[] args) {
    //    method1();
        method2();
    }

    private static void method2() {
        HashMap<String, String> map = new HashMap<>();
        map.put(null,"张柏芝");
        map.put(null,"王菲");
        map.put("张柏芝",null);
        System.out.println(map);
    }

    private static void method1() {
        Hashtable<String, String> table = new Hashtable<>();
        table.put(null,"张柏芝");
        table.put(null,"王菲");
        table.put("张柏芝",null);
        System.out.println(table);
    }
}
