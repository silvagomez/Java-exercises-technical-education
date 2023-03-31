package control_structures;

import java.util.Scanner;

public class Ex209_toTen {
    // EXERCISE 9
    /*------------------------------------------------
     * Program that asks the user for a number between 1 and 10.
     * and display the series of numbers from to 10.
     * Perform the exercise with switch().
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        byte num;

        System.out.println("Enter a number from 1 to 10:");
        num = keyboard.nextByte();
        switch (num) {
            case 1:
                System.out.println(num + " 2 3 4 5 6 7 8 9 10");
                break;
            case 2:
                System.out.println(num + " 3 4 5 6 7 8 9 10");
                break;
            case 3:
                System.out.println(num + " 4 5 6 7 8 9 10");
                break;
            case 4:
                System.out.println(num + " 5 6 7 8 9 10");
                break;
            case 5:
                System.out.println(num + " 6 7 8 9 10");
                break;
            case 6:
                System.out.println(num + " 7 8 9 10");
                break;
            case 7:
                System.out.println(num + " 8 9 10");
                break;
            case 8:
                System.out.println(num + " 9 10");
                break;
            case 9:
                System.out.println(num + " 10");
                break;
            case 10:
                System.out.println(num);
                break;
            default:
                break;
        }
    }
}
