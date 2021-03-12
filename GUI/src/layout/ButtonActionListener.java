package layout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener {
    String firstName;
    String lastName;
    private JLabel footer;

    public ButtonActionListener(){}

    public ButtonActionListener(String firstName, String lastName, JLabel footer){
        this.firstName = firstName;
        this.lastName = lastName;
        this.footer = footer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if(command.equals("save")){
            this.footer.setText(this.firstName+ " "+this.lastName);
        }else if(command.equals("clear")){
            System.out.println("Clear command received .... ");
        }
    }
}
