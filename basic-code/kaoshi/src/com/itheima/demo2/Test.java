package com.itheima.demo2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person("小秋",1.72,72);
        Person p2 = new Person("小红",1.58,44);
        Person p3 = new Person("小白",1.80,55);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        for (int i = 0; i < list.size(); i++) {
            Person person = list.get(i);
            if (person.getName().equals("小白")){
                person.setWeight(person.getWeight()+10);
                person.showBMI();
            }
        }
    }
}
