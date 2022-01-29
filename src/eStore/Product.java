package eStore;

public class Product {
    private String productId;
    private String productName;
    private double price;
    private String productDescription;
    private ProductCategory category;
    public Product(String productId, String productName, double price){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    }

