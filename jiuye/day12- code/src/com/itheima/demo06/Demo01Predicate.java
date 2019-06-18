package com.itheima.demo06;

import java.util.function.Predicate;

public class Demo01Predicate {
    /*public static void main(String[] args) {
        String s = "abcdef";
        boolean b = checkString(s, (String str) -> { return str.length() > 5; });
        System.out.println(b);
    }

    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }*/

    public static boolean checkString(String s,Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        String s = "abcdef";
        boolean b = checkString(s, (String str) -> {
            return str.length() > 5;
        });
        System.out.println(b);
    }
}
