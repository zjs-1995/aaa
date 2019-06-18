package com.itheima.demo04;

/*
    需求:
        给定一个厨子Cook接口，内含唯一的抽象方法makeFood，且无参数、无返回值。
        使用Lambda的标准格式调用invokeCook方法，打印输出“吃饭啦！”字样
 */
public class Demo01Cook {
    public static void main(String[] args) {
        //标准格式
        invokeCook(()->{
            System.out.println("吃饭了");
        });
        //省略格式
        invokeCook(()-> System.out.println("吃饭了"));
    }

    public static void invokeCook(Cook c) {
        c.makeFood();
    }
}
