package com.example.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class OnlineTimeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Long startTime = (Long) session.getAttribute("startTime");

        if (startTime == null) {
            startTime = System.currentTimeMillis();
            session.setAttribute("startTime", startTime);
        }

        long now = System.currentTimeMillis();
        long onlineTime = (now - startTime) / 1000;

        session.setAttribute("onlineTime", onlineTime);
        request.getRequestDispatcher("online.jsp").forward(request, response);
    }
}
