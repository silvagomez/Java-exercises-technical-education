package control_structures;

import java.util.Scanner;

public class Ex201_isPosNeg {
    // EXERCISE 1
    /*------------------------------------------------
     * Type in a number,
     * we want the program to display:
     * null, negative or positive, depending on the number typed.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int number;

        System.out.println("Enter a number:");
        number = keyboard.nextInt();
        if (number == 0) {
            System.out.print(number + " is null");
        } else {
            if (number > 0) {
                System.out.print(number + " is positive");
            } else {
                System.out.print(number + " is negative");
            }
        }
    }
}
