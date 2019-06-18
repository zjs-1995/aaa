package com.itheima.demo7;

/*定义船类（Boat），继承Vehicles类，实现Run接口，包含满参、空参构造
        重写runInRoad()方法，方法内调用showInfo()方法，并输出"我航行在海上"
        重写takePassager(int num)方法，在方法内做比较，如果num大于500，就输出" 船上没有足够的座位！"，
        否则就输出"船上有足够的座位！"*/
public class Boat extends Vehicles implements Run {
    public Boat() {
    }

    public Boat(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void runInRoad() {
        showInfo();
        System.out.println("我航行在海上");
    }



    @Override
    public void takePassager(int num) {
        if (num > 500){
            System.out.println(" 船上没有足够的座位！");
        }else {
            System.out.println("船上有足够的座位！");
        }
    }
}
