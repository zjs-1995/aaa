package com.test01;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //生成随机数
        Random ran = new Random();
       //定义一个集合
        int[] arr= new int[8];
        for (int i = 0; i < 8; i++) {
            int num = ran.nextInt(10)+1;
            arr[i] = num;
            System.out.println(num);
        }
        //先求和
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
          ;sum+=arr[i];
        }
        //求平均值
        avg = sum / arr.length;
        System.out.println("平均值是:"+avg);

    }
}
