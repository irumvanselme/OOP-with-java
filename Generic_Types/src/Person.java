public class Person<MyType1, MyType2> {
    public MyType1 age;
    public MyType2 name;
    public MyType1 height;

    public Person(MyType1 age, MyType2 name, MyType1 height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }
}
