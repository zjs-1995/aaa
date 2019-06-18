package com.itheima.demo06;

public class Demo01Calculator {
    public static void main(String[] args) {
        invokeCalc(20,30,(int a,int b)->{
            return a * b + (a * b*a*b*a*b*a*b);
        });
    }

    public static void invokeCalc(int a,int b,Calculator c){
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
