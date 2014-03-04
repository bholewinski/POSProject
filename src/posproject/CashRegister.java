package posproject;

/**
 * @author Ben Holewinski
 */
public class CashRegister {
    private Receipt receipt;
    
    public void endSaleAndOutputReceipt() {
        receipt.outputReceipt();
    }
    
    public void addItemToSale(String prodId, int qty) {
        
            receipt.addLineItem(prodId, qty);
        
    }
    
    public void startNewSale(String custId) {
        receipt = new Receipt(custId);
    }
}
