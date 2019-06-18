package com.itheima.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
   /* public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        os.write("你好,服务器".getBytes());
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int b = 0;
        b = is.read(bytes);
        System.out.println(new String(bytes,0,b));
        socket.close();
    }*/

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        os.write("你好,服务器".getBytes());
        InputStream is = socket.getInputStream();

        byte[] bytes = new byte[1024];
        int b = 0;
        b = is.read(bytes);
        System.out.println(new String(bytes,0,b));
        socket.close();
    }
}
