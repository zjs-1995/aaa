package com.itheima.test;

import java.io.File;
import java.io.IOException;

public class Demo0303 {
    public static void main(String[] args) throws IOException {
        File src = new File("C:\\Users\\zjs\\Desktop\\aaa");
        File dest = new File("C:\\Users\\zjs\\Desktop\\bbb");
        copy(src,dest);
    }
    public static void copy(File src, File dest) throws IOException {
        if (src.isDirectory() && dest.isDirectory()){
            File newDir = new File(dest, src.getName());//创建对象,子父路径拼接
            newDir.mkdir();//在目标文件夹创建和源文件同名的文件夹
            File[] files = src.listFiles();
            for (File file : files) {
                if (file.isDirectory()){
                    copy(file,newDir);//复制源文件夹里每一个子文件夹到目标文件夹
                }else{
                    File file1 = new File(newDir, file.getName());
                    file1.createNewFile();
                }
            }
        }
    }
}
