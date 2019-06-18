package com.itheima.dao;

public class User implements Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void desc(){
        System.out.println("hi"+name);
    }
}
