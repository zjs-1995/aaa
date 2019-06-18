package com.itheima.demo03;

import java.util.Scanner;

/*
* 模拟注册操作,如果用户名已处在,则抛出异常并提示:亲,该用户名已经被注册
* */
public class Demo02RegisterException {
   static String[] usernames = {"张三","赵四","王五"};
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String s = sc.next();
        checkUsername(s);
    }

    private static void checkUsername(String s)  {

        for (String name : usernames) {
            if (name.equals(s)){
                try {
                    throw new Demo01("亲,该用户名已经被注册");
                } catch (Demo01 demo01) {
                    demo01.printStackTrace();
                    return;
                }

            }
        }
        System.out.println("注册成功");
    }
}
