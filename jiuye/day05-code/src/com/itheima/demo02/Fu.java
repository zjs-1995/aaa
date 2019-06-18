package com.itheima.demo02;

import java.lang.reflect.Array;

public class Fu {


        public void show01() throws NullPointerException,ClassCastException{}
        public void show02() throws IndexOutOfBoundsException{}
        public void show03() throws IndexOutOfBoundsException{}
        public void show04() throws Exception{}
}
class Zi extends Fu{
        public void show01() throws NullPointerException,ClassCastException{}
        public void show02() throws ArrayIndexOutOfBoundsException{}
        public void show04() throws Exception{}
}