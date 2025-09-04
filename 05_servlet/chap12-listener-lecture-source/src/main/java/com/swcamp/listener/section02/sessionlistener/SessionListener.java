package com.swcamp.listener.section02.sessionlistener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener, HttpSessionAttributeListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Session Created");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session Destroyed");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("Session Attribute Add!");
        System.out.println("Session에 추가 된 attr: " + event.getName()+", value : "+ event.getValue());
    }
//보통 로그인하게되면 로그인 한 회원의 객체로 바뀌게돼서 key에 맞는 value도 중요 (로그인 한 상태인 사람)
    //현재 로그인 상태인지 확인 할 수 있음, 로그인 한 사람의 객체 정보가 담겨있음(만료시간은 당연히 있음)
    //그동안 db를 안가서 효율이좋음.
    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("Session Attribute Remove!");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("Session Attribute Replace!");
    }
}
