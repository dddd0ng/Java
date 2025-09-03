package com.swcamp.filter.section02.uses;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.IOException;

//rest api는 아님, 경로에 행위가 들어가므로
//회원가입은 insert같은 개념이므로 post
@WebServlet("/member/regist") //2단계 구조
public class RegistMemberServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = req.getParameter("userId");
        String password = req.getParameter("password");
        String name = req.getParameter("name");

        System.out.println("userId = " + userId);
        System.out.println("password = " + password);
        System.out.println("name = " + name);

        /* 설명. 사용자가 입력한(password는 암호화 된) 값들이
         * DB에 저장되고 나서 다시 사용자의 입력과 비교한다면?*/
        //password에 1234또는 5678값을 넣어 로그인 상황 테스트
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println("비밀번호가 1234인지 확인 : "+ passwordEncoder.matches("1234", password));
        System.out.println("비밀번호가 5678인지 확인 : "+ passwordEncoder.matches("5678", password));
        //평문, password

    }
}
