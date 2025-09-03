package com.swcamp.redirect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//redirect에서 오는것은 무조건 doGet (get)

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setAttribute("test","abc"); //이 값이 살아있어야함 (redirect했을때)
        System.out.println("리다이렉트 이 후 request의 attribute확인 : "+req.getAttribute("test"));
        System.out.println("리다이렉트 이 후 request의 parameter 확인 : "+req.getParameter("test"));
    }
}

//겟요청 파라미터가 없음 -> 쿼리스트링 없음
