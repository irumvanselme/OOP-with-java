import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pooling implements Runnable{
    private final String threadName;
    private Thread thread;

    public Pooling(String threadName){
        this.threadName = threadName;
    }

//    public void start(){
//        if(thread == null){
//            thread = new Thread(this, "Extend Thread");
//        }
//
//        thread.start();
//    }

    @Override
    public void run(){
        try {
            System.out.println("Starting thread "+threadName+" at "+ LocalDateTime.now().toString() );
            Thread.sleep(100);
            for(int i = 0; i < 2; i++){
                System.out.println("Executing task : " + (i+1) + " from thread "+threadName+ "  at "+LocalDateTime.now().toString() );
                    Thread.sleep(200);
            }
            System.out.println("Exiting "+threadName+" at "+LocalDateTime.now().toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        var thread1 = new Pooling("USER ONE ");
        var thread2 = new Pooling("USER TWO ");
        var thread3 = new Pooling("USER THREE ");
        var thread4 = new Pooling("USER FOUR ");
        var thread5 = new Pooling("USER FIVE ");

        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(thread1);
        pool.execute(thread2);
        pool.execute(thread3);
        pool.execute(thread4);
        pool.execute(thread5);

        pool.shutdown();
    }
}
