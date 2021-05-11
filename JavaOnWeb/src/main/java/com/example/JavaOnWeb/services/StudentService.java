package com.example.JavaOnWeb.services;

import com.example.JavaOnWeb.config.DbConnection;
import com.example.JavaOnWeb.controllers.StudentController;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "Students", value = "/students")
public class StudentService extends HttpServlet {
    Connection connection = DbConnection.getConnection();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String year = request.getParameter("year");
        String className = request.getParameter("class");

        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO students VALUES (NULL , ?, ?, ?, ?, ?, ?)");

            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, gender);
            statement.setString(4, email);
            statement.setString(5, year);
            statement.setString(6, className);


            int result =  statement.executeUpdate();


            response.getOutputStream().println("<h1>Hello Successfully created a student "+result+"</h1>");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
