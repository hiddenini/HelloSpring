package com.xz.customInterfaceToSpring;

/**
 * @author xz
 * @date 2019/12/21 10:17
 **/

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@Component
public class ServiceProxyFactory implements FactoryBean<TestService>{

    @Override
    public TestService getObject() throws Exception {
        Class<?> interfaceType = TestService.class;
        InvocationHandler handler = new ServiceInvocationHandler(interfaceType);

       TestService proxyTestService= (TestService) Proxy.newProxyInstance(interfaceType.getClassLoader(),
                new Class[] {interfaceType},handler);
        System.out.println("proxyTestService:"+proxyTestService);
        System.out.println("is an impl:"+(proxyTestService instanceof  TestService));
        return proxyTestService;
    }

    @Override
    public Class<?> getObjectType() {
        return TestService.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
