package cn.itheima.day06.Demo05;

public class Phone01 {
    public static void main(String[] args) {
        //无参构造
        Phone phone = new Phone();
        phone.setBrand("小米");
        phone.setPrice(998);
        //有参构造
        Phone phone2 = new Phone("小米", 998);

        phone.call();
        phone.sendMseeage();
        phone.playGame();
        /*System.out.println("正在使用价格为" + phone.getPrice() + "元的" + phone.getBrand() + "品牌的手机");
        System.out.println("正在使用价格为" + phone.getPrice() + "元的" + phone.getBrand() + "品牌的手机");
        System.out.println("正在使用价格为" + phone.getPrice() + "元的" + phone.getBrand() + "品牌的手机");*/
    }
}
