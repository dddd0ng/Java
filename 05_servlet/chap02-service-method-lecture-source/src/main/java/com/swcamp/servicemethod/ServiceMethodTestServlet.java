package com.swcamp.servicemethod;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//-Dfile.encoding=UTF-8
//war에러 뜨면 구성편집->배포-> +버튼 -> 아티팩트
//매핑은 @WebServlet에서 index.jsp에 있는 앵커 태그 주소와
@WebServlet("/request-service")
public class ServiceMethodTestServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("req = " + req);
        System.out.println("res = " + res);

        //다운캐스팅 -> 자식이 가진 메서드를 쓰려고
        /* 설명. http method를 확인하기 위해 실체 객체 타입인 HttpServletXXX 계열로 다운캐스팅 후 확인*/
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse) res;

        String httpMethod = httpRequest.getMethod();
        System.out.println("httpMethod = " + httpMethod);

        /* 설명. 기본적으로 쓸 Http Method방식
        * GET 조회              / GET~DELETE -> CURD같은 개념
        * POST 추가            / 서블릿에서는 get,post주로 쓰고 위 포함 아래 두개는 REST API에서
        * PUT / PATCH 수정       put-전체수정, patch-부분수정
        * DELETE 삭제
        * /직접 쓸일은 거의 없음OPTION/
        * */

        if("GET".equals(httpMethod)){
            doGet(httpRequest, httpResponse);
        } else if("POST".equals(httpMethod)){
            doPost(httpRequest,httpResponse);
        }


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET 요청을 처리 할 메소드 호출 됨..");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST 요청을 처리 할 메소드 호출 됨..");
    }
}
