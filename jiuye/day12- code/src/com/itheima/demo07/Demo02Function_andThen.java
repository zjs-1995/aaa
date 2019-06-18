package com.itheima.demo07;

import java.util.function.Function;

public class Demo02Function_andThen {
    public static void change(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String s1 = fun1.andThen(fun2).apply(s);
        System.out.println(s1);
    }

    public static void main(String[] args) {
        String s = "123";
        change(s,(String str)->{
            return Integer.parseInt(str)+10;
        },(Integer i)->{
            return i+"";
        });
    }
}