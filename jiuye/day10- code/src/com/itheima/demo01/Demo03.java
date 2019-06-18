package com.itheima.demo01;

import java.io.*;

public class Demo03 {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\新建文件夹 (2)\\feiq\\Recv Files\\idea快捷键.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\新建文件夹 (2)\\idea快捷键.jpg"));
        /*
        int b = 0;
        while ((b = bis.read())!=-1){
            bos.write(b);
        }*/
        byte[] bytes = new byte[8*1024];
        int b = 0;
        while ((b = bis.read(bytes))!=-1){
            bos.write(bytes,0,b);
        }
        long s1 = System.currentTimeMillis();
        System.out.println("复制文件共耗时"+(s1-s)+"毫秒");
    }

}
