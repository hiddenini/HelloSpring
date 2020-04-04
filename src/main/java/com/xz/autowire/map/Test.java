package com.xz.autowire.map;

import com.xz.autowire.AutowireAppConfig;
import com.xz.autowire.OrderService;
import com.xz.autowire.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xz
 * @date 2019/12/12 16:25
 **/

public class Test {
    public static void main(String[] args) {

        /**
         *    在org.springframework.beans.factory.support.DefaultListableBeanFactory#resolveMultipleBeans这个方法中。
         *
         *    判断如果@Autowired的field的类型是Map则 findAutowireCandidates  根据map中的valueType 拿到所有的bean的名字，再遍历这些名字
         *
         *    从sporing容器中拿到对应的bean返回.
         *
         *
         */

        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(AutowireAppConfigMap.class);

        StrategyService bean = annotationConfigApplicationContext.getBean(StrategyService.class);

        System.out.println("bean:"+bean);
    }
}
