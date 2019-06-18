package com.itheima.demo01;

import java.io.File;

public class Demo03 {
    public static void main(String[] args) {
        show01();
        show02();
    }

    private static void show02() {
        File file1 = new File("D:\\新建文件夹 (2)\\feiq\\Recv Files\\day04作业.java");
        if (file1.exists()) {
            boolean directory = file1.isDirectory();
            System.out.println(directory);
            boolean file = file1.isFile();
            System.out.println(file);
        }
    }

    private static void show01() {
        File file1 = new File("D:\\新建文件夹 (2)\\feiq\\Recv Files");
        boolean exists = file1.exists();
        System.out.println(exists);
    }
}
