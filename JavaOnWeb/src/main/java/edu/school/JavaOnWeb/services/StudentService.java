package edu.school.JavaOnWeb.services;

import edu.school.JavaOnWeb.controllers.StudentController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "Students", value = "/students")
public class StudentService extends HttpServlet {
    private final StudentController controller = new StudentController();

    public StudentService() throws SQLException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        int studentId = Integer.parseInt(request.getParameter("id"));

        switch (action) {
            case "DELETE":
                boolean result = false;
                try {
                    result = controller.delete(studentId);
                } catch (SQLException throwable) {
                    throwable.printStackTrace();
                }
                if(result) response.sendRedirect("all-students");
                else response.getOutputStream().println("<h1>Failed to delete a student</h1>");
                break;
            case "REDIRECT_TO_UPDATE":
                try {
                    request.setAttribute("student", controller.getById(studentId));
                } catch (SQLException throwable) {
                    throwable.printStackTrace();
                }

                RequestDispatcher dispatcher = request.getRequestDispatcher("editStudent.jsp");
                dispatcher.forward(request,response);

                break;
            default:
                response.sendRedirect("all-students");
                break;
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
