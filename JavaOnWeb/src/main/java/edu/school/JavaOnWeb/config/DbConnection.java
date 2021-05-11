package edu.school.JavaOnWeb.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection getConnection() throws SQLException {
        Connection connection;
        String dbUrl = "jdbc:mysql://127.0.0.1/web_app_db";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        connection = DriverManager.getConnection(dbUrl, "root1", "Rca@{123}");
        if (connection == null) {
            System.out.println("Failed to connect to database ");
            System.exit(0);
        }

        return connection;
    }
}
