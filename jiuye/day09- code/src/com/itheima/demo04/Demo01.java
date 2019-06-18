package com.itheima.demo04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//处理IO异常
public class Demo01 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("D:\\IdeaProjects\\jiuye\\day09- code\\src\\com\\itheima\\a.txt");
             FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\jiuye\\day09- code\\src\\com\\itheima\\b.txt");){
            int b = 0;
            while ((b = fis.read())!=-1){
                fos.write(b);
            }
        }catch(IOException e){
            System.out.println(e);
        }


    }
}
