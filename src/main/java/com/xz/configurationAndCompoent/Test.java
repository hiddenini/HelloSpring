package com.xz.configurationAndCompoent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xz
 * @date 2019/12/21 15:16
 **/

/**
 * 如果MyConfiguration加的是@Configuration 下面打印的是同一个对象 @Configuration(cglib代理)
 *
 * 第一步，初始化时设置了Component类型过滤器；
 * 第二步，根据指定扫描包扫描.class文件，生成Resource对象；
 * 第三步、解析.class文件并注解归类，生成MetadataReader对象；
 * 第四步、使用第一步的注解过滤器过滤出有@Component类；
 * 第五步、生成BeanDefinition对象；
 * 第六步、把BeanDefinition注册到Spring容器。
 * 以上是@Component注解原理，@Service、@Controller和@Repository上都有@Component修饰，所以原理是一样的
 *
 *  如果MyConfiguration加的是@Component 下面打印的是不同的对象
 *
 *
 *  @see org.springframework.context.annotation.AnnotationConfigApplicationContext
 *
 *  的refresh() 方法中的invokeBeanFactoryPostProcessors 的时候有一个 ConfigurationClassPostProcessor (BeanDefinitionRegistryPostProcessor)     processConfigBeanDefinitions    parser.parse(candidates);
 *
 *  parse(((AnnotatedBeanDefinition) bd).getMetadata(), holder.getBeanName());  processConfigurationClass(new ConfigurationClass(metadata, beanName));  sourceClass = doProcessConfigurationClass
 *
 *  如果有@ComponentScan注解，则Process any @ComponentScan annotations
 *
 *  this.componentScanParser.parse  scanner.doScan      ClassPathBeanDefinitionScanner.doScan       (也就是@Component注解中的 * @see org.springframework.context.annotation.ClassPathBeanDefinitionScanner)
 *
 *  findCandidateComponents(找到所有的component),    return scanCandidateComponents(basePackage);
 *
 *  scanCandidateComponents遍历该包(com.xz.configurationAndCompoent)下面的所有class
 *
 *  MetadataReader metadataReader = getMetadataReaderFactory().getMetadataReader(resource);   通过AMS读取元信息
 *
 *  isCandidateComponent(metadataReader) 判断上面拿到的元数据是否符合容器定义的注解的过滤规则
 *
 *  符合规则的candidates返回
 *
 *  在ClassPathBeanDefinitionScanner.doScan 方法中遍历这些candidates    注入到spring容器
 *
 *  ScannedGenericBeanDefinition sbd = new ScannedGenericBeanDefinition(metadataReader);
 *
 *  registerBeanDefinition(definitionHolder, this.registry) 将bean注入到spring容器
 *
 *
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(ComponentAopConfig.class);

        System.out.println("aaa:"+app.getBean(Bona.class));




    }
}
