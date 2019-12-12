package com.xz.bean;

import org.springframework.stereotype.Component;

/**
 * @author xz
 * @date 2019/12/12 16:30
 **/

@Component
public class User {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
