package com.itheima.dao;

import com.itheima.domain.QueryVo;
import com.itheima.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有
     * @return
     */
    List<User> findAll();

   /* *//**
     * 保存用户
     * @param user
     *//*
    void saveUser(User user);

    *//**
     * 修改用户
     * @param user
     *//*
    void updateUser(User user);

    *//**
     * 删除用户
     * @param userId
     *//*


    void deleteUser(Integer userId);*/


    /**
     * 根据 id 查询  单条查询
     * @param userId
     * @return
     */
    User findById(Integer userId);


    /**
     * 模糊查询
     * @param username
     * @return
     */
    List<User> findByName(String username);

 /*   *//**
     * 聚合函数  查询总记录数
     * @return
     *//*
    int findTotal();
*/

    /**
     * 根据传入参数
     * @param user
     * @return
     */
    List<User> findUserByCondition(User user);

    List<User> findUserByCondition1(User user);

    List<User> findUserInIds(QueryVo vo);
}
