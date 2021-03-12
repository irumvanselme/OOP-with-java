package Collections.src;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
        Person p1 = new Person("DUSHIMIMANA", "Samuel");
        Person p2 = new Person("DUSHIMIMANA", "Samuel");
        persons.add(p1);
        persons.add(p2);

        List<Person> persons1 = new ArrayList<>();
        persons1.add(p1);
        persons1.add(p2);

        for (Person person: persons)
            System.out.println(person.full_name());

        for (Person person: persons1)
            System.out.println(person.full_name());

    }
}
