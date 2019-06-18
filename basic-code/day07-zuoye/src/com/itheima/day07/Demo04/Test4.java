package com.itheima.day07.Demo04;

public class Test4 {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        int c = 1;
        int result = 0;
        switch (c) {
            case 0:
                result = a + b;
                break;
            case 1:
                result = a - b;
                break;
            case 2:
                result = a * b;
                break;
            case 3:
                result = a / b;
                break;
            default:
                System.out.println("数据错误");
                break;
        }
        System.out.println(result);
    }
}
