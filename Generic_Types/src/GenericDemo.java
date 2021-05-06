package src;

public class GenericDemo {
    public static void main(String[] args) {
        Person<Integer, String> p1 = new Person<>(3, "Anselme", 4);
        Person<Double, String> p2 = new Person<>(3.4, "Anselme", 4.5);
        System.out.println(p2.age);
    }
}
