package com.xz.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author xz
 * @date 2020/1/3 14:14
 **/

@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* com.xz.aop..*.*(..))")
    private void execute(){}

    @Before("execute()")
    public void b(){
        System.out.println("Before...");
    }

}
