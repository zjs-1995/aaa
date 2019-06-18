package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.FavoriteDao;
import cn.itcast.travel.dao.impl.FavoriteDaoImpl;
import cn.itcast.travel.domain.Favorite;
import cn.itcast.travel.service.FavoriteServicec;

public class FavoriteServicecImpl implements FavoriteServicec{
    private FavoriteDao favoriteDao = new FavoriteDaoImpl();
    @Override
    public boolean isFavorite(String rid, int uid) {
        Favorite favorite = favoriteDao.findRidAndUid(Integer.parseInt(rid), uid);

        if (favorite== null){
            return false;
        }else{
            //如果对象有值,代表已经收藏过了,返回true
            return true;
        }

    }
}
