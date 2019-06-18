package cn.itheima.day06.Dmeo02;

public class Phone {
    //成员变量
   String brand;
   double price;
   String color;

   //成员方法
    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }

}
