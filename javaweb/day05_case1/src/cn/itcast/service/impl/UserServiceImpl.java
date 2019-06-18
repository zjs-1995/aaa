package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    /*
     * 调用dao查询
     * */
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    //登录方法
    public User login(User user){
        return dao.findUserByUsernameAndPassword(user.getUsername(),user.getPassword());
    }

    //添加方法
    @Override
    public void addUser(User user) {
        dao.add(user);
    }

    @Override
    public void deleteUser(String id) {
        dao.delete(Integer.parseInt(id));//把字符串类型的id转成int类型的
    }

    @Override
    public User findUserById(String id) {
        return dao.findById(Integer.parseInt(id));
    }

    @Override
    public void updateUser(User user) {
        dao.update(user);
    }

    @Override
    public void delSelectedUser(String[] ids) {
        if (ids!=null && ids.length>0){
            //遍历数组
            for (String id : ids) {
                //调用dao删除
                dao.delete(Integer.parseInt(id));
            }
        }

    }

    @Override
    public PageBean<User> findUserByPage(String _currentPage, String _rows) {

        int currentPage = Integer.parseInt(_currentPage);//当前页码
        int rows = Integer.parseInt(_rows);//每页显示条数

        //创建空的PageBean对象    把数据都存入对象
        PageBean<User> pb = new PageBean<>();
        //设置参数
        pb.setCurrentPage(currentPage);
        pb.setRows(rows);

        //调用dao在数据库中查询总记录数
        int totalCount = dao.findTotalCount();
        pb.setTotalCount(totalCount);
        //调用dao查询List集合
        //计算开始的记录索引
        int start = (currentPage - 1) * rows;
        List<User> list = dao.findByPage(start,rows);
        pb.setList(list);
        //计算总页码
        int totalPage = (totalCount % rows == 0) ? totalCount/rows : (totalCount/rows)+1;
        pb.setTotalPage(totalPage);
        return pb;
    }


}
