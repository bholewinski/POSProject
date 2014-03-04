
package posproject;

/**
 * @author Ben Holewinski
 */
public class QuantityDiscount implements DiscountStrategy {
    private double discountRate = 0.10;
    private int minQty = 5;
    
    @Override
    public double getDiscountAmount(double unitPrice, int qty) {
        if(qty >= minQty) {
            return unitPrice * qty * discountRate;
        } else {
            return 0;
        }
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
