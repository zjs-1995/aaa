package com.itheima.demo6;

public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal an = new Dog();
        an.eat();
        if (an instanceof Dog){
            Dog dog = (Dog)an;
            dog.watchHouse();
        }
        if (an instanceof Cat){
            Cat cat = (Cat)an;
            cat.catchMouse();
        }
    }
}
