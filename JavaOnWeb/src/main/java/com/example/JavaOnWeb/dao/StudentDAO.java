package com.example.JavaOnWeb.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.example.JavaOnWeb.config.DbConnection;
import com.example.JavaOnWeb.models.Student;

public class StudentDAO {
    Connection connection = DbConnection.getConnection();

    public List<Student> getAll() throws SQLException {
        List<Student> departmentList = new ArrayList<>();

        Statement statement = connection.createStatement();

        ResultSet set = statement.executeQuery("SELECT * FROM students");

        while (set.next()) {
            departmentList.add(new Student(
                    set.getString("first_name"),
                    set.getString("last_name"),
                    set.getString("gender"),
                    set.getString("email"),
                    set.getString("year"),
                    set.getString("class")
            ));
        }

        return departmentList;
    }

    public int create(Student student) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO students VALUES (NULL , ?, ?, ?, ?, ?, ?)");
        statement.setString(1, student.getFirstName());
        statement.setString(2, student.getLastName());
        statement.setString(3, student.getGender());
        statement.setString(4, student.getEmail());
        statement.setString(5, student.getYear());
        statement.setString(6, student.getClassName());

        return statement.executeUpdate();
    }
}
