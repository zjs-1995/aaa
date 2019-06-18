package com.itheima.test;

import java.io.File;
//统计一个文件夹的大小
public class Demo0101 {
    public static void main(String[] args) {
        File file = new File("E:\\BaiduNetdiskDownload\\预习班资料\\软件\\必安");
        long size = getSize(file);
        System.out.println(size);
    }

    public static long getSize(File dir) {
        long size = 0;
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                size += getSize(file);
            } else {
                size += file.length();
            }
        }
        return size;
    }
}
