package com.itheima.demo05;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01Arrays {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("迪丽热巴",18),
                new Person("古力娜扎",15),
                new Person("赵丽颖",30)
        };
       /* Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/
        Arrays.sort(arr,(Person o1, Person o2)->{
            return o1.getAge() - o2.getAge();
        });

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
