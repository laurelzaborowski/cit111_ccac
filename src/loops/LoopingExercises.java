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
public class LoopingExercises {

    public static void main(String[] args) {
        String lady = "Lady";
        String flowers = "Bicycle";
        String beetle = "Beetle";

        Scanner keyboardscanner = new Scanner(System.in);
        int ctl = keyboardscanner.nextInt();
        int stepSize = keyboardscanner.nextInt();
        int max = keyboardscanner.nextInt();

        System.out.println(lady);
        do {
            if (ctl % 2 > 0) {
                System.out.println(flowers.toUpperCase());
            }
            ctl = ctl + stepSize;
        } while (ctl <= max);
        System.out.println(beetle);

    }

}
