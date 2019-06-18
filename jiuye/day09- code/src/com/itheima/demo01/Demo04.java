package com.itheima.demo01;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo04 {
    public static void main(String[] args) throws IOException {
       /* FileInputStream fis = new FileInputStream("E:\\b.txt");
        int len = 0;
        while((len = fis.read())!=-1){
            System.out.println(len);
        }
        fis.close();*/

        FileInputStream fis = new FileInputStream("D:\\IdeaProjects\\jiuye\\day09- code\\src\\com\\itheima\\demo01\\a.txt");
        /*int read = fis.read();
        System.out.println(read);
        fis.close();*/
        int b = 0;
        while ((b = fis.read()) != -1) {
            System.out.println(b);
        }
        fis.close();
    }
}
