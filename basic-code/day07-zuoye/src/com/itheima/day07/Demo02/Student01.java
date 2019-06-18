package com.itheima.day07.Demo02;

import java.util.ArrayList;

public class Student01 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        /*创建一个对象,名为stu1,赋值名字是小红,年龄12岁,学校是小学
        创建一个对象,名为stu2,赋值名字是小米,年龄21岁,学校是大学
        创建一个对象,名为stu3,赋值名字是小明,年龄14岁,学校是初中
        把三个对象存入集合中
        把stu1地址值赋值给list集合,索引值0;
        把stu2地址值赋值给list集合,索引值1;
        把stu3地址值赋值给list集合,索引值2;

        */

        Student stu1 = new Student("小红", 12, "小学");
        Student stu2 = new Student("小米", 21, "大学");
        Student stu3 = new Student("小明", 14, "初中");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //for循环遍历集合,if语句找出年龄小于15的人的地址,把学历改为幼儿园

        for (int i = 0; i < list.size(); i++) {
            Student a = list.get(i);//找到需要改的元素,赋值给a
            int age = a.getAge();//找出他的年龄,赋值给age
            if (age < 15){    //if语句找出符合条件的年龄
                a.setScool("幼儿园");//把符合条件的用set方法把学历改为幼儿园
            }

        }
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName()+"-"+s.getAge()+"-"+s.getScool());

        }
    }

}

