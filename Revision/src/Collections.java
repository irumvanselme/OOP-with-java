import java.util.*;

class App {
    public static void write(Object data){
        System.out.println(data);
    }

    public static void new_line(){
        System.out.println("====================================");
    }
}

public class Collections {

    public static void main(String[] args) {


        //  Lists interface

        // 1.1 Array list ....
        ArrayList<Integer> my_list = new ArrayList<>();

        my_list.add(120);
        my_list.add(432);
        my_list.add(35);
        my_list.add(3, 3);
        my_list.clear(); // a ver bad clear method
        App.write(my_list.lastIndexOf(32));


        ArrayList<Integer> new_list = new ArrayList<>();
        new_list.add(36);
        new_list.add(37);
        new_list.add(90);
        my_list.addAll(new_list);

        my_list.removeIf(item -> item > 101);

        ArrayList<Integer> clone = (ArrayList<Integer>) my_list.clone();
        for (Integer item: clone )
            App.write(item);

        App.new_line();

        // 1.2 Linked Lists ....

        LinkedList<String> students = new LinkedList<>();
        students.add("jacques");
        students.add("Daniel");
        students.add("Anselme");
        students.add("Sauve");

        for (String item: students)
            App.write(item);

        App.new_line();

        // 1.3 Vectors ....

        Vector<String> lessons = new Vector<>();
        lessons.add("JAVA");
        lessons.add("English");
        lessons.add("Database");
        lessons.add("Embaded Systems");

        for (String lesson: lessons){
            App.write(lesson);
        }

        App.new_line();

        Stack<String> my_stack = new Stack<>();
        my_stack.push("A");
        my_stack.push("B");
        my_stack.push("C");

        for (String item : my_stack)
            App.write(item);

        App.new_line();

        // 2. Queue interface ....

        PriorityQueue<String> my_queue = new PriorityQueue<>();

        my_queue.add("Year 2 C");
        my_queue.add("Year 2 B");
        my_queue.add("Year 2 A");
        my_queue.add("Year 1 C");
        my_queue.add("Year 1 B");
        my_queue.add("Year 1 A");

        App.write(my_queue.peek());
        // iterable class

        App.new_line();

        // hashset

        HashSet<Object> my_set = new HashSet<>();
        my_set.add(3);
        my_set.add("A very col story");
        for (Object any: my_set)
            App.write(any);

//        my_list.remove(1);  remove method
        for (Integer integer : my_list) App.write(integer);
    }
}