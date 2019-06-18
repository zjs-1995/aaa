package com.itheima.day07.Demo04;

public class Test3 {
    public static void main(String[] args) {
        int workAge = 10;
        int yzgz = 0;
        if (workAge < 0 && workAge >= 15){
            System.out.println("输入不正确");
        }else if (workAge>=0&& workAge < 1){
            yzgz = 200;
        }else if (workAge >= 1 && workAge <3){
            yzgz = 500;
        }else if (workAge >= 3 && workAge < 5){
            yzgz = 1000;
        }else if (workAge >= 5 && workAge < 10){
            yzgz = 2500;
        }else {
            yzgz = 5000;
        }
        System.out.println("您目前工作了"+workAge+"年,基本工资为3000元,应涨工资"+yzgz+"元,涨后工资"+(3000+yzgz)+"元");
    }
}
