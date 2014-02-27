package posproject;

/**
 * @author Ben Holewinski
 */
public class DollarOffDiscount implements DiscountStrategy {
    private double dollarsOff = 10;
    private double productCost;
    private double quantity;
    
    public DollarOffDiscount(double dollarsOff) {
        setDollarsOff(dollarsOff);
    }
    
    @Override
    public double getDiscount(double productCost, double quantity) {
        return dollarsOff;
    }

    public double getDollarsOff() {
        return dollarsOff;
    }

    public void setDollarsOff(double dollarsOff) {
        this.dollarsOff = dollarsOff;
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
