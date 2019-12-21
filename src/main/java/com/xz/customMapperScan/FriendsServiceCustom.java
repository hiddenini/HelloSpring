package com.xz.customMapperScan;

import com.xz.bean.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FriendsServiceCustom {

    @Autowired
    private FriendsDaoCustom friendsDaoCustom;

    public Friend getFriendById(int id){
        return friendsDaoCustom.getFriendById(id);
    }
}
