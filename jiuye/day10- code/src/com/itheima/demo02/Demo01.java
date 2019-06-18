package com.itheima.demo02;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("D:\\IdeaProjects\\jiuye\\day10- code\\src\\com\\itheima\\demo02\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IdeaProjects\\jiuye\\day10- code\\src\\com\\itheima\\demo02\\b.txt"));
        String b;
        while ((b = br.readLine()) != null) {
            bw.write(b);
        }
        br.close();
        bw.close();

       /* String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);;
        }
        br.close();*/
    }
}
