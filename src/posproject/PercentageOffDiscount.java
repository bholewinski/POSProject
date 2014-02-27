package posproject;

/**
 * @author Ben Holewinski
 */
public class PercentageOffDiscount implements DiscountStrategy {
    private double percent = .10;
    private double productCost;
    private double quantity;
    
    public PercentageOffDiscount(double percent) {
        setPercent(percent);
    }
    
    @Override
    public double getDiscount(double productCost, double quantity) {
        return productCost * quantity * percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public double getProductCost() {
        return productCost;
    }

    @Override
    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    @Override
    public double getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
    
    
}
