package com.swcamp.parameter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/payload")
public class PayloadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//개발자노트->페이로드.request 헤더쪽엔

        //tomcat 9버전 이하는 get요청 말고 Post요청일때는
        // 인코딩 설정을 하지 않으면 parameter의 한글이 깨짐
//        req.setCharacterEncoding("UTF-8");

        String name=req.getParameter("name");
        System.out.println("name="+name);

        
        /* 설명. parameter들의 Key값들을 한번에 순회하며 파악 할 수 있기도 하다.(feat.Enumeration)*/
        Enumeration<String> KeyNames = req.getParameterNames();
        while(KeyNames.hasMoreElements()) {
            System.out.println(KeyNames.nextElement());

        }
    }
}
