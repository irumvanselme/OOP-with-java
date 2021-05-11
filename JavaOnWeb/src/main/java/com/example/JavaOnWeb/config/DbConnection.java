package com.example.JavaOnWeb.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    public static Connection getConnection(){
        Connection connection = null;
        try {
            String dbUrl = "jdbc:mysql://127.0.0.1/web_app_db";

            connection = DriverManager.getConnection(dbUrl, "root1", "Rca@{123}");

            if(connection == null){
                System.out.println("Failed to connect to database ");
                System.exit(0);
            }
        }catch (Exception e){
            System.out.println("Failed to connect to database in the catch");
            System.exit(0);
            e.printStackTrace();
        }

        return connection;
    }
}
