package TaskOne;

import java.util.ArrayList;
import java.util.List;

public class StudentsService {
    private final List<Student> students = new ArrayList<>();

    public void newStudent(String firstName, String lastName, String gender, String className){
        Student student = new Student(firstName, lastName, gender, className);
        students.add(student);
    }

    public List<Student> getAll() {
        return students;
    }
}
