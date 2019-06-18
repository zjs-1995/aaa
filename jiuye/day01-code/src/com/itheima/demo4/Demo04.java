package com.itheima.demo4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo04 {
    public static void main(String[] args) throws ParseException {
       /* Calendar c = Calendar.getInstance();
        int date = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(date);

        c.set(Calendar.YEAR,2020);
        System.out.println(c.get(Calendar.YEAR));*/

        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("1999-01-01");
        c.setTime(date);
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
    }
}
