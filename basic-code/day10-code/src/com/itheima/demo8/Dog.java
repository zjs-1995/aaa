package com.itheima.demo8;

public class Dog extends Animal implements Swim{
    public Dog() {
    }


    @Override
    public void drink() {

    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void swimming() {
        System.out.println("狗刨");
    }
}
