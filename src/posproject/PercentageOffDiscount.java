package posproject;

/**
 * @author Ben Holewinski
 */
public class PercentageOffDiscount implements DiscountStrategy {
    private double discountRate = 0.10;
    
    @Override
    public final double getDiscountAmount(double unitPrice, int qty) {
        // needs validation
        return unitPrice * qty * discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    
}
