package com.itheima.demo01;

public class Demo01 {
    public static void main(String[] args) {
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });

show(()-> System.out.println("使用Lambda表达式重写接口中的抽象方法"));
    }

    public static void show(MyFunctionalInterface myInter) {
        myInter.method();
    }
}
