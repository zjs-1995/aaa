package com.itheima.demo04;

import java.util.function.Supplier;

public class Demo01Supplier {
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }


    public static void main(String[] args) {
        String s1 = getString(() -> {
            return "胡歌";
        });
        System.out.println(s1);
        String s = getString(() -> "胡歌");
        System.out.println(s);

    }
}
