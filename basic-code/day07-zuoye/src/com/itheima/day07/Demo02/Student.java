package com.itheima.day07.Demo02;

public class Student {
    private String name;
    private int age;
    private String scool;

    public Student() {
    }

    public Student(String name, int age, String scool) {
        this.name = name;
        this.age = age;
        this.scool = scool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getScool() {
        return scool;
    }

    public void setScool(String scool) {
        this.scool = scool;
    }
}
