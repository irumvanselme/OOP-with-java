package learn;

import javax.swing.*;
import javax.swing.border.Border;

public class Revision {
    public Revision() {
        JFrame frame = new JFrame("We are going to learn Java UI");
        JPanel panel = new JPanel();

        frame.setSize(1000, 500);


//        JLabel label = new JLabel("A very cool label ... ");
//        frame.add(label);

//        JButton button = new JButton("Click me, I am the title .... ");
//        frame.add(button);

//        JCheckBox checkBox = new JCheckBox("Click this checkbox .... ");
//        frame.add(checkBox);

//        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//        JList list = new JList<>(week);
//        frame.add(list);

//        JTextField textField = new JTextField("", 30);
//        textField.setSize(10, 30);
//        frame.add(textField);

        JTextArea textArea = new JTextArea(40, 20);

        JDialog dialog = new JDialog();
        dialog.setSize(100, 100);

        dialog.add(textArea);

        panel.add(dialog);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Revision();
    }
}
