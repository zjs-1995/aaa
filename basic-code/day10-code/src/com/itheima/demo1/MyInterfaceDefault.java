package com.itheima.demo1;

public interface MyInterfaceDefault {

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法");
    }
}
