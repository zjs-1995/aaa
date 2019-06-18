package com.itheima.demo02;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Class<Person> cls = Person.class;
        Field[] fields = cls.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        Field a = cls.getField("a");
        Person person = new Person();
        Object value = a.get(person);
        System.out.println(value);
        a.set(person,"张三");
        System.out.println(person);

        Field[] declaredFields = cls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Field d = cls.getDeclaredField("d");
        d.setAccessible(true);
        Object value2 = d.get(person);
        System.out.println(value2);
    }
}
