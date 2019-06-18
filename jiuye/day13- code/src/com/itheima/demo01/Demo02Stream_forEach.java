package com.itheima.demo01;

import java.util.stream.Stream;

public class Demo02Stream_forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("赵丽颖", "杨幂", "迪丽热巴", "古力娜扎");
        stream.forEach((String name)->{
            System.out.println(name);
        });
    }
}
