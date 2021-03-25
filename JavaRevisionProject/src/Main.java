import controllers.DepartmentController;
import models.Department;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public class Main {
    JFrame frame;
    JPanel form;
    JPanel tableContainer;
    DepartmentController controller = new DepartmentController();

    public Main() throws SQLException {
        frame = new JFrame("A very department CRUD ...");
        frame.setSize(1000, 1000);
        frame.setLayout(new GridLayout(2,1));

        form = new JPanel();
        form.setBorder(BorderFactory.createTitledBorder("Create new Department"));
        JLabel nameLabel = new JLabel("Department name : ");
        JTextField nameField = new JTextField("", 20);

        JLabel descriptionLabel = new JLabel("Department description : ");
        JTextArea descriptionField = new JTextArea(30, 20);
        form.add(nameLabel);
        form.add(nameField);
        form.add(descriptionLabel);
        form.add(descriptionField);

        tableContainer = new JPanel();
        tableContainer.setBorder(BorderFactory.createTitledBorder("All departments"));

        List<Department> departments = controller.getAllDepartments();

        String[][] data = new String[departments.size()][];

        for (int i = 0; i < departments.size(); i++){
            data[i] = new String[]{ Integer.toString(departments.get(i).getId()), departments.get(i).getName(), departments.get(i).getDescription()};
        }

        String[] columnNames = { "id", "name", "Description" };

        JTable table = new JTable(data, columnNames);

        tableContainer.add(new JScrollPane(table));

        frame.add(form);
        frame.add(tableContainer);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws SQLException {
        new Main();
    }
}
