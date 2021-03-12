public class Multiplicative {
    synchronized public void multiply(long number) throws InterruptedException {
        for (int i = 1; i < 13; i++) {
            System.out.println(i + "\t X \t" + number + "\t = " + (i * number));
        }
    }
}
