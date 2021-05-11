package edu.school.JavaOnWeb.services;
import edu.school.JavaOnWeb.controllers.StudentController;

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

            response.getOutputStream().println("<h1>Hello Successfully created a student " + result + "</h1>");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
