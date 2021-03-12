interface Model{
    String class_Name = "MODEL";
    void walk();

    static void hey(){
        System.out.println("Hello World !");
    }
}

abstract class Animal{
    public Animal(String kingdom){

    }

    public abstract int get_legs();
    public abstract String vocal();
}

class Dog extends Animal implements Model{
    public Dog(){
        super("Mamal");
    }
    private String name = "";
    public void walk(){
        System.out.println("I am walking ");
    }

    public int add (int a, int b ){ return a + b; }
    public int add (int a, int b, int c){ return a + b + c; }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void test_static(){
        System.out.println("Holla");
    }

    @Override
    public int get_legs() {
        return 5;
    }

    @Override
    public String vocal() {
        return "barks";
    }
}

public class OOPConcepts {
    public static void main(String[] args) {
        String str1 = "one";
        String str2 = "one";
        String str3 = new String("one");
        String str4 = new String("one");

        if(str1 == str2){
            System.out.println("Ok");
        }
    }
}
