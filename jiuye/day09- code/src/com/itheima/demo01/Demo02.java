package com.itheima.demo01;

import javax.print.DocFlavor;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
      /*  FileOutputStream fos = new FileOutputStream("E:\\a.txt");
        byte[] bytes1 = {50,61,59,97};
       // fos.write(bytes1);
        byte[] bytes2 = {-65,69,59,97};
        fos.write(bytes2);
        fos.close();*/

        FileOutputStream fos = new FileOutputStream("D:\\IdeaProjects\\jiuye\\day09- code\\src\\com\\itheima\\demo01\\a.txt");
        byte[] bytes = {65, 66, 67, 68, 69};
        //byte[] bytes1 = {-65,-66,-67,68,69};
        // fos.write(bytes);
        // fos.write(bytes1);
        fos.write(bytes, 0, 3);
        fos.close();
    }
}
