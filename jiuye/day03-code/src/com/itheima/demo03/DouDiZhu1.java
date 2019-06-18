package com.itheima.demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DouDiZhu1 {
    public static void main(String[] args) {
        //准备牌
        HashMap<Integer, String> poker = new HashMap<>();

        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义数组存储花色和数字
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3",};

        //把大王小王存到集合里
        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        index++;
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index,number+color);
                pokerIndex.add(index);
                index++;

            }
        }
        //洗牌
        Collections.shuffle(pokerIndex);
        //发牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if (i >= 51){
                diPai.add(in);
            }else if (i % 3 == 0){
                player01.add(in);
            }else if (i % 3 == 1){
                player02.add(in);
            }else if (i % 3 == 2){
                player03.add(in);
            }
        }
        //排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);
        //看牌

    }
}
