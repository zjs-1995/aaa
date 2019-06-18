package com.itheima.demo4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            int num = random.nextInt(49) + 2;
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        int anInt = sc.nextInt();
        findNum(arr, anInt);

        int avg = getAvg(arr);
        System.out.println("数组中小于平均值元素的个数"+avg);
    }

    public static void findNum(int[] arr, int num) {
        int count = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count = i;

            }
        }
        if (count == -1) {
            System.out.println("不存在");
        } else {
            System.out.println("数字在数组中最后一次出现的位置:" + count);
        }
    }
   // 定义方法,统计数组中小于平均值元素的个数,将结果返回并进行输出
    public static int getAvg(int[] arr) {
        int sum = 0;
        int avg = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg =  sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg){
                count++;
            }
        }
        return count;
    }
}
