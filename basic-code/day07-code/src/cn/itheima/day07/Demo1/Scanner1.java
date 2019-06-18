package cn.itheima.day07.Demo1;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();

        int result = a+b;
        System.out.println("相加结果是:");
        System.out.println(result);
    }
}
