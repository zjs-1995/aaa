package com.itheima.test;

import java.io.File;

//1.统计一个文件夹的大小
public class Demo01 {
    public static void main(String[] args) {
        File file = new File("E:\\BaiduNetdiskDownload");
        long size = getSize(file);
        System.out.println(size);
    }

    public static long getSize(File file) {
        long size = 0;
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()){
                size+=getSize(file1);
            }else{
                size+=file1.length();
            }
        }
        return size;
    }
}

