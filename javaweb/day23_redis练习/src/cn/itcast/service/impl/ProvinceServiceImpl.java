package cn.itcast.service.impl;

import cn.itcast.dao.ProvinceDao;
import cn.itcast.dao.impl.ProvinceDaoImpl;
import cn.itcast.domain.Province;
import cn.itcast.jedis.util.JedisPoolUtils;
import cn.itcast.service.ProvinceService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService{

    private ProvinceDao dao = new ProvinceDaoImpl();
    @Override
    public String findAllJson() {
        //先从redis中查询   没有从数据库中查
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");

        if (province_json==null || province_json.length()==0){
            //redis中没有数据
            System.out.println("redis中没有数据,从数据库中查");
            //从数据库中查询
            List<Province> ps = dao.findAll();
            //
            ObjectMapper mapper = new ObjectMapper();
            try {
                province_json = mapper.writeValueAsString(ps);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            //将json数据存入jedis  以后可以不用查数据库,提高效率
            jedis.set("province",province_json);
            jedis.close();
        }else {
            //缓存中有数据
            System.out.println("缓存中有数据,查看缓存");
        }
        return province_json;
    }
}
