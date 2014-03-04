package posproject;

/**
 * @author Ben Holewinski
 */
public class LineItem {
    FakeDatabase db = new FakeDatabase();
    private Product product;
    private int qty;

    public LineItem() {
    }

    public LineItem(String prodId, int qty) {
        this.product = findProduct(prodId);
        this.qty = qty;
    }
    
    private Product findProduct(String prodId) {
        return db.findProduct(prodId);
    }
    
    public double getOrigPriceSubtotal() {
        return product.getUnitPrice() * qty;
    }
    
    public double getDiscountAmt() {
        return product.getDiscountStrategy().getDiscountAmount(product.getUnitPrice(), qty);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
}
