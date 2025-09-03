package com.swcamp.session.section02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/delete")
public class DeleteSessionDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        System.out.println("attribute 무효화 전 firstname :"
        + session.getAttribute("firstName"));
        System.out.println("attribute 무효화 전 lastname :"
        + session.getAttribute("lastName"));

        session.invalidate(); //모든 어트리뷰트 삭제 확인, invalidate
        //위 코드 쓰면 아래 코드들 못씀
        //HttpSession 객체의 Attribute 값들을 무효화(로그아웃 개념으로 많이 사용)
//        제이세션아이디-웹에선 제공, 모든 다른 프론트랑 연동되는 내용은 아님,

//포워드 문제해결하기위해 리다이렉트 -> 리다이렉트 문제 해결하기 위해 쿠키,세션

//        System.out.println("attribute 무효화 후 firstname :"
//                + session.getAttribute("firstName"));
//        System.out.println("attribute 무효화 후 lastname :"
//                + session.getAttribute("lastName"));

    }
}
