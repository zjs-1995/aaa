package com.itheima.demo01;

import java.util.stream.Stream;

public class Demo03Stream_filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张韶轩", "张韶涵", "范玮琪", "梁静茹","吴青峰");
        Stream<String> stream1 = stream.filter((String name) -> {
            return name.startsWith("张");
        });
        stream1.forEach((name)->{
            System.out.println(name);
        });
    }
}
