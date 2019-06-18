package com.itheima.demo01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\jiuye\\day10- code\\src\\com\\itheima\\demo01\\a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("写数据".getBytes());
        bos.flush();
        bos.close();
    }
}
