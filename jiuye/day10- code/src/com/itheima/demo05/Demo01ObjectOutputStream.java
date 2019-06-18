package com.itheima.demo05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\IdeaProjects\\jiuye\\day10- code\\src\\com\\itheima\\demo05\\Person.txt"));
        oos.writeObject(new Person("小美女",18));
        oos.close();
    }
}
