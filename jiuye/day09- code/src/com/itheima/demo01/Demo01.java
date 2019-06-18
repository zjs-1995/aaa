package com.itheima.demo01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        /*FileOutputStream fos = new FileOutputStream("E:\\a.txt");
        fos.write(97);
        fos.close();*/

        FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\jiuye\\day09- code\\src\\com\\itheima\\demo01\\a.txt");
        fos.write(97);
        fos.close();
    }
}
