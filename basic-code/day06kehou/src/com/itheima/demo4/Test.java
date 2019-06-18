package com.itheima.demo4;

public class Test {
    public static void main(String[] args) {
        Manager man = new Manager("James","9527",15000,3000);
        Coder coder = new Coder("Kobe","0025",1000);
        man.intro();
        man.showSalary();
        man.work();

        coder.intro();
        coder.showSalary();
        coder.work();
    }
}
