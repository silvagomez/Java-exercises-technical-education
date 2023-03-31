package control_structures;

import java.util.Scanner;

public class Ex202_greaterLess {
    // EXERCISE 2
    /*------------------------------------------------
     * Enter 3 quantities.
     * If the first one is greater than the second one.
     * Display the result of the sum of the first quantity with the second quantity.
     * If the first is less than or equal to the second.
     * Display the result of subtracting these quantities.
     * Their product if the second is greater than the third.
     * Their quotient if the second is less than or equal to the third.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        float num1, num2, num3;

        System.out.println("You will enter three numbers...");
        System.out.println("Enter number one:");
        num1 = keyboard.nextFloat();
        System.out.println("Enter number two:");
        num2 = keyboard.nextFloat();
        System.out.println("Enter number three:");
        num3 = keyboard.nextFloat();

        if (num1 > num2) {
            System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        } else if (num1 <= num2) {
            System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        }
        if (num2 > num3) {
            System.out.println(num2 + "*" + num3 + "=" + (num2 * num3));
        } else if (num2 <= num3) {
            System.out.println(num2 + "/" + num3 + "=" + (num2 / num3));
        }
    }
}
