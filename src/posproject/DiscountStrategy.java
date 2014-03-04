package posproject;

/**
 * @author Ben Holewinski
 */
public interface DiscountStrategy {

    public abstract double getDiscountAmount(double unitPrice, int qty);
    public abstract double getDiscountRate();
    public abstract void setDiscountRate(double discountRate);
    
}
