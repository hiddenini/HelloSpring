package com.xz.customMapperScan;

import com.alibaba.fastjson.JSON;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xz
 * @date 2019/12/19 17:18
 **/

public class CustomTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(CustomAppConfig.class);
        FriendsDaoCustom friendsDaoCustom = (FriendsDaoCustom) annotationConfigApplicationContext.getBean("ccc");

        System.out.println("friendsDaoCustom:"+ JSON.toJSONString(friendsDaoCustom.getFriendById(2)));

        System.out.println("friendFactoryBean:"+JSON.toJSONString(annotationConfigApplicationContext.getBean("&ccc")));

/*        FriendsServiceCustom bean = annotationConfigApplicationContext.getBean(FriendsServiceCustom.class);
        System.out.println("result:"+ JSON.toJSONString(bean.getFriendById(3)));*/
    }
}
