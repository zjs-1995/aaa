package com.itheima.demo8;

public class Frog extends Animal implements Swim{//青蛙类


    @Override
    public void drink() {

    }

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    @Override
    public void swimming() {
        System.out.println("蛙泳");
    }



}
