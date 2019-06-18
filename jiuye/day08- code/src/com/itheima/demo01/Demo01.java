package com.itheima.demo01;

import java.io.File;

public class Demo01 {
    public static void main(String[] args) {
        File file1 = new File("D:\\新建文件夹 (2)\\feiq\\Recv Files");
        System.out.println(file1);

        File file2 = new File("D:\\","新建文件夹 (2)\\feiq\\Recv Files");
        System.out.println(file2);

        File parent = new File("D:\\");
        File file3 = new File(parent,"新建文件夹 (2)\\feiq\\Recv Files");
        System.out.println(file3);
    }
}
