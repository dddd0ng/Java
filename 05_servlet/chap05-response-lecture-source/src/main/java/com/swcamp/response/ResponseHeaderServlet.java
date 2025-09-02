package com.swcamp.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

@WebServlet("/headers")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        long currentTime = System.currentTimeMillis();
        //스트림 내보내기?
        out.print("<h1>" + currentTime + "</h1>");
        out.print("<h1>" + new java.util.Date(currentTime) + "</h1>");
        out.flush();
        out.close();

        Collection<String> respHeaderNames = resp.getHeaderNames();
        Iterator<String> iter = respHeaderNames.iterator();
        while(iter.hasNext()) {
            String headerName = iter.next();
            System.out.println(headerName+" : " + resp.getHeader(headerName));
//            key값으로 value가 나옴
        }

    }
}
