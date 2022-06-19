package views.student;

import controllers.StudentController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class NewStudent extends JFrame {
    String gender = "None";

    public NewStudent(){
        JLabel label = new JLabel("Fill in student Registration .... ");
        label.setFont(new Font("serif", Font.PLAIN, 20));

        // the first name input group starts here ...

        JPanel firstNameGroup = new JPanel();

        JLabel firstNameLabel = new JLabel("First name");
        firstNameGroup.add(firstNameLabel);

        JTextField textField = new JTextField("", 30);
        textField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        textField.setBackground(new Color(146,146,146));
        firstNameGroup.add(textField);


        // the last name input group starts here

        JPanel lastNameGroup = new JPanel();

        JLabel lastNameLabel = new JLabel("Last name");
        lastNameGroup.add(lastNameLabel);

        JTextField lastNameField = new JTextField("", 30);
        lastNameField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        lastNameField.setBackground(new Color(146,146,146));
        lastNameGroup.add(lastNameField);


        // the gender input group starts here
        JPanel genderFormGroup = new JPanel();
        JLabel genderLabel = new JLabel("Gender");
        genderFormGroup.add(genderLabel);
        genderFormGroup.setSize(300, 300);
        genderFormGroup.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JRadioButton maleCheckbox = new JRadioButton("Male");
        ButtonGroup buttonGroup = new ButtonGroup();
        maleCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!gender.equals("Male")){
                    gender = "Male";
                }
            }
        });

        JRadioButton femaleCheckbox = new JRadioButton("Female");
        femaleCheckbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!gender.equals("Female")){
                    gender = "Female";
                }
            }
        });
        buttonGroup.add(maleCheckbox);
        buttonGroup.add(femaleCheckbox);
        genderFormGroup.add(femaleCheckbox);
        genderFormGroup.add(maleCheckbox);

        // birth date

        String dates[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",};
        String years[] = {"1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006"};
        String months[] = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};

        JPanel birthDatePanel = new JPanel();
        JLabel birthDateLabel = new JLabel("Birth date");
        birthDatePanel.add(birthDateLabel);
        JComboBox<String> datesSelect = new JComboBox<>(dates);
        birthDatePanel.add(datesSelect);

        JComboBox<String> monthsSelect = new JComboBox<>(months);
        birthDatePanel.add(monthsSelect);

        JComboBox<String> yearsSelect = new JComboBox<>(years);
        birthDatePanel.add(yearsSelect);

        birthDatePanel.setBorder(BorderFactory.createEmptyBorder(10, 150, 10, 150));


        // department
        JPanel departmentPanel = new JPanel();

        String departments[] = {"Choose department", "Software Engineering", " Siber Security"};
        JLabel departmentLabel = new JLabel("Department");
        departmentPanel.add(departmentLabel);
        JComboBox<String> departmentSelect = new JComboBox<>(departments);
        departmentSelect.setBackground(new Color(146,146,146));
        departmentSelect.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 20));
        departmentPanel.add(departmentSelect);

        departmentPanel.setBorder(BorderFactory.createEmptyBorder(10, 150, 10, 150));


        // School
        JPanel schoolInputGroup = new JPanel();

        String schools[] = {"Choose school", "Rwanda Coding Academy"};
        JLabel schoolsLabel = new JLabel("Schools");
        schoolInputGroup.add(schoolsLabel);
        JComboBox<String> schoolsSelect = new JComboBox<>(schools);
        schoolsSelect.setBackground(new Color(146,146,146));
        schoolsSelect.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 20));
        schoolInputGroup.add(schoolsSelect);

        schoolInputGroup.setBorder(BorderFactory.createEmptyBorder(10, 150, 10, 150));


        JPanel buttons = new JPanel();
        JButton save = new JButton("SAVE");
        save.setBackground(Color.green);
        save.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 20));
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentController controller = new StudentController();
                try {
                    controller.create(textField.getText(), lastNameField.getText(), gender, (datesSelect.getSelectedItem()+"-"+monthsSelect.getSelectedItem()+"-"+yearsSelect.getSelectedItem()), departmentSelect.getSelectedIndex());
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });
        JButton clear = new JButton("Clear");
        clear.setBackground(Color.green);
        clear.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 20));


        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                lastNameField.setText("");
                maleCheckbox.setSelected(false);
                femaleCheckbox.setSelected(false);
                datesSelect.setSelectedIndex(0);
                yearsSelect.setSelectedIndex(0);
                monthsSelect.setSelectedIndex(0);
                departmentSelect.setSelectedIndex(0);
                schoolsSelect.setSelectedIndex(0);
            }
        });


        buttons.add(save);
        buttons.add(clear);

        JPanel panel = new JPanel();

        panel.add(label);
        panel.add(firstNameGroup);
        panel.add(lastNameGroup);
        panel.add(genderFormGroup);
        panel.add(birthDatePanel);
        panel.add(departmentPanel);
        panel.add(schoolInputGroup);
        panel.add(buttons);
        this.add(panel);
    }
}
