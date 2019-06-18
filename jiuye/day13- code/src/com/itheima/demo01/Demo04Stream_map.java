package com.itheima.demo01;

import java.util.stream.Stream;

public class Demo04Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");
        Stream<Integer> stream1 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        stream1.forEach((s) -> {
            System.out.println(s);
        });
    }
}
