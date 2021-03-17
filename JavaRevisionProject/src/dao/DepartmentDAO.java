package dao;

import models.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO implements Dao {

    public List<Department> getAll() throws SQLException {
        List<Department> departmentList = new ArrayList<>();

        Statement statement = connection.createStatement();

        ResultSet set = statement.executeQuery("SELECT * FROM departments");

        while (set.next()) {
            departmentList.add(
                    new Department(
                            set.getInt("id"),
                            set.getString("name"),
                            set.getString("description")));
        }

        return departmentList;
    }

    public Department getById(int id ) throws SQLException {
        Department department = null;

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM departments where id = ?");
        statement.setInt(1, id);

        ResultSet set = statement.executeQuery();

        while (set.next()) {
            department = new Department( set.getInt("id"), set.getString("name"), set.getString("description"));
        }

        return department;
    }

    public int create(Department department) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO departments VALUES (NULL , ?, ?)");
        statement.setString(1, department.getName());
        statement.setString(2, department.getDescription());

        return statement.executeUpdate();
    }

    public int update(Department department) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("UPDATE departments SET name = ? description =  ? WHERE id = ?");
        statement.setString(1, department.getName());
        statement.setString(2, department.getDescription());
        statement.setInt(3, department.getId());

        return statement.executeUpdate();
    }

    public int delete(int id) throws SQLException{
        PreparedStatement statement = connection.prepareStatement("DELETE FROM departments WHERE id = ?");
        statement.setInt(1, id);

        return statement.executeUpdate();
    }
}
