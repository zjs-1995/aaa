package com.itheima.demo03;

import java.io.File;

public class Demo04 {
    public static void main(String[] args) {
        File file = new File("E:\\BaiduNetdiskDownload\\预习班资料\\学习资料\\就业班\\08\\avi");
        getAllFile(file);
    }
    public static void getAllFile(File dir){
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()){
                getAllFile(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
