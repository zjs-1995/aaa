package com.itheima.demo2;

public class Demo04 <E>{
    private E name;

    public Demo04() {
    }

    public Demo04(E name) {
        this.name = name;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
