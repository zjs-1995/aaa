package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;

public interface UserDao {

    public List<User> findAll();

    User findUserByUsernameAndPassword(String username, String password);

    void add(User user);


    void delete(int i);

    User findById(int i);

    void update(User user);

    /*
     *查询总记录数
     * */
    int findTotalCount();

    /*
     * 分页查询每页记录
     * */
    List<User> findByPage(int start, int rows);
}
