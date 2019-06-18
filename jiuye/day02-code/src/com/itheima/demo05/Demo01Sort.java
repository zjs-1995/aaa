package com.itheima.demo05;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Sort {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Person p1 = new Person("张三",15);
        Person p2 = new Person("李四",25);
        Person p3 = new Person("王五",20);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);
    }
}
