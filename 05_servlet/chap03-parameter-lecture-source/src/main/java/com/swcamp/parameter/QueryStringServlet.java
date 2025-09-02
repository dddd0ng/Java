package com.swcamp.parameter;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;
//get request
//http://localhost:8080/chap03/querystring?name=%E3%85%87%E3%84%B9%E3%85%87&age=%E3%85%87%E3%84%B9%E3%85%87%E3%84%B9%E3%85%87&birthday=&national=ko&hobbies=movie&hobbies=music
@WebServlet("/querystring") //http error 500 - backEnd error
public class QueryStringServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name =req.getParameter("name"); // 꺼내는 값 무조건 string
        System.out.println("name = " + name);

        int age=Integer.parseInt(req.getParameter("age")); // 꺼내는 값 무조건 string라서 integer.parseInt() 써줘야함
        System.out.println("age = " + age);

        //parsing가능
        java.sql.Date birthday = java.sql.Date.valueOf(req.getParameter("birthday"));
        System.out.println("birthday = " + birthday);

        String gender = req.getParameter("gender");
        System.out.println("gender = " + gender);

        String national = req.getParameter("national");
        System.out.println("national = " + national);

        String[] hobbies = req.getParameterValues("hobbies");
        System.out.println("hobbies = " + Arrays.toString(hobbies));

    }
}
