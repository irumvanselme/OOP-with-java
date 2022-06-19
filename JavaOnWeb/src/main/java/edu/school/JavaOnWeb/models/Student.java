package edu.school.JavaOnWeb.models;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String year;
    private String  className;

    public Student(){}

    public Student(int id){
        this.id = id;
    }

    public Student(String firstName, String lastName, String gender, String email, String year, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.year = year;
        this.className = className;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String  getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
