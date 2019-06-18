package com.itheima.demo07;

import java.util.Arrays;

public class Demo {
    public static int[] creatArray(int length, ArrayBuilder ab) {
        return ab.buliderArray(length);
    }

    public static void main(String[] args) {
        int[] arr = creatArray(10, (len) -> {
            return new int[len];
        });
        System.out.println(arr.length);

        int[] arr2 = creatArray(10, int[]::new);
        System.out.println(arr2.length);
        System.out.println(Arrays.toString(arr2));
    }
}
