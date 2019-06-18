package cn.itheima.day06.Dmeo02;

public class PhoneParam {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.brand = "小米";
        phone.price = 2999;
        phone.color = "黑色";
        method(phone);
    }

    public static void method(Phone param){
        System.out.println(param.price);
        System.out.println(param.brand);
        System.out.println(param.color);
    }
    }
