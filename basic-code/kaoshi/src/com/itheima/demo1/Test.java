package com.itheima.demo1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        FactoryImp factoryImp = new FactoryImp();
        ArrayList<Hat> list = factoryImp.piliang(5);
        for (int i = 0; i < list.size(); i++) {
            Hat hat = list.get(i);
            factoryImp.describe(hat);
        }
    }
}
