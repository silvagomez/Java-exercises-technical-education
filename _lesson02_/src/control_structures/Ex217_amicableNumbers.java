package control_structures;

import java.util.Scanner;

public class Ex217_amicableNumbers {
    // EXERCISE 17
    /*------------------------------------------------
     * Program that determines if the two integers typed by the user are friends.
     * Two numbers are friends if the sum of the divisors (except the number itself)
     * of each of them is equal to the other number.
     * Friendly numbers are: 220 and 284, 17,296 and 18,416.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int num1, num2, divisor = 1, sum1 = 0, sum2 = 0;

        System.out.println("Enter number 1:");
        num1 = keyboard.nextInt();
        System.out.println("Enter number 2:");
        num2 = keyboard.nextInt();

        while (divisor < num1) {
            if (num1 % divisor == 0) {
                sum1 = sum1 + divisor;
            }
            divisor++;
        }
        divisor = 1;
        while (divisor < num2) {
            if (num2 % divisor == 0) {
                sum2 = sum2 + divisor;
            }
            divisor++;
        }
        if (sum1 == num2 && sum2 == num1) {
            System.out.print(num1 + " and " + num2 + " are amicable numbers");
        } else {
            System.out.print(num1 + " and " + num2 + " are not amicable numbers");
        }
    }
}