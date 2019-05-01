/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;

import java.util.Scanner;

/**
 *
 * @author laurel.zaborowski
 */
public class HotelLand {

    public static Hotel[] hotelArray;

    public static void main(String[] args) {
        // create array with three bins and store hotel objects in each bin 
        hotelArray = new Hotel[3];
        hotelArray[0] = new Hotel();
        hotelArray[0].name = "Laurel Inn";
        hotelArray[0].roomsAvailable = 78;
        hotelArray[0].numberOfRooms = 300;
        hotelArray[0].pricePerNight = 120;
        hotelArray[0].hasPool = true;
        // call hotel objects in chosen bin to print line 
        hotelArray[0].printHotelStats();

        hotelArray[1] = new Hotel();
        hotelArray[1].name = "Just Like Home";
        hotelArray[1].roomsAvailable = 30;
        hotelArray[1].numberOfRooms = 200;
        hotelArray[1].pricePerNight = 170;
        hotelArray[1].hasPool = false;
        hotelArray[1].printHotelStats();

        hotelArray[2] = new Hotel();
        hotelArray[2].name = "Stay Awhile";
        hotelArray[2].roomsAvailable = 126;
        hotelArray[2].numberOfRooms = 500;
        hotelArray[2].pricePerNight = 210;
        hotelArray[2].hasPool = true;
        hotelArray[2].printHotelStats();

        bookRooms();
    } // close main 

    public static void bookRooms() {
        int hotelChosen = 0;
        int hotelOptions = 3;
        int roomsNeeded = 0;
        int nightsStaying = 0;
        int userPrice = 0;
        Scanner keyboardScanner = new Scanner(System.in);
        // create a scanner for user to select hotel bin
        System.out.println("Which hotel would you like to stay in?");
        hotelChosen = keyboardScanner.nextInt();
        hotelChosen = hotelChosen - 1; 
        // subtract one from user input because of array numbering of hotels
        System.out.println("How many rooms do you need?");
        roomsNeeded = keyboardScanner.nextInt();
        System.out.println("How many nights will you be staying?");
        nightsStaying = keyboardScanner.nextInt();
        userPrice = hotelArray[hotelChosen].pricePerNight * nightsStaying * roomsNeeded;
        System.out.println("Your price is: " + userPrice); 
        hotelArray[hotelChosen].roomsAvailable = hotelArray[hotelChosen].roomsAvailable - roomsNeeded;
        hotelArray[hotelChosen].printHotelStats(); 
        // call adjusted hotel objects from chosen bin after booking is done 

    } // close method  

} // close class
