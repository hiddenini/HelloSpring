package com.xz.aop;

import org.springframework.stereotype.Service;

/**
 * @author xz
 * @date 2020/1/3 14:19
 **/

@Service("aopService")
public class AopService {
    public void say(){
        System.out.println("hello aop");
    }
}
