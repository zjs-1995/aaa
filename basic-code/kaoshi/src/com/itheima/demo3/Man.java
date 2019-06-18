package com.itheima.demo3;

public class Man extends People implements Movement{

    @Override
    void speak(String str) {
        System.out.println("姓名为"+getName()+"的"+getCountry()+"人在说着"+str);
    }

    public Man() {
    }

    public Man(String name, String country) {
        super(name, country);
    }

    @Override
    public void exercise() {
        System.out.println(getName()+"正在锻炼中！");
    }

    public void life(){
        speak("共产党万岁");
        exercise();
    }
}
