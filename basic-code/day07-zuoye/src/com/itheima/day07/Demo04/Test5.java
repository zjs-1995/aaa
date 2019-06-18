package com.itheima.day07.Demo04;

/*已知数组int[] nums = {5,10,15},,要求创建一个新数组
        1.新数组的长度和已知数组相同
        2.新数组每个元素的值 是已知数组对应位置元素的2倍
        3.在控制台中打印新数组的所有元素*/
public class Test5 {
    public static void main(String[] args) {
        int[] nums = {5,10,15};
        int[] arr = new int[3];
        arr[0] = nums[0] * 2;
        arr[1] = nums[1] * 2;
        arr[2] = nums[2] * 2;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
