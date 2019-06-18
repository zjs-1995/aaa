package com.itheima.demo5;
/*
4.定义测试类，在main方法实现以下功能：
        创建并初始化一个Person对象per，调用方法 startStudy (Study study)
        参数：study为Study的实现类，需要实现studyPlan(Plan p)抽象方法，
        实现要求：调用参数p的printPlan ()方法
*/
public class Test {
    public static void main(String[] args) {
        Person per = new Person("张三",12);
        per.startStudy(new Study() {
            @Override
            public void studyPlan(Plan p) {
                p.printPlan();
            }
        });
    }
}
