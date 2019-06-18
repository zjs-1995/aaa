package cn.itheima.day06.Demo03;

public class Student01 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(20);
        stu.setMale(true);
        stu.setName("鹿晗");

        System.out.println("姓名"+stu.getName());
        System.out.println("年龄"+stu.getAge());
        System.out.println("是不是男的"+stu.isMale());
    }
}
