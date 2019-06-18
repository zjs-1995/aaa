package com.itheima.demo1;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*分析以下需求，并用代码实现
        1.已知日期字符串:"2015-10-20",将改日期字符串转换为日期对象
        2.将(1)中的日期对象转换为日历类的对象
        3.根据日历对象获取该日期是星期几,以及这一年的第几天
        4.通过键盘录入日期字符串，格式(2015-10-20)
        如输入：2015-10-20，输出"2015年-10月-20日 是 星期二，是2015年的第 293 天"*/
public class Demo01 {
    public static void main(String[] args) throws ParseException{
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期 格式yyyy-MM-dd");
        String s = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(s);


        Calendar c = Calendar.getInstance();
        int i = c.get(Calendar.DAY_OF_WEEK)-1;
        int i1 = c.get(Calendar.DAY_OF_YEAR);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = sdf2.format(parse);
        System.out.println(i);
        System.out.println(i1);
   //     System.out.println(format+"是星期五,是"++"的第81天");*/


        Scanner sc = new Scanner(System.in);
        System.out.println("输入日期 格式:yyyy-MM-dd");
        String s = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(s);

        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年-MM月-dd日");
        String format = sdf2.format(parse);
        c.setTime(parse);
        int i = c.get(Calendar.DAY_OF_WEEK)-1;
        int i1 = c.get(Calendar.DAY_OF_YEAR);
 //       System.out.println(format+"是星期"+i+",是"+c.get(Calendar.YEAR)+"的第"+i1+"天");
        String s1 = "";
        switch (i){
            case 0:
                s1+="星期日";
                break;
            case 1:
                s1+="星期一";
                break;
            case 2:
                s1+="星期二";
                break;
            case 3:
                s1+="星期三";
                break;
            case 4:
                s1+="星期四";
                break;
            case 5:
                s1+="星期五";
                break;
            default:
                s1+="星期六";
                break;
        }
        System.out.println(format+s1+",是"+c.get(Calendar.YEAR)+"的第"+i1+"天");
    }











    /*public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2015-10-20");

        Calendar c = Calendar.getInstance();
//        Date time = c.getTime();
//        System.out.println(time);

        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);
        int year = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(year);*/
    }

