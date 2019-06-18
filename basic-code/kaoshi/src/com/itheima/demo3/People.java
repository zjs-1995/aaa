package com.itheima.demo3;

public abstract class People {
    private String name;
    private String country;

    abstract void speak(String str);

    public People() {
    }

    public People(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
