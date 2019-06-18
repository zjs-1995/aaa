package cn.itcast.service;

import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;

import java.util.List;

public interface UserService {

    /*
    * 查询所有用户信息
    * */
    public List<User> findAll();

    /*
    登录方法
    * */
    User login(User user);


    /*
    添加方法
    */
    void addUser(User user);



    /*

    删除方法
    *
    * */

    void deleteUser(String id);

/*
* 修改方法
* */
    User findUserById(String id);

    /*
    * 修改用户信息
    * */
    void updateUser(User user);
/*
* 批量删除用户
* */
    void delSelectedUser(String[] ids);

    /*
    * 分页查询
    * */
    PageBean<User> findUserByPage(String currentPage, String rows);
}
