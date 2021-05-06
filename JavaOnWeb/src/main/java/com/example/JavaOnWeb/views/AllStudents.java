package com.example.JavaOnWeb.views;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "AllStudents", value = "/all-students")
public class AllStudents extends HttpServlet {

    public void init() {
        String message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        RequestDispatcher dispatcher = request.getRequestDispatcher("allStudents.jsp");
        dispatcher.forward(request,response);
    }

    public void destroy() {
    }
}