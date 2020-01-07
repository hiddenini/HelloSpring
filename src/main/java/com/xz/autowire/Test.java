package com.xz.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xz
 * @date 2019/12/12 16:25
 **/

public class Test {
    public static void main(String[] args) {

        /**
         *     @Autowired 是实现了AutowiredAnnotationBeanPostProcessor(BeanPostProcessor)
         *
         *     在容器启动,为对象赋值的时候,遇到@Autowired注解,会用后置处理器机制,来创建属性的实例,然后再利用反射机制,将实例化好的属性,赋值给对象上.
         */

        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AutowireAppConfig.class);

        OrderService orderService=annotationConfigApplicationContext.getBean(OrderService.class);

        ProductService productService=annotationConfigApplicationContext.getBean(ProductService.class);

        System.out.println("orderService:"+ orderService);

        System.out.println("productService:"+ productService);

    }
}
