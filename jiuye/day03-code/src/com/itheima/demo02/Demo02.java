package com.itheima.demo02;

import java.util.HashMap;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.next();
        char[] chars = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : chars) {
            if(map.containsKey(c)){
                Integer integer = map.get(c);
                map.put(c, integer);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
