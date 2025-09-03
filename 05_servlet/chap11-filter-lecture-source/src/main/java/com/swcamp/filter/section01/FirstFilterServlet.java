package com.swcamp.filter.section01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//a태그로 오는거 doGet
@WebServlet("/first/filter")
//@WebServlet(urlPatterns = {"/first/*","second/*"}) 서블릿은 패턴 잘 안쓰고 필터 많이 씀
public class FirstFilterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("서블릿으로 get 요청 도착 확인!");

    }
}
