package cn.itheima.day06.Demo01;

public class Student1 {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.name = "zhangsan";
        stu.age = 18;
        stu.heigh = 180.0;
        System.out.println(stu.name);
        System.out.println(stu.heigh);
        System.out.println(stu.age);

        stu.eat();
        stu.sleep();
        stu.study();
    }
}
