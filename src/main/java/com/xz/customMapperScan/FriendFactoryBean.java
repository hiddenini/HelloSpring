package com.xz.customMapperScan;

import com.xz.bean.Friend;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author xz
 * @date 2019/12/19 17:15
 **/
//@Component("ccc")
public class FriendFactoryBean implements FactoryBean, InvocationHandler {
    public Object getObject() throws Exception {
        Object proxy = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{FriendsDaoCustom.class,}, this);
        System.out.println("是否是FriendsDaoCustom的实现:"+(proxy instanceof  FriendsDaoCustom));
        return proxy;
        //return new Zjw();
    }

    public Class<?> getObjectType() {
        return FriendsDaoCustom.class;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (Object.class.equals(method.getDeclaringClass())) {
            System.out.println("if调用前");
            return method.invoke(this, args);
        }
        System.out.println("调用前，参数：{}" + args[0]);
        /**
         * 这里到底要怎么做才能和mybatis一样
         */
        return new Friend();
    }
}
