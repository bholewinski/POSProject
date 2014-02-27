package posproject;

/**
 * @author Ben Holewinski
 */
public class Product {
    private String productID;
    private String description;
    private double price;
    private DiscountStrategy discount;

    public Product(String productID, String description, double price, DiscountStrategy discount) {
        this.productID = productID;
        this.description = description;
        this.price = price;
        this.discount = discount;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    
}
