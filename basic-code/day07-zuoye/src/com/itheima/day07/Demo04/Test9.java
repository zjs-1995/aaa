package com.itheima.day07.Demo04;

/*主方法中给定数组int[] arr= {10,20,30,40,50,60};
这个数组没有重复元素.定义一个方法可以接受这个给定的数组并返回这个数组中最大元素值的索引值
*/
public class Test9 {
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60};
        int max = method(arr);
        System.out.println(max);

    }
    public static int method(int[] arr){
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > arr[maxIndex]){
                maxIndex = i;

            }

        }
        return maxIndex;

    }
}
