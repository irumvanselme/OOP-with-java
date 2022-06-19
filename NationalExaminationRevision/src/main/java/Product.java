public class Product extends Soldable implements ProductService {

    private float price;

    public Product() {
    }

    public Product(int price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
