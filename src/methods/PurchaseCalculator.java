/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author laurel.zaborowski
 */
public class PurchaseCalculator {

    public static void main(String[] args) { 
        Scanner keyboardScanner = new Scanner(System.in);
        final double ITEM_PRICE = 100.00; 
        final double discount = 0.15; 
        System.out.println("Hard-coded price value: $" + ITEM_PRICE);
        System.out.println("Enter your purchase limit and press enter:");
        double userLimit = keyboardScanner.nextDouble(); 

        displayPriceWithTax(ITEM_PRICE); 
        computerPriceAfterDiscount(ITEM_PRICE, discount);

    } // close mehtod main  

    public static void displayPriceWithTax(double price) {

        final double TAX_RATE = 0.075;
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice);
    }// close method displayPriceWithTax  
    
    public static void computerPriceAfterDiscount(double price, double discount){ 
        double finalPrice = price - (price * discount); 
        System.out.println("Price after discount: $" + finalPrice); 
        
    } // close method computerPriceAfterDiscount

    public static void displayPurchaseNumber(double price, double limit){ 
        int numPurchasable = (int) Math.floor(limit / price);  
        System.out.println("With $" + limit
                + ", you can buy" + numPurchasable + "units"); 
                
    } 
        
} // close class 
