package com.xz.autowire.multi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xz
 * @date 2020/1/14 9:51
 **/

public class MultiAutoireTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(MultiAppConfig.class);

        System.out.println("myService:"+annotationConfigApplicationContext.getBean(MyService.class));

    }

}
