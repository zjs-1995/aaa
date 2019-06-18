package com.itheima.demo05;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo02PrintSteam {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我在控制台输出");
        PrintStream ps = new PrintStream("D:\\IdeaProjects\\jiuye\\day10- code\\src\\com\\itheima\\demo05\\Person.txt");
        System.setOut(ps);
        System.out.println("wo");
        ps.close();
    }
}
