package com.itheima.day07.Demo04;

public class Test7 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        System.out.print("[");
        for (int i = 1; i <= 100; i++) {
            if (i %3 ==0 && i % 7 == 0){

                System.out.print(i+",");
            }
        }
        System.out.println("]");

    }
}
