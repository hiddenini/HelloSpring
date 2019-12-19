package com.xz.factoryBeanExample;

import com.xz.bean.Student;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author xz
 * @date 2019/12/18 9:46
 **/

@Component("aaa")
public class MyFactoryBean implements FactoryBean<Student> {

    public Student getObject() throws Exception {
        Student student=new Student();
        student.setName("zjw");
        student.setGrade("9");
        return student;
    }

    public Class<?> getObjectType() {
        return Student.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
