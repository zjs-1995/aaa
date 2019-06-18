package com.itheima.demo1;

public interface MyInterfacePrivateB {

    public static void methodStatic1(){
        System.out.println("静态方法1");
        methStaticCommon();
    }
    public static void methodStatic2(){
        System.out.println("静态方法2");
        methStaticCommon();

    }
   private static void methStaticCommon(){
        System.out.println("默认方法3");
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}

