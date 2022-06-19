public class MyCustomThread extends Thread {

    @Override
    public void run() {
        System.out.println("Do this job " + this.getName());
    }

}

