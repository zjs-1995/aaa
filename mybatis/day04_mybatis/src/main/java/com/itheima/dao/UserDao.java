package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface UserDao {

   User findById(Integer uid);

   List<User> findAll();
}
