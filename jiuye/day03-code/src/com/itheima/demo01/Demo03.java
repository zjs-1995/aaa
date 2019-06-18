package com.itheima.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03 {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("赵丽颖",18),"河北");
        map.put(new Person("成龙",20),"香港");
        map.put(new Person("李连杰",18),"台湾");
        map.put(new Person("范冰冰",19),"青岛");
        map.put(new Person("李连杰",18),"香港");
        Set<Map.Entry<Person, String>> set = map.entrySet();
        Iterator<Map.Entry<Person, String>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<Person, String> entry = it.next();
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
    }
}
