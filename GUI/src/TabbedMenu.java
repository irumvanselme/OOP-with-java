import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class TabbedMenu {
    JFrame frame;

    public TabbedMenu(){
        frame = new JFrame();
        JTextArea textArea = new JTextArea(200, 100);
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(10, 16, 10));
        panel1.add(textArea);

        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();

        JLabel label1 = new JLabel("Main div");
        panel4.add(label1);

        JLabel label2 = new JLabel("Visit div div");
        panel2.add(label2);

        JLabel label3 = new JLabel("Help div");
        panel3.add(label3);

        JTabbedPane pane = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        pane.setBounds(50, 50, 200, 200);
        ImageIcon icon = null;

        icon = new ImageIcon("C:\\Users\\DELL\\Documents\\java\\code\\GUI\\src\\lib\\image.jpg", "A very cool description ");
        pane.addTab("Test tab", new ImageIcon(getScaledImage(icon.getImage(), 8, 10)), panel4);
        pane.addTab("main", new ImageIcon(getScaledImage(icon.getImage(), 10, 10)), panel1);
        pane.add("Visit", panel2);
        pane.add("Help", panel3);


        frame.add(pane);
        frame.setSize(1000, 1000);
        frame.setVisible(true);

    }

    /**
     * this function is used to scale the image
     * @return Image
     * @param src Image
     * @param width int
     * @param height int
     * */
    private Image getScaledImage(Image src, int width, int height){
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2D = image.createGraphics();

        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(src, 0, 0, width, height, null);
        graphics2D.dispose();;

        return image;
    }

    public static void main(String[] args) {
        new TabbedMenu();
    }
}
