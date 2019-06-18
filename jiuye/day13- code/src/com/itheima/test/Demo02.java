package com.itheima.test;


import java.util.ArrayList;
import java.util.stream.Stream;

//已知数组arr1中有如下元素{郭靖，杨康}，arr2中有如下元素{黄蓉，穆念慈}，
// 使用Stream将二者合并到List集合
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String[] arr1 = {"郭靖","杨康"};
        String[] arr2 = {"黄蓉","穆念慈"};
        Stream<String> stream1 = Stream.of(arr1);
        Stream<String> stream2 = Stream.of(arr2);
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach((String s)->{
            list.add(s);
        });
        for (String s : list) {
            System.out.println(s);
        }
    }
}
