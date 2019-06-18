package com.itheima.demo06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//复制文件夹
public class Demo {
    public static void main(String[] args) {
        File src = new File("D:\\IdeaProjects\\aaa\\09_test");
        File dest = new File("C:\\Users\\yanjingpan\\Desktop\\a");
        copy(src,dest);
    }
    /*
    复制文件夹
    参数 File src，File dest
     */
    public static void copy(File src,File dest){
        if (src.isDirectory() && dest.isDirectory()){
            //在dest文件夹下创建一个src同名的文件夹
            File newDir = new File(dest, src.getName());
            newDir.mkdir();
            //将src下边的孩子复制到newDir中
            File[] files = src.listFiles();
            for (File file : files) {
                if (file.isDirectory()){
                    copy(file,newDir);
                }else {
                    //复制文件
                    try (
                            FileInputStream fis = new FileInputStream(file);
                            FileOutputStream fos = new FileOutputStream(new File(newDir,file.getName()))
                    ) {
                        byte[] bytes = new byte[1024];
                        int len;
                        while ((len = fis.read(bytes)) != -1){
                            fos.write(bytes,0,len);
                        }
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
