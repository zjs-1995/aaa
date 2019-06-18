package com.itheima.demo7;
/*定义交通工具类（Vehicles），包含满参、空参构造和以下成员变量
        品牌 brand （String类型）
        颜色 color （String类型）
        成员方法showInfo()，在方法内输出"我的牌子为：xxx，颜色为：YYY"
        ”xxx为brand值，YYY为color值。*/
public class Vehicles {//交通工具类
    private String brand;
    private String color;
    public void showInfo(){
        System.out.println("我的牌子为："+brand+"，颜色为："+color);
    }

    public Vehicles() {
    }

    public Vehicles(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
