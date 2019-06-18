package com.itheima.demo05;

import java.io.*;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\IdeaProjects\\jiuye\\day10- code\\src\\com\\itheima\\demo05\\Prson.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("D:\\IdeaProjects\\jiuye\\day10- code\\src\\com\\itheima\\demo05\\copyPerson.txt"));
        String line;
        while ((line = br.readLine())!=null){
            pw.println(line);
        }
        br.close();
        pw.close();
    }
}
