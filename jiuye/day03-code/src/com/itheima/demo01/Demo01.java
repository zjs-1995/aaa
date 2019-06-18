package com.itheima.demo01;

import java.util.HashMap;

public class Demo01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Integer v1 = map.put("赵丽颖", 168);
        map.put("杨颖",170);
        map.put("杨幂",165);
    //    System.out.println(v1);
        System.out.println(map);//{赵丽颖=168, 杨颖=170, 杨幂=165}

        map.remove("赵丽颖");
        System.out.println(map);//{杨颖=170, 杨幂=165}

        Integer v2 = map.get("杨幂");
        System.out.println(v2);//165

        boolean v3 = map.containsKey("杨颖");
        System.out.println(v3);//true

        boolean b = map.containsValue(175);
        System.out.println(b);//false

    }
}
