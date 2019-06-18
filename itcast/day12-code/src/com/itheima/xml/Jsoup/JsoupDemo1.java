package com.itheima.xml.Jsoup;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        String path = JsoupDemo1.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
        Element element = document.getElementById("itcast");
        System.out.println(element);
        System.out.println("----------------");
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements);
        System.out.println("----------------");
        Elements elementsByAttributeValue = document.getElementsByAttributeValue("number", "heima_0001");
        System.out.println(elementsByAttributeValue);
        System.out.println("----------------");

        String text = element.text();
        System.out.println(text);
        System.out.println("----------------");
        String id = element.attr("id");
        System.out.println(id);
        System.out.println("----------------");

        Elements xing = element.getElementsByTag("xing");
        System.out.println(xing);
        System.out.println("----------------");
        Elements elementsByAttributeValue1 = element.getElementsByAttributeValue("id", "itcast");
        System.out.println(elementsByAttributeValue1);
    }
}
