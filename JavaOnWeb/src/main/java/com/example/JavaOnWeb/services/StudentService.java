package com.example.JavaOnWeb.services;

import com.example.JavaOnWeb.controllers.StudentController;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Students", value = "/students")
public class StudentService extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        StudentController controller = new StudentController();

        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String year = request.getParameter("year");
        String className = request.getParameter("class");

        try {
            int create = controller.create(firstName, lastName, gender, email, year, className);
            System.out.println(create);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }

        response.getOutputStream().println("<h1>Hello Successfully created a student</h1>");
    }
}
