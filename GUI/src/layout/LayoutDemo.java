package layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutDemo {

    public LayoutDemo(){
        LayoutInit();
    }

    public void LayoutInit(){
        Frame myWindow = new Frame();
        JLabel footer = new JLabel("footer");

        myWindow.setLayout(new GridLayout(2,1));
        myWindow.setSize(500, 700);


        JButton button = new JButton("SUBMIT ... ");
        button.setActionCommand("save");

        JButton clear = new JButton("CLEAR ... ");
        clear.setActionCommand("clear");


        JTextField firstName = new JTextField("", 10);
        firstName.setSize(100, 100);
        JTextField lastName = new JTextField("", 10);

//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                footer.setText(firstName.getText() + " "+ lastName.getText());
//            }
//        });
//
//        clear.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                firstName.setText("");
//                lastName.setText("");
//                footer.setText("");
//            }
//        });

        button.addActionListener(new ButtonActionListener());
        clear.addActionListener(new ButtonActionListener());

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.setBorder(BorderFactory.createTitledBorder("Forms "));
        panel1.add(lastName);
        panel1.add(firstName);
        panel1.add(clear);
        panel1.add(button);
        panel2.setBackground(Color.red);
        panel2.add(footer);

        myWindow.add(panel1);
        myWindow.add(panel2);
        myWindow.setVisible(true);
        myWindow.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        LayoutDemo demo = new LayoutDemo();
        demo.LayoutInit();
    }
}
