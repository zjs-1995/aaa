package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.domain.QueryVo;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisTest {
    //查询所有
    @Test
    public void testFinfAll() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSession session = new SqlSessionFactoryBuilder().build(is).openSession();
        UserDao mapper = session.getMapper(UserDao.class);
        List<User> users = mapper.findAll();
        for(User user : users){
            System.out.println(user);
        }
        session.close();
        is.close();
    }

    //保存用户
    @Test
    public void testSave() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();
        UserDao userdao = session.getMapper(UserDao.class);

        User user = new User();
        //user.setUsername("save u");
        user.setUserName("mybatis last insertid");
        user.setUserAddress("济南");
        user.setUserSex("男");
        user.setUserBirthday(new Date());
        System.out.println("保存操作之前:"+user);
        userdao.saveUser(user);
        System.out.println("保存操作之后:"+user);
        session.commit();//提交事务
        session.close();
        in.close();
    }
    //增加用户
    @Test
    public void testUpdate() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        User user = new User();
        user.setUserName("田馥甄");
        user.setUserAddress("台湾");
        user.setUserSex("女");
        user.setUserBirthday(new Date());
        user.setUserId(49);
        userDao.updateUser(user);

        session.commit();
        session.close();
        in.close();
    }
    //删除用户
    @Test
    public void testDelete() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSession session = new SqlSessionFactoryBuilder().build(in).openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        userDao.deleteUser(49);
        session.commit();
        session.close();
        in.close();
    }
    //单条查询
    @Test
    public void testFindById() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSession session = new SqlSessionFactoryBuilder().build(in).openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        User user = userDao.findById(45);
        System.out.println(user);
        session.close();
        in.close();
    }

    //模糊查询
    @Test
    public void testFindByName() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSession session = new SqlSessionFactoryBuilder().build(in).openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> users = userDao.findByName("%王%");
        for (User user : users) {
            System.out.println(user);
        }
        session.close();
        in.close();
    }

    //聚合函数
    @Test
    public void testFindTotal() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSession session = new SqlSessionFactoryBuilder().build(in).openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        int total = userDao.findTotal();
        System.out.println(total);
        session.close();
        in.close();
    }

    @Test
    public void testFindByVo() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSession session = new SqlSessionFactoryBuilder().build(in).openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUserName("%王%");
        vo.setUser(user);
        List<User> users = userDao.findByVo(vo);
        for (User user1 : users) {
            System.out.println(user1);
        }
        session.close();
        in.close();
    }
}
