public interface ProductService {

    default void role() {
        System.out.println("I am the Product Service");
    }

    static void great(ProductService service) {
        System.out.println("Hello You can do anything here ... ");
    }

    interface Yello {
        static String message = "Hello";
    }
}
