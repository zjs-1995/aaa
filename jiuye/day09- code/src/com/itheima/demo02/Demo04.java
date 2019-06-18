package com.itheima.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//文件复制
public class Demo04 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("C:\\Users\\zjs\\Desktop\\aaa\\a.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\zjs\\Desktop\\bbb\\b.txt");
            ){
            byte[] bytes = new byte[1024];
            int b = 0;
            while ((b=fis.read(bytes))!=-1){
                fos.write(bytes);
            }
        }catch (IOException e){
            System.out.println(e);
        }


    }
}
