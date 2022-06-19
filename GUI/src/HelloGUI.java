import java.awt.*;
import javax.swing.*;

public class HelloGUI {
    private Frame mainWindow1;
    private JFrame mainWindow2;
    private Label header;
//    private Label header2;

    public void UIInitializer(){
        mainWindow1 = new Frame("From awt new frame .... ");
        mainWindow2 = new JFrame("From swing new frame .... ");
        header = new Label("Heading ..... ");
//        header2 = new Label("Heading ..... ");

        mainWindow1.setSize(400, 500);
        mainWindow1.setBackground(Color.yellow);
        mainWindow1.setVisible(true);

        mainWindow2.setSize(200, 300);
        mainWindow2.getContentPane().setBackground(Color.blue);
        mainWindow2.setVisible(true);

        mainWindow1.add(header);
        mainWindow2.getContentPane().add(header);
    }

    public HelloGUI() {
        UIInitializer();
    }

    public static void main(String[] args) {
        HelloGUI helloGUI = new HelloGUI();
    }
}
