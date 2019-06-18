package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
问题：以下是某不知名机构评出的全球最佳影片及华人最佳影片前十名 ：
        全球
        　　1、 《教父》2、 《肖申克的救赎》3、 《辛德勒的名单》4、 《公民凯恩》5、 《卡萨布兰卡》
        　　6、 《教父续集》7、 《七武士》8、 《星球大战》9、 《美国美人》10、 《飞跃疯人院》
        华人
        　  1、 《霸王别姬》2、 《大闹天宫》3、 《鬼子来了》4、 《大话西游》5、 《活着》
        　　6、 《饮食男女》7、 《无间道》8、 《天书奇谭》9、 《哪吒脑海》10、 《春光乍泄》
        1、现将两个榜单中的影片名，分别按排名顺序依次存入两个ArrayList集合
        2、通过流的方式
        1）打印全球影片排行榜中的前三甲影片名
        2）打印华人影片排行榜中倒数5名的影片名
        3）将两个排行榜中的前5名挑出来共同存入新的集合
        4）定义电影Film类，以影片名为name创建Film对象并保存至集合
*/
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        //1、现将两个榜单中的影片名，分别按排名顺序依次存入两个ArrayList集合
        Collections.addAll(list1,"1、 《教父》","2、 《肖申克的救赎》","3、 《辛德勒的名单》","4、 《公民凯恩》",
                "5、 《卡萨布兰卡》","6、 《教父续集》","7、 《七武士》","8、 《星球大战》","9、 《美国美人》","10、 《飞跃疯人院》");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"1、 《霸王别姬》","2、 《大闹天宫》","3、 《鬼子来了》","4、 《大话西游》","5、 《活着》",
                "6、 《饮食男女》","7、 《无间道》","8、 《天书奇谭》","9、 《哪吒脑海》","10、 《春光乍泄》");
        //1）打印全球影片排行榜中的前三甲影片名
        Stream<String> stream1 = list1.stream().limit(3);
        stream1.forEach((String s)->{
            System.out.println(s);
        });
        //2）打印华人影片排行榜中倒数5名的影片名
        Stream<String> stream2 = list2.stream().skip(5);
        stream2.forEach((String s)->{
            System.out.println(s);
        });
        //3）将两个排行榜中的前5名挑出来共同存入新的集合
        ArrayList<String> list3 = new ArrayList<>();
        Stream<String> stream3 = list1.stream().limit(5);
        Stream<String> stream4 = list2.stream().limit(5);
        Stream<String> concat = Stream.concat(stream3, stream4);
        List<String> list = concat.collect(Collectors.toList());
        //4）定义电影Film类，以影片名为name创建Film对象并保存至集合
     //   Film film = new Film();
        list.stream().map(s->new Film(s)).forEach((s)->{
            System.out.println(s);
        });
    }
}
