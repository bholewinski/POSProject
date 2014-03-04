package posproject;

/**
 * @author Ben Holewinski
 */
public class Product {
    private String prodId;
    private String description;
    private double unitPrice;
    private DiscountStrategy discountStrategy;

    public Product() {
    }

    public Product(String prodId, String description, double unitPrice, DiscountStrategy discountStrategy) {
        this.prodId = prodId;
        this.description = description;
        this.unitPrice = unitPrice;
        this.discountStrategy = discountStrategy;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
    
}
