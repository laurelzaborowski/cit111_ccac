

package projects;

import java.util.Scanner;

/**
 * computes your price total for party supplies
 * @author laurel.zaborowski
 */
public class PartyPlanning {
        final static double POP_PRICE = 8.99; 
        final static double CUPCAKE_PRICE = 2.50; 
        final static double PIZZA_PRICE = 10.99; 
        static double totalPrice = 0; 
        static Scanner keyboardScanner; 
        
    public static void main(String[] args) {
        keyboardScanner = new Scanner(System.in);  
        casesOfPop(); 
        cupCakesToBePurchased(); 
        pizzaToPurchase();
        
       
    } // close main  

    public static void casesOfPop() { 
        System.out.println("How many cases of pop do you need?"); 
        int userInput = keyboardScanner.nextInt(); 
        totalPrice = totalPrice + (userInput * POP_PRICE); 
        displayTotalPrice(); 
    } // close method 

    public static void cupCakesToBePurchased() { 
        System.out.println("How many cupcakes do you need?"); 
        int userInput = keyboardScanner.nextInt(); 
        totalPrice = totalPrice + (userInput * CUPCAKE_PRICE); 
        displayTotalPrice();
        
        
    } // close method 

    public static void pizzaToPurchase() {
        System.out.println("How many large pizzas do you need?"); 
        int userInput = keyboardScanner.nextInt(); 
        totalPrice = totalPrice + (userInput * PIZZA_PRICE); 
        displayTotalPrice();

    } // close method 
    
    
    

    public static void displayTotalPrice() { 
        System.out.println("Total price = " + totalPrice);
        
        
       
    } // close method  
    
} // close class
