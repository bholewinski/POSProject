package posproject;

/**
 * @author Ben Holewinski
 */
public class NoDiscount implements DiscountStrategy {
    private double discountRate = 0;

    @Override
    public double getDiscountAmount(double unitPrice, int qty) {
        return 0;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
