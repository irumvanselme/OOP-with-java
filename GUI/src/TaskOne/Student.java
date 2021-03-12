package TaskOne;

public class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private String className;

    public Student() {}

    public Student(String firstName, String lastName, String gender, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.className = className;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
