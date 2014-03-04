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
public interface OutputReceiptStrategy {
    public abstract void outputReceipt(Customer customer, LineItem[] lineItems);
}
