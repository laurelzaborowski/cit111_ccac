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
public class JavaGhostRevisited {

    public static void main(String[] args) {
        String correct_password = "hello";
        String entered_password;
        final int ATTEMPTS_ALLOWED = 3;
        int ctl = 1;
        Scanner keyboardScanner = new Scanner(System.in);
        while (ctl < ATTEMPTS_ALLOWED) {
            System.out.println("Enter your passowrd followed by enter:");
            entered_password = keyboardScanner.next();
            boolean areStringsEqual = entered_password.equals(correct_password);
            if (areStringsEqual) {
                System.out.println("Welcome!");
                break;

            }else{ 
            System.out.println("Wrong password: try again:");
                
            } 
            ctl++;
        } //close while
        System.out.println("End of program");
    } // close main
} // close class
