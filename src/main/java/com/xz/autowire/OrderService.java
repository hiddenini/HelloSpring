package com.xz.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xz
 * @date 2020/1/6 15:15
 **/

@Service("order")
public class OrderService {
    @Autowired
    private PayService payService;

}
