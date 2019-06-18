package itheima.demo3;

public class Body {//外部类
    public class Heart {//内部类

        public void beat(){
            System.out.println("心脏跳动");
        }
    }

    public void methodBody(){
        System.out.println("外部类的方法");
    }


}
