package com.itheima.demo01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\IdeaProjects\\jiuye\\day10- code\\src\\com\\itheima\\demo01\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int b = 0;
        while ((b = bis.read())!=-1){
            System.out.println(b);
        }
        bis.close();
     /*int b = 0;
        byte[] bytes = new byte[1024];
        while ((b = bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,b));
        }
        bis.close();*/
    }
}
