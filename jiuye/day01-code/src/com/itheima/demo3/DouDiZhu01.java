package com.itheima.demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DouDiZhu01 {
    public static void main(String[] args) {
        //准备牌
        ArrayList<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");
        String[] colors = {"♠", "♥", "♦", "♣"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        for (String color : colors) {
            for (String number : numbers) {
                poker.add(number + color);
            }
        }
        //洗牌
        Collections.shuffle(poker);
        //发牌
        ArrayList<String> plary01 = new ArrayList<>();
        ArrayList<String> plary02 = new ArrayList<>();
        ArrayList<String> plary03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if (i >= 51) {
                diPai.add(s);
            } else if (i % 3 == 0) {
                plary01.add(s);
            } else if (i % 3 == 1) {
                plary02.add(s);
            } else if (i % 3 == 2) {
                plary03.add(s);
            }
        }
        //看牌
        System.out.println("刘德华"+plary01);
        System.out.println("周润发"+plary02);
        System.out.println("周星驰"+plary03);
        System.out.println("底牌"+diPai);
    }
}
