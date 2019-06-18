package com.itheima.demo02;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\b.txt");
        byte[] bytes = new byte[1024];
 //       int len = fis.read();
//        System.out.println(len);
        int b = 0;
        while((b = fis.read(bytes))!= -1){
            System.out.println(new String(bytes));
        }
        fis.close();
    }
}
