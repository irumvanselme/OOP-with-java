package Menus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemo {
    private JFrame frame, newFrame;
    private JMenuBar menuBar;
    private JMenu file, window, help;

    public MenuDemo(){
        init();
    }

    protected ImageIcon createImageIcon(String path,
                                        String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    private void init(){
        frame = new JFrame("Menu bar");
        frame.setSize(1000, 1000);

        menuBar = new JMenuBar();

        file = new JMenu("File");

        JMenuItem newFile = new JMenuItem("New ");
        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newFrame = new JFrame("New file ... ");
                newFrame.setSize(400, 400);
                newFrame.setVisible(true);
            }
        });
        file.add(newFile);
        file.add(new JMenuItem("Open "));
        JMenu open = new JMenu("Open");
        open.add(new JMenuItem("Recent"));
        open.add(new JMenuItem("Hidden"));
        open.add(new JMenuItem("Old"));
        file.add(open);


        file.add(new JMenuItem("Settings "));
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        file.add(exit);

        window = new JMenu("Window");
        help = new JMenu("Help");

        menuBar.add(file);
        menuBar.add(window);
        menuBar.add(help);

        frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}
