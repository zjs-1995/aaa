package com.itheima.test;

import java.io.File;
//删除一个文件夹
public class Demo0202 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\zjs\\Desktop\\新建文件夹 (2)");
        deteleFile(file);
    }
    public static void deteleFile(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File file1 : files) {
                if (file1.isDirectory()){
                    deteleFile(file1);
                }else{
                    file1.delete();
                }
            }
            file.delete();
        }
    }
}
