package edu.school.JavaOnWeb.services;

import edu.school.JavaOnWeb.controllers.StudentController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Students", value = "/students")
public class StudentService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        switch (action){
            case "DELETE":
                response.getOutputStream().println("You decided to delete");
                break;
            case "REDIRECT_TO_UPDATE":
                response.getOutputStream().println("You decided to update a record");
                break;
            default:
                response.sendRedirect("all-students");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String year = request.getParameter("year");
        String className = request.getParameter("class");


        StudentController controller = null;
        try {
            controller = new StudentController();
            int result = controller.create(firstName, lastName, gender, email, year, className);

            if (result == 1) {
                response.sendRedirect("all-students");
            } else {
                response.getOutputStream().println("<h1>Failed to create the Student </h1>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
