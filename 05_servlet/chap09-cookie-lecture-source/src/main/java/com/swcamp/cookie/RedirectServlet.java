package com.swcamp.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


//쿠키-웹 브라우저 고객이 저장하는 정보공간
//단점?부담을 클라이언트한테해서 서버가 컨트롤을 못하는 측면이 있음
@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
//처음엔 Post로 받지만 redirect는 무조건 get요청
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies(); //꺼낸갯수만큼 배열이 형성됨
        String firstName="";
        String lastName="";
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + ": " +cookie.getValue());

            if("firstName".equals(cookie.getName())){
                firstName = cookie.getValue();
            } else if ("lastName".equals(cookie.getName())){
                lastName = cookie.getValue();
            }
        }

        StringBuilder responseText = new StringBuilder();
        responseText.append("<h3>당신의 이름은")
                .append(firstName)
                .append("<br>그리고 성은 ")
                .append(lastName)
                .append("</h3>");

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println(responseText);
        out.flush();
        out.close();
    }
}
