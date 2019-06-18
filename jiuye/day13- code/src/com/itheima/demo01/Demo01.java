package com.itheima.demo01;

import java.util.*;
import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        HashSet<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        HashMap<String, String> map = new HashMap<>();
        Stream<String> stream3 = map.keySet().stream();
        Stream<String> stream4 = map.values().stream();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        Stream<Integer> stream6 = Stream.of(1, 2, 3, 4, 5);

        Integer[] arr = {1,2,3,4,5,6};
        Stream<Integer> stream7 = Stream.of(arr);
    }
}
