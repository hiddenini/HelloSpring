package com.xz.customInterfaceToSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xz
 * @date 2019/12/12 16:25
 **/

public class CustomMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
        TestService bean = annotationConfigApplicationContext.getBean(TestService.class);
        System.out.println("service:"+ bean);
        bean.getList("aaa","bbb");


        //System.out.println(annotationConfigApplicationContext.getBean("serviceProxyFactory"));

        //System.out.println(annotationConfigApplicationContext.getBean("&serviceProxyFactory"));

    }
}
