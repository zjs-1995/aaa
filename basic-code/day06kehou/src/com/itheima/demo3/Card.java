package com.itheima.demo3;

public class Card {
    private String huase;
    private String dianshu;

    public void showCard(){
        System.out.println("黑桃A");
    }

    public Card() {
    }

    public Card(String huase, String dianshu) {
        this.huase = huase;
        this.dianshu = dianshu;
    }

    public String getHuase() {
        return huase;
    }

    public void setHuase(String huase) {
        this.huase = huase;
    }

    public String getDianshu() {
        return dianshu;
    }

    public void setDianshu(String dianshu) {
        this.dianshu = dianshu;
    }
}
