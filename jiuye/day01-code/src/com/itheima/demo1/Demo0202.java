package com.itheima.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
分析以下需求，并用代码实现
        1.从键盘录入一个日期字符串,格式为 xxxx-xx-xx,代表该人的出生日期
        2.利用人出生日期到当前日期所经过的毫秒值计算出这个人活了多少天
*/
public class Demo0202 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期 格式:xxxx-xx-xx");
        String s = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date p = sdf.parse(s);
        long time1 = p.getTime();
        Date date = new Date();
        long time2 = date.getTime();
        long t = time2 - time1;
        System.out.println(t/1000/60/60/24);
    }
}
