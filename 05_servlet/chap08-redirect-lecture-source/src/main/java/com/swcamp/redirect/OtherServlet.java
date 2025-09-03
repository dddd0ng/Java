package com.swcamp.redirect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//이 부분이 컨트롤러 계층 (컨트롤러 - 화면을 성공,실패시 제어하는 개념(포워딩,리다이렉트를 통해)
//보통 리다이렉트 많이 사용(ex-로그인같은걸 하고나면 원래 페이지로 다시 돌아가는 개념)
@WebServlet("/otherservlet")
public class OtherServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("test","abc"); //이 값이 살아있어야함 (redirect했을때)
//        resp.sendRedirect("redirect");
//        redirect받으면 무조건 Get 요청

        // 응답, 요청을 받고나면 정보가 있던 서블릿 객체가 사라짐

        //성공 또는 실패했을때 어디로 가는지 어떤 페이지로 넘어가는지 선정하는것 -> 컨트롤러
        resp.sendRedirect("redirect?test=abc");
        //url이 지저분해질 수 있음 (해결방안 2가지 있음)
        //파라미터 사용하면 리퀘스트 헤더에 담김
    }
}


