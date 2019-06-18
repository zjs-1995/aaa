package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.util.JedisUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CategoryServiceImpl implements CategoryService {
    private CategoryDao categoryDao = new CategoryDaoImpl();


    @Override
    public List<Category> findALL() {
        //先从redis中查询
        //获取jedis客户端
        Jedis jedis = JedisUtil.getJedis();
        /*
        //使用sortedset排序查询
        Set<String> categorys = jedis.zrange("category", 0, -1);
        */

        //查询sortedset中的分数(cid)和值(cname)
        Set<Tuple> categorys = jedis.zrangeWithScores("category", 0, -1);

        //判断查询的集合是否为空
        List<Category> cs = null;
        if (categorys==null || categorys.size()==0){

            System.out.println("从数据库中查询");
            //内存中查不到,再从数据库中查,查完再存入redis
            cs = categoryDao.findAll();
            for (int i = 0; i < cs.size(); i++) {
                jedis.zadd("category",cs.get(i).getCid(),cs.get(i).getCname());
            }

        }else {
            System.out.println("从redis中查询");
            //缓存中有数据  将set的数据存入list
            cs = new ArrayList<Category>();
            for (Tuple tuple : categorys) {
                Category category = new Category();
                category.setCname(tuple.getElement());
                category.setCid((int)tuple.getScore());
                cs.add(category);
            }
        }

        return cs;
    }
}
