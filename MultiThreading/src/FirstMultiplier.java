public class FirstMultiplier extends Thread {
    private final Multiplicative multiplicative;

    public FirstMultiplier(Multiplicative multiplicative){
        this.multiplicative = multiplicative;
    }

    @Override
    public void run() {
        try {
            multiplicative.multiply(9);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
