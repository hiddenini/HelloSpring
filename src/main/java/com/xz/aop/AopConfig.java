package com.xz.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author xz
 * @date 2020/1/3 13:58
 **/
@Configuration
@ComponentScan("com.xz.aop")
@EnableAspectJAutoProxy
public class AopConfig {
    /**
     * @EnableAspectJAutoProxy 使用   AspectJAutoProxyRegistrar(ImportBeanDefinitionRegistrar) 往spring中添加了一个beanPostProcessor(AnnotationAwareAspectJAutoProxyCreator)
     *
     *在context 的refresh中的   finishBeanFactoryInitialization --> beanFactory.preInstantiateSingletons() --> getBean(beanName)  -->doGetBean  -->return createBean() -->Object beanInstance = doCreateBean
     *
     * -->exposedObject = initializeBean  -->  wrappedBean = applyBeanPostProcessorsAfterInitialization 在这里完成了动态代理
     */

    /**
     *  AnnotationAwareAspectJAutoProxyCreator 的父类AbstractAutoProxyCreator 中定义了beanPostProcessor的 postProcessBeforeInitialization 和postProcessAfterInitialization
     *
     *   在调用postProcessBeforeInitialization时是一个return bean; 空方法，直接返回bean ,在执行和postProcessAfterInitialization时完成切面chain等一系列操作
     */
}
