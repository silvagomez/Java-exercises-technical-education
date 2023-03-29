import java.util.Scanner;

public class Ex116_remainder {
    // EXERCISE 16
    /*------------------------------------------------
     * Get the remainder of several divisions.
     *------------------------------------------------*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int divisor, dividend, remainder;

        System.out.println("Enter divisor:");
        divisor = keyboard.nextInt();
        System.out.println("Enter dividend:");
        dividend = keyboard.nextInt();
        remainder = dividend % divisor;
        System.out.print("The remainder of the division is " + remainder);
    }
}
