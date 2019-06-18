package com.itheima.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*分析以下需求，并用代码实现
        要求:利用Calendar类的方法判断当前年是闰年还是平年
        提示:
        闰年:二月有29天
        将日期设置为3月1号,然后倒退1天至2月底,求出2月底是多少天*/
public class Demo03 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份 格式yyyy");
        String s = sc.next();
        String s1 = s + "-3-1";
        System.out.println(s1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(s1);

        Calendar c = Calendar.getInstance();

        c.setTime(parse);

        c.add(Calendar.DAY_OF_MONTH, -1);

        int i = c.get(Calendar.DATE);
        if (i == 29) {
            System.out.println("闰年");
        } else {
            System.out.println("平年");
        }

        int i1 = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(i1);
    }

}

