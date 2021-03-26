package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

    public static Connection getConnection(){
        Connection connection = null;
        try {
            String dbUrl = "jdbc:mysql://127.0.0.1/desktop_app_db";

            connection = DriverManager.getConnection(dbUrl, "root1", "Rca@{123}");
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
