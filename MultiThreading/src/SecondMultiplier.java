public class SecondMultiplier extends Thread {
    private final Multiplicative multiplicative;

    public SecondMultiplier(Multiplicative multiplicative){
        this.multiplicative = multiplicative;
    }

    @Override
    public void run() {
        try {
            multiplicative.multiply(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
