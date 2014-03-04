package posproject;

/**
 * @author Ben Holewinski
 */
public class DollarOffDiscount implements DiscountStrategy {
    private double discountRate = 1;
    
    @Override
    public final double getDiscountAmount(double unitPrice, int qty) {
        // needs validation
        return unitPrice - discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
    
    
}
