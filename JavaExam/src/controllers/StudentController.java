package controllers;

import dao.StudentDAO;
import models.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentController {
    private final StudentDAO dao = new StudentDAO();

    public List<Student> getStudents() throws SQLException {
        return dao.getAll();
    }

    public void create(String firstName, String lastName, String gender, String birthDate, int department) throws SQLException {
        dao.create(new Student(firstName, lastName, gender, birthDate, department));
    }
}
