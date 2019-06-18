package com.itheima.demo02;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.*;
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
        InputStream is = socket.getInputStream();
        while ((b = is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,b));
        }
        fis.close();
        socket.close();
    }
}
