package com.itheima.demo5;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃狗");
    }
        //子类特有方法
        public void catchMouse(){
            System.out.println("猫抓老鼠");
        }

}
