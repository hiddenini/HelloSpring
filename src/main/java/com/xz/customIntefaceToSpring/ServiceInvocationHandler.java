package com.xz.customIntefaceToSpring;

/**
 * @author xz
 * @date 2019/12/21 10:13
 **/

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ServiceInvocationHandler implements InvocationHandler {

    private Class<?> interfaceType;

    public ServiceInvocationHandler(Class<?> intefaceType) {
        this.interfaceType = interfaceType;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (Object.class.equals(method.getDeclaringClass())) {
            System.out.println("if调用前");
            return method.invoke(this, args);
        }
        System.out.println("调用前，参数：{}" + args);
        Object result = Arrays.asList(args);
        System.out.println("调用后，结果：{}" + result);
        return result;
    }
}
