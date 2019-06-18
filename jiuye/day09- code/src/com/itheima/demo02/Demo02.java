package com.itheima.demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\jiuye\\day09- code\\src\\com\\itheima\\demo02\\a.txt");
        byte[] bytes = {65,66,67,68,69};
        fos.write(bytes);
        fos.close();

        /*FileInputStream fis = new FileInputStream("D:\\IdeaProjects\\jiuye\\day09- code\\src\\com\\itheima\\demo02\\a.txt");
        byte[] bytes1 = new byte[2];
        int read = fis.read(bytes1);
        System.out.println(read);
        System.out.println(Arrays.toString(bytes1));
        fis.close();*/

        FileInputStream fis = new FileInputStream("D:\\IdeaProjects\\jiuye\\day09- code\\src\\com\\itheima\\demo02\\a.txt");
        byte[] bytes1 = new byte[1024];
        int b = 0;
        while ((b = fis.read(bytes1))!=-1){
         //   System.out.println(new String(bytes1));
            System.out.println(new String(bytes1,0,5));
        }
        fis.close();
    }
}
