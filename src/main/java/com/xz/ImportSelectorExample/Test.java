package com.xz.ImportSelectorExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xz
 * @date 2019/12/21 15:16
 **/

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(SelectAppConfig.class);

        System.out.println(app.getBean(SelectorService.class));

    }
}
