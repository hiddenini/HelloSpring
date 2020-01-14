package com.xz.autowire.multi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MyService {
    /**
     *  @Autowired  首先首先是根据type找，如果找到多个则根据name过滤
     *
     *  DefaultListableBeanFactory
     *
     * Map<String, Object> matchingBeans = findAutowireCandidates(beanName, type, descriptor);
     *
     *如果找到了多个,则
     *
     * autowiredBeanName = determineAutowireCandidate(matchingBeans, descriptor);
     *
     * 根据上面返回的匹配的bean的名字从matchingBeans拿到对应的bean
     *
     * instanceCandidate = matchingBeans.get(autowiredBeanName)
     */

    /**
     *      若是下面这样，则会报错:expected single matching bean but found 2: myDao1,myDao2
     *      @Autowired
            private MyDao myDao;

     *      若是下面这样，则会找到MyDao1
     *      @Autowired
            private MyDao myDao1;

     */
    @Autowired
    private MyDao myDao1;


    @PostConstruct
    public void init(){
        System.out.println(myDao1.getClass().getName());
    }
}
