package com.itheima.demo8;

public abstract class Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void drink();

    public abstract void eat();

}
