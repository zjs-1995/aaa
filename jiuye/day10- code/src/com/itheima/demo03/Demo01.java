package com.itheima.demo03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\IdeaProjects\\jiuye\\day10- code\\src\\com\\itheima\\demo03\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IdeaProjects\\jiuye\\day10- code\\src\\com\\itheima\\demo03\\out.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(0) - o2.charAt(0);
            }
        });
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
        br.close();

    }
}
