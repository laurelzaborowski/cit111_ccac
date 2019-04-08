/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Random;

/**
 * Methods help us avoid code repetition
 *
 * @author laurel.zaborowski
 */
public class RefactorTheRing {
        static int numViewersSwallowedByRing = 0;

    public static void main(String[] args) {
        viewersWatchFilm("Katie");
        viewersWatchFilm("Josh"); 
        viewersWatchFilm("Rachel");
        viewersWatchFilm("Noah");
        viewersWatchFilm("Aiden");

    } // close main  

    public static String viewersWatchFilm(String viewer) {
        Random randomMachine = new Random();
        boolean madeCopy = randomMachine.nextBoolean(); 

        System.out.println(viewer + " watched the tape; 7 days to live");
        System.out.print("Did Viewer named " + viewer + " make a copy? ");
        System.out.println(madeCopy);

        if (madeCopy) {
            System.out.println(viewer + " is safe from The Ring!");
        } else {
            numViewersSwallowedByRing = numViewersSwallowedByRing + 1;
            System.out.println("No copy made; " + viewer + " is toast");

        } // close if/else

        System.out.println("Number of viewers swallowed by Ring.." + numViewersSwallowedByRing);
        return "viewer";

    } // close method

} // close class 

