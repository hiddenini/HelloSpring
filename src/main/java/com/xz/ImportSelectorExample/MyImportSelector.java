package com.xz.ImportSelectorExample;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author xz
 * @date 2019/12/21 15:17
 **/

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {


       String value= (String) importingClassMetadata.getAnnotationAttributes(EnableService.class.getName()).get("value");

        System.out.println(value);

        System.out.println(importingClassMetadata.getAnnotationAttributes("com.xz.ImportSelectorExample.EnableService"));

        //如果注解的值是NOT,那么不注入SelectorService
        if("NOT".equals(value)){
            return new String[0];
        }

        //否则往spring容器中注入SelectorService
        return new String[]{SelectorService.class.getName()};
    }
}
