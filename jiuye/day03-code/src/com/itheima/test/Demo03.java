package com.itheima.test;

import java.util.HashSet;
import java.util.Random;

public class Demo03 {
    public static void main(String[] args) {

        Random random = new Random();
        HashSet<Integer> set1 = new HashSet();
        HashSet<String> set2 = new HashSet();
        for (int i = 0; i < 10; i++) {
            int i1 = random.nextInt(20) + 1;
            if (!set1.add(i1)) {
                i--;
            }
        }
        System.out.println(set1);


        long l = System.currentTimeMillis();
        for (int j = 0; j < 10; j++) {
            char[] chars = new char[10];
            for (int i = 0; i < 10; i++) {
                int a = random.nextInt(3);
                int num = -1;
                switch (a) {
                    case 0:
                        num = random.nextInt((int) 'z' -('a'- 1)) + 'a';

                        break;
                    case 1:
                        num = random.nextInt((int) 'Z' -('A'- 1)) + 'A';
                        break;
                    case 2:
                        num = random.nextInt((int) '9' -('1'- 1)) + '1';

                        break;
                }
                chars[i] = (char) num;
            }

            String str = new String(chars);
            if (!set2.add(str)) {
                j--;

            }
        }
        System.out.println(set2);
        long l1 = System.currentTimeMillis();
        System.out.println("程序运行了"+(l1-l)+"毫秒");
    }

}
