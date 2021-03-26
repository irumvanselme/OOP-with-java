package views.student;

import controllers.StudentController;
import models.Student;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AllStudents extends JFrame {
    private StudentController controller = new StudentController();

    public AllStudents() throws IOException, SQLException {
        setLayout(new GridLayout(3, 1));
        JPanel header = new JPanel();
        BufferedImage profileImage = ImageIO.read(new File("C:\\Users\\DELL\\Documents\\java\\JavaExam\\libs\\profile.jpg"));
        BufferedImage schoolImage = ImageIO.read(new File("C:\\Users\\DELL\\Documents\\java\\JavaExam\\libs\\school.png"));
        JLabel logo = new JLabel(new ImageIcon(getScaledImage(schoolImage, 100, 100)));
        JLabel profile = new JLabel(new ImageIcon(getScaledImage(profileImage, 100, 100)));
        JLabel label = new JLabel("School management information system .... ");
        header.add(logo);
        header.add(label);
        header.add(profile);

        JPanel menu = new JPanel();
        JMenuBar menuBar = new JMenuBar();
        JMenu students = new JMenu("Students");
        JMenuItem addNewStudent = new JMenuItem("Add New ");
        addNewStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewStudent student = new NewStudent();
                student.setSize(600, 600);
                student.setVisible(true);
            }
        });
        students.add(addNewStudent);
        menuBar.add(new JMenu("Home "));
        menuBar.add(new JMenu("Schools "));
        menuBar.add(students);
        menuBar.add(new JMenu("Exit "));

        menu.add(menuBar);


        JPanel tableContainer = new JPanel();
        List<Student> studentsList = controller.getStudents();

        String[][] data = new String[studentsList.size()][];

        String departments[] = {"Choose department", "Software Engineering", " Siber Security"};

        for (int i = 0; i < studentsList.size(); i++){
            data[i] = new String[]{ studentsList.get(i).getFirstName(), studentsList.get(i).getLastName(), departments[studentsList.get(i).getDepartment()], "Rwanda Coding Academy"};
        }

        String[] columnNames = { "First name", "Last name", "Department", "School" };

        JTextField search = new JTextField("Search", 20);
        search.setBorder(BorderFactory.createCompoundBorder(search.getBorder(), BorderFactory.createEmptyBorder(5, 50, 5, 50)));
        JPanel searchPannel = new JPanel();
        searchPannel.add(search);

        JTable table = new JTable(data, columnNames);
        tableContainer.add(new JScrollPane(table));

        JLabel label1 = new JLabel("List of recorded students ");
        label1.setBorder(BorderFactory.createEmptyBorder(20, 200, 20, 200));
        header.add(label1);
        header.add(searchPannel);
        add(header);
        setJMenuBar(menuBar);
        add(tableContainer);
    }

    private Image getScaledImage(Image src, int width, int height){
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2D = image.createGraphics();

        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(src, 0, 0, width, height, null);
        graphics2D.dispose();;

        return image;
    }
}
