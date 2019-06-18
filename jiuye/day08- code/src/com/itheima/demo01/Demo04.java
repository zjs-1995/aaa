package com.itheima.demo01;

import java.io.File;

public class Demo04 {
    public static void main(String[] args) {
       // show01();
        show02();
    }

    private static void show02() {
        File file1 = new File("D:\\新建文件夹 (2)");
        File[] files = file1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    private static void show01() {
        File file1 = new File("D:\\新建文件夹 (2)");
        String[] list = file1.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
