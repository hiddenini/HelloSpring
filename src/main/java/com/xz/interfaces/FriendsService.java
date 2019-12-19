package com.xz.interfaces;

import com.xz.bean.Friend;
import com.xz.mappers.FriendsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xz
 * @date 2019/12/19 16:52
 **/

@Service
public class FriendsService {

    @Autowired
    private FriendsDao friendsDao;

    public Friend getFriendById(int id){
        return friendsDao.getFriendById(id);
    }
}
