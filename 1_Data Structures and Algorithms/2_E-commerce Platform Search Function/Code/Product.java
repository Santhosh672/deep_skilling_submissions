package ecommerce;

public class Product {
    int productId;    
    String productName;
    String category;

    // Constructor - sets up a basic product
    public Product(int id, String name, String cat) {
        this.productId = id;
        this.productName = name;
        this.category = cat;
    }

    @Override
    public String toString() {
        return "Product(ID=" + productId + ", Name=" + productName + ", Category=" + category + ")";
    }
}
