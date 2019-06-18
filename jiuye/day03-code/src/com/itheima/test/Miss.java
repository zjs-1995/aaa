package com.itheima.test;

/*编写一个选美小姐的类  属性有  姓名,年龄,颜值,身高  生成对应的getter setter方法.无参构造有参构造

        (1)在一个集合中存储5个选美小姐的对象.
        (2)如果你是评委,按照你的审美去给这五个人排序.*/
public class Miss  {
    private String name;
    private int age;
    private int looks;
    private int height;

    public Miss() {
    }

    public Miss(String name, int age, int looks, int height) {
        this.name = name;
        this.age = age;
        this.looks = looks;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLooks() {
        return looks;
    }

    public void setLooks(int looks) {
        this.looks = looks;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Miss{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", looks=" + looks +
                ", height=" + height +
                '}';
    }


}
