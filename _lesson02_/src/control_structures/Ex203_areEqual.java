package control_structures;

import java.util.Scanner;

public class Ex203_areEqual {
    // EXERCISE 3
    /*------------------------------------------------
     * Program that asks the user for 3 numbers and displays the message:
     * are they equal if the sum of two of them is equal to the other number,
     * and if not displayed they are not equal.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("You will enter three numbers...");
        System.out.println("Enter number one:");
        num1 = keyboard.nextInt();
        System.out.println("Enter number two:");
        num2 = keyboard.nextInt();
        System.out.println("Enter number three:");
        num3 = keyboard.nextInt();

        if (num1 + num2 == num3 || num1 + num3 == num2 || num2 + num3 == num1) {
            System.out.print("They are equal");
        } else {
            System.out.print("They are not equal");
        }
    }
}
