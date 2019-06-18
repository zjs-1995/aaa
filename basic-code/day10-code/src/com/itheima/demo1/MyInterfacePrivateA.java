package com.itheima.demo1;

public interface MyInterfacePrivateA {

    public default void methodDefault1(){
        System.out.println("默认方法1");
        methCommon();
    }
    public default void methodDefault2(){
        System.out.println("默认方法2");
        methCommon();

    }
    private void methCommon(){
        System.out.println("默认方法3");
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}

