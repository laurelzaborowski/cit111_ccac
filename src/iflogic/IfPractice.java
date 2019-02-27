/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iflogic;

import java.util.Scanner;

/**
 *
 * @author laurel.zaborowski
 */
public class IfPractice {

    public static void main(String[] args) {
        int riderHeight = 180; 
        int otherRider = 180;
        final int MIN_HEIGHT = 137;
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Welcome to the ride!");
        System.out.println("Enter your heights in centimeters");
        riderHeight = keyboardScanner.nextInt(); 
        otherRider = keyboardScanner.nextInt();

        if (riderHeight >= MIN_HEIGHT && otherRider >= MIN_HEIGHT) {
            System.out.println(" Enjoy the ride!");
        } else {
            System.out.println("Better luck next year!");
        } // close if/else
    } // close main method

} //close class
