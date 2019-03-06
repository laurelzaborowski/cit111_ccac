/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author laurel.zaborowski
 */
public class JavaGhost {

    public static void main(String[] args) {
        String username = "javaghost";
        String password = "ic0d3";

        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Enter your username followed by enter:");
        username = keyboardScanner.next();
        System.out.println("Enter your passowrd followed by enter:");
        password = keyboardScanner.next();
        boolean areStringsEqual = username.equals(password);
        if (areStringsEqual) {
            System.out.println("Login sucessful!");
        } else {
            System.out.println("Incorrect password or username! Try Again!");

        } //close if/else
    } // close class
} // close main
