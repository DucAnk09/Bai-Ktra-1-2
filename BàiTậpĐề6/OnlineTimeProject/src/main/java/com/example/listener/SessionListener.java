package com.example.listener;

import jakarta.servlet.http.*;
import jakarta.servlet.ServletContext;

public class SessionListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext context = se.getSession().getServletContext();
        Integer count = (Integer) context.getAttribute("sessionCount");
        context.setAttribute("sessionCount", count == null ? 1 : count + 1);
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        ServletContext context = se.getSession().getServletContext();
        Integer count = (Integer) context.getAttribute("sessionCount");
        context.setAttribute("sessionCount", count == null || count <= 1 ? 0 : count - 1);
    }
}
