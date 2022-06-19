package edu.school.JavaOnWeb.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import edu.school.JavaOnWeb.config.DbConnection;
import edu.school.JavaOnWeb.models.Student;

public class StudentDAO {
    Connection connection;

    public StudentDAO() throws SQLException {
        connection = DbConnection.getConnection();
    }

    protected void disconnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    public List<Student> getAll() throws SQLException {
        List<Student> students = new ArrayList<>();

        Statement statement = connection.createStatement();

        ResultSet set = statement.executeQuery("SELECT * FROM students");

        while (set.next()) {
            Student student = new Student(
                    set.getString("first_name"),
                    set.getString("last_name"),
                    set.getString("gender"),
                    set.getString("email"),
                    set.getString("year"),
                    set.getString("class")
            );
            student.setId(set.getInt("id"));
            students.add(student);
        }

        statement.close();
        disconnect();

        return students;
    }

    public Student show(int id) throws SQLException {
        Student department = null;

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM students where id = ?");
        statement.setInt(1, id);

        ResultSet set = statement.executeQuery();

        while (set.next()) {
            department = new Student(set.getString("first_name"), set.getString("last_name"), set.getString("gender"), set.getString("email"), set.getString("year"), set.getString("class"));
            department.setId(set.getInt("id"));
        }

        return department;
    }

    public int create(Student student) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("INSERT INTO students VALUES (NULL , ?, ?, ?, ?, ?, ?)");
        statement.setString(1, student.getFirstName());
        statement.setString(2, student.getLastName());
        statement.setString(3, student.getGender());
        statement.setString(4, student.getEmail());
        statement.setString(5, student.getYear());
        statement.setString(6, student.getClassName());

        int result = statement.executeUpdate();
        statement.close();
        disconnect();

        return result;
    }

    public int update(Student student) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("UPDATE students SET last_name = ?, first_name = ?, gender = ?, email = ?, year = ?, class = ? WHERE id = ?");
        statement.setString(2, student.getLastName());
        statement.setString(1, student.getFirstName());
        statement.setString(3, student.getGender());
        statement.setString(4, student.getEmail());
        statement.setString(5, student.getYear());
        statement.setString(6, student.getClassName());
        statement.setInt(7, student.getId());

        int result = statement.executeUpdate();
        statement.close();
        disconnect();

        return result;
    }

    public boolean delete(Student student) throws SQLException {
        String sql = "DELETE FROM students where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, student.getId());
        boolean rowDeleted = statement.executeUpdate() > 0;
        statement.close();

        return rowDeleted;
    }
}
