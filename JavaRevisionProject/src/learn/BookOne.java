package learn;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BookOne {
    private Frame frame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;
    private Button button;

    public BookOne(){
        frame = new Frame("Java awt example ... ");
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(3, 1));

        // adding the closing event handler for the awt frame ....
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent event){
                System.exit(0);
            }
        });

        headerLabel  = new Label("This is the header .... ");
        headerLabel.setAlignment(Label.CENTER);

        statusLabel = new Label("This is the status ");
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350, 100);

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout()); // TODO: Find what the new flow layout means

        button = new Button("Click me ");

        frame.add(headerLabel);
        frame.add(controlPanel);
        frame.add(statusLabel);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new BookOne();
    }

}
