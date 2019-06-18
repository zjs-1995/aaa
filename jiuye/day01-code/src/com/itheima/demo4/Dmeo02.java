package com.itheima.demo4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dmeo02 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(d);

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
//        Date date = sdf.parse("2019年03月22日 11时18分17秒");
//        System.out.println(date);
    }
}
