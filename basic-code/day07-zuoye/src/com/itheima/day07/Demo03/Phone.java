package com.itheima.day07.Demo03;

public class Phone {
    private String brand;
    private int price;
    private int time;

    public Phone() {
    }

    public Phone(String brand, int price, int time) {
        this.brand = brand;
        this.price = price;
        this.time = time;
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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
