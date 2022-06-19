
public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyCustomThread myThred = new MyCustomThread();
        myThred.setName("ANew_Name");
        myThred.setPriority(2);
        myThred.join(10000);
        myThred.start();

        MyCustomThread myThred2 = new MyCustomThread();
        myThred2.setName("ANew_Name2");
        myThred2.setPriority(6);

        myThred2.start();
    }
}