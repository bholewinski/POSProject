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
public interface DiscountStrategy {

    double getDiscount(double productCost, double quantity);

    double getProductCost();

    double getQuantity();

    void setProductCost(double productCost);

    void setQuantity(double quantity);
    
}
