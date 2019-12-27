package com.xz.ConfigurationAndCompoent;

import com.xz.bean.Friend;
import com.xz.bean.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xz
 * @date 2019/12/21 15:16
 **/

/**
 * 如果MyConfiguration加的是@Configuration 下面打印的是同一个对象 @Configuration(cglib代理)
 *
 *  如果MyConfiguration加的是@Component 下面打印的是不同的对象
 */
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfiguration.class);

        System.out.println(app.getBean(Student.class).getFriend());

        System.out.println(app.getBean(Friend.class));


    }
}
