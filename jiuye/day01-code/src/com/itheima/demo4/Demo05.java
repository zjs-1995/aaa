package com.itheima.demo4;

import java.util.Arrays;
import java.util.Date;

public class Demo05 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
   //     System.out.println(time);
        Date date = new Date(time);//把毫秒转化为日期
        System.out.println(date);//当前系统时间

        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后:"+Arrays.toString(dest));
    }
}
