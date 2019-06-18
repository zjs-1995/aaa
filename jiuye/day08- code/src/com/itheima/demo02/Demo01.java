package com.itheima.demo02;

import java.io.File;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
       // show01();
       // show02();
       // show03();
        show04();
    }

    private static void show04() {
        File file = new File("E:\\1");
        boolean delete = file.delete();
        System.out.println(delete);
    }

    private static void show03() {
        File file = new File("E:\\1\\2\\3");
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);
    }

    private static void show02() {
        File file1 = new File("E:\\1");
        boolean mkdir = file1.mkdir();
        System.out.println(mkdir);
    }

    private static void show01() throws IOException {
        File file1 = new File("E:\\1.txt");
        boolean b1 = file1.createNewFile();
        System.out.println(b1);
    }
}
