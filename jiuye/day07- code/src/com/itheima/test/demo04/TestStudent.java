package com.itheima.test.demo04;

import java.util.Arrays;
import java.util.Comparator;

public class TestStudent {
    public static void main(String[] args) {
        Student[] arr = {
                new Student("杨幂",19),
                new Student("杨洋",20),
                new Student("杨颖",30),
        };

        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore() - o2.getScore();
            }
        });
        for (Student student : arr) {
            System.out.println(student);
        }
        System.out.println("-----------------------------------");
        //标准格式
        Arrays.sort(arr,(Student o1,Student o2)->{
            return o1.getScore() - o2.getScore();
        });
        for (Student student : arr) {
            System.out.println(student);
        }
        System.out.println("-----------------------------------");


        //省略格式
        Arrays.sort(arr,(o1, o2) -> o2.getScore()-o1.getScore());
        System.out.println(Arrays.toString(arr));
    }

}
