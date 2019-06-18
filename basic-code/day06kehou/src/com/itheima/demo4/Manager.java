package com.itheima.demo4;

public class Manager {
    private String name;
    private String id;
    private int money;//工资
    private int salary;//奖金

    //打印姓名 工号
    public void intro() {
        System.out.println("经理姓名:"+getName());
        System.out.println("工号"+getId());
    }

    //打印薪资
    public void showSalary() {
        System.out.println("基本工资为"+getMoney()+",奖金为"+getSalary());
    }

    //打印工作
    public void work() {
        System.out.println("正在努力的做着管理工作,分配任务");
    }

    public Manager() {
    }

    public Manager(String name, String id, int money, int salary) {
        this.name = name;
        this.id = id;
        this.money = money;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
