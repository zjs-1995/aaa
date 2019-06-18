package com.itheima.demo7;
/*5.创建Car对象并赋值，并调用showCar()、runInRoad()方法，键盘录入并提示"请输入乘坐XXX的人数"，xxx为Car的品牌，并接收用户输出。
        调用takePassager(num)方法
        5.2  创建Boat对象并赋值，调用runInRoad（）方法 ，键盘录入并提示
        "请输入乘坐XXX的人数"，xxx为Boat的品牌，并接收用户输出。
        调用takePassager(num)方法*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("宝马", "黑色", 5);

        car.showInfo();
        car.runInRoad();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入乘坐" + car.getBrand() + "的人数");
        int num = sc.nextInt();
        car.takePassager(num);

        Boat boat = new Boat("船", "红色");
        boat.runInRoad();

       // Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入乘坐" + boat.getBrand() + "的人数");
        int num1 = sc.nextInt();

        boat.takePassager(num1);
    }
}
