package com.itheima.demo04;

import java.awt.image.BufferedImageFilter;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8086);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String Line = br.readLine();
        String[] arr = Line.split(" ");
        String htmipath = arr[1].substring(1);
        FileInputStream fis = new FileInputStream(htmipath);
        OutputStream os = socket.getOutputStream();

        // 写入HTTP协议响应头,固定写法
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        // 必须要写入空行,否则浏览器不解析
        os.write("\r\n".getBytes());

        byte[] bytes = new byte[1024];
        int b = 0;
        while ((b = fis.read(bytes)) != -1) {
            os.write(bytes, 0, b);
        }
        fis.close();
        socket.close();
        server.close();
    }
}
