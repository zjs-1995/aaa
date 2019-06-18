package com.itheima.demo03;
/*
递归求1-n的和
* */
public class Demo01 {
    public static void main(String[] args) {
        int s = sum(5);
        System.out.println(s);


    }
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        return  n + sum(n-1);
    }
}
