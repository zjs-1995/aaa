package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.UserDao;
import cn.itcast.travel.dao.impl.UserDaoImpl;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.UserService;
import cn.itcast.travel.util.MailUtils;

public class UserServiceImpl implements UserService {

    private UserDao dao = new UserDaoImpl();


    @Override
    public boolean regist(User user) {
        User u = dao.findByUsername(user.getUsername());
        if (u!=null){
            //用户名已存在 注册失败
            return false;
        }

        dao.save(user);

        //设置激活状态
        user.setStatus("N");
        //发送激活邮件
        String content = "<a href='http://localhost/travel/activeUserSservlet?code="+user.getCode()+"'>点击激活 黑马旅游网</a>";
        MailUtils.sendMail(user.getEmail(),content,"激活邮件");


        return true;
    }

    @Override
    public boolean active(String code) {
        User user = dao.findByCode(code);
        if (user!=null){
            //数据库中可以查到
            //修改状态码
            dao.updateStatus(user);
            return true;
        }
        return false;
    }

    @Override
    public User login(User user) {
        return dao.findByUsernameAndPassword(user.getUsername(),user.getPassword());



    }


}
