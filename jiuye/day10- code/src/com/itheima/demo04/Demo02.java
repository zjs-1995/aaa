package com.itheima.demo04;

import java.io.*;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\IdeaProjects\\jiuye\\day10- code\\src\\com\\itheima\\demo04\\a.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\IdeaProjects\\jiuye\\day10- code\\src\\com\\itheima\\demo04\\b.txt"), "utf-8");
        int b = 0;
        while ((b = isr.read())!=-1){
            osw.write(b);
        }
        isr.close();
        osw.close();

    }
}
