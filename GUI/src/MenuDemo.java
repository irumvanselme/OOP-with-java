import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemo {
    private JFrame mainWindow;
    private JMenuBar menuBar;
    private JMenu file,window,help;
    private JFrame newWindow;

    public MenuDemo(){
        menuInit();
    }

    public void menuInit(){
        mainWindow = new JFrame("Menu Demo");
        mainWindow.setSize(500,700);
        menuBar = new JMenuBar();
        file = new JMenu("File");
        window = new JMenu("Window");
        help = new JMenu("Help");


        JMenuItem newFile = new JMenuItem("New");
        JMenu open = new JMenu("Open");
        JMenuItem exit = new JMenuItem("Exit");

        JMenuItem recent = new JMenuItem("Recent");
        JMenuItem hidden = new JMenuItem("Hidden");
        JMenuItem old = new JMenuItem("Old");

        open.add(recent);
        open.add(hidden);
        open.add(old);

        file.add(newFile);
        file.add(open);
        file.add(exit);

        ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\Documents\\java\\code\\GUI\\src\\2019-09-10-213108.jpg");
        file.setIcon(icon);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Exit placed ");
                System.exit(0);

            }
        });

        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newWindow = new JFrame("Opening new file ");
                newWindow.setSize(300,500);
                newWindow.setVisible(true);
            }
        });


        menuBar.add(file);
        menuBar.add(window);
        menuBar.add(help);

        mainWindow.setJMenuBar(menuBar);
        mainWindow.setVisible(true);
    }

    public static void main(String[] args) {
        MenuDemo menuDemo = new MenuDemo();
    }
}
