package edu.school.JavaOnWeb.views;

import edu.school.JavaOnWeb.controllers.StudentController;
import edu.school.JavaOnWeb.models.Student;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

        StudentController controller = null;
        List<Student> students = new ArrayList<>();

        try {
            controller = new StudentController();
            students = controller.getStudents();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("students", students);

        RequestDispatcher dispatcher = request.getRequestDispatcher("allStudents.jsp");
        dispatcher.forward(request,response);
    }

    public void destroy() {
    }
}