package com.itheima.demo04;

public class Demo01ObjectMethodReference {
    public static void printString(Printable p){
        p.print("张韶涵");
    }

    public static void main(String[] args) {
        printString((s)->{
            MethodRerObject obj = new MethodRerObject();
            obj.printUpperCaseString(s);
        });

        MethodRerObject obj = new MethodRerObject();
        printString(obj::printUpperCaseString);
    }
}
