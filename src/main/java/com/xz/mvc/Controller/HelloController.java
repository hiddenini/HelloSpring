package com.xz.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xz
 * @date 2020/1/14 14:58
 **/

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloZ(){
        return "hello mvc";
    }
}
