package com.itheima.demo04;

public class Demo01 {
    public static void main(String[] args) {
        int method = method(10, 20);
        System.out.println(method);
    }
    public static int method(int...arr){
        System.out.println(arr.length);
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
