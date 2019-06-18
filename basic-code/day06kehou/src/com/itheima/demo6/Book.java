package com.itheima.demo6;

public class Book {
    private String bianhao;
    private String shuming;
    private String ISBN;
    private double price;
    private String time;
    public void showBook(){
        System.out.println("最贵的书是:"+getBianhao()+","+getShuming()+","+getISBN()+","+getPrice()+","+getTime());
    }

    public Book() {
    }

    public Book(String bianhao, String shuming, String ISBN, double price, String time) {
        this.bianhao = bianhao;
        this.shuming = shuming;
        this.ISBN = ISBN;
        this.price = price;
        this.time = time;
    }

    public String getBianhao() {
        return bianhao;
    }

    public void setBianhao(String bianhao) {
        this.bianhao = bianhao;
    }

    public String getShuming() {
        return shuming;
    }

    public void setShuming(String shuming) {
        this.shuming = shuming;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
