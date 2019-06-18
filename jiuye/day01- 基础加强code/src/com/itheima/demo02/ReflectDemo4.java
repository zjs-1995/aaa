package com.itheima.demo02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> cls = Person.class;
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        Method method = cls.getMethod("eat");
        Person person = new Person();
        method.invoke(person);

        Method method1 = cls.getMethod("eat", String.class);
        method1.invoke(person,"饭");

        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

     //   Method declaredMethod = cls.getDeclaredMethod();

    }
}
