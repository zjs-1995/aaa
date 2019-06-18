package com.itheima.demo01;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = null;
        getElement(arr,3);
    }
    public static int getElement(int[] arr,int index){
        if (arr==null){
            throw new NullPointerException("空指针异常");
        }else {
            int i = arr[index];
            return i;
        }

    }
}
