package control_structures;

import java.util.Scanner;

public class Ex207_zodiacSign {
    // EXERCISE 7
    /*------------------------------------------------
     * Show the zodiac sign of a person.
     * To do this, the user must enter the day and month of birth.
     * Perform the exercise with if.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        byte day, month;

        System.out.println("Zodiac sign");
        System.out.println("Enter your day birthday:");
        day = keyboard.nextByte();
        System.out.println("Enter your month birthday:");
        month = keyboard.nextByte();

        // 01, 02, ..., 09 WARNING OCTAL INTEGER
        if (day >= 20 && month == 1 || day <= 18 && month == 2) {
            System.out.print("Aquarius");
        } else if (day >= 19 && month == 2 || day <= 20 && month == 3) {
            System.out.print("Pisces");
        } else if (day >= 21 && month == 3 || day <= 19 && month == 4) {
            System.out.print("Aries");
        } else if (day >= 20 && month == 4 || day <= 20 && month == 5) {
            System.out.print("Taurus");
        } else if (day >= 21 && month == 5 || day <= 20 && month == 6) {
            System.out.print("Gemini");
        } else if (day >= 21 && month == 6 || day <= 22 && month == 7) {
            System.out.print("Cancer");
        } else if (day >= 23 && month == 7 || day <= 22 && month == 8) {
            System.out.print("Leo");
        } else if (day >= 23 && month == 8 || day <= 22 && month == 9) {
            System.out.print("Virgo");
        } else if (day >= 23 && month == 9 || day <= 22 && month == 10) {
            System.out.print("Libra");
        } else if (day >= 23 && month == 10 || day <= 21 && month == 11) {
            System.out.print("Scorpio");
        } else if (day >= 22 && month == 11 || day <= 21 && month == 12) {
            System.out.print("Sagittarius");
        } else if (day >= 22 && month == 12 || day <= 19 && month == 01) {
            System.out.print("Capricorn");
        }
    }
}