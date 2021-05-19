package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//监听servlet上下文
//还可以监听req session 实现不同的类
public class SvContext implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("销毁");

    }
}
