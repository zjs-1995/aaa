package com.itheima.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method1() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖",170);
        map.put("杨幂",165);

        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        /*while(it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }*/
        for (String key:set) {
            Integer value = map.get(key);
            System.out.println(key+"="+value);

        }
    }

    private static void method2() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖",170);
        map.put("杨幂",165);
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
