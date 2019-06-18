package com.itheima.demo5;

public class Cat {
    private int age;
    private char color;
    public void showMsg(){
        System.out.println("猫的年龄:"+getAge()+",颜色:"+getColor());
    }

    public Cat() {
    }

    public Cat(int age, char color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
}
