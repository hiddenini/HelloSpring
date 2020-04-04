package com.xz.autowire.map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StrategyService {

    @Autowired
    private Map<String,Strategy>  strategyMap;


}
