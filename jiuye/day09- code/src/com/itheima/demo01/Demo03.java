package com.itheima.demo01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) throws IOException {
       /* FileOutputStream fos = new FileOutputStream("E:\\a.txt",true);
        fos.write("你好".getBytes());
        fos.close();*/

        FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\jiuye\\day09- code\\src\\com\\itheima\\demo01\\a.txt",true);
        for (int i = 0; i < 10; i++) {
            fos.write("HelloWorld".getBytes());
            fos.write("\r\n".getBytes());//换行
        }

        fos.close();
    }
}
