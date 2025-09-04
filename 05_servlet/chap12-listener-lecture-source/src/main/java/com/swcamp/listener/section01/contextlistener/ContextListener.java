package com.swcamp.listener.section01.contextlistener;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener, ServletContextAttributeListener {
   public ContextListener(){
       System.out.println("Context listener 인스턴스 생성!");
   }
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("attribute add!!"+event.getName());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("attribute removed!!");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context init!!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context destroy!!");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("attribute replaced!!");
    }
}
