package cn.itheima.day06.Demo03;

public class Person01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "赵丽颖";
//        person.age = -38;
        person.setAge(50);
        person.show();
    }
}
