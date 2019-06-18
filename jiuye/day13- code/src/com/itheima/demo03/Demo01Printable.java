package com.itheima.demo03;



public class Demo01Printable {
    public static void printString(Printable p){
        p.print("helloworld");
    }

    public static void main(String[] args) {
        printString((s)->{
            System.out.println(s);
        });

        printString(System.out::println);
    }
}
