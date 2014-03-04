package posproject;

/**
 * @author Ben Holewinski
 */
public class FakeDatabase {
    private Customer[] customers = {
        new Customer("cid001", "Aaron Rodgers"),
        new Customer("cid002", "Eddie Lacy"),
        new Customer("cid003", "James Jones")
    };
    
    Product[] products = {
        new Product("VG001", "Watchdogs", 49.99, new DollarOffDiscount()),
        new Product("VG002", "Skylanders Booster Pack", 15.99, new QuantityDiscount()),
        new Product("VG003", "Battlefield 4", 49.99, new PercentageOffDiscount()),
        new Product("VG004", "Final Fantasy 7", 4.99, new NoDiscount())
    };
    
    public Customer findCustomer(String custId) {
        Customer customer = null;
        for(Customer c : customers) {
            if(custId.equals(c.getCustId())) {
                customer = c;
                break;
            }
        }
        
        return customer;
    }
    
    public Product findProduct(String prodId) {
        Product product = null;
        for(Product p : products) {
            if(prodId.equals(p.getProdId())) {
                product = p;
                break;
            }
        }
        
        return product;
    }
}
