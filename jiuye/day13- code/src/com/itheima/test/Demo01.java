package com.itheima.test;

import java.util.ArrayList;
import java.util.stream.Stream;

/*有如下整数1，-2，-3，4，-5
        使用Stream取元素绝对值并打印*/
public class Demo01 {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, -2, -3, 4, -5);
        Stream<Integer> stream1 = stream.map((Integer i) -> {
            return Math.abs(i);
        });
        stream1.forEach((i)->{
            System.out.println(i);
        });
    }

}
