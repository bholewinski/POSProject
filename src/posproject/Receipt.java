package posproject;

/**
 * @author Ben Holewinski
 */
public class Receipt {
    private FakeDatabase db = new FakeDatabase();
    private static int receiptNo = 0;
    private Customer customer;
    private LineItem[] lineItems;
    private OutputReceiptStrategy output = new OutputReceiptToConsole();

    public Receipt(String custId) {
        this.customer = findCustomer(custId);
        receiptNo++;
        lineItems = new LineItem[0];
    }
    
    private Customer findCustomer(String custId) {
        return db.findCustomer(custId);
    }    
    
    public double getTotalBeforeDiscount() {
        double total = 0.0;
        for(LineItem item : lineItems) {
            total += item.getSubtotal();
        }
        return total;
    }
    
    public double getTotalDiscount() {
        double total = 0.0;
        for(LineItem item : lineItems) {
            total += item.getDiscountAmount();
        }
        return total;
    }

    public void addLineItem(String prodId, int qty) {
        LineItem item = new LineItem(prodId, qty);
        addToArray(item);
    }
    
    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    public void outputReceipt() {
        output.outputReceipt(customer, lineItems);
    }
}
