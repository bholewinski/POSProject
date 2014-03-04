package posproject;

/**
 * @author Ben Holewinski
 */
public class POSProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        cr.startNewSale("100");
        //cr.addItemToSale("B205", 2);
        //cr.addItemToSale("A101", 1);
        cr.endSaleAndOutputReceipt();
    }
    
}
