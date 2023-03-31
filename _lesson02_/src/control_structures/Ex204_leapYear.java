package control_structures;

import java.util.Scanner;

public class Ex204_leapYear {
    // EXERCISE 4
    /*------------------------------------------------
     * Program that tells the user if the typed year is a leap year or not.
     * For a year to be a leap year it has to be a multiple of 4,
     * there is an exception: if in addition to being a multiple of 4 it is also a multiple of 100,
     * and it is not a multiple of 400 it is not a leap year.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int year;
        boolean leap;

        System.out.println("Enter a year:");
        year = keyboard.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }
        if (leap) {
            System.out.print(year + " is a leap year.");
        } else {
            System.out.print(year + " is not a leap year.");
        }
    }
}