package com.itheima.demo5;
/*3.定义类Person，包含空参、满参构造和以下成员变量
        姓名 name（String类型）
        年龄 age（int类型）
        生成所有成员变量set/get方法
        定义成员方法：void startStudy (Study study)，要求：输出“xxx开始学习”，然后在方法内依次调用studyHard()，
        studyPlan(Plan p)
        PS：xxx为变量name值，参数p需要自行创建并初始化变量read与 test*/
public class Person {
    private String name;
    private int age;

    public void startStudy (Study study){
        System.out.println(name+"开始学习");
        study.studyHard();
        Plan plan = new Plan("java","helloWorld");
        study.studyPlan(plan);
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
