package com.itheima.demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*练习:集合元素处理（传统方式）
        现在有两个ArrayList集合存储队伍当中的多个成员姓名
        1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中
        2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
        3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中。
        4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中。
        5. 将两个队伍合并为一个队伍；存储到一个新集合中。
        6. 根据姓名创建Person对象；存储到一个新集合中。
        7. 打印整个队伍的Person对象信息。*/
public class Demo02StreamTest {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        Stream<String> stream1 = one.stream().filter((name) -> name.length() == 3).limit(3);


        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");

        Stream<String> stream2 = two.stream().filter((name) -> {
            return name.startsWith("张");
        }).skip(2);


      Stream<Person> steam = Stream.concat(stream1, stream2).map((name) -> {
            return new Person(name);
        });
      steam.forEach(person -> System.out.println(person));


      //转为list集合
        List<Person> list = steam.collect(Collectors.toList());
        //转为set集合
        Set<Person> set = steam.collect(Collectors.toSet());

        //转为数组
        Object[] objects = steam.toArray();
    }

}
