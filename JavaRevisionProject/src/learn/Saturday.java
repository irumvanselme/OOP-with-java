package learn;

import java.sql.*;

public class Saturday {

    // database connection ......
    public static Connection connection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/class_a", "root1", "Rca@{123}");
        }catch (SQLException e){
            e.printStackTrace();
        }

        return connection;
    }


    // java and networking .......



    public static void main(String[] args) throws SQLException {
        Connection connection = connection();
        Statement statement = connection.createStatement();
        ResultSet set = statement.executeQuery("SELECT * FROM students_list");

        while(set.next()){
            System.out.println(set.getString("first_name")+" "+set.getString("last_name"));
        }
    }
}

// TODO: Theory: Multithreading to GUI ()
// TODO: Practical: Database to GUI