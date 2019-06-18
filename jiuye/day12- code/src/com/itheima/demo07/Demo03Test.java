package com.itheima.demo07;

import java.util.function.Function;

public class Demo03Test {
    public static String change(String s, Function<String, String> fun1,
                                Function<String, Integer> fun2, Function<Integer, String> fun3) {
        return fun1.andThen(fun2).andThen(fun3).apply(s);
    }
}
