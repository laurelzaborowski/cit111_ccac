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
public class GeometricShapes {

    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        System.out.println("Enter the side length of the cube to calculate its volume: ");
        double userSideLength = keyboardScanner.nextDouble();
        double returnedVolume = calcVolumeOfCube(userSideLength);
        System.out.println("The volume of a cube with side length " + userSideLength
                + " is " + returnedVolume);
        System.out.println("Enter the cylinder radius: ");
        double userRadius = keyboardScanner.nextDouble();
        System.out.println("Enter the cylinder height: ");
        double userHeight = keyboardScanner.nextDouble();
        double returnedCylVolume = calcVolumeOfCylinder(userRadius, userHeight);
        System.out.println("The volume of a cylinder with radius: " + userRadius
                + "\nand height of " + userHeight + " is " + returnedCylVolume);
        System.out.println("-------------------------------------------------");

    } // close main

    public static double calcVolumeOfCube(double sideLength) {
        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume;

    }// close method  

    public static double calcVolumeOfCylinder(double radius, double height) {
        final double PI = 3.1416;
        double cylVol = PI * (radius * radius) * height;
        return cylVol;

    } // close method

} // close class 
