package com.itheima.demo02;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    /* public static void main(String[] args) throws IOException {
       ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        File file = new File("e:\\a");
        if (!file.exists()){
            file.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream(file+"\\1.jpg");

        int len =0;
        byte[] bytes = new byte[1024];
        while((len = is.read(bytes))!=-1){
            //7.使用本地字节输出流FileOutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘上
            fos.write(bytes,0,len);
        }
        socket.getOutputStream().write("上传成功".getBytes());
        fos.close();
        socket.close();
        server.close();
    }*/

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        File file = new File("e:\\a");
        if (!file.exists()){
            file.mkdirs();
        }

        FileOutputStream fos = new FileOutputStream(file + "\\1.jpg");

        int b= 0;
        byte[] bytes = new byte[1024];
        while((b = is.read(bytes))!=-1){
            fos.write(bytes,0,b);
        }
        OutputStream os= socket.getOutputStream();
        os.write("上传成功".getBytes());
        fos.close();
        server.close();
        socket.close();
    }
}
