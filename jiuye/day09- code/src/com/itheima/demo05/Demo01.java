package com.itheima.demo05;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.setProperty("迪丽热巴","18");
        pro.setProperty("赵丽颖","15");
        pro.setProperty("古力娜扎","20");

       /* Set<String> set = pro.stringPropertyNames();
        for (String s : set) {
            String value = pro.getProperty(s);
            System.out.println(value);
        }*/

        FileWriter fw = new FileWriter("D:\\IdeaProjects\\jiuye\\day09- code\\src\\com\\itheima\\prp.txt");
        pro.store(fw,"save date");
        fw.close();
    }
}
