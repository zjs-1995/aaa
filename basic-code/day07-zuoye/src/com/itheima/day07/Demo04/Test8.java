package com.itheima.day07.Demo04;

public class Test8 {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        int[] arr={10,20,30,40,60,80};
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num+=arr[i];
        }
        System.out.println(num);
    }
}
