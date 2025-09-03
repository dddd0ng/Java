package com.swcamp.filter.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter("/member/*")
public class EncodingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("인코딩 설정용 필터 지나감");
        HttpServletRequest httpRequest = (HttpServletRequest) request;

        /* 톰캣 10버전 이전에는 Post요청일 때는 인코딩 설정을 하지 않으면 한글이 깨졌었다.
        * 우린 10버전의 톰캣이라 굳이 인코딩 해주지 않아도 동작하지만,
        * 현업에서 경우에 따라 필요 할 수도 있고.
        * 추가로 다른 인코딩 설정으로 바꿀때도 활용 할 수 있다. */

        if("POST".equals(httpRequest.getMethod()));{
            httpRequest.setCharacterEncoding("UTF-8"); //전처리
        }
        chain.doFilter(httpRequest, response);
    }

}
