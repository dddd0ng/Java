package com.swcamp.filter.section01;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;



//@WebFilter라는 이노테이션을 통해 필터 설정을 할 수 있지만, 요청 시 필터의 동작 순서를
//정하기 위해서는 Servlet에서는 web.xml을 통한 설정 시 작성된 순서로만 바꿔줄 수 있다.
//(web.xml에 작성한 filter mapping의 순서에 따라 동작한다.)


@WebFilter(filterName = "firstFilter", urlPatterns = "/first/*")
//@WebFilter(filterName = "firstFilter") //xml으로 매핑하는거
//인터페이스를 구현 jakarta.servlet
public class FirstFilter implements Filter {
    public FirstFilter() {
        System.out.println("Filter 기본 생성자 호출");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FirstFilter 인스턴스 생성!");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("FirstFilter의 doFilter()호출됨...");
        /* 설명. FilterChain에서 제공하는 doFilter를 통해 다음 필터 또는 서블릿으로 진행하라는 의미*/
        //서블릿 가기 전에 호출 (doFilter), 전 처리 + 서블릿으로 안가게 막을 수 있음(FilterChain을 이용해서)
        chain.doFilter(request, response);//다음 필터가 있으면 다음 필터로 가고, 없으면 서블릿으로
        System.out.println("FirstFilter 서블릿 다녀온 이후 client로 응답 전");
    }

    @Override
    public void destroy() {
        System.out.println("FirstFilter 삭제 직전!");
    }
}
