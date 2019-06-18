package com.itheima.demo06;

import com.itheima.demo02.Person;

public class Demo {
    public static void printName(String name,PersonBuilder pb){
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        printName("张韶涵",(String name)->{
            return new Person(name);
        });
    }
}
