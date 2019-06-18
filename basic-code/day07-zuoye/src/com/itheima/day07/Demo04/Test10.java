package com.itheima.day07.Demo04;

public class Test10 {
    public static void main(String[] args) {
        int a = 2;
       // int b = 3;
        double c = 1.5;

        System.out.println(isSame1(a,c));
        System.out.println(isSame2(a,c));
    }
    public static int isSame1(int a, double c){
       int  result = (int) (a + c);
       return result;
    }
    public static boolean isSame2(int a,double c){
        return a == c;
    }
    public static int isSame3(int a, int c){
//        int max;
//        if (a > c){
//          max = a;
//
//        }else{
//            max = c;
//        }
//        return max;

        if (a > c){
            return a;
        }else {
            return c;
        }
    }
}
