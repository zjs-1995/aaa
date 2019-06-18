package com.itheima.demo04;

import java.io.File;

public class Demo01 {
    public static void main(String[] args) {
        File file = new File("E:\\1");
        deleteFile(file);
    }
    public static void deleteFile(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()){

            }
            file.delete();
        }
    }
}
