package com.itheima.demo03;

import java.util.HashSet;

public class Demo01HashSetPerson {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小美女",15);
        Person p2 = new Person("小美女",15);
        Person p3 = new Person("小美女",16);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
