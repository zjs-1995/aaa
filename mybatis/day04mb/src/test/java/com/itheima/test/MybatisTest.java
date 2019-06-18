package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    private InputStream in;
    private SqlSession sqlSession;
    private UserDao userDao;
    private SqlSessionFactory factory;


    @Before//用于在测试方法执行之前执行
    public void init()throws Exception{
        //1.读取配置文件，生成字节输入流
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.获取SqlSessionFactory
         factory = new SqlSessionFactoryBuilder().build(in);
        //3.获取SqlSession对象
        sqlSession = factory.openSession();
        //4.获取dao的代理对象
         //accountDao = sqlSession.getMapper(AccountDao.class);
         userDao = sqlSession.getMapper(UserDao.class);
    }

    @After//用于在测试方法执行之后执行
    public void destroy()throws Exception{
        //提交事务
       // sqlSession.commit();
        //6.释放资源
        sqlSession.close();
        in.close();
    }




   @Test
   public void testFirstLevelCache(){
       User user = userDao.findById(41);
       System.out.println("第一次查询的用户:"+user);

       //重新获取sqlSession对象
       sqlSession.close();
        sqlSession = factory.openSession();
        userDao = sqlSession.getMapper(UserDao.class);

       User user2 = this.userDao.findById(41);
       System.out.println("第二次查询用户："+user2);
       System.out.println(user == user2);
   }

   @Test
   public void testClearlCache(){
       User user1 = userDao.findById(41);
       System.out.println(user1);
       user1.setUsername("zhangsan");
       user1.setAddress("山东");
       userDao.updateUser(user1);

       User user2 = userDao.findById(41);
       System.out.println(user2);
       System.out.println(user1==user2);
   }
}

