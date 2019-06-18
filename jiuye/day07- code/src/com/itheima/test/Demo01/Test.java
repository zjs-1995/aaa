package com.itheima.test.Demo01;

public class Test {
    public static void main(String[] args) {
        invokeDirect(()->{
            System.out.println("导演拍电影啦！");
        });

        invokeDirect(()-> System.out.println("导演拍电影啦！"));
    }
    public static void invokeDirect(Director director){
        director.makeMovie();
    }
}
