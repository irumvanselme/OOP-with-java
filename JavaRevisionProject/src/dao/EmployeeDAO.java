package dao;

import models.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements Dao{

    public List<Employee> getAll() throws SQLException {
        List<Employee> employees = new ArrayList<>();

        Statement statement = connection.createStatement();
        ResultSet set = statement.executeQuery("SELECT * FROM employees_list");

        while (set.next()){
            employees.add(new Employee(
                    set.getInt("id"),
                    set.getString("employee_code"),
                    set.getString("first_name"),
                    set.getString("last_name"),
                    set.getString("gender"),
                    set.getString("phone"),
                    set.getString("resident_address"),
                    set.getFloat("salary"),
                    set.getInt("departmentId"),
                    set.getString("department_name")
            ));
        }

        return employees;
    }

    public Employee getById(int id) throws SQLException {
        Employee employee = null;

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM employees_list where id = ?");
        statement.setInt(1, id);

        ResultSet set = statement.executeQuery();

        while (set.next()) {
            employee = new Employee(
                    set.getInt("id"),
                    set.getString("employee_code"),
                    set.getString("first_name"),
                    set.getString("last_name"),
                    set.getString("gender"),
                    set.getString("phone"),
                    set.getString("resident_address"),
                    set.getFloat("salary"),
                    set.getInt("departmentId"),
                    set.getString("department_name")
            );
        }

        return employee;
    }

    public int create(Employee employee) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO employees VALUES (NULL , ?, ?, ?, ?, ?, ?, ?, ?)");
        statement.setString(1, employee.getCode());
        statement.setString(2, employee.getFirstName());
        statement.setString(3, employee.getLastName());
        statement.setString(5, employee.getPhone());
        statement.setString(6, employee.getAddress());
        statement.setFloat(7, employee.getSalary());
        statement.setString(4, employee.getGender());
        statement.setInt(8, employee.getDepartmentId());

        return statement.executeUpdate();
    }

    public int update(Employee employee) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("UPDATE employees set employee_code = ?, first_name = ?, last_name = ?, gender = ?, phone = ?, phone = ?, resident_address = ?,department_id ? WHERE id= ?");
        statement.setString(1, employee.getCode());
        statement.setString(2, employee.getFirstName());
        statement.setString(3, employee.getLastName());
        statement.setString(4, employee.getGender());
        statement.setString(5, employee.getPhone());
        statement.setString(6, employee.getAddress());
        statement.setFloat(7, employee.getSalary());
        statement.setInt(8, employee.getDepartmentId());
        statement.setInt(9, employee.getId());

        return statement.executeUpdate();
    }

    public int delete(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("DELETE FROM departments WHERE id = ?");
        statement.setInt(1, id);

        return statement.executeUpdate();
    }
}
