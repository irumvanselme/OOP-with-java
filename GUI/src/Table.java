import javax.swing.*;

public class Table {
    public Table(){
        JFrame frame = new JFrame("Table showing ");
        frame.setSize(500, 500);
        String[][] data = {
                { "1234", "IRUMVA", "Anselme" },
                { "2345", "TWIZEYIMANA", "Jacques" }
        };

        String[] columnNames = { "Name", "First name", "Last name" };

        JTable table = new JTable(data, columnNames);

        frame.add(new JScrollPane(table));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Table();
    }
}
