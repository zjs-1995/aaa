package com.itheima.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
//发到手里牌是有序的
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        HashMap<Integer, String> poker = new HashMap<>();

        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义两个数组,存储花色和序号
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //把大王和小王存储到集合中
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color + number);
                pokerIndex.add(index);
                index++;
            }
        }
//        System.out.println(poker);
//        System.out.println(pokerIndex);

        //2.洗牌
        Collections.shuffle(pokerIndex);

        //3.发牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        //遍历存储牌索引的list集合,获取每一个索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            //先判断底牌
            if (i >= 51) {
                diPai.add(in);
            } else if (i % 3 == 0) {
                player01.add(in);
            } else if (i % 3 == 1) {
                player02.add(in);
            } else if (i % 3 == 2) {
                player03.add(in);
            }
        }
        //4.排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);

        //5.看牌
        lookPoker("刘德华", poker, player01);
        lookPoker("周润发", poker, player02);
        lookPoker("周星驰", poker, player03);
        lookPoker("底牌", poker, diPai);
    }

    public static void lookPoker(String name, HashMap<Integer, String> poker, ArrayList<Integer> list) {
        System.out.print(name + ": ");
        for (Integer integer : list) {
            String s = poker.get(integer);
            System.out.print(s + "");
        }
        System.out.println();//打印完每一个玩家的牌换行
    }
}
