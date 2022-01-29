package eStore;

public enum ProductCategory {
    ELECTRONICS("ELECTRONICS"),
    GROCERIES("GROCERIES"),
    UTENSILS("UTENSILS"),
    CLOTHING("CLOTHING");

    private final String[] productCategory;
    ProductCategory(String...productCategory) {
        this.productCategory = productCategory;
    }

    public String[] getProductCategory() {
        return productCategory;
    }
}
