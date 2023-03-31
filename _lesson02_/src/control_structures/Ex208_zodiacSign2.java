package control_structures;

import java.util.Scanner;

public class Ex208_zodiacSign2 {
    // EXERCISE 8
    /*------------------------------------------------
     * Show the zodiac sign of a person.
     * To do this, the user must enter the day and month of birth.
     * Perform the exercise with switch.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        byte dia, moth;

        System.out.println("Zodiac sign");
        System.out.println("Enter your day birthday:");
        dia = keyboard.nextByte();
        System.out.println("Enter your month birthday");
        moth = keyboard.nextByte();

        switch (moth) {
            case 1:
                if (dia >= 20) {
                    System.out.print("Aquarius");
                } else {
                    System.out.print("Capricorn");
                }
                break;
            case 2:
                if (dia >= 19) {
                    System.out.print("Pisces");
                } else {
                    System.out.print("Aquarius");
                }
                break;
            case 3:
                if (dia >= 21) {
                    System.out.print("Aries");
                } else {
                    System.out.print("Pisces");
                }
                break;
            case 4:
                if (dia >= 20) {
                    System.out.print("Taurus");
                } else {
                    System.out.print("Aries");
                }
                break;
            case 5:
                if (dia >= 21) {
                    System.out.print("Gemini");
                } else {
                    System.out.print("Taurus");
                }
                break;
            case 6:
                if (dia >= 21) {
                    System.out.print("Cancer");
                } else {
                    System.out.print("Gemini");
                }
                break;
            case 7:
                if (dia >= 23) {
                    System.out.print("Leo");
                } else {
                    System.out.print("Cancer");
                }
                break;
            case 8:
                if (dia >= 23) {
                    System.out.print("Virgo");
                } else {
                    System.out.print("Leo");
                }
                break;
            case 9:
                if (dia >= 23) {
                    System.out.print("Libra");
                } else {
                    System.out.print("Virgo");
                }
                break;
            case 10:
                if (dia >= 20) {
                    System.out.print("Scorpio");
                } else {
                    System.out.print("Libra");
                }
                break;
            case 11:
                if (dia >= 22) {
                    System.out.print("Sagittarius");
                } else {
                    System.out.print("Scorpio");
                }
                break;
            case 12:
                if (dia >= 22) {
                    System.out.print("Capricorn");
                } else {
                    System.out.print("Sagittarius");
                }
                break;
            default:
                break;
        }
    }
}
