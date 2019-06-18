package com.itheima.demo5;

import java.security.PublicKey;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }
    public void watchHouse(){
        System.out.println("狗看家");
    }
}
