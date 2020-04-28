package com.xz.factoryBeanExample;

import com.xz.factoryBeanExample.service.AnimalService;
import com.xz.factoryBeanExample.service.impl.CatServiceImpl;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author xz
 * @date 2019/12/18 9:46
 **/

/**
 * Spring在根据type去获取Bean的时候，会先获取到beanName。
 * 获取beanName的过程是：先循环Spring容器中的所有的beanName，然后根据beanName获取对应的BeanDefinition，
 * 如果当前bean是FactoryBean的类型，则会从Spring容器中根据beanName获取对应的Bean实例，
 * 接着调用获取到的Bean实例的getObjectType方法获取到Class类型，判断此Class类型和我们传入的Class是否是同一类型。如果是则返回测beanName
 *
 *
 * spring容器初始化的时候
 * <p>
 * <p>
 * <p>
 * <p>
 * 一般情况下，Spring通过反射机制利用的class属性指定实现类实例化Bean，
 * 在某些情况下，实例化Bean过程比较复杂，如果按照传统的方式，
 * 则需要在中提供大量的配置信息。配置方式的灵活性是受限的，
 * 这时采用编码的方式可能会得到一个简单的方案。
 * Spring为此提供了一个org.springframework.bean.factory.FactoryBean的工厂类接口，
 * 用户可以通过实现该接口定制实例化Bean的逻辑。
 * FactoryBean接口对于Spring框架来说占用重要的地位，
 * Spring自身就提供了70多个FactoryBean的实现。
 * 它们隐藏了实例化一些复杂Bean的细节，
 * 给上层应用带来了便利。从Spring3.0开始，FactoryBean开始支持泛型，即接口声明改为FactoryBean的形式
 *
 *
 * 比如MybatisSqlSessionFactoryBean  使用FactoryBean将SqlSessionFactory注入到spring容器中
 */
@Component("bbb")
public class AnimalFactoryBean implements FactoryBean<AnimalService> {

    public AnimalService getObject() throws Exception {
        return new CatServiceImpl();
    }

    public Class<?> getObjectType() {
        return AnimalService.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
