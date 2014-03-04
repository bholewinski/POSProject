package posproject;

/**
 * @author Ben Holewinski
 */
public interface OutputReceiptStrategy {
    public abstract void outputReceipt(Customer customer, LineItem[] lineItems);
}
