package com.itheima.day07.Demo04;

public class Test1 {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                num = num+i;


            }
        }
        System.out.println(num);
    }
}
