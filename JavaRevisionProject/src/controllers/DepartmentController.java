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
}

