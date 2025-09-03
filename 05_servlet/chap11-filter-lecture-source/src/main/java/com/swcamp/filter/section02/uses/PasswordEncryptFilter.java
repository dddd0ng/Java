package com.swcamp.filter.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;

@WebFilter("/member/*")
public class PasswordEncryptFilter implements Filter {



    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("암호화 필터 실행됨");

        //원래의 request를 우리가 만든 request로
/* 설명. 기존의 request객체가 아닌 우리가 GetParameter()를 재정의 한 Request객체로 교체*/
        RequestWrapper wrapper = new RequestWrapper((HttpServletRequest) request);

        chain.doFilter(wrapper, response);

    }
}
