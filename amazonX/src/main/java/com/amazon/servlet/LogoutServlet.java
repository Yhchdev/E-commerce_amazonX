package com.amazon.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpSession session = req.getSession(false);
//        if(session == null){
//            resp.sendRedirect("index.jsp");
//        }
//        session.removeAttribute("user");
//        resp.sendRedirect("index.jsp");
        HttpSession userSession = req.getSession();
        userSession.removeAttribute("user");
        userSession.invalidate();
        resp.sendRedirect("index.jsp");
    }
}
