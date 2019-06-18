package com.itheima.test.demo03;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student[] stu = {
                new Student("迪丽热巴",50),
                new Student("赵丽颖",70),
                new Student("古力娜扎",90)
        };

        Arrays.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore() - o1.getScore();
            }
        });

        Arrays.sort(stu,(o1, o2) -> o1.getScore() - o2.getScore());

        System.out.println(Arrays.toString(stu));
        for (Student student : stu) {
            System.out.println(student);
        }
    }

}
