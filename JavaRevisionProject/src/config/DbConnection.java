package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    public static Connection getConnection(){
        Connection connection = null;
        try {
            String dbUrl = "jdbc:mysql://127.0.0.1/employee_ms";

            connection = DriverManager.getConnection(dbUrl, "root1", "Rca@{123}");
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
