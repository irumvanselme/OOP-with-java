import views.student.*;

import javax.swing.*;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {

        AllStudents app = new AllStudents();
        app.setSize(1000, 1000);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);

//        JFrame newStudent = new NewStudent();
//
//        newStudent.setSize(600, 600);
//        newStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        newStudent.setVisible(true);
    }
}
