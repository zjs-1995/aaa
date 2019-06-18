package cn.itheima.day06.Demo05;

public class Phone {
    private String brand;
    private int price;

    public void call(){
        System.out.println();
    }
    public void sendMseeage(){
        System.out.println("发短信");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }

    public Phone() {
    }

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
