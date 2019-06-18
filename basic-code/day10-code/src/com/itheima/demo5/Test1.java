package com.itheima.demo5;

public class Test1 {
    public static void main(String[] args) {
        Animal an = new Dog();
        feed(an);
    }
    public static void feed(Animal an){
        an.eat();
    }
}
