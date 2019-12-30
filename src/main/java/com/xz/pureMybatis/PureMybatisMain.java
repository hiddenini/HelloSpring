package com.xz.pureMybatis;

import com.alibaba.fastjson.JSON;
import com.xz.mappers.FriendsDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xz
 * @date 2019/12/30 16:57
 **/

public class PureMybatisMain {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        sqlSessionFactory.getConfiguration().addMapper(FriendsDao.class);
        /**
         * mybatis (MapperProxy)MapperProxy.invoke--->(MapperMethod)mapperMethod.execute--->(DefaultSqlSession)DefaultSqlSession.selectOne---> (DefaultSqlSession)this.selectList--->executor.query
         */
        System.out.println("pureMybatis:"+ JSON.toJSONString(sqlSessionFactory.openSession().getMapper(FriendsDao.class).getFriendById(2)));
    }
}
