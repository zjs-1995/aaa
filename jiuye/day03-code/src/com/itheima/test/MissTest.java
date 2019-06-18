package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
编写一个选美小姐的类  属性有  姓名,年龄,颜值,身高  生成对应的getter setter方法.无参构造有参构造

        (1)在一个集合中存储5个选美小姐的对象.
        (2)如果你是评委,按照你的审美去给这五个人排序.
*/
public class MissTest {
    public static void main(String[] args) {
        ArrayList<Miss> list = new ArrayList<>();
        Miss miss1 = new Miss("迪丽热巴", 18, 90, 180);
        Miss miss2 = new Miss("古力娜扎", 19, 89, 170);
        Miss miss3 = new Miss("杨幂", 15, 70, 190);
        Miss miss4 = new Miss("唐嫣", 17, 100, 180);
        Miss miss5 = new Miss("刘诗诗", 20, 99, 190);
        list.add(miss1);
        list.add(miss2);
        list.add(miss3);
        list.add(miss4);
        list.add(miss5);

        Collections.sort(list, new Comparator<Miss>() {
            @Override
            public int compare(Miss o1, Miss o2) {
                int i = o1.getLooks() - o2.getLooks();
                if (i == 0) {
                    i = o1.getAge() - o2.getAge();
                    if (i == 0) {
                        i = o1.getHeight() - o2.getHeight();
                        if (i == 0) {
                            i = o1.getName().length() - o2.getName().length();
                        }
                    }
                }
                return i;
            }
        });
        System.out.println(list);
    }
}
