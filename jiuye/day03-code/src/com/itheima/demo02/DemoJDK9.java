package com.itheima.demo02;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DemoJDK9 {
    public static void main(String[] args) {
        List<Object> list = List.of("张柏芝","王菲","周迅");
        System.out.println(list);

        Set<String> set = Set.of("谢霆锋","李亚鹏","窦唯");
        System.out.println(set);

        Map<String,Integer> map = Map.of("谭维维",18,"张韶涵",20);
       // map.put("刘德华",30);
        System.out.println(map);
    }
}
