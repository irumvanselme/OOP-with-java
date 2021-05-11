package com.example.JavaOnWeb.views;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "NewStudent", value = "/new-student")
public class NewStudent extends HttpServlet {

    public void init() { }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        RequestDispatcher dispatcher = request.getRequestDispatcher("newStudent.jsp");
        dispatcher.forward(request,response);
    }

    public void destroy() {
    }
}
