package com.itheima.demo06;

import com.itheima.demo02.Person;

@FunctionalInterface
public interface PersonBuilder {
   public abstract Person builderPerson(String name);
}
