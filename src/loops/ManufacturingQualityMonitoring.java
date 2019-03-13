/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Random;

/**
 *
 * @author laurel.zaborowski
 */
public class ManufacturingQualityMonitoring {

    final static int QUALITY_THRESHOLD = 80;
    final static int UNITS_TO_MAKE = 50;
    final static int MAX_QUALITY = 100;
    static int unitQuality = 0;
    static int totalFailures = 0;
    static int totalUnitsMade = 1;

    public static void main(String[] args) {
        final int UPPER_END_OF_RANGE = 100;

        Random ranGenerator = new Random();

        while (totalUnitsMade <= UNITS_TO_MAKE) {
            unitQuality = ranGenerator.nextInt(UPPER_END_OF_RANGE);
            System.out.println("Random Number: " + unitQuality);

            if (unitQuality < QUALITY_THRESHOLD) {
                System.out.println("Unit below quality standards");
            totalFailures = totalFailures + 1;
            } else {
                System.out.println("Unit passes quality test");

            }// close if/else  
            totalUnitsMade = totalUnitsMade + 1;
            System.out.println("Total Failures: "+ totalFailures + " out of " + totalUnitsMade);
        }// close while

    }// close main
}// close class 
