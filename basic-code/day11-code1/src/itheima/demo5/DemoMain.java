package itheima.demo3.demo5;

public class DemoMain {
    public static void main(String[] args) {

        //使用匿名对象
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名对象实现了方法");
            }
        };
        obj.method();


    }
}
