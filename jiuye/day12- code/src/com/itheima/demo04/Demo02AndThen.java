package com.itheima.demo04;

import java.util.function.Consumer;

public class Demo02AndThen {
    public static void method(String s, Consumer<String> con1,Consumer<String> con2){
        con1.andThen(con2).accept(s);//con1连接con2,先执行con1消费数据,在执行con2消费数据
    }

    public static void main(String[] args) {
        method("Hello",(t)->{
                    System.out.println(t.toUpperCase());
        },
                (t)->{
                    System.out.println(t.toLowerCase());
                });
    }
}
