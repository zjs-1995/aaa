package com.itheima.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03 {
    public static void main(String[] args) {
        try (  FileInputStream fis = new FileInputStream("D:\\IdeaProjects\\jiuye\\day09- code\\src\\com\\itheima\\demo02\\a.txt");
               FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\jiuye\\day09- code\\src\\com\\itheima\\demo02\\b.txt");
               ){
            byte[] bytes = new byte[1024];
            int b = 0;
            while ((b = fis.read(bytes))!=-1){
                fos.write(bytes,0,5);
            }
        }catch(IOException e){
            System.out.println(e);
        }


    }
}
