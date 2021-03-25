package controllers;


import dao.DepartmentDAO;
import models.Department;

import java.sql.SQLException;
import java.util.List;

public class DepartmentController {
    private final DepartmentDAO dao = new DepartmentDAO();

    public List<Department> getAllDepartments() throws SQLException {
        return dao.getAll();
    }

    public int create(String name, String description) throws SQLException {
        return dao.create(new Department(0, name, description));
    }
}

