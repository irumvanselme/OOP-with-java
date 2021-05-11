package edu.school.JavaOnWeb.views;

import edu.school.JavaOnWeb.controllers.StudentController;
import edu.school.JavaOnWeb.models.Student;

import java.io.*;
import java.sql.SQLException;
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
        try {
            controller = new StudentController();
            List<Student> students = controller.getStudents();
            for (Student student: students) {
                System.out.println(student.getFirstName());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("allStudents.jsp");
        dispatcher.forward(request,response);
    }

    public void destroy() {
    }
}