package com.itheima.demo01;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args)  {
        readFile("c:\\a.txt");
    }
    public static void readFile(String fileName)  {
        /*if (!fileName.equals("c:\\a.txt")){
            try {
                throw new FileNotFoundException("传递的文件路径不是c:\\\\a.txt");
            } catch (FileNotFoundException e) {
               // e.printStackTrace();
            }finally {
                System.out.println("dfasfdsdf");
            }
        }*/
        if (fileName.endsWith(".txt")){
            try {
                throw new IOException("文件后缀名不对");
            } catch (IOException e) {
              //  e.printStackTrace();
            }
            finally {;;;;
                System.out.println("dfsgsg");
            }
        }
    //    System.out.println("路径没有问题,读取文件");
    }
}
