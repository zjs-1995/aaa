package com.itheima.demo6;

public class Demo01Main {
    public static void main(String[] args) {
        Animal an = new Cat();
        an.eat();
        Cat cat = (Cat) an;
        cat.catchMouse();
    }
}
