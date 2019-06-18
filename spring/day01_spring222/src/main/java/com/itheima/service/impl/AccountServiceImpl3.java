package com.itheima.service.impl;


import com.itheima.service.IAccountService;

import java.util.*;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl3 implements IAccountService {

    private String[] myStrs;
    private List<String> myList;
    private Set<String> myset;
    private Map<String,String> mysMap;
    private Properties myProps;

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMyset(Set<String> myset) {
        this.myset = myset;
    }

    public void setMysMap(Map<String, String> mysMap) {
        this.mysMap = mysMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    public void  saveAccount(){
        System.out.println(Arrays.toString(myStrs));
        System.out.println(myList);
        System.out.println(myset);
        System.out.println(mysMap);
        System.out.println(myProps);
    }


}
