package com.itheima.demo03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
   /* public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\1.jpg");
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int b = 0;
        while ((b=fis.read(bytes))!=-1){
            os.write(bytes,0,b);
        }

        socket.shutdownOutput();

        *//*InputStream is = socket.getInputStream();
        byte[] bytes1 = new byte[1024];
        int b1 = 0;
        while ((b1=is.read())!=-1){
            os.write(bytes1,0,b1);
        }*//*
        InputStream is = socket.getInputStream();
        while ((b=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,b));
        }
        fis.close();
        socket.close();
    }*/

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\1.jpg");
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        int b = 0;
        byte[] bytes = new byte[1024];
        while ((b = fis.read())!=-1){
            os.write(bytes,0,b);
        }
        //给服务器写(while循环)一个结束标语,终止循环
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        while ((b = is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,b));
        }
        fis.close();
        socket.close();
    }
}
