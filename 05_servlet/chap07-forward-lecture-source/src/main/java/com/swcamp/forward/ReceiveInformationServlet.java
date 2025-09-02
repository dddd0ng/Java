package com.swcamp.forward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/forward")
public class ReceiveInformationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = req.getParameter("userId");
        String password = req.getParameter("password");


        /* 설명.
        * 이 부분에서 입력받아 서버로 넘어 온 id, password를 가지고
        *  db까지 가서 Select하고 확인하는 비즈니스 로직(BL)이 수행되어야 함
        * (그 결과는 해당 회원의 정보가 올것임)
        * 우리는 제대로 조회가 되었다는 가정 하에 "DDD씨를 환영합니다."
        * 와 같은 메시지를 가진 화면을 만들어 응답해보자.
        *  */

        req.setAttribute("userName", "홍길동");

        RequestDispatcher rd = req.getRequestDispatcher("print");
        rd.forward(req, resp);

    }
}
