package com.itheima.day07.Demo01;

import java.util.ArrayList;

// ArrayList练习之按指定格式遍历集合字符串
public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
     //   System.out.println(list);

        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
           String name = list.get(i);
           if (i == list.size()-1){
               System.out.println(name+"}");
           }else {
               System.out.print(name + "@");
           }
        }
    }
}
