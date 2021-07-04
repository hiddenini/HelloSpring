package com.xz.mini.beans.factory.support;

import com.xz.mini.beans.BeansException;
import com.xz.mini.core.io.Resource;
import com.xz.mini.core.io.ResourceLoader;

/**
 * Simple interface for bean definition readers.
 *
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;

}
