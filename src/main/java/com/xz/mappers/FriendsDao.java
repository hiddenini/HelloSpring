package com.xz.mappers;

import com.xz.bean.Friend;
import org.apache.ibatis.annotations.Select;

/**
 * @author xz
 * @date 2019/12/18 20:50
 **/

public interface FriendsDao {

    @Select("select * from friends where id=#{id}")
    Friend getFriendById(int  id);
}
