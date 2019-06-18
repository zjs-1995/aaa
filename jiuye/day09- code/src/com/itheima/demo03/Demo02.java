package com.itheima.demo03;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\IdeaProjects\\" +
                "jiuye\\day09- code\\src\\com\\itheima\\a.txt");
        fw.write(97);
        fw.write('a');
        fw.flush();
        fw.close();
    }
}
