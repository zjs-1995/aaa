package cn.itcast.service;

import cn.itcast.domain.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserService {

    public List<User> findAll();
    //登录方法
    User login(User user);

    //保存User
    void addUser(User user);
    //根据id删除
    void deleteUser(String id);
}
