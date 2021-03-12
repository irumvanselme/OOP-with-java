import libs.DataBaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDemo {
    public static void main(String[] args) throws SQLException {
        try {
            Connection connection = DataBaseConnection.connect();

            Statement statement = connection.createStatement();
            ResultSet set = statement.executeQuery("SELECT * FROM students");

            while (set.next()) {
                String name = set.getString("first_name");
                System.out.println(name);
            }
        }finally {
            System.out.println("We are in the finally block ... ");
        }
    }
}