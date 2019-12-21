package com.xz.customMapperScan;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author xz
 * @date 2019/12/19 17:12
 **/

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {


    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        BeanDefinitionBuilder builder=BeanDefinitionBuilder.genericBeanDefinition(FriendsDaoCustom.class);
        GenericBeanDefinition beanDefinition= (GenericBeanDefinition) builder.getBeanDefinition();
        beanDefinition.setBeanClass(FriendFactoryBean.class);
        registry.registerBeanDefinition("ccc",beanDefinition);
    }



}
