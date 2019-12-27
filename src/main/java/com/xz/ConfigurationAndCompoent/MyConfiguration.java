package com.xz.ConfigurationAndCompoent;

import com.xz.bean.Friend;
import com.xz.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author xz
 * @date 2019/12/25 20:31
 **/

@Component
//@Configuration
public class MyConfiguration {

    @Bean
    public Student student(){
        Student student=new Student();
        student.setGrade("9");
        student.setName("zjw");
        student.setFriend(friend());
        return student;
    }

    @Bean
    public Friend friend(){
        Friend friend=new Friend();
        friend.setName("lz");
        friend.setAge(25);
        return friend;
    }
}
