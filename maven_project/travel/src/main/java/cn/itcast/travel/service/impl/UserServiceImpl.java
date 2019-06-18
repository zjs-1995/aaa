package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.util.MailUtils;
import cn.itcast.travel.util.UuidUtil;

public class UserServiceImpl implements UserService{
    private UserDao dao = new UserDaoImpl();
    //注册用户
    @Override
    public boolean regist(User user) {
        User u = dao.findByUsername(user.getUsername());
        //判断是否为空
        if (u!=null){
           // 用户名存在,注册失败
            return false;
        }
        //保存用户信息
        //设置激活码
        user.setCode(UuidUtil.getUuid());
        //设置状态  N代表未激活
        user.setStatus("N");

        dao.save(user);

        //激活邮件发送
        String content = "<a href='http://localhost/travel/user/active?code="+user.getCode()+"'>点击激活 黑马旅游网</a>";
                            //发送地址      正文           标题
        MailUtils.sendMail(user.getEmail(),content,"激活邮件");
        return true;

    }

    /*
    * 激活用户
    * */
    @Override
    public boolean active(String code) {
        //根据激活码查询用户对象
        User user = dao.findByCode(code);
        if (user!=null){
            //数据库中可以查到
            //修改激活状态码  改为已激活
            dao.updateStatus(user);
            return true;
        }else {
            return false;
        }



    }
/*
* 登录
* */
    @Override
    public User login(User user) {
        return dao.findByUsernameAndPassword(user.getUsername(),user.getPassword());
    }
}
