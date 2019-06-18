package com.itheima.demo04;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer01 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int b = 0;
        while ((b = is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,b));
        }
    }
}
