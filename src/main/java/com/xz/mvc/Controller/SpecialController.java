package com.xz.mvc.Controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xz
 * @date 2020/1/15 11:30
 **/

/**
 * 如果是这种形式的controller则在
 *
 * DispatcherServlet.getHandler 中遍历到org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping 这个HandlerMapping 时才能拿到handler
 *
 * handler = mapping.getHandler(request)
 *
 */
@Component("/special")
public class SpecialController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("enter   SpecialController ");
        return null;
    }
}
