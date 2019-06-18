package com.itheima.demo04;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8806);
        while (true) {
            Socket accept = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = accept.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String line = br.readLine();
                        System.out.println(line);

                        String[] arr = line.split(" ");
                        String htmlpath = arr[1].substring(1);

                        FileInputStream fis = new FileInputStream(htmlpath);
                        OutputStream os = accept.getOutputStream();

                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        // 必须要写入空行,否则浏览器不解析
                        os.write("\r\n".getBytes());

                        int len;
                        byte[] bytes = new byte[1024];
                        while ((len = fis.read(bytes)) != -1) {
                            os.write(bytes, 0, len);
                        }

                        fis.close();
                        accept.close();


                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }).start();

        }


    }
}

