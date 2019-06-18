package cn.itheima.day06.Dmeo02;

public class PhoneOne {
    public static void main(String[] args) {
        Phone phone = new Phone();

        //成员变量
        phone.brand = "小米";
        phone.price = 2999;
        phone.color = "黑色";
        System.out.println(phone.brand);
        System.out.println(phone.color);
        System.out.println(phone.price);
        //成员方法

        phone.call("雷军");
        phone.sendMessage();
    }

}
