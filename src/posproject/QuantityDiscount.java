/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package posproject;

/**
 *
 * @author bholewinski
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
