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

    public int createNewDepartment(String name, String description) throws SQLException {
        return controller.create(name, description);
    }

    public Main() throws SQLException {
        frame = new JFrame("A very department CRUD ...");
        frame.setSize(1000, 1000);
        frame.setLayout(new GridLayout(2,1));

        form = new JPanel();
        form.setLayout(null);
        form.setBorder(BorderFactory.createTitledBorder("Create new Department"));
        JLabel nameLabel = new JLabel("Department name : ");
        nameLabel.setBounds(120, 120, 219,219);
        nameLabel.setBackground(Color.red);
        JTextField nameField = new JTextField("", 20);
        JPanel nameContainer = new JPanel();
        nameContainer.add(nameLabel);
        nameContainer.add(nameField);

        JLabel descriptionLabel = new JLabel("Department description : ");
        JTextArea descriptionField = new JTextArea(30, 20);
        
        JButton createButton = new JButton("Create Department .... ");
        createButton.addActionListener(e -> {
            try {
                if(createNewDepartment(nameField.getText(), descriptionField.getText()) == 1){
                    System.out.println("We are going to retrieve the data ..... ");
                }
            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
            nameField.setText("");
            descriptionField.setText("");
        });

        form.add(nameContainer);
        form.add(descriptionLabel);
        form.add(descriptionField);
        form.add(createButton);

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

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\java\\code\\JavaRevisionProject\\src\\logo.png");
        frame.setIconImage(imageIcon.getImage());

        frame.add(form);
        frame.add(tableContainer);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws SQLException {
        new Main();
    }
}
