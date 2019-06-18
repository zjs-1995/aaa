package com.itheima.demo04;

import java.io.File;

public class Filter {
    public static void main(String[] args) {
        File file = new File("E:\\1\\2");
        getAllFile(file);
    }
    public static void getAllFile(File dir){
        File[] files = dir.listFiles(new FileFilterImpl());
        for (File f : files) {
            if (f.isDirectory()){
                getAllFile(f);
            }else{
                System.out.println(f);
            }
        }
    }
}
