public class GenericDemo {
    public static void main(String[] args) {
        Person1<Integer, String> p1 = new Person1<>(3, "Anselme", 4);
        Person1<Double, String> p2 = new Person1<>(3.4, "Anselme", 4.5);
        System.out.println(p2.age);
    }
}
