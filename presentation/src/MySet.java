import java.util.*;

public class MySet {
    public static void main(String[] args) {
        Hashtable<Integer, String> my_table = new Hashtable<>();
        my_table.put(1, "Daniel");
        my_table.put(2, "Jacques");
        my_table.put(3, "Sauve");

        for (Map.Entry<Integer, String> item: my_table.entrySet())
            System.out.println(item.getKey()+" "+item.getValue());


    }
}
