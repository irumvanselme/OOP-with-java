package edu.school.JavaOnWeb;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void init() {
        String message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String path = request.getServletPath();
        String username = request.getParameter("username");
        System.out.println("username:"+username);
        response.getWriter().append("success");
        //response.getWriter().append(username);
        request.setAttribute("yyy", username);
        RequestDispatcher dispatcher = request.getRequestDispatcher("newStudent.jsp");
        dispatcher.forward(request,response);
    }

    public void destroy() {
    }
}