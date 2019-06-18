package com.itheima.test;

import java.util.ArrayList;

public class DemoTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("小明", 18, 60);
        Student stu2 = new Student("小黑", 19, 61);
        Student stu3 = new Student("小白", 20, 90);
        Student stu4 = new Student("小华", 21, 85);
        Student stu5 = new Student("小花", 20, 100);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        //   System.out.println(list);
        Student[] stu = list.toArray(new Student[5]);
        for (Student student : stu) {
            System.out.println(student);
        }

        ArrayList<Person> list1 = new ArrayList<>();
        Person p1 = new Person("张三", 15, 55);
        Person p2 = new Person("李四", 16, 59);
        list1.add(p1);
        list1.add(p2);

        ArrayList<Student> list2 = new ArrayList<>();
        Student student1 = new Student("张一",25,99);
        Student student2 = new Student("张二",26,89);
        list2.add(student1);
        list2.add(student2);

        list1.addAll(list2);

        for (Person person : list1) {
            System.out.println(person);
        }

    }
}
