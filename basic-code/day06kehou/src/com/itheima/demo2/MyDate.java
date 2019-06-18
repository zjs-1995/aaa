package com.itheima.demo2;

public class MyDate {
    private int yaer;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int yaer, int month, int day) {
        this.yaer = yaer;
        this.month = month;
        this.day = day;
    }

    public int getYaer() {
        return yaer;
    }

    public void setYaer(int yaer) {
        this.yaer = yaer;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void showDate(){
        System.out.println("日期:"+getYaer()+"年"+getMonth()+"月"+getDay()+"日");
    }
    public void isBi(){
        if ((getYaer() % 100 != 0 && getYaer() / 4 == 0) || (getYaer() % 100 == 0 && getYaer() % 400 ==0)) {
            System.out.println("闰年");
        }else {
            System.out.println(getYaer()+"不是闰年");
        }
    }
}
