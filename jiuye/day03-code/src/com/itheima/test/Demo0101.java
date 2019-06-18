package com.itheima.test;

import java.lang.reflect.Array;
import java.util.*;

/*分析以下需求，并用代码实现
        1.生成10个1至100之间的随机整数(不能重复)，存入一个集合
        2.然后利用迭代器和增强for循环分别遍历集合元素并输出
        3.如：15 18 20 40 46 60 65 70 75 91*/
public class Demo0101 {
    public static void main(String[] args) {
        Random r = new Random();

        HashSet<Integer> set = new HashSet<>();
       /* for (int i = 0; i < 10; i++) {
            int i1 = r.nextInt(100)+1;
            set.add(i1);
        }
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer next = it.next();
            System.out.print(next+" ");
        }*/

    while(true){
        int i = r.nextInt(100)+1;
        set.add(i);
        if (set.size()==10){
            break;
        }
    }
        System.out.println(set);
    }
}
