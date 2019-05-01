/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Scanner;

/**
 *
 * @author laurel.zaborowski
 */
public class PracticingArrays {

    public static void main(String[] args) {
        String[] cars = new String[8];
        cars[0] = "Red Camry";
        cars[1] = "Gold Ford";
        cars[2] = "Silver Chevy HHR";
        cars[3] = "Oragnge Chevrolet Cavalier";
        cars[4] = "Beat up Chrystler LX";
        cars[5] = "White Nissan";
        cars[6] = "Sparkly blue Ford";
        cars[7] = "Lifted Jeep";
        userInteraction(cars);

        int counter = 0;
        while (counter < cars.length) {
            //System.out.println("Value at bin index " + counter + " is " + cars[counter]);
            counter = counter + 1;
        } // end while

        for (int i = 0; i < cars.length; i = i + 1) {
            //System.out.println("Value at bin index " + i + " is " + cars[i]);
        } // close for loop 

    } // close main

    // a method that takes in a string array and allows user to populate values
    public static void userInteraction(String[] array) {
        int arraySize = 8;
        int binChosen = 0;
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Which bin would you like to access?");
        binChosen = keyboardScanner.nextInt();
        binChosen = binChosen - 1;
        System.out.println("You revealed bin " + array[binChosen]); 
    } // close method 
} // close class 
