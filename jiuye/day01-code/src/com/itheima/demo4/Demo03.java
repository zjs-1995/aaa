package com.itheima.demo4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//请使用日期时间相关的API，计算出一个人已经出生了多少天。

public class Demo03 {
    public static void main(String[] args) throws ParseException {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期 格式:yyyy-MM-dd");
        String s = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //把文本变成日期
        Date p = sdf.parse(s);
        //把日期变成毫秒
        long time = p.getTime();
        //获取当前时间
        Date date = new Date();
        //把当前时间变成毫秒
        long time1 = date.getTime();
        //当前时间减去出生时间就是年龄
        long t =  time1 - time;
        //把年龄的毫秒值变成天数
        System.out.println(t/1000/60/60/24);
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期 格式:yyyy-MM-dd");
        String s = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(s);
        long time1 = parse.getTime();//出生时间毫秒值
        Date date = new Date();
        long time2 = date.getTime();//当前时间毫秒值
        long time = time2 - time1;
        System.out.println(time / 1000 / 60 / 60 / 24);
    }
}
