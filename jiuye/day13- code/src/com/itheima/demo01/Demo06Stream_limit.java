package com.itheima.demo01;

import java.util.stream.Stream;

public class Demo06Stream_limit {
    public static void main(String[] args) {
        String[] arr = {"刘欢","齐豫","杨坤","吴青峰"};
        Stream<String> stream = Stream.of(arr);
        Stream<String> stream1 = stream.limit(2);
        stream1.forEach((name)->{
            System.out.println(name);
        });
    }
}
