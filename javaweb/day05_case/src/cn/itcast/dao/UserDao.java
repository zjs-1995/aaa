package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;

public interface UserDao {

    public List<User> findAll();

    User findUserByUsernameAndPassword(String username, String password);

    void add(User user);

    void delete(int i);
}
