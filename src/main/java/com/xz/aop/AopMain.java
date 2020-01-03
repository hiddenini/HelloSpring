package com.xz.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xz
 * @date 2020/1/3 14:21
 **/

public class AopMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AopConfig.class);

        annotationConfigApplicationContext.getBean(AopService.class).say();
    }
}
