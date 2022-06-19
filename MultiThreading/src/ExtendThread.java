public class ExtendThread implements Runnable {
    private long number;
    private String threadName;
    private Thread thread;

    public ExtendThread(long number, String name) {
        this.number = number;
        this.threadName = name;
    }

    public long getNumber() {
        return number;
    }

    public void start(){
        if(thread == null){
            thread = new Thread(this, "Extend Thread");
        }

        thread.start();
    }

    public String getThreadName() {
        return threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < getNumber(); i ++){
            System.out.println("thread : " + getThreadName() + "  number : "+ i);
        }
    }

    public static void main(String[] args){
        var extendThread = new ExtendThread(1, "A");
        extendThread.start();
    }
}