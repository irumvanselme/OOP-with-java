import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

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

        table.setCellSelectionEnabled(true);
        ListSelectionModel model = table.getSelectionModel();
        model.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        model.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int rows[] = table.getSelectedRows();
                int cols[] = table.getSelectedColumns();

                for (int row: rows){
                    for (int col: cols){
                        String value = (String) table.getValueAt(row, col);
                        System.out.println(value);
                    }
                }
            }
        });

        frame.add(new JScrollPane(table));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Table();
    }
}
