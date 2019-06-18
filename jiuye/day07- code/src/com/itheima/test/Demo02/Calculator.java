package com.itheima.test.Demo02;
/*问题：给定一个计算器 Calculator 接口，内含抽象方法 calc (减法)，
        其功能是可以将两个数字进行相减，并返回差值。使用Lambda表达式在Test中完成调用。*/
public interface Calculator {
    public abstract int calc(int a,int b);
}
