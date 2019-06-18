package com.itheima.demo04;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"123","4456","asdff");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
