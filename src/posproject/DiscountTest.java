package posproject;

/**
 * @author Ben Holewinski
 */
public class DiscountTest {
    public static void main(String[] args) {
        DiscountStrategy discount = new PercentageOffDiscount(.10);
        double discountAmt = discount.getDiscount(20.00, 3);
        System.out.println("The Discount Should Be 6 " + discountAmt);
    }
}
