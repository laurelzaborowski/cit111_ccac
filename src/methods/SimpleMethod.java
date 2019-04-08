/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author laurel.zaborowski
 */
public class SimpleMethod {

    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);  
        int response = 0; 
        System.out.println("****** switches and methods ******");
        System.out.println("Options:");
        System.out.println("1 - Print special statement");
        System.out.println("2 - Generate a really big random number");
        System.out.println("3 - Get me out of here!"); 
        System.out.println("Enter an int and press enter:");  
        response = keyboardScanner.nextInt(); 
        
        generateBigNumber();


    } // close method main 

    // method that takes no parameters and returns nothing to the caller
    // A mehtod is a named block of code that does 
    // a single task
    public static void printStatement() {
        

    } // close method printSpecialStatement  

    public static void generateBigNumber() {
        Random r = new Random();
        BigInteger bigInt = new BigInteger(100, r);
        System.out.println("************INSIDE generateBigNumber*************");
        System.out.println(bigInt);

    }
} // close class
