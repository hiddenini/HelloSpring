package com.xz.mvc;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

/**
 * @author xz
 * @date 2020/1/14 10:45
 **/

public class MvcMain {
    public static void main(String[] args) {

        /**
         * spring的环境
         */
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();

        ac.register(MvcConfig.class);

        ac.refresh();


        /**
         * 手动启动tomcat,springBoot底层也是这么做的
         */
        File base = new File(System.getProperty("java.io.tmpdir"));

        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8090);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);

        Context context = tomcat.addContext("", base.getAbsolutePath());

        Tomcat.addServlet(context, "zjw",dispatcherServlet );

        context.addServletMapping("/","zjw");

        try {
            tomcat.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }

        tomcat.getServer().await();


    }
}
