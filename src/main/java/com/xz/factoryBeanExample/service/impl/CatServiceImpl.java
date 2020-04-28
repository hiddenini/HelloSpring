package com.xz.factoryBeanExample.service.impl;

import com.xz.factoryBeanExample.service.AnimalService;

/**
 * @author xz
 * @date 2020/4/28 15:42
 **/

public class CatServiceImpl implements AnimalService {
    @Override
    public void say() {
        System.out.println("miao miao miao");
    }
}
