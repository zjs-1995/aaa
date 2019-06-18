package com.itheima.demo5;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat(5,'黑');
        Cat cat2 = new Cat(5,'白');

        cat1.showMsg();
        cat2.showMsg();
        if (cat1.getAge()==cat2.getAge() && cat1.getColor()==cat2.getColor()){
            System.out.println("属性相同?"+true);
        }else {
            System.out.println("属性相同?"+false);
        }
    }
}
