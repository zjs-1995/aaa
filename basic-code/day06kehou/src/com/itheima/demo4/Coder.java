package com.itheima.demo4;

public class Coder {
    private String name;
    private String id;
    private int money;//工资

    //打印姓名 工号
    public void intro() {
        System.out.println("程序员姓名:"+getName());
        System.out.println("工号:"+getId());
    }
    //打印薪资
    public void showSalary(){
        System.out.println("基本工资为"+getMoney()+",奖金无");
    }
    //打印工作
    public void work(){
        System.out.println("正在努力写代码...");
    }

    public Coder() {
    }

    public Coder(String name, String id, int money) {
        this.name = name;
        this.id = id;
        this.money = money;
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
}
