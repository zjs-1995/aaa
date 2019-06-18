package com.itheima.xml.Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo5 {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo5.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        Elements name = document.select("name");
        System.out.println(name);
        System.out.println("=----------------");
        Elements student_name = document.select("student name");
        System.out.println(student_name);
        System.out.println("=----------------");
        Elements select = document.select("students > student");
        System.out.println(select);
        System.out.println("=----------------");
        Elements select1 = document.select("name[id=\"itcast\"]");
        System.out.println(select1);
    }
}
