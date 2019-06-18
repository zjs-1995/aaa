package cn.itheima.day06.Demo03;

public class Person {
    String name;
    private int age;

    //成员方法
    public void show(){
        System.out.println("我叫"+ name+",年龄"+age);
    }
    public void setAge(int num){
        if (num >= 0 && num < 100){
            age = num;
        }else{
            System.out.println("输入错误");
        }
    }
    public int getAge(){
        return age;
    }
}