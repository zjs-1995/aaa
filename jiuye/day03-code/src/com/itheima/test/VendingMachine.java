package com.itheima.test;

import java.util.HashMap;

/*
创建自动售货机类(VendingMachine)
		属性有机器名称、饮料列表（HashMap<String, Float>）、机内剩余现金总额（float类型）
在VendingMachine类中定义购买饮料的方法：
        传入钞票和饮料名称后，需要判断传入的钞票是否为真、面值是否足够购买此类饮料；若不符合购买条件给出错误提示，
        结束购买流程；若购买成功后需打印出找零金额和目前机内现金总额；
*/
public class VendingMachine {
    private String name;
    private HashMap<String, Float> drink;
    private float symoney;

    public VendingMachine() {
    }

    public VendingMachine(String name, HashMap<String, Float> drink, float symoney) {
        this.name = name;
        this.drink = drink;
        this.symoney = symoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Float> getDrink() {
        return drink;
    }

    public void setDrink(HashMap<String, Float> drink) {
        this.drink = drink;
    }

    public float getSymoney() {
        return symoney;
    }

    public void setSymoney(float symoney) {
        this.symoney = symoney;
    }

    public void buy(Money money, String name) {
        if (money.isZj()) {
            if (money.getMz()>=drink.get(name)){
                System.out.println("找零"+(money.getMz() - drink.get(name)));
                System.out.println("总额"+(symoney+drink.get(name)));
            }else {
                System.out.println("钱不够");
            }
        }else {
            System.out.println("钱是假的");
        }

    }
}
