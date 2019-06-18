package com.itheima.test;

import java.util.ArrayList;

/*分析以下需求，并用代码实现
        1.有如下代码：
public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("d");
        }
        2.定义一个noRepeat()方法,要求对传递过来集合中进行元素去重
public static void noRepeat(ArrayList<String> al){

        }*/
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("c");
        list.add("c");
        list.add("a");
        list.add("d");
        noRepeat(list);
    }
    public static void noRepeat(ArrayList<String> al){
        ArrayList<String> list1 = new ArrayList<>();

        for (String s : al) {
//            System.out.println(s);
            if (list1.contains(s)){
               // list1.remove(s);
            }else {
                list1.add(s);
            }

        }
        System.out.println(list1);
    }

}
