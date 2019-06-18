package com.test02;


public class Dog extends Animal implements Sports{
    @Override
    public void speak(String str) {
        System.out.println(getName()+"说："+str);
    }

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+"狗刨中!");
    }

    public void goPlay(){
        speak("我去玩了");
        swimming ();

    }
}
