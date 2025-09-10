package com.swcamp.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


@Component
public class StopwatchInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandler 호출함(핸들러 메소드 이전에)");

        long startTime=System.currentTimeMillis();//시스템의 현재 시간을 밀리초 단위 long형으로 반환
        request.setAttribute("startTime", startTime);
        /* 설명. 핸들러 인터셉터의 preHandler이 반환하는 boolean형에 따라 Controller의 핸들러 메소드 동작 여부 조절 가능*/
        return true;
    } //pre => 전처리
//boolean ? -> false를 반환하면 핸들러 요청 반환 x
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandler 호출함(핸들러 메소드 이후)");
        long startTime = (Long)request.getAttribute("startTime");
                //get파라미터와 달리 꺼내면 오브젝트임(다운캐스팅)
        long endTime = System.currentTimeMillis();
        //end - start

        /* 설명. postHandle의 ModelAndView는 Controller의 핸들러메소드가 반환한 내용(재료) + 뷰가 담겨 있다.*/
        modelAndView.addObject("interval", endTime - startTime);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }//after => 리소스 반환
}
