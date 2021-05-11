package edu.school.JavaOnWeb.controllers;

import java.sql.SQLException;
import java.util.List;

import edu.school.JavaOnWeb.dao.StudentDAO;
import edu.school.JavaOnWeb.models.Student;

public class StudentController {
    private final StudentDAO dao;

    public StudentController() throws SQLException {
        dao = new StudentDAO();
    }

    public List<Student> getStudents() throws SQLException {
        return dao.getAll();
    }

    public int create(String firstName, String lastName, String gender, String email, String year, String className) throws SQLException {
        return dao.create(new Student(firstName, lastName, gender, email , year, className));
    }


}
