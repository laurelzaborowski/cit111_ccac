/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author laurel.zaborowski
 */
public class SimpleWhile {

    public static void main(String[] args) {
        int numLoops = 0;
        int loopControl = 5;
        String phrase;

        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Enter number of loops");
            loopControl = keyboardScanner.nextInt();
            System.out.println("Enter phrase to be repeated");
            phrase = keyboardScanner.next();

        while (numLoops < loopControl) {
            System.out.println(phrase + " " + numLoops);
            numLoops = numLoops + 1;

        }//close while 
    }// close main
}// close class
