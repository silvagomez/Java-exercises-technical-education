package control_structures;

import java.util.Scanner;

public class Ex213_numberDivisors {
    // EXERCISE 13
    /*------------------------------------------------
     * Program that displays the divisors of the number given by the user.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int dividend, remainder = 0, divisor = 1;

        System.out.println("Enter a number");
        dividend = keyboard.nextInt();
        System.out.println("The divisor numbers of " + dividend + " are:");
        while (divisor <= dividend) {
            if (dividend % divisor == remainder) {
                System.out.print(divisor + " ");
            }
            divisor++;
        }
    }
}
