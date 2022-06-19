package views.departments;

import controllers.DepartmentController;
import models.Department;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

public class AllDepartments {
    DepartmentController controller = new DepartmentController();

    public AllDepartments() throws SQLException {
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);


        List<Department> departments = controller.getAllDepartments();

        String[][] data = new String[departments.size()][];

        for (int i = 0; i < departments.size(); i++){
            data[i] = new String[]{ Integer.toString(departments.get(i).getId()), departments.get(i).getName(), departments.get(i).getDescription()};
        }

        String[] columnNames = { "id", "name", "Description" };

        JTable table = new JTable(data, columnNames);

        frame.add(new JScrollPane(table));
        frame.setVisible(true);
    }

    public static void main(String[] args) throws SQLException {
        new AllDepartments();
    }
}
