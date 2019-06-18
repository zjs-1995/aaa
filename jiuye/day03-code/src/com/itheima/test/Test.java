package com.itheima.test;

import java.util.HashMap;

/*.创建test类，根据以下要求完成相关功能:
        (1)创建一个名为“有料饮料售货机”的售货机（VendingMachine），
        给“饮料列表属性赋值并添加五种饮料和价格”，设置机内剩余现金总额为100.0元。
        (2)调用售货机的购买饮料方法，向售货机投入10元的真币在“有料饮料售货机”成功购买一瓶脉动。*/
public class Test {
    public static void main(String[] args) {
        HashMap<String, Float> map = new HashMap<>();
        map.put("雪碧",5.5f);
        map.put("可口可乐",30f);
        map.put("百事可乐",5f);
        map.put("脉动",4.5f);
        map.put("红牛",90f);
        VendingMachine vm = new VendingMachine("有料饮料售货机",map,100f);
        vm.buy(new Money(100,true),"红牛");
        vm.buy(new Money(100,true),"可口可乐");
        vm.buy(new Money(90,true),"红牛");
    }
}
