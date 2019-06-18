package com.itheima.demo03;
//递归求1-n的阶乘
public class Demo03 {
    public static void main(String[] args) {
        int jc = jc(5);
        System.out.println(jc);
    }
    public static int jc(int n){
        if (n==1){
            return 1;
        }
        return n * jc(n-1);
    }
}
