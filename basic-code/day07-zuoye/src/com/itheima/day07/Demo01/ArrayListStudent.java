package com.itheima.day07.Demo01;

import java.util.ArrayList;

//ArrayList练习之存储自定义对象

public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张一", 18);
        Student stu2 = new Student("张二", 19);
        Student stu3 = new Student("张三", 20);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名: "+stu.getName()+", 年龄: "+stu.getAge());

        }
    }
}
