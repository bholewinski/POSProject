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
