package Demo3;

import java.util.ArrayList;

public class ArrayListPerson {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person one = new Person("欧阳锋",20);//创建类并直接赋值
        Person two = new Person("洪七公",20);
        Person three = new Person("段智兴",20);
        list.add(one);
        list.add(two);
        list.add(three);
       // System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            Person person= list.get(i);
            System.out.println("姓名"+person.getName()+",年龄:"+person.getAge());
        }
    }
}
