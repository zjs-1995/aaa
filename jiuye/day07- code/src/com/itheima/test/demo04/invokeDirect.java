package com.itheima.test.demo04;

public class invokeDirect {
    public static void main(String[] args) {

        invokeDirect(()->{
            System.out.println("导演拍电影啦！");
        });

        invokeDirect(()-> System.out.println("导演拍电影啦！"));

    }
    public static void  invokeDirect(Director director){
        director.makeMovie();
    }
}
