public class SynchronisationDemo {
    public static void main(String[] args) {
        var multiplicative = new Multiplicative();
        var firstMultiplier = new FirstMultiplier(multiplicative);
        firstMultiplier.start();

        var secondMultiplier = new SecondMultiplier(multiplicative);
        secondMultiplier.start();
    }
}
