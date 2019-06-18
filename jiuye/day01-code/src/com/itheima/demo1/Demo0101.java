package com.itheima.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

/*
1.已知日期字符串:"2015-10-20",将改日期字符串转换为日期对象
2.将(1)中的日期对象转换为日历类的对象
3.根据日历对象获取该日期是星期几,以及这一年的第几天
4.通过键盘录入日期字符串，格式(2015-10-20)
	如输入：2015-10-20，输出"2015年-10月-20日 是 星期二，是2015年的第 293 天"
*/
public class Demo0101 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期格式:yyyy-MM-dd");
        String s = sc.next();
        Date p = sdf.parse(s);
        Calendar cal = Calendar.getInstance();
        cal.setTime(p);
        int i = cal.get(Calendar.DAY_OF_WEEK)-1;
        String[] arr = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        int i1 = cal.get(Calendar.DAY_OF_YEAR);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年-MM月-dd日");
        String format = sdf1.format(p);
        System.out.println(format+" 是 "+arr[i]+", 是"+cal.get(Calendar.YEAR)+"年的第"+i1+"天");
    }

}
