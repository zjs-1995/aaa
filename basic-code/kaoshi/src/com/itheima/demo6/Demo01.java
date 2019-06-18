package com.itheima.demo6;


import java.util.ArrayList;

/*.定义一个无返回值，参数为String[] 数组的方法，实现以下功能：
        1.把数组中的元素存入到一个ArrayList集合中，删除集合中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字
           就需要删除此整个字符串)。
        2.遍历该集合打印剩余元素。
        3.在main方法中，定义一个字符串数组
        String arr[]={“0af3s2sf”,”s6ds1”,”jjww”,”lailai”}，
        并将这个字符串数组传入上述方法中，进行测试。
        示例如下：
        删除有数字的字符串之后的集合元素有：
        jjww
        lailai*/
public class Demo01 {
    public static void main(String[] args) {
        String arr[] = {"0af3s2sf", "s6ds1", "jjww", "lailai"};
        method(arr);
    }

    public static void method(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list.add(arr[i]);
        }
        //  删除集合中包含0-9数字的字符串  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            String s = list.get(i);
            char[] chars = s.toCharArray();
            boolean b = false;
            for (int i1 = 0; i1 < chars.length; i1++) {
                char aChar = chars[i];
                if (aChar >= '0' && aChar <= '9') {
                    b = true;
                    break;
                }
            }
            if (b){
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
