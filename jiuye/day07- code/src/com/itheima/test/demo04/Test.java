package com.itheima.test.demo04;

public class Test {
    public static void main(String[] args) {
        invokeCalc(130,120,(int a,int b)->{
            return a - b;
        });
        invokeCalc(130,120,(a,b)->a-b);
    }

    public static void invokeCalc(int a,int b,Calculator calculator) {
      int sum = calculator.calc(a,b);
        System.out.println(sum);
    }
}
