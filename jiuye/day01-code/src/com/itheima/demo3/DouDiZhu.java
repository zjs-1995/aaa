package com.itheima.demo3;

import java.util.ArrayList;
import java.util.Collections;

/*
* 模拟斗地主
* */
public class DouDiZhu {
    public static void main(String[] args) {
        //先准备牌
        //定义一个集合,存储54张牌
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组,存储花色和序号
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //先把大王和小王存到poker集合中
        poker.add("大王");
        poker.add("小王");
        //用增强for遍历poker集合
        for (String number : numbers){
            for (String color: colors) {
          //      System.out.println(color+number);
                poker.add(color+number);
            }
        }
        //System.out.println(poker);
        //洗牌  static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换。
        Collections.shuffle(poker);
    //    System.out.println(poker);
        //发牌  定义四个集合,存储三个玩家的牌和三张底牌
        ArrayList<String> poker1 = new ArrayList<>();
        ArrayList<String> poker2 = new ArrayList<>();
        ArrayList<String> poker3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            String s = poker.get(i);
            //轮流发牌
            if (i >= 51){
                diPai.add(s);//发底牌
            }else if (i % 3 == 0){
                poker1.add(s);
            }else if (i % 3 == 1){
                poker2.add(s);
            }else if (i % 3 == 2){
                poker3.add(s);
            }
        }
        //看牌
        System.out.println("刘德华"+poker1);
        System.out.println("周润发"+poker2);
        System.out.println("周星驰"+poker3);
        System.out.println("底牌"+diPai);
    }


}
