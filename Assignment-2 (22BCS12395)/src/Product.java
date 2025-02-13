public class Product {
    
    private int id;
    private String name;
    private double price;
    
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Product Details:\nID: %d\nName: %s\nPrice: %.2f", id, name, price);
    }

    // Main method inside Product
    public static void main(String[] args) {
        Product laptop = new Product(1001, "Laptop", 80000.0);
        Product shoes = new Product(1002, "Sneakers", 10000.0);

        System.out.println(laptop);
        System.out.println(shoes);
    }
}
