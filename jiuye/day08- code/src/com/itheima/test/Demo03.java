package com.itheima.test;

import java.io.File;
import java.io.IOException;

//将一个文件夹,在另外一个文件夹中创建对应的目录结构.
public class Demo03 {
    public static void main(String[] args) throws IOException {
        File src = new File("C:\\Users\\zjs\\Desktop\\aaa");
        File dest = new File("C:\\Users\\zjs\\Desktop\\bbb");
        copy(src,dest);
    }
    public static void copy(File src,File dest) throws IOException {
        if (src.isDirectory() && dest.isDirectory()){
            File newDir = new File(dest, src.getName());
            newDir.mkdir();
            File[] files = src.listFiles();
            for (File file : files) {
                if (file.isDirectory()){
                    copy(file,newDir);
                }else{
                    File file1 = new File(newDir, file.getName());
                    file1.createNewFile();
                }
            }
        }
    }
}
