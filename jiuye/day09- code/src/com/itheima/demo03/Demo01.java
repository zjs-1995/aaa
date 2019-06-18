package com.itheima.demo03;

import java.io.FileReader;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
     /* FileReader fr = new FileReader("E:\\b.txt");
        *//*  int ch = 0;
        while ((ch = fr.read()) != -1) {
            System.out.println(ch);
            System.out.println((char) ch);
        }*//*


        char[] chars = new char[1024];
        int ch2 = 0;
        while ((ch2 = fr.read(chars))!=-1){
            System.out.println(new String(chars));
        }
        fr.close();*/

        FileReader fr = new FileReader("D:\\IdeaProjects\\jiuye\\day09- code\\src\\com\\itheima\\demo03\\a.txt");
      /*  int b = 0;
        while ((b = fr.read())!=-1){
            System.out.print((char)b);
        }
        fr.close();*/
        char[] chars = new char[1024];
        int b = 0;
        while ((b=fr.read(chars))!=-1){
            System.out.println(new String(chars,0,b));
        }
        fr.close();
    }
}
