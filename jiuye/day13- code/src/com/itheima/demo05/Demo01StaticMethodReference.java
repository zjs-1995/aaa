package com.itheima.demo05;

public class Demo01StaticMethodReference {
    public static int method(int number,Calcable c){
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
        int i = method(-5, (number) -> {
            return Math.abs(number);
        });
        System.out.println(i);
    }
}
