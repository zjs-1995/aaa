package com.itheima.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
   /* public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int b = 0;
        b = is.read(bytes);
        System.out.println(new String(bytes,0,b));
        OutputStream os = socket.getOutputStream();
        os.write("谢谢,收到".getBytes());
        server.close();
        socket.close();
    }*/

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int b= 0;
        b=is.read(bytes);
        System.out.println(new String(bytes,0,b));
        OutputStream os = socket.getOutputStream();
        os.write("谢谢,收到".getBytes());
        server.close();
        socket.close();
    }
}
