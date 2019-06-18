package com.itheima.demo01;

import java.io.File;

public class Demo02 {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }

    private static void show04() {
        File file1 = new File("D:\\新建文件夹 (2)\\feiq\\Recv Files\\day04作业.java");
        File file2 = new File("D:\\新建文件夹 (2)\\feiq\\Recv Files");
        long length = file1.length();
        long length1 = file2.length();
        System.out.println(length);
        System.out.println(length1);
    }

    private static void show03() {
        File file1 = new File("D:\\新建文件夹 (2)\\feiq\\Recv Files");
        String name = file1.getName();
        System.out.println(name);
    }

    private static void show02() {
        File file1 = new File("D:\\新建文件夹 (2)\\feiq\\Recv Files");
        String path = file1.getPath();
        System.out.println(path);
    }

    private static void show01() {
        File file1 = new File("D:\\新建文件夹 (2)\\feiq\\Recv Files");
        //  File file2 = new File("feiq\\Recv Files");
        File ab1 = file1.getAbsoluteFile();
        //  File ab2 = file2.getAbsoluteFile();
        System.out.println(ab1);
        //   System.out.println(ab2);
    }
}
