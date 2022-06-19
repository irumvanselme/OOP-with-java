package TaskOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class StudentsView {
    private Frame window;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel firstNameLabel;
    private JTextField firstName;
    private JLabel lastNameLabel;
    private JTextField lastName;
    private JLabel classNameLabel;
    private JTextField className;
    private JLabel genderLabel;
    private JRadioButton maleButton;
    private JRadioButton femaleButton;
    private BoxLayout formLayout;
    private JPanel formFirstPanel;
    private JPanel formSecondPanel;

    public StudentsView(){
        lastNameLabel = new JLabel("Last name ");
        firstNameLabel = new JLabel("First name ");
        genderLabel = new JLabel("Gender ");
        classNameLabel = new JLabel("Class Name ");

        window = new Frame();
        window.setSize(600, 700);
        window.setLayout(new GridLayout(2, 1));

        panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createTitledBorder("Create New student "));
        panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createTitledBorder("All students "));

        formFirstPanel = new JPanel();
        formSecondPanel = new JPanel();

        panel1.setLayout(new GridLayout(1, 2));

        firstName = new JTextField("", 20);
        formFirstPanel.add(firstNameLabel);
        formFirstPanel.add(firstName);

        lastName = new JTextField("", 20);
        formFirstPanel.add(lastNameLabel);
        formFirstPanel.add(lastName);

        formSecondPanel.add(genderLabel);
        maleButton = new JRadioButton("Male");
        formSecondPanel.add(maleButton);

        femaleButton = new JRadioButton("Female");
        formSecondPanel.add(femaleButton);

        className = new JTextField("", 20);
        formSecondPanel.add(classNameLabel);
        formSecondPanel.add(className);


        panel1.add(formFirstPanel);
        panel1.add(formSecondPanel);

        window.add(panel1);
        window.add(panel2);
        window.setVisible(true);
        window.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        StudentsView view = new StudentsView();
    }
}
