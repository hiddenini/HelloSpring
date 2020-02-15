package com.xz.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xz
 * @date 2020/1/14 14:58
 **/

/**
 * 如果是这种形式的controller则在
 *
 * DispatcherServlet.getHandler 中遍历到org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping 这个HandlerMapping 时就能拿到handler
 *
 * handler = mapping.getHandler(request)
 *
 * 还有一个是RouterFunctionMapping  好像是和WebFlux相关
 *
 * initHandlerMappings 是在 DispatcherServlet.initHandlerMappings 中的 this.handlerMappings = getDefaultStrategies(context, HandlerMapping.class)初始化的
 *
 *   getDefaultStrategies(context, HandlerMapping.class) 是从defaultStrategies中拿的 String value = defaultStrategies.getProperty(key)
 *
 * Properties defaultStrategies 是在DispatcherServlet的static静态代码块中初始化的    defaultStrategies = PropertiesLoaderUtils.loadProperties(resource)
 *
 *  resource是读的web-mvc包下面的  DispatcherServlet.properties
 *
 *  ClassPathResource resource = new ClassPathResource(DEFAULT_STRATEGIES_PATH, DispatcherServlet.class);
 *
 *
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloZ(){
        return "hello mvc";
    }
}
