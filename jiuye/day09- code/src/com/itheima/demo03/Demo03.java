package com.itheima.demo03;

import java.io.FileWriter;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\IdeaProjects\\jiuye\\day09- code\\src\\com\\itheima\\a.txt");
        char[] chars = {'1','a','2','b'};
        fw.write(chars);
        fw.flush();
        fw.write(chars,0,3);
        fw.flush();
        fw.write("传智播客");
        fw.flush();

        fw.close();
    }
}
