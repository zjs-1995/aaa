package com.itheima.day07.Demo04;

public class Test1001 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        double c = 1.5;
        double d = 2.5;
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static double sum(double c,double d){
        return c + d;
    }
    public static boolean isSame(int a,int b){
        return a == b;
    }
    public static boolean isSame(double c,double d){
        return c == d;
    }
    public static int getMax(int a,int b){
        if (a > b){
            return a;
        }else{
            return b;
        }
    }
}

