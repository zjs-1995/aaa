package com.itheima.demo04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo01 {
    public static void main(String[] args) throws IOException {
       /* OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\IdeaProjects\\jiuye\\day10- code\\src\\com\\itheima\\demo04\\a.txt"));
        osw.write("你好");
        osw.flush();
        osw.close();*/

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\IdeaProjects\\jiuye\\day10- code\\src\\com\\itheima\\demo04\\a.txt"),"gbk");
        osw.write("你好");
        osw.flush();
        osw.close();
    }
}
