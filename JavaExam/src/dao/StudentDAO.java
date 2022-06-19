package dao;

import config.DbConnection;
import models.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    Connection connection = DbConnection.getConnection();

    public List<Student> getAll() throws SQLException {
        List<Student> departmentList = new ArrayList<>();

        Statement statement = connection.createStatement();

        ResultSet set = statement.executeQuery("SELECT * FROM student");

        while (set.next()) {
            departmentList.add(new Student(
                    set.getString("first_name"),
                    set.getString("last_name"),
                    set.getString("gender"),
                    set.getString("birth_date"),
                    set.getInt("department_id")
            ));
        }

        return departmentList;
    }

    public int create(Student student) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO student VALUES (NULL , RAND(), ?, ?, ?, ?, ?)");
        statement.setString(1, student.getFirstName());
        statement.setString(2, student.getLastName());
        statement.setString(3, student.getGender());
        statement.setString(4, student.getBirthDate());
        statement.setInt(5, student.getDepartment());

        return statement.executeUpdate();
    }
}
