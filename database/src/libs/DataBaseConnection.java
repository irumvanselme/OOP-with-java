package libs;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
    static public Connection connect () {
        String JDBCURL = "jdbc:mysql://127.0.0.1/class_a";
        Connection con = null;
        try{
            con = DriverManager.getConnection(JDBCURL,"root1","Rca@{123}");

            if(con != null){
                System.out.println("We successfully connected to database ..");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}