package cn.itheima.day07.Demo1;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个值");
        int a = sc.nextInt();
        System.out.println("请输入第二个值");
        int b = sc.nextInt();
        System.out.println("请输入第三个值");
        int c = sc.nextInt();

        int temp = a>b?a:b;
        int max = temp>c?temp:c;
        System.out.println("最大值是:");
        System.out.println(max);
    }
}
