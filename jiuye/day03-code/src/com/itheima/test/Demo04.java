package com.itheima.test;

import java.util.HashSet;

/*1.定义一个长度为10的int数组,并存入10个int类型的数据,其中有一些数据是重复的
        2.利用集合的知识对数组进行去重,产生新数组,不能改变数组中原来数字的顺序
        3.打印新数组中的内容*/
public class Demo04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5,3,6,6,7};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        Integer[] in = set.toArray(new Integer[0]);
        for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
        }
    }
}
