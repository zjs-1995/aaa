package com.itheima.demo07;

import java.util.function.Function;

public class Demo01Function {
    public static void change(String s, Function<String,Integer> fun){
        Integer in = fun.apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        String s = "123456";
        change(s,(String str)->{
            return Integer.parseInt(str);
        });

      //  change(s,str->Integer.parseInt(str));
    }
}
